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
package de.dfki.iui.mmds.core.model.io.communicative_functions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsFactory
 * @model kind="package"
 * @generated
 */
public interface Communicative_functionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "communicative_functions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/mmds/core/model/io/communicative_functions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "communicative_functions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Communicative_functionsPackage eINSTANCE = de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SemanticContentImpl <em>Semantic Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SemanticContentImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getSemanticContent()
	 * @generated
	 */
	int SEMANTIC_CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONTENT__BINDING = BasePackage.BOBJECT__BINDING;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONTENT__CONTENT = BasePackage.BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONTENT__REFERENCE = BasePackage.BOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONTENT__RESOLVED = BasePackage.BOBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONTENT__ID = BasePackage.BOBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONTENT__VALIDITY = BasePackage.BOBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Semantic Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONTENT_FEATURE_COUNT = BasePackage.BOBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Semantic Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CONTENT_OPERATION_COUNT = BasePackage.BOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction <em>Communicative Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getCommunicativeFunction()
	 * @generated
	 */
	int COMMUNICATIVE_FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_FUNCTION__BINDING = BasePackage.BOBJECT__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_FUNCTION__SEMANTIC_CONTENT = BasePackage.BOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_FUNCTION__IS_ELLIPSIS = BasePackage.BOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_FUNCTION__KNOWLEDGE_ITEM = BasePackage.BOBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Communicative Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_FUNCTION_FEATURE_COUNT = BasePackage.BOBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Communicative Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATIVE_FUNCTION_OPERATION_COUNT = BasePackage.BOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.GeneralPurposeCommunicativeFunction <em>General Purpose Communicative Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.GeneralPurposeCommunicativeFunction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getGeneralPurposeCommunicativeFunction()
	 * @generated
	 */
	int GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION__BINDING = COMMUNICATIVE_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION__SEMANTIC_CONTENT = COMMUNICATIVE_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION__IS_ELLIPSIS = COMMUNICATIVE_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION__KNOWLEDGE_ITEM = COMMUNICATIVE_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>General Purpose Communicative Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION_FEATURE_COUNT = COMMUNICATIVE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>General Purpose Communicative Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION_OPERATION_COUNT = COMMUNICATIVE_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InformationTransferFunction <em>Information Transfer Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InformationTransferFunction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getInformationTransferFunction()
	 * @generated
	 */
	int INFORMATION_TRANSFER_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TRANSFER_FUNCTION__BINDING = GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TRANSFER_FUNCTION__SEMANTIC_CONTENT = GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TRANSFER_FUNCTION__IS_ELLIPSIS = GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TRANSFER_FUNCTION__KNOWLEDGE_ITEM = GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Information Transfer Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TRANSFER_FUNCTION_FEATURE_COUNT = GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Information Transfer Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TRANSFER_FUNCTION_OPERATION_COUNT = GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InformationSeekingFunction <em>Information Seeking Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InformationSeekingFunction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getInformationSeekingFunction()
	 * @generated
	 */
	int INFORMATION_SEEKING_FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SEEKING_FUNCTION__BINDING = INFORMATION_TRANSFER_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SEEKING_FUNCTION__SEMANTIC_CONTENT = INFORMATION_TRANSFER_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SEEKING_FUNCTION__IS_ELLIPSIS = INFORMATION_TRANSFER_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SEEKING_FUNCTION__KNOWLEDGE_ITEM = INFORMATION_TRANSFER_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Information Seeking Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SEEKING_FUNCTION_FEATURE_COUNT = INFORMATION_TRANSFER_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Information Seeking Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SEEKING_FUNCTION_OPERATION_COUNT = INFORMATION_TRANSFER_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InformationProvidingFunction <em>Information Providing Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InformationProvidingFunction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getInformationProvidingFunction()
	 * @generated
	 */
	int INFORMATION_PROVIDING_FUNCTION = 5;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_PROVIDING_FUNCTION__BINDING = INFORMATION_TRANSFER_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_PROVIDING_FUNCTION__SEMANTIC_CONTENT = INFORMATION_TRANSFER_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_PROVIDING_FUNCTION__IS_ELLIPSIS = INFORMATION_TRANSFER_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_PROVIDING_FUNCTION__KNOWLEDGE_ITEM = INFORMATION_TRANSFER_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Information Providing Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_PROVIDING_FUNCTION_FEATURE_COUNT = INFORMATION_TRANSFER_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Information Providing Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_PROVIDING_FUNCTION_OPERATION_COUNT = INFORMATION_TRANSFER_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ActionDiscussionFunction <em>Action Discussion Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ActionDiscussionFunction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getActionDiscussionFunction()
	 * @generated
	 */
	int ACTION_DISCUSSION_FUNCTION = 6;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DISCUSSION_FUNCTION__BINDING = GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DISCUSSION_FUNCTION__SEMANTIC_CONTENT = GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DISCUSSION_FUNCTION__IS_ELLIPSIS = GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DISCUSSION_FUNCTION__KNOWLEDGE_ITEM = GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Action Discussion Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DISCUSSION_FUNCTION_FEATURE_COUNT = GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action Discussion Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DISCUSSION_FUNCTION_OPERATION_COUNT = GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Commissive <em>Commissive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Commissive
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getCommissive()
	 * @generated
	 */
	int COMMISSIVE = 7;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMISSIVE__BINDING = ACTION_DISCUSSION_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMISSIVE__SEMANTIC_CONTENT = ACTION_DISCUSSION_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMISSIVE__IS_ELLIPSIS = ACTION_DISCUSSION_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMISSIVE__KNOWLEDGE_ITEM = ACTION_DISCUSSION_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Commissive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMISSIVE_FEATURE_COUNT = ACTION_DISCUSSION_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Commissive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMISSIVE_OPERATION_COUNT = ACTION_DISCUSSION_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Directive <em>Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Directive
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getDirective()
	 * @generated
	 */
	int DIRECTIVE = 8;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__BINDING = ACTION_DISCUSSION_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__SEMANTIC_CONTENT = ACTION_DISCUSSION_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__IS_ELLIPSIS = ACTION_DISCUSSION_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__KNOWLEDGE_ITEM = ACTION_DISCUSSION_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE_FEATURE_COUNT = ACTION_DISCUSSION_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE_OPERATION_COUNT = ACTION_DISCUSSION_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.QuestionImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 9;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__BINDING = INFORMATION_SEEKING_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__SEMANTIC_CONTENT = INFORMATION_SEEKING_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__IS_ELLIPSIS = INFORMATION_SEEKING_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__KNOWLEDGE_ITEM = INFORMATION_SEEKING_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = INFORMATION_SEEKING_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = INFORMATION_SEEKING_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SetQuestionImpl <em>Set Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SetQuestionImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getSetQuestion()
	 * @generated
	 */
	int SET_QUESTION = 10;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_QUESTION__BINDING = QUESTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_QUESTION__SEMANTIC_CONTENT = QUESTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_QUESTION__IS_ELLIPSIS = QUESTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_QUESTION__KNOWLEDGE_ITEM = QUESTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Set Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Set Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PropositionalQuestion <em>Propositional Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PropositionalQuestion
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPropositionalQuestion()
	 * @generated
	 */
	int PROPOSITIONAL_QUESTION = 11;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITIONAL_QUESTION__BINDING = QUESTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITIONAL_QUESTION__SEMANTIC_CONTENT = QUESTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITIONAL_QUESTION__IS_ELLIPSIS = QUESTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITIONAL_QUESTION__KNOWLEDGE_ITEM = QUESTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Propositional Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITIONAL_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Propositional Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITIONAL_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.CheckQuestion <em>Check Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.CheckQuestion
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getCheckQuestion()
	 * @generated
	 */
	int CHECK_QUESTION = 12;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUESTION__BINDING = PROPOSITIONAL_QUESTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUESTION__SEMANTIC_CONTENT = PROPOSITIONAL_QUESTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUESTION__IS_ELLIPSIS = PROPOSITIONAL_QUESTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUESTION__KNOWLEDGE_ITEM = PROPOSITIONAL_QUESTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Check Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUESTION_FEATURE_COUNT = PROPOSITIONAL_QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Check Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_QUESTION_OPERATION_COUNT = PROPOSITIONAL_QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveCheckQuestionImpl <em>Positive Check Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveCheckQuestionImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveCheckQuestion()
	 * @generated
	 */
	int POSITIVE_CHECK_QUESTION = 13;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_CHECK_QUESTION__BINDING = CHECK_QUESTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_CHECK_QUESTION__SEMANTIC_CONTENT = CHECK_QUESTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_CHECK_QUESTION__IS_ELLIPSIS = CHECK_QUESTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_CHECK_QUESTION__KNOWLEDGE_ITEM = CHECK_QUESTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Positive Check Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_CHECK_QUESTION_FEATURE_COUNT = CHECK_QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Check Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_CHECK_QUESTION_OPERATION_COUNT = CHECK_QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeCheckQuestionImpl <em>Negative Check Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeCheckQuestionImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeCheckQuestion()
	 * @generated
	 */
	int NEGATIVE_CHECK_QUESTION = 14;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_CHECK_QUESTION__BINDING = CHECK_QUESTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_CHECK_QUESTION__SEMANTIC_CONTENT = CHECK_QUESTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_CHECK_QUESTION__IS_ELLIPSIS = CHECK_QUESTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_CHECK_QUESTION__KNOWLEDGE_ITEM = CHECK_QUESTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Negative Check Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_CHECK_QUESTION_FEATURE_COUNT = CHECK_QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negative Check Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_CHECK_QUESTION_OPERATION_COUNT = CHECK_QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ChoiceQuestion <em>Choice Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ChoiceQuestion
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getChoiceQuestion()
	 * @generated
	 */
	int CHOICE_QUESTION = 15;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_QUESTION__BINDING = QUESTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_QUESTION__SEMANTIC_CONTENT = QUESTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_QUESTION__IS_ELLIPSIS = QUESTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_QUESTION__KNOWLEDGE_ITEM = QUESTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Choice Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Choice Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InformImpl <em>Inform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InformImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getInform()
	 * @generated
	 */
	int INFORM = 16;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORM__BINDING = INFORMATION_PROVIDING_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORM__SEMANTIC_CONTENT = INFORMATION_PROVIDING_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORM__IS_ELLIPSIS = INFORMATION_PROVIDING_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORM__KNOWLEDGE_ITEM = INFORMATION_PROVIDING_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Inform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORM_FEATURE_COUNT = INFORMATION_PROVIDING_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORM_OPERATION_COUNT = INFORMATION_PROVIDING_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Agreement <em>Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Agreement
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAgreement()
	 * @generated
	 */
	int AGREEMENT = 17;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__BINDING = INFORM__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__SEMANTIC_CONTENT = INFORM__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__IS_ELLIPSIS = INFORM__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__KNOWLEDGE_ITEM = INFORM__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_FEATURE_COUNT = INFORM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_OPERATION_COUNT = INFORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Disagreement <em>Disagreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Disagreement
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getDisagreement()
	 * @generated
	 */
	int DISAGREEMENT = 18;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISAGREEMENT__BINDING = INFORM__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISAGREEMENT__SEMANTIC_CONTENT = INFORM__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISAGREEMENT__IS_ELLIPSIS = INFORM__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISAGREEMENT__KNOWLEDGE_ITEM = INFORM__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Disagreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISAGREEMENT_FEATURE_COUNT = INFORM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disagreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISAGREEMENT_OPERATION_COUNT = INFORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AnswerImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 19;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__BINDING = INFORM__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__SEMANTIC_CONTENT = INFORM__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__IS_ELLIPSIS = INFORM__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__KNOWLEDGE_ITEM = INFORM__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = INFORM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPERATION_COUNT = INFORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Correction <em>Correction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Correction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getCorrection()
	 * @generated
	 */
	int CORRECTION = 20;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECTION__BINDING = DISAGREEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECTION__SEMANTIC_CONTENT = DISAGREEMENT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECTION__IS_ELLIPSIS = DISAGREEMENT__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECTION__KNOWLEDGE_ITEM = DISAGREEMENT__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Correction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECTION_FEATURE_COUNT = DISAGREEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Correction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECTION_OPERATION_COUNT = DISAGREEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ConfirmImpl <em>Confirm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ConfirmImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getConfirm()
	 * @generated
	 */
	int CONFIRM = 21;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM__BINDING = ANSWER__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM__SEMANTIC_CONTENT = ANSWER__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM__IS_ELLIPSIS = ANSWER__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM__KNOWLEDGE_ITEM = ANSWER__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Confirm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Confirm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRM_OPERATION_COUNT = ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.DisconfirmImpl <em>Disconfirm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.DisconfirmImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getDisconfirm()
	 * @generated
	 */
	int DISCONFIRM = 22;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONFIRM__BINDING = ANSWER__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONFIRM__SEMANTIC_CONTENT = ANSWER__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONFIRM__IS_ELLIPSIS = ANSWER__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONFIRM__KNOWLEDGE_ITEM = ANSWER__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Disconfirm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONFIRM_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disconfirm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONFIRM_OPERATION_COUNT = ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Offer <em>Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Offer
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getOffer()
	 * @generated
	 */
	int OFFER = 23;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__BINDING = COMMISSIVE__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__SEMANTIC_CONTENT = COMMISSIVE__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__IS_ELLIPSIS = COMMISSIVE__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__KNOWLEDGE_ITEM = COMMISSIVE__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FEATURE_COUNT = COMMISSIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OPERATION_COUNT = COMMISSIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AddressSuggestion <em>Address Suggestion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AddressSuggestion
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAddressSuggestion()
	 * @generated
	 */
	int ADDRESS_SUGGESTION = 24;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SUGGESTION__BINDING = COMMISSIVE__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SUGGESTION__SEMANTIC_CONTENT = COMMISSIVE__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SUGGESTION__IS_ELLIPSIS = COMMISSIVE__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SUGGESTION__KNOWLEDGE_ITEM = COMMISSIVE__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Address Suggestion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SUGGESTION_FEATURE_COUNT = COMMISSIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Address Suggestion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SUGGESTION_OPERATION_COUNT = COMMISSIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Promise <em>Promise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Promise
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPromise()
	 * @generated
	 */
	int PROMISE = 25;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMISE__BINDING = OFFER__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMISE__SEMANTIC_CONTENT = OFFER__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMISE__IS_ELLIPSIS = OFFER__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMISE__KNOWLEDGE_ITEM = OFFER__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Promise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMISE_FEATURE_COUNT = OFFER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Promise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMISE_OPERATION_COUNT = OFFER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Threat <em>Threat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Threat
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getThreat()
	 * @generated
	 */
	int THREAT = 26;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__BINDING = OFFER__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__SEMANTIC_CONTENT = OFFER__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__IS_ELLIPSIS = OFFER__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__KNOWLEDGE_ITEM = OFFER__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_FEATURE_COUNT = OFFER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_OPERATION_COUNT = OFFER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AddressRequestImpl <em>Address Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AddressRequestImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAddressRequest()
	 * @generated
	 */
	int ADDRESS_REQUEST = 27;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_REQUEST__BINDING = THREAT__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_REQUEST__SEMANTIC_CONTENT = THREAT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_REQUEST__IS_ELLIPSIS = THREAT__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_REQUEST__KNOWLEDGE_ITEM = THREAT__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Address Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_REQUEST_FEATURE_COUNT = THREAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Address Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_REQUEST_OPERATION_COUNT = THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AcceptRequestImpl <em>Accept Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AcceptRequestImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAcceptRequest()
	 * @generated
	 */
	int ACCEPT_REQUEST = 28;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_REQUEST__BINDING = ADDRESS_REQUEST__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_REQUEST__SEMANTIC_CONTENT = ADDRESS_REQUEST__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_REQUEST__IS_ELLIPSIS = ADDRESS_REQUEST__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_REQUEST__KNOWLEDGE_ITEM = ADDRESS_REQUEST__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Accept Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_REQUEST_FEATURE_COUNT = ADDRESS_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Accept Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_REQUEST_OPERATION_COUNT = ADDRESS_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.DeclineRequestImpl <em>Decline Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.DeclineRequestImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getDeclineRequest()
	 * @generated
	 */
	int DECLINE_REQUEST = 29;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLINE_REQUEST__BINDING = ADDRESS_REQUEST__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLINE_REQUEST__SEMANTIC_CONTENT = ADDRESS_REQUEST__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLINE_REQUEST__IS_ELLIPSIS = ADDRESS_REQUEST__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLINE_REQUEST__KNOWLEDGE_ITEM = ADDRESS_REQUEST__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Decline Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLINE_REQUEST_FEATURE_COUNT = ADDRESS_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decline Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLINE_REQUEST_OPERATION_COUNT = ADDRESS_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AcceptSuggestionImpl <em>Accept Suggestion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AcceptSuggestionImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAcceptSuggestion()
	 * @generated
	 */
	int ACCEPT_SUGGESTION = 30;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_SUGGESTION__BINDING = ADDRESS_SUGGESTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_SUGGESTION__SEMANTIC_CONTENT = ADDRESS_SUGGESTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_SUGGESTION__IS_ELLIPSIS = ADDRESS_SUGGESTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_SUGGESTION__KNOWLEDGE_ITEM = ADDRESS_SUGGESTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Accept Suggestion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_SUGGESTION_FEATURE_COUNT = ADDRESS_SUGGESTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Accept Suggestion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_SUGGESTION_OPERATION_COUNT = ADDRESS_SUGGESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.DeclineSuggestionImpl <em>Decline Suggestion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.DeclineSuggestionImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getDeclineSuggestion()
	 * @generated
	 */
	int DECLINE_SUGGESTION = 31;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLINE_SUGGESTION__BINDING = ADDRESS_SUGGESTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLINE_SUGGESTION__SEMANTIC_CONTENT = ADDRESS_SUGGESTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLINE_SUGGESTION__IS_ELLIPSIS = ADDRESS_SUGGESTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLINE_SUGGESTION__KNOWLEDGE_ITEM = ADDRESS_SUGGESTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Decline Suggestion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLINE_SUGGESTION_FEATURE_COUNT = ADDRESS_SUGGESTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decline Suggestion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLINE_SUGGESTION_OPERATION_COUNT = ADDRESS_SUGGESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.RequestImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 32;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__BINDING = DIRECTIVE__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__SEMANTIC_CONTENT = DIRECTIVE__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__IS_ELLIPSIS = DIRECTIVE__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__KNOWLEDGE_ITEM = DIRECTIVE__KNOWLEDGE_ITEM;

	/**
	 * The feature id for the '<em><b>Request Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__REQUEST_INFO = DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = DIRECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InstructImpl <em>Instruct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InstructImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getInstruct()
	 * @generated
	 */
	int INSTRUCT = 33;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCT__BINDING = REQUEST__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCT__SEMANTIC_CONTENT = REQUEST__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCT__IS_ELLIPSIS = REQUEST__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCT__KNOWLEDGE_ITEM = REQUEST__KNOWLEDGE_ITEM;

	/**
	 * The feature id for the '<em><b>Request Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCT__REQUEST_INFO = REQUEST__REQUEST_INFO;

	/**
	 * The number of structural features of the '<em>Instruct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCT_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instruct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCT_OPERATION_COUNT = REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AddressOfferImpl <em>Address Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AddressOfferImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAddressOffer()
	 * @generated
	 */
	int ADDRESS_OFFER = 34;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OFFER__BINDING = REQUEST__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OFFER__SEMANTIC_CONTENT = REQUEST__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OFFER__IS_ELLIPSIS = REQUEST__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OFFER__KNOWLEDGE_ITEM = REQUEST__KNOWLEDGE_ITEM;

	/**
	 * The feature id for the '<em><b>Request Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OFFER__REQUEST_INFO = REQUEST__REQUEST_INFO;

	/**
	 * The number of structural features of the '<em>Address Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OFFER_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Address Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OFFER_OPERATION_COUNT = REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AcceptOfferImpl <em>Accept Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AcceptOfferImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAcceptOffer()
	 * @generated
	 */
	int ACCEPT_OFFER = 35;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_OFFER__BINDING = ADDRESS_OFFER__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_OFFER__SEMANTIC_CONTENT = ADDRESS_OFFER__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_OFFER__IS_ELLIPSIS = ADDRESS_OFFER__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_OFFER__KNOWLEDGE_ITEM = ADDRESS_OFFER__KNOWLEDGE_ITEM;

	/**
	 * The feature id for the '<em><b>Request Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_OFFER__REQUEST_INFO = ADDRESS_OFFER__REQUEST_INFO;

	/**
	 * The number of structural features of the '<em>Accept Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_OFFER_FEATURE_COUNT = ADDRESS_OFFER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Accept Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_OFFER_OPERATION_COUNT = ADDRESS_OFFER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.DeclineOfferImpl <em>Decline Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.DeclineOfferImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getDeclineOffer()
	 * @generated
	 */
	int DECLINE_OFFER = 36;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLINE_OFFER__BINDING = ADDRESS_OFFER__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLINE_OFFER__SEMANTIC_CONTENT = ADDRESS_OFFER__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLINE_OFFER__IS_ELLIPSIS = ADDRESS_OFFER__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLINE_OFFER__KNOWLEDGE_ITEM = ADDRESS_OFFER__KNOWLEDGE_ITEM;

	/**
	 * The feature id for the '<em><b>Request Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLINE_OFFER__REQUEST_INFO = ADDRESS_OFFER__REQUEST_INFO;

	/**
	 * The number of structural features of the '<em>Decline Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLINE_OFFER_FEATURE_COUNT = ADDRESS_OFFER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decline Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLINE_OFFER_OPERATION_COUNT = ADDRESS_OFFER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SuggestionImpl <em>Suggestion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SuggestionImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getSuggestion()
	 * @generated
	 */
	int SUGGESTION = 37;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGGESTION__BINDING = DIRECTIVE__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGGESTION__SEMANTIC_CONTENT = DIRECTIVE__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGGESTION__IS_ELLIPSIS = DIRECTIVE__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGGESTION__KNOWLEDGE_ITEM = DIRECTIVE__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Suggestion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGGESTION_FEATURE_COUNT = DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Suggestion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGGESTION_OPERATION_COUNT = DIRECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.DimensionSpecificCommunicativeFunction <em>Dimension Specific Communicative Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.DimensionSpecificCommunicativeFunction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getDimensionSpecificCommunicativeFunction()
	 * @generated
	 */
	int DIMENSION_SPECIFIC_COMMUNICATIVE_FUNCTION = 38;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_SPECIFIC_COMMUNICATIVE_FUNCTION__BINDING = COMMUNICATIVE_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_SPECIFIC_COMMUNICATIVE_FUNCTION__SEMANTIC_CONTENT = COMMUNICATIVE_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_SPECIFIC_COMMUNICATIVE_FUNCTION__IS_ELLIPSIS = COMMUNICATIVE_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_SPECIFIC_COMMUNICATIVE_FUNCTION__KNOWLEDGE_ITEM = COMMUNICATIVE_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Dimension Specific Communicative Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_SPECIFIC_COMMUNICATIVE_FUNCTION_FEATURE_COUNT = COMMUNICATIVE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dimension Specific Communicative Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_SPECIFIC_COMMUNICATIVE_FUNCTION_OPERATION_COUNT = COMMUNICATIVE_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.DialogueControlFunction <em>Dialogue Control Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.DialogueControlFunction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getDialogueControlFunction()
	 * @generated
	 */
	int DIALOGUE_CONTROL_FUNCTION = 39;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_CONTROL_FUNCTION__BINDING = DIMENSION_SPECIFIC_COMMUNICATIVE_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_CONTROL_FUNCTION__SEMANTIC_CONTENT = DIMENSION_SPECIFIC_COMMUNICATIVE_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_CONTROL_FUNCTION__IS_ELLIPSIS = DIMENSION_SPECIFIC_COMMUNICATIVE_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_CONTROL_FUNCTION__KNOWLEDGE_ITEM = DIMENSION_SPECIFIC_COMMUNICATIVE_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Dialogue Control Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_CONTROL_FUNCTION_FEATURE_COUNT = DIMENSION_SPECIFIC_COMMUNICATIVE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dialogue Control Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_CONTROL_FUNCTION_OPERATION_COUNT = DIMENSION_SPECIFIC_COMMUNICATIVE_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackFunction <em>Feedback Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackFunction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getFeedbackFunction()
	 * @generated
	 */
	int FEEDBACK_FUNCTION = 40;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FUNCTION__BINDING = DIALOGUE_CONTROL_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FUNCTION__SEMANTIC_CONTENT = DIALOGUE_CONTROL_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FUNCTION__IS_ELLIPSIS = DIALOGUE_CONTROL_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FUNCTION__KNOWLEDGE_ITEM = DIALOGUE_CONTROL_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Feedback Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FUNCTION_FEATURE_COUNT = DIALOGUE_CONTROL_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feedback Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FUNCTION_OPERATION_COUNT = DIALOGUE_CONTROL_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AutoFeedback <em>Auto Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AutoFeedback
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAutoFeedback()
	 * @generated
	 */
	int AUTO_FEEDBACK = 41;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_FEEDBACK__BINDING = FEEDBACK_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_FEEDBACK__SEMANTIC_CONTENT = FEEDBACK_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_FEEDBACK__IS_ELLIPSIS = FEEDBACK_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_FEEDBACK__KNOWLEDGE_ITEM = FEEDBACK_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_FEEDBACK_FEATURE_COUNT = FEEDBACK_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_FEEDBACK_OPERATION_COUNT = FEEDBACK_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AlloFeedback <em>Allo Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AlloFeedback
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAlloFeedback()
	 * @generated
	 */
	int ALLO_FEEDBACK = 42;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLO_FEEDBACK__BINDING = FEEDBACK_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLO_FEEDBACK__SEMANTIC_CONTENT = FEEDBACK_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLO_FEEDBACK__IS_ELLIPSIS = FEEDBACK_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLO_FEEDBACK__KNOWLEDGE_ITEM = FEEDBACK_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLO_FEEDBACK_FEATURE_COUNT = FEEDBACK_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLO_FEEDBACK_OPERATION_COUNT = FEEDBACK_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InteractionManagementFunction <em>Interaction Management Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InteractionManagementFunction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getInteractionManagementFunction()
	 * @generated
	 */
	int INTERACTION_MANAGEMENT_FUNCTION = 43;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_MANAGEMENT_FUNCTION__BINDING = DIALOGUE_CONTROL_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT = DIALOGUE_CONTROL_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_MANAGEMENT_FUNCTION__IS_ELLIPSIS = DIALOGUE_CONTROL_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM = DIALOGUE_CONTROL_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Interaction Management Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_MANAGEMENT_FUNCTION_FEATURE_COUNT = DIALOGUE_CONTROL_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interaction Management Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_MANAGEMENT_FUNCTION_OPERATION_COUNT = DIALOGUE_CONTROL_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnManagementFunction <em>Turn Management Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnManagementFunction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTurnManagementFunction()
	 * @generated
	 */
	int TURN_MANAGEMENT_FUNCTION = 44;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_MANAGEMENT_FUNCTION__BINDING = INTERACTION_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT = INTERACTION_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_MANAGEMENT_FUNCTION__IS_ELLIPSIS = INTERACTION_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM = INTERACTION_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Turn Management Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_MANAGEMENT_FUNCTION_FEATURE_COUNT = INTERACTION_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn Management Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_MANAGEMENT_FUNCTION_OPERATION_COUNT = INTERACTION_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TimeManagementFunction <em>Time Management Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TimeManagementFunction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTimeManagementFunction()
	 * @generated
	 */
	int TIME_MANAGEMENT_FUNCTION = 45;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MANAGEMENT_FUNCTION__BINDING = INTERACTION_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT = INTERACTION_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MANAGEMENT_FUNCTION__IS_ELLIPSIS = INTERACTION_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM = INTERACTION_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Time Management Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MANAGEMENT_FUNCTION_FEATURE_COUNT = INTERACTION_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Management Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_MANAGEMENT_FUNCTION_OPERATION_COUNT = INTERACTION_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ContactManagementFunction <em>Contact Management Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ContactManagementFunction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getContactManagementFunction()
	 * @generated
	 */
	int CONTACT_MANAGEMENT_FUNCTION = 46;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MANAGEMENT_FUNCTION__BINDING = INTERACTION_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT = INTERACTION_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MANAGEMENT_FUNCTION__IS_ELLIPSIS = INTERACTION_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM = INTERACTION_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Contact Management Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MANAGEMENT_FUNCTION_FEATURE_COUNT = INTERACTION_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contact Management Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MANAGEMENT_FUNCTION_OPERATION_COUNT = INTERACTION_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.OwnCommunicationManagementFunction <em>Own Communication Management Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.OwnCommunicationManagementFunction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getOwnCommunicationManagementFunction()
	 * @generated
	 */
	int OWN_COMMUNICATION_MANAGEMENT_FUNCTION = 47;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWN_COMMUNICATION_MANAGEMENT_FUNCTION__BINDING = INTERACTION_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWN_COMMUNICATION_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT = INTERACTION_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWN_COMMUNICATION_MANAGEMENT_FUNCTION__IS_ELLIPSIS = INTERACTION_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWN_COMMUNICATION_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM = INTERACTION_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Own Communication Management Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWN_COMMUNICATION_MANAGEMENT_FUNCTION_FEATURE_COUNT = INTERACTION_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Own Communication Management Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWN_COMMUNICATION_MANAGEMENT_FUNCTION_OPERATION_COUNT = INTERACTION_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PartnerCommunicationManagementFunction <em>Partner Communication Management Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PartnerCommunicationManagementFunction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPartnerCommunicationManagementFunction()
	 * @generated
	 */
	int PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION = 48;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION__BINDING = INTERACTION_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT = INTERACTION_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION__IS_ELLIPSIS = INTERACTION_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM = INTERACTION_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Partner Communication Management Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION_FEATURE_COUNT = INTERACTION_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Partner Communication Management Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION_OPERATION_COUNT = INTERACTION_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.DiscourseStructureManagementFunction <em>Discourse Structure Management Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.DiscourseStructureManagementFunction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getDiscourseStructureManagementFunction()
	 * @generated
	 */
	int DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION = 49;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION__BINDING = INTERACTION_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT = INTERACTION_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION__IS_ELLIPSIS = INTERACTION_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM = INTERACTION_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Discourse Structure Management Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION_FEATURE_COUNT = INTERACTION_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Discourse Structure Management Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION_OPERATION_COUNT = INTERACTION_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SocialObligationManagementFunction <em>Social Obligation Management Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.SocialObligationManagementFunction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getSocialObligationManagementFunction()
	 * @generated
	 */
	int SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION = 50;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__BINDING = DIALOGUE_CONTROL_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT = DIALOGUE_CONTROL_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__IS_ELLIPSIS = DIALOGUE_CONTROL_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM = DIALOGUE_CONTROL_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Social Obligation Management Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION_FEATURE_COUNT = DIALOGUE_CONTROL_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Social Obligation Management Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION_OPERATION_COUNT = DIALOGUE_CONTROL_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Salutation <em>Salutation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Salutation
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getSalutation()
	 * @generated
	 */
	int SALUTATION = 51;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALUTATION__BINDING = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALUTATION__SEMANTIC_CONTENT = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALUTATION__IS_ELLIPSIS = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALUTATION__KNOWLEDGE_ITEM = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Salutation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALUTATION_FEATURE_COUNT = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Salutation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALUTATION_OPERATION_COUNT = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SelfIntroduction <em>Self Introduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.SelfIntroduction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getSelfIntroduction()
	 * @generated
	 */
	int SELF_INTRODUCTION = 52;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_INTRODUCTION__BINDING = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_INTRODUCTION__SEMANTIC_CONTENT = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_INTRODUCTION__IS_ELLIPSIS = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_INTRODUCTION__KNOWLEDGE_ITEM = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Self Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_INTRODUCTION_FEATURE_COUNT = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Self Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_INTRODUCTION_OPERATION_COUNT = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Apologizing <em>Apologizing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Apologizing
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getApologizing()
	 * @generated
	 */
	int APOLOGIZING = 53;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOLOGIZING__BINDING = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOLOGIZING__SEMANTIC_CONTENT = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOLOGIZING__IS_ELLIPSIS = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOLOGIZING__KNOWLEDGE_ITEM = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Apologizing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOLOGIZING_FEATURE_COUNT = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Apologizing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOLOGIZING_OPERATION_COUNT = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Gratitude <em>Gratitude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Gratitude
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getGratitude()
	 * @generated
	 */
	int GRATITUDE = 54;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRATITUDE__BINDING = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRATITUDE__SEMANTIC_CONTENT = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRATITUDE__IS_ELLIPSIS = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRATITUDE__KNOWLEDGE_ITEM = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Gratitude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRATITUDE_FEATURE_COUNT = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gratitude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRATITUDE_OPERATION_COUNT = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Valediction <em>Valediction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Valediction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getValediction()
	 * @generated
	 */
	int VALEDICTION = 55;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALEDICTION__BINDING = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALEDICTION__SEMANTIC_CONTENT = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALEDICTION__IS_ELLIPSIS = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALEDICTION__KNOWLEDGE_ITEM = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Valediction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALEDICTION_FEATURE_COUNT = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Valediction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALEDICTION_OPERATION_COUNT = SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InitialGreetingImpl <em>Initial Greeting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InitialGreetingImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getInitialGreeting()
	 * @generated
	 */
	int INITIAL_GREETING = 56;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_GREETING__BINDING = SALUTATION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_GREETING__SEMANTIC_CONTENT = SALUTATION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_GREETING__IS_ELLIPSIS = SALUTATION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_GREETING__KNOWLEDGE_ITEM = SALUTATION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Initial Greeting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_GREETING_FEATURE_COUNT = SALUTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial Greeting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_GREETING_OPERATION_COUNT = SALUTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ReturnGreetingImpl <em>Return Greeting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ReturnGreetingImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getReturnGreeting()
	 * @generated
	 */
	int RETURN_GREETING = 57;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_GREETING__BINDING = SALUTATION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_GREETING__SEMANTIC_CONTENT = SALUTATION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_GREETING__IS_ELLIPSIS = SALUTATION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_GREETING__KNOWLEDGE_ITEM = SALUTATION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Return Greeting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_GREETING_FEATURE_COUNT = SALUTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Return Greeting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_GREETING_OPERATION_COUNT = SALUTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InitialSelfIntroductionImpl <em>Initial Self Introduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InitialSelfIntroductionImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getInitialSelfIntroduction()
	 * @generated
	 */
	int INITIAL_SELF_INTRODUCTION = 58;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SELF_INTRODUCTION__BINDING = SELF_INTRODUCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SELF_INTRODUCTION__SEMANTIC_CONTENT = SELF_INTRODUCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SELF_INTRODUCTION__IS_ELLIPSIS = SELF_INTRODUCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SELF_INTRODUCTION__KNOWLEDGE_ITEM = SELF_INTRODUCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Initial Self Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SELF_INTRODUCTION_FEATURE_COUNT = SELF_INTRODUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial Self Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_SELF_INTRODUCTION_OPERATION_COUNT = SELF_INTRODUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ReturnSelfIntroductionImpl <em>Return Self Introduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ReturnSelfIntroductionImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getReturnSelfIntroduction()
	 * @generated
	 */
	int RETURN_SELF_INTRODUCTION = 59;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SELF_INTRODUCTION__BINDING = SELF_INTRODUCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SELF_INTRODUCTION__SEMANTIC_CONTENT = SELF_INTRODUCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SELF_INTRODUCTION__IS_ELLIPSIS = SELF_INTRODUCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SELF_INTRODUCTION__KNOWLEDGE_ITEM = SELF_INTRODUCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Return Self Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SELF_INTRODUCTION_FEATURE_COUNT = SELF_INTRODUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Return Self Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SELF_INTRODUCTION_OPERATION_COUNT = SELF_INTRODUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ApologyImpl <em>Apology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ApologyImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getApology()
	 * @generated
	 */
	int APOLOGY = 60;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOLOGY__BINDING = APOLOGIZING__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOLOGY__SEMANTIC_CONTENT = APOLOGIZING__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOLOGY__IS_ELLIPSIS = APOLOGIZING__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOLOGY__KNOWLEDGE_ITEM = APOLOGIZING__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Apology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOLOGY_FEATURE_COUNT = APOLOGIZING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Apology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOLOGY_OPERATION_COUNT = APOLOGIZING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ApologyDownplayImpl <em>Apology Downplay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ApologyDownplayImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getApologyDownplay()
	 * @generated
	 */
	int APOLOGY_DOWNPLAY = 61;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOLOGY_DOWNPLAY__BINDING = APOLOGIZING__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOLOGY_DOWNPLAY__SEMANTIC_CONTENT = APOLOGIZING__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOLOGY_DOWNPLAY__IS_ELLIPSIS = APOLOGIZING__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOLOGY_DOWNPLAY__KNOWLEDGE_ITEM = APOLOGIZING__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Apology Downplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOLOGY_DOWNPLAY_FEATURE_COUNT = APOLOGIZING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Apology Downplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOLOGY_DOWNPLAY_OPERATION_COUNT = APOLOGIZING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ThankingImpl <em>Thanking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ThankingImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getThanking()
	 * @generated
	 */
	int THANKING = 62;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THANKING__BINDING = GRATITUDE__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THANKING__SEMANTIC_CONTENT = GRATITUDE__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THANKING__IS_ELLIPSIS = GRATITUDE__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THANKING__KNOWLEDGE_ITEM = GRATITUDE__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Thanking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THANKING_FEATURE_COUNT = GRATITUDE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Thanking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THANKING_OPERATION_COUNT = GRATITUDE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ThankingDownplayImpl <em>Thanking Downplay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ThankingDownplayImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getThankingDownplay()
	 * @generated
	 */
	int THANKING_DOWNPLAY = 63;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THANKING_DOWNPLAY__BINDING = GRATITUDE__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THANKING_DOWNPLAY__SEMANTIC_CONTENT = GRATITUDE__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THANKING_DOWNPLAY__IS_ELLIPSIS = GRATITUDE__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THANKING_DOWNPLAY__KNOWLEDGE_ITEM = GRATITUDE__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Thanking Downplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THANKING_DOWNPLAY_FEATURE_COUNT = GRATITUDE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Thanking Downplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THANKING_DOWNPLAY_OPERATION_COUNT = GRATITUDE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InitialGoodbyeImpl <em>Initial Goodbye</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InitialGoodbyeImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getInitialGoodbye()
	 * @generated
	 */
	int INITIAL_GOODBYE = 64;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_GOODBYE__BINDING = VALEDICTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_GOODBYE__SEMANTIC_CONTENT = VALEDICTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_GOODBYE__IS_ELLIPSIS = VALEDICTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_GOODBYE__KNOWLEDGE_ITEM = VALEDICTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Initial Goodbye</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_GOODBYE_FEATURE_COUNT = VALEDICTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial Goodbye</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_GOODBYE_OPERATION_COUNT = VALEDICTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ReturnGoodbyeImpl <em>Return Goodbye</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ReturnGoodbyeImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getReturnGoodbye()
	 * @generated
	 */
	int RETURN_GOODBYE = 65;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_GOODBYE__BINDING = VALEDICTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_GOODBYE__SEMANTIC_CONTENT = VALEDICTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_GOODBYE__IS_ELLIPSIS = VALEDICTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_GOODBYE__KNOWLEDGE_ITEM = VALEDICTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Return Goodbye</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_GOODBYE_FEATURE_COUNT = VALEDICTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Return Goodbye</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_GOODBYE_OPERATION_COUNT = VALEDICTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.OpeningImpl <em>Opening</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.OpeningImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getOpening()
	 * @generated
	 */
	int OPENING = 66;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING__BINDING = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING__SEMANTIC_CONTENT = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING__IS_ELLIPSIS = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING__KNOWLEDGE_ITEM = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Opening</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_FEATURE_COUNT = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Opening</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_OPERATION_COUNT = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PreclosingImpl <em>Preclosing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PreclosingImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPreclosing()
	 * @generated
	 */
	int PRECLOSING = 67;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECLOSING__BINDING = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECLOSING__SEMANTIC_CONTENT = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECLOSING__IS_ELLIPSIS = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECLOSING__KNOWLEDGE_ITEM = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Preclosing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECLOSING_FEATURE_COUNT = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Preclosing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECLOSING_OPERATION_COUNT = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TopicIntroductionImpl <em>Topic Introduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TopicIntroductionImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTopicIntroduction()
	 * @generated
	 */
	int TOPIC_INTRODUCTION = 68;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_INTRODUCTION__BINDING = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_INTRODUCTION__SEMANTIC_CONTENT = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_INTRODUCTION__IS_ELLIPSIS = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_INTRODUCTION__KNOWLEDGE_ITEM = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Topic Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_INTRODUCTION_FEATURE_COUNT = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Topic Introduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_INTRODUCTION_OPERATION_COUNT = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TopicShiftAnnouncementImpl <em>Topic Shift Announcement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TopicShiftAnnouncementImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTopicShiftAnnouncement()
	 * @generated
	 */
	int TOPIC_SHIFT_ANNOUNCEMENT = 69;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SHIFT_ANNOUNCEMENT__BINDING = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SHIFT_ANNOUNCEMENT__SEMANTIC_CONTENT = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SHIFT_ANNOUNCEMENT__IS_ELLIPSIS = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SHIFT_ANNOUNCEMENT__KNOWLEDGE_ITEM = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Topic Shift Announcement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SHIFT_ANNOUNCEMENT_FEATURE_COUNT = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Topic Shift Announcement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SHIFT_ANNOUNCEMENT_OPERATION_COUNT = DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TopicShiftImpl <em>Topic Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TopicShiftImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTopicShift()
	 * @generated
	 */
	int TOPIC_SHIFT = 70;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SHIFT__BINDING = TOPIC_SHIFT_ANNOUNCEMENT__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SHIFT__SEMANTIC_CONTENT = TOPIC_SHIFT_ANNOUNCEMENT__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SHIFT__IS_ELLIPSIS = TOPIC_SHIFT_ANNOUNCEMENT__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SHIFT__KNOWLEDGE_ITEM = TOPIC_SHIFT_ANNOUNCEMENT__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Topic Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SHIFT_FEATURE_COUNT = TOPIC_SHIFT_ANNOUNCEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Topic Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SHIFT_OPERATION_COUNT = TOPIC_SHIFT_ANNOUNCEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.CompletionImpl <em>Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.CompletionImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getCompletion()
	 * @generated
	 */
	int COMPLETION = 71;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION__BINDING = PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION__SEMANTIC_CONTENT = PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION__IS_ELLIPSIS = PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION__KNOWLEDGE_ITEM = PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_FEATURE_COUNT = PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_OPERATION_COUNT = PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.CorrectMisspeakingImpl <em>Correct Misspeaking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.CorrectMisspeakingImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getCorrectMisspeaking()
	 * @generated
	 */
	int CORRECT_MISSPEAKING = 72;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECT_MISSPEAKING__BINDING = PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECT_MISSPEAKING__SEMANTIC_CONTENT = PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECT_MISSPEAKING__IS_ELLIPSIS = PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECT_MISSPEAKING__KNOWLEDGE_ITEM = PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Correct Misspeaking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECT_MISSPEAKING_FEATURE_COUNT = PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Correct Misspeaking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRECT_MISSPEAKING_OPERATION_COUNT = PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ErrorSignalingImpl <em>Error Signaling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ErrorSignalingImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getErrorSignaling()
	 * @generated
	 */
	int ERROR_SIGNALING = 73;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SIGNALING__BINDING = OWN_COMMUNICATION_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SIGNALING__SEMANTIC_CONTENT = OWN_COMMUNICATION_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SIGNALING__IS_ELLIPSIS = OWN_COMMUNICATION_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SIGNALING__KNOWLEDGE_ITEM = OWN_COMMUNICATION_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Error Signaling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SIGNALING_FEATURE_COUNT = OWN_COMMUNICATION_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Error Signaling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SIGNALING_OPERATION_COUNT = OWN_COMMUNICATION_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.RetractionImpl <em>Retraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.RetractionImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getRetraction()
	 * @generated
	 */
	int RETRACTION = 74;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRACTION__BINDING = ERROR_SIGNALING__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRACTION__SEMANTIC_CONTENT = ERROR_SIGNALING__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRACTION__IS_ELLIPSIS = ERROR_SIGNALING__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRACTION__KNOWLEDGE_ITEM = ERROR_SIGNALING__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Retraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRACTION_FEATURE_COUNT = ERROR_SIGNALING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Retraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRACTION_OPERATION_COUNT = ERROR_SIGNALING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SelfCorrectionImpl <em>Self Correction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SelfCorrectionImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getSelfCorrection()
	 * @generated
	 */
	int SELF_CORRECTION = 75;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_CORRECTION__BINDING = RETRACTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_CORRECTION__SEMANTIC_CONTENT = RETRACTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_CORRECTION__IS_ELLIPSIS = RETRACTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_CORRECTION__KNOWLEDGE_ITEM = RETRACTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Self Correction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_CORRECTION_FEATURE_COUNT = RETRACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Self Correction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_CORRECTION_OPERATION_COUNT = RETRACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ContactCheckImpl <em>Contact Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ContactCheckImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getContactCheck()
	 * @generated
	 */
	int CONTACT_CHECK = 76;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_CHECK__BINDING = CONTACT_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_CHECK__SEMANTIC_CONTENT = CONTACT_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_CHECK__IS_ELLIPSIS = CONTACT_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_CHECK__KNOWLEDGE_ITEM = CONTACT_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Contact Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_CHECK_FEATURE_COUNT = CONTACT_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contact Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_CHECK_OPERATION_COUNT = CONTACT_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ContactIndicationImpl <em>Contact Indication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ContactIndicationImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getContactIndication()
	 * @generated
	 */
	int CONTACT_INDICATION = 77;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INDICATION__BINDING = CONTACT_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INDICATION__SEMANTIC_CONTENT = CONTACT_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INDICATION__IS_ELLIPSIS = CONTACT_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INDICATION__KNOWLEDGE_ITEM = CONTACT_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Contact Indication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INDICATION_FEATURE_COUNT = CONTACT_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contact Indication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INDICATION_OPERATION_COUNT = CONTACT_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.StallingImpl <em>Stalling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.StallingImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getStalling()
	 * @generated
	 */
	int STALLING = 78;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STALLING__BINDING = TIME_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STALLING__SEMANTIC_CONTENT = TIME_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STALLING__IS_ELLIPSIS = TIME_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STALLING__KNOWLEDGE_ITEM = TIME_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Stalling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STALLING_FEATURE_COUNT = TIME_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stalling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STALLING_OPERATION_COUNT = TIME_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PausingImpl <em>Pausing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PausingImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPausing()
	 * @generated
	 */
	int PAUSING = 79;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSING__BINDING = TIME_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSING__SEMANTIC_CONTENT = TIME_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSING__IS_ELLIPSIS = TIME_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSING__KNOWLEDGE_ITEM = TIME_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Pausing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSING_FEATURE_COUNT = TIME_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pausing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSING_OPERATION_COUNT = TIME_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnUnitInitialFuntion <em>Turn Unit Initial Funtion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnUnitInitialFuntion
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTurnUnitInitialFuntion()
	 * @generated
	 */
	int TURN_UNIT_INITIAL_FUNTION = 80;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_UNIT_INITIAL_FUNTION__BINDING = TURN_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_UNIT_INITIAL_FUNTION__SEMANTIC_CONTENT = TURN_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_UNIT_INITIAL_FUNTION__IS_ELLIPSIS = TURN_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_UNIT_INITIAL_FUNTION__KNOWLEDGE_ITEM = TURN_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Turn Unit Initial Funtion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_UNIT_INITIAL_FUNTION_FEATURE_COUNT = TURN_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn Unit Initial Funtion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_UNIT_INITIAL_FUNTION_OPERATION_COUNT = TURN_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnUnitFinalFunction <em>Turn Unit Final Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnUnitFinalFunction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTurnUnitFinalFunction()
	 * @generated
	 */
	int TURN_UNIT_FINAL_FUNCTION = 81;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_UNIT_FINAL_FUNCTION__BINDING = TURN_MANAGEMENT_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_UNIT_FINAL_FUNCTION__SEMANTIC_CONTENT = TURN_MANAGEMENT_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_UNIT_FINAL_FUNCTION__IS_ELLIPSIS = TURN_MANAGEMENT_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_UNIT_FINAL_FUNCTION__KNOWLEDGE_ITEM = TURN_MANAGEMENT_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Turn Unit Final Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_UNIT_FINAL_FUNCTION_FEATURE_COUNT = TURN_MANAGEMENT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn Unit Final Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_UNIT_FINAL_FUNCTION_OPERATION_COUNT = TURN_MANAGEMENT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnAcceptImpl <em>Turn Accept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnAcceptImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTurnAccept()
	 * @generated
	 */
	int TURN_ACCEPT = 82;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ACCEPT__BINDING = TURN_UNIT_INITIAL_FUNTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ACCEPT__SEMANTIC_CONTENT = TURN_UNIT_INITIAL_FUNTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ACCEPT__IS_ELLIPSIS = TURN_UNIT_INITIAL_FUNTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ACCEPT__KNOWLEDGE_ITEM = TURN_UNIT_INITIAL_FUNTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Turn Accept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ACCEPT_FEATURE_COUNT = TURN_UNIT_INITIAL_FUNTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn Accept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ACCEPT_OPERATION_COUNT = TURN_UNIT_INITIAL_FUNTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnGrabImpl <em>Turn Grab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnGrabImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTurnGrab()
	 * @generated
	 */
	int TURN_GRAB = 83;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_GRAB__BINDING = TURN_UNIT_INITIAL_FUNTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_GRAB__SEMANTIC_CONTENT = TURN_UNIT_INITIAL_FUNTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_GRAB__IS_ELLIPSIS = TURN_UNIT_INITIAL_FUNTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_GRAB__KNOWLEDGE_ITEM = TURN_UNIT_INITIAL_FUNTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Turn Grab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_GRAB_FEATURE_COUNT = TURN_UNIT_INITIAL_FUNTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn Grab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_GRAB_OPERATION_COUNT = TURN_UNIT_INITIAL_FUNTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnTakeImpl <em>Turn Take</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnTakeImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTurnTake()
	 * @generated
	 */
	int TURN_TAKE = 84;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TAKE__BINDING = TURN_UNIT_INITIAL_FUNTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TAKE__SEMANTIC_CONTENT = TURN_UNIT_INITIAL_FUNTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TAKE__IS_ELLIPSIS = TURN_UNIT_INITIAL_FUNTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TAKE__KNOWLEDGE_ITEM = TURN_UNIT_INITIAL_FUNTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Turn Take</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TAKE_FEATURE_COUNT = TURN_UNIT_INITIAL_FUNTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn Take</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_TAKE_OPERATION_COUNT = TURN_UNIT_INITIAL_FUNTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnAssignImpl <em>Turn Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnAssignImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTurnAssign()
	 * @generated
	 */
	int TURN_ASSIGN = 85;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ASSIGN__BINDING = TURN_UNIT_FINAL_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ASSIGN__SEMANTIC_CONTENT = TURN_UNIT_FINAL_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ASSIGN__IS_ELLIPSIS = TURN_UNIT_FINAL_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ASSIGN__KNOWLEDGE_ITEM = TURN_UNIT_FINAL_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Turn Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ASSIGN_FEATURE_COUNT = TURN_UNIT_FINAL_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_ASSIGN_OPERATION_COUNT = TURN_UNIT_FINAL_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnKeepImpl <em>Turn Keep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnKeepImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTurnKeep()
	 * @generated
	 */
	int TURN_KEEP = 86;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_KEEP__BINDING = TURN_UNIT_FINAL_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_KEEP__SEMANTIC_CONTENT = TURN_UNIT_FINAL_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_KEEP__IS_ELLIPSIS = TURN_UNIT_FINAL_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_KEEP__KNOWLEDGE_ITEM = TURN_UNIT_FINAL_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Turn Keep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_KEEP_FEATURE_COUNT = TURN_UNIT_FINAL_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn Keep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_KEEP_OPERATION_COUNT = TURN_UNIT_FINAL_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnReleaseImpl <em>Turn Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnReleaseImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTurnRelease()
	 * @generated
	 */
	int TURN_RELEASE = 87;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RELEASE__BINDING = TURN_UNIT_FINAL_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RELEASE__SEMANTIC_CONTENT = TURN_UNIT_FINAL_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RELEASE__IS_ELLIPSIS = TURN_UNIT_FINAL_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RELEASE__KNOWLEDGE_ITEM = TURN_UNIT_FINAL_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Turn Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RELEASE_FEATURE_COUNT = TURN_UNIT_FINAL_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RELEASE_OPERATION_COUNT = TURN_UNIT_FINAL_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackElicitationFunction <em>Feedback Elicitation Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackElicitationFunction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getFeedbackElicitationFunction()
	 * @generated
	 */
	int FEEDBACK_ELICITATION_FUNCTION = 88;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_ELICITATION_FUNCTION__BINDING = ALLO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_ELICITATION_FUNCTION__SEMANTIC_CONTENT = ALLO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_ELICITATION_FUNCTION__IS_ELLIPSIS = ALLO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_ELICITATION_FUNCTION__KNOWLEDGE_ITEM = ALLO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Feedback Elicitation Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_ELICITATION_FUNCTION_FEATURE_COUNT = ALLO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feedback Elicitation Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_ELICITATION_FUNCTION_OPERATION_COUNT = ALLO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AttentionFeedbackElicitationImpl <em>Attention Feedback Elicitation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AttentionFeedbackElicitationImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAttentionFeedbackElicitation()
	 * @generated
	 */
	int ATTENTION_FEEDBACK_ELICITATION = 89;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENTION_FEEDBACK_ELICITATION__BINDING = FEEDBACK_ELICITATION_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENTION_FEEDBACK_ELICITATION__SEMANTIC_CONTENT = FEEDBACK_ELICITATION_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENTION_FEEDBACK_ELICITATION__IS_ELLIPSIS = FEEDBACK_ELICITATION_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENTION_FEEDBACK_ELICITATION__KNOWLEDGE_ITEM = FEEDBACK_ELICITATION_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Attention Feedback Elicitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENTION_FEEDBACK_ELICITATION_FEATURE_COUNT = FEEDBACK_ELICITATION_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attention Feedback Elicitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENTION_FEEDBACK_ELICITATION_OPERATION_COUNT = FEEDBACK_ELICITATION_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PerceptionFeedbackElicitationImpl <em>Perception Feedback Elicitation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PerceptionFeedbackElicitationImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPerceptionFeedbackElicitation()
	 * @generated
	 */
	int PERCEPTION_FEEDBACK_ELICITATION = 90;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPTION_FEEDBACK_ELICITATION__BINDING = FEEDBACK_ELICITATION_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPTION_FEEDBACK_ELICITATION__SEMANTIC_CONTENT = FEEDBACK_ELICITATION_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPTION_FEEDBACK_ELICITATION__IS_ELLIPSIS = FEEDBACK_ELICITATION_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPTION_FEEDBACK_ELICITATION__KNOWLEDGE_ITEM = FEEDBACK_ELICITATION_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Perception Feedback Elicitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPTION_FEEDBACK_ELICITATION_FEATURE_COUNT = FEEDBACK_ELICITATION_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Perception Feedback Elicitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPTION_FEEDBACK_ELICITATION_OPERATION_COUNT = FEEDBACK_ELICITATION_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InterpretationFeedbackElicitationImpl <em>Interpretation Feedback Elicitation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InterpretationFeedbackElicitationImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getInterpretationFeedbackElicitation()
	 * @generated
	 */
	int INTERPRETATION_FEEDBACK_ELICITATION = 91;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_FEEDBACK_ELICITATION__BINDING = FEEDBACK_ELICITATION_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_FEEDBACK_ELICITATION__SEMANTIC_CONTENT = FEEDBACK_ELICITATION_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_FEEDBACK_ELICITATION__IS_ELLIPSIS = FEEDBACK_ELICITATION_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_FEEDBACK_ELICITATION__KNOWLEDGE_ITEM = FEEDBACK_ELICITATION_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Interpretation Feedback Elicitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_FEEDBACK_ELICITATION_FEATURE_COUNT = FEEDBACK_ELICITATION_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interpretation Feedback Elicitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETATION_FEEDBACK_ELICITATION_OPERATION_COUNT = FEEDBACK_ELICITATION_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.EvaluationFeedackElicitationImpl <em>Evaluation Feedack Elicitation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.EvaluationFeedackElicitationImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getEvaluationFeedackElicitation()
	 * @generated
	 */
	int EVALUATION_FEEDACK_ELICITATION = 92;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FEEDACK_ELICITATION__BINDING = FEEDBACK_ELICITATION_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FEEDACK_ELICITATION__SEMANTIC_CONTENT = FEEDBACK_ELICITATION_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FEEDACK_ELICITATION__IS_ELLIPSIS = FEEDBACK_ELICITATION_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FEEDACK_ELICITATION__KNOWLEDGE_ITEM = FEEDBACK_ELICITATION_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Evaluation Feedack Elicitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FEEDACK_ELICITATION_FEATURE_COUNT = FEEDBACK_ELICITATION_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evaluation Feedack Elicitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FEEDACK_ELICITATION_OPERATION_COUNT = FEEDBACK_ELICITATION_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ExecutionFeedbackElicitationImpl <em>Execution Feedback Elicitation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ExecutionFeedbackElicitationImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getExecutionFeedbackElicitation()
	 * @generated
	 */
	int EXECUTION_FEEDBACK_ELICITATION = 93;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FEEDBACK_ELICITATION__BINDING = FEEDBACK_ELICITATION_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FEEDBACK_ELICITATION__SEMANTIC_CONTENT = FEEDBACK_ELICITATION_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FEEDBACK_ELICITATION__IS_ELLIPSIS = FEEDBACK_ELICITATION_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FEEDBACK_ELICITATION__KNOWLEDGE_ITEM = FEEDBACK_ELICITATION_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Execution Feedback Elicitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FEEDBACK_ELICITATION_FEATURE_COUNT = FEEDBACK_ELICITATION_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execution Feedback Elicitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FEEDBACK_ELICITATION_OPERATION_COUNT = FEEDBACK_ELICITATION_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackGivingFunction <em>Feedback Giving Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackGivingFunction
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getFeedbackGivingFunction()
	 * @generated
	 */
	int FEEDBACK_GIVING_FUNCTION = 94;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_GIVING_FUNCTION__BINDING = ALLO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_GIVING_FUNCTION__SEMANTIC_CONTENT = ALLO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_GIVING_FUNCTION__IS_ELLIPSIS = ALLO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_GIVING_FUNCTION__KNOWLEDGE_ITEM = ALLO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Feedback Giving Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_GIVING_FUNCTION_FEATURE_COUNT = ALLO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feedback Giving Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_GIVING_FUNCTION_OPERATION_COUNT = ALLO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveAlloFeedbackImpl <em>Positive Allo Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveAlloFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveAlloFeedback()
	 * @generated
	 */
	int POSITIVE_ALLO_FEEDBACK = 95;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_ALLO_FEEDBACK__BINDING = FEEDBACK_GIVING_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_ALLO_FEEDBACK__SEMANTIC_CONTENT = FEEDBACK_GIVING_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_ALLO_FEEDBACK__IS_ELLIPSIS = FEEDBACK_GIVING_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_ALLO_FEEDBACK__KNOWLEDGE_ITEM = FEEDBACK_GIVING_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Positive Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_ALLO_FEEDBACK_FEATURE_COUNT = FEEDBACK_GIVING_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_ALLO_FEEDBACK_OPERATION_COUNT = FEEDBACK_GIVING_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeAlloFeedbackImpl <em>Negative Allo Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeAlloFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeAlloFeedback()
	 * @generated
	 */
	int NEGATIVE_ALLO_FEEDBACK = 96;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_ALLO_FEEDBACK__BINDING = FEEDBACK_GIVING_FUNCTION__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_ALLO_FEEDBACK__SEMANTIC_CONTENT = FEEDBACK_GIVING_FUNCTION__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_ALLO_FEEDBACK__IS_ELLIPSIS = FEEDBACK_GIVING_FUNCTION__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_ALLO_FEEDBACK__KNOWLEDGE_ITEM = FEEDBACK_GIVING_FUNCTION__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Negative Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_ALLO_FEEDBACK_FEATURE_COUNT = FEEDBACK_GIVING_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negative Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_ALLO_FEEDBACK_OPERATION_COUNT = FEEDBACK_GIVING_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveAttentionAlloFeedbackImpl <em>Positive Attention Allo Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveAttentionAlloFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveAttentionAlloFeedback()
	 * @generated
	 */
	int POSITIVE_ATTENTION_ALLO_FEEDBACK = 118;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_ATTENTION_ALLO_FEEDBACK__BINDING = POSITIVE_ALLO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_ATTENTION_ALLO_FEEDBACK__SEMANTIC_CONTENT = POSITIVE_ALLO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_ATTENTION_ALLO_FEEDBACK__IS_ELLIPSIS = POSITIVE_ALLO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_ATTENTION_ALLO_FEEDBACK__KNOWLEDGE_ITEM = POSITIVE_ALLO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Positive Attention Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_ATTENTION_ALLO_FEEDBACK_FEATURE_COUNT = POSITIVE_ALLO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Attention Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_ATTENTION_ALLO_FEEDBACK_OPERATION_COUNT = POSITIVE_ALLO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositivePerceptionAlloFeedbackImpl <em>Positive Perception Allo Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositivePerceptionAlloFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositivePerceptionAlloFeedback()
	 * @generated
	 */
	int POSITIVE_PERCEPTION_ALLO_FEEDBACK = 103;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_PERCEPTION_ALLO_FEEDBACK__BINDING = POSITIVE_ATTENTION_ALLO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_PERCEPTION_ALLO_FEEDBACK__SEMANTIC_CONTENT = POSITIVE_ATTENTION_ALLO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_PERCEPTION_ALLO_FEEDBACK__IS_ELLIPSIS = POSITIVE_ATTENTION_ALLO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_PERCEPTION_ALLO_FEEDBACK__KNOWLEDGE_ITEM = POSITIVE_ATTENTION_ALLO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Positive Perception Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_PERCEPTION_ALLO_FEEDBACK_FEATURE_COUNT = POSITIVE_ATTENTION_ALLO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Perception Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_PERCEPTION_ALLO_FEEDBACK_OPERATION_COUNT = POSITIVE_ATTENTION_ALLO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveInterpretationAlloFeedbackImpl <em>Positive Interpretation Allo Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveInterpretationAlloFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveInterpretationAlloFeedback()
	 * @generated
	 */
	int POSITIVE_INTERPRETATION_ALLO_FEEDBACK = 101;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTERPRETATION_ALLO_FEEDBACK__BINDING = POSITIVE_PERCEPTION_ALLO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTERPRETATION_ALLO_FEEDBACK__SEMANTIC_CONTENT = POSITIVE_PERCEPTION_ALLO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTERPRETATION_ALLO_FEEDBACK__IS_ELLIPSIS = POSITIVE_PERCEPTION_ALLO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTERPRETATION_ALLO_FEEDBACK__KNOWLEDGE_ITEM = POSITIVE_PERCEPTION_ALLO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Positive Interpretation Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTERPRETATION_ALLO_FEEDBACK_FEATURE_COUNT = POSITIVE_PERCEPTION_ALLO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Interpretation Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTERPRETATION_ALLO_FEEDBACK_OPERATION_COUNT = POSITIVE_PERCEPTION_ALLO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveEvaluationAlloFeedbackImpl <em>Positive Evaluation Allo Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveEvaluationAlloFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveEvaluationAlloFeedback()
	 * @generated
	 */
	int POSITIVE_EVALUATION_ALLO_FEEDBACK = 99;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EVALUATION_ALLO_FEEDBACK__BINDING = POSITIVE_INTERPRETATION_ALLO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EVALUATION_ALLO_FEEDBACK__SEMANTIC_CONTENT = POSITIVE_INTERPRETATION_ALLO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EVALUATION_ALLO_FEEDBACK__IS_ELLIPSIS = POSITIVE_INTERPRETATION_ALLO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EVALUATION_ALLO_FEEDBACK__KNOWLEDGE_ITEM = POSITIVE_INTERPRETATION_ALLO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Positive Evaluation Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EVALUATION_ALLO_FEEDBACK_FEATURE_COUNT = POSITIVE_INTERPRETATION_ALLO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Evaluation Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EVALUATION_ALLO_FEEDBACK_OPERATION_COUNT = POSITIVE_INTERPRETATION_ALLO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveExecutionAlloFeedbackImpl <em>Positive Execution Allo Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveExecutionAlloFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveExecutionAlloFeedback()
	 * @generated
	 */
	int POSITIVE_EXECUTION_ALLO_FEEDBACK = 97;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EXECUTION_ALLO_FEEDBACK__BINDING = POSITIVE_EVALUATION_ALLO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EXECUTION_ALLO_FEEDBACK__SEMANTIC_CONTENT = POSITIVE_EVALUATION_ALLO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EXECUTION_ALLO_FEEDBACK__IS_ELLIPSIS = POSITIVE_EVALUATION_ALLO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EXECUTION_ALLO_FEEDBACK__KNOWLEDGE_ITEM = POSITIVE_EVALUATION_ALLO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Positive Execution Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EXECUTION_ALLO_FEEDBACK_FEATURE_COUNT = POSITIVE_EVALUATION_ALLO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Execution Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EXECUTION_ALLO_FEEDBACK_OPERATION_COUNT = POSITIVE_EVALUATION_ALLO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeExecutionAlloFeedbackImpl <em>Negative Execution Allo Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeExecutionAlloFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeExecutionAlloFeedback()
	 * @generated
	 */
	int NEGATIVE_EXECUTION_ALLO_FEEDBACK = 98;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EXECUTION_ALLO_FEEDBACK__BINDING = NEGATIVE_ALLO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EXECUTION_ALLO_FEEDBACK__SEMANTIC_CONTENT = NEGATIVE_ALLO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EXECUTION_ALLO_FEEDBACK__IS_ELLIPSIS = NEGATIVE_ALLO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EXECUTION_ALLO_FEEDBACK__KNOWLEDGE_ITEM = NEGATIVE_ALLO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Negative Execution Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EXECUTION_ALLO_FEEDBACK_FEATURE_COUNT = NEGATIVE_ALLO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negative Execution Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EXECUTION_ALLO_FEEDBACK_OPERATION_COUNT = NEGATIVE_ALLO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeEvaluationAlloFeedbackImpl <em>Negative Evaluation Allo Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeEvaluationAlloFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeEvaluationAlloFeedback()
	 * @generated
	 */
	int NEGATIVE_EVALUATION_ALLO_FEEDBACK = 100;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EVALUATION_ALLO_FEEDBACK__BINDING = NEGATIVE_EXECUTION_ALLO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EVALUATION_ALLO_FEEDBACK__SEMANTIC_CONTENT = NEGATIVE_EXECUTION_ALLO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EVALUATION_ALLO_FEEDBACK__IS_ELLIPSIS = NEGATIVE_EXECUTION_ALLO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EVALUATION_ALLO_FEEDBACK__KNOWLEDGE_ITEM = NEGATIVE_EXECUTION_ALLO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Negative Evaluation Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EVALUATION_ALLO_FEEDBACK_FEATURE_COUNT = NEGATIVE_EXECUTION_ALLO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negative Evaluation Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EVALUATION_ALLO_FEEDBACK_OPERATION_COUNT = NEGATIVE_EXECUTION_ALLO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeInterpretationAlloFeedbackImpl <em>Negative Interpretation Allo Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeInterpretationAlloFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeInterpretationAlloFeedback()
	 * @generated
	 */
	int NEGATIVE_INTERPRETATION_ALLO_FEEDBACK = 102;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_INTERPRETATION_ALLO_FEEDBACK__BINDING = NEGATIVE_EVALUATION_ALLO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_INTERPRETATION_ALLO_FEEDBACK__SEMANTIC_CONTENT = NEGATIVE_EVALUATION_ALLO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_INTERPRETATION_ALLO_FEEDBACK__IS_ELLIPSIS = NEGATIVE_EVALUATION_ALLO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_INTERPRETATION_ALLO_FEEDBACK__KNOWLEDGE_ITEM = NEGATIVE_EVALUATION_ALLO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Negative Interpretation Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_INTERPRETATION_ALLO_FEEDBACK_FEATURE_COUNT = NEGATIVE_EVALUATION_ALLO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negative Interpretation Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_INTERPRETATION_ALLO_FEEDBACK_OPERATION_COUNT = NEGATIVE_EVALUATION_ALLO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativePerceptionAlloFeedbackImpl <em>Negative Perception Allo Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativePerceptionAlloFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativePerceptionAlloFeedback()
	 * @generated
	 */
	int NEGATIVE_PERCEPTION_ALLO_FEEDBACK = 104;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PERCEPTION_ALLO_FEEDBACK__BINDING = NEGATIVE_INTERPRETATION_ALLO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PERCEPTION_ALLO_FEEDBACK__SEMANTIC_CONTENT = NEGATIVE_INTERPRETATION_ALLO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PERCEPTION_ALLO_FEEDBACK__IS_ELLIPSIS = NEGATIVE_INTERPRETATION_ALLO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PERCEPTION_ALLO_FEEDBACK__KNOWLEDGE_ITEM = NEGATIVE_INTERPRETATION_ALLO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Negative Perception Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PERCEPTION_ALLO_FEEDBACK_FEATURE_COUNT = NEGATIVE_INTERPRETATION_ALLO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negative Perception Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PERCEPTION_ALLO_FEEDBACK_OPERATION_COUNT = NEGATIVE_INTERPRETATION_ALLO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeAttentionAlloFeedbackImpl <em>Negative Attention Allo Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeAttentionAlloFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeAttentionAlloFeedback()
	 * @generated
	 */
	int NEGATIVE_ATTENTION_ALLO_FEEDBACK = 105;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_ATTENTION_ALLO_FEEDBACK__BINDING = NEGATIVE_PERCEPTION_ALLO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_ATTENTION_ALLO_FEEDBACK__SEMANTIC_CONTENT = NEGATIVE_PERCEPTION_ALLO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_ATTENTION_ALLO_FEEDBACK__IS_ELLIPSIS = NEGATIVE_PERCEPTION_ALLO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_ATTENTION_ALLO_FEEDBACK__KNOWLEDGE_ITEM = NEGATIVE_PERCEPTION_ALLO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Negative Attention Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_ATTENTION_ALLO_FEEDBACK_FEATURE_COUNT = NEGATIVE_PERCEPTION_ALLO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negative Attention Allo Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_ATTENTION_ALLO_FEEDBACK_OPERATION_COUNT = NEGATIVE_PERCEPTION_ALLO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveAutoFeedbackImpl <em>Positive Auto Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveAutoFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveAutoFeedback()
	 * @generated
	 */
	int POSITIVE_AUTO_FEEDBACK = 106;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTO_FEEDBACK__BINDING = AUTO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTO_FEEDBACK__SEMANTIC_CONTENT = AUTO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTO_FEEDBACK__IS_ELLIPSIS = AUTO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTO_FEEDBACK__KNOWLEDGE_ITEM = AUTO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Positive Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTO_FEEDBACK_FEATURE_COUNT = AUTO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_AUTO_FEEDBACK_OPERATION_COUNT = AUTO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeAutoFeedbackImpl <em>Negative Auto Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeAutoFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeAutoFeedback()
	 * @generated
	 */
	int NEGATIVE_AUTO_FEEDBACK = 107;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTO_FEEDBACK__BINDING = AUTO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTO_FEEDBACK__SEMANTIC_CONTENT = AUTO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTO_FEEDBACK__IS_ELLIPSIS = AUTO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTO_FEEDBACK__KNOWLEDGE_ITEM = AUTO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Negative Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTO_FEEDBACK_FEATURE_COUNT = AUTO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negative Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_AUTO_FEEDBACK_OPERATION_COUNT = AUTO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveAttentionAutoFeedbackImpl <em>Positive Attention Auto Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveAttentionAutoFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveAttentionAutoFeedback()
	 * @generated
	 */
	int POSITIVE_ATTENTION_AUTO_FEEDBACK = 116;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_ATTENTION_AUTO_FEEDBACK__BINDING = POSITIVE_AUTO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_ATTENTION_AUTO_FEEDBACK__SEMANTIC_CONTENT = POSITIVE_AUTO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_ATTENTION_AUTO_FEEDBACK__IS_ELLIPSIS = POSITIVE_AUTO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_ATTENTION_AUTO_FEEDBACK__KNOWLEDGE_ITEM = POSITIVE_AUTO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Positive Attention Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_ATTENTION_AUTO_FEEDBACK_FEATURE_COUNT = POSITIVE_AUTO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Attention Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_ATTENTION_AUTO_FEEDBACK_OPERATION_COUNT = POSITIVE_AUTO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositivePerceptionAutoFeedbackImpl <em>Positive Perception Auto Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositivePerceptionAutoFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositivePerceptionAutoFeedback()
	 * @generated
	 */
	int POSITIVE_PERCEPTION_AUTO_FEEDBACK = 112;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_PERCEPTION_AUTO_FEEDBACK__BINDING = POSITIVE_ATTENTION_AUTO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_PERCEPTION_AUTO_FEEDBACK__SEMANTIC_CONTENT = POSITIVE_ATTENTION_AUTO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_PERCEPTION_AUTO_FEEDBACK__IS_ELLIPSIS = POSITIVE_ATTENTION_AUTO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_PERCEPTION_AUTO_FEEDBACK__KNOWLEDGE_ITEM = POSITIVE_ATTENTION_AUTO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Positive Perception Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_PERCEPTION_AUTO_FEEDBACK_FEATURE_COUNT = POSITIVE_ATTENTION_AUTO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Perception Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_PERCEPTION_AUTO_FEEDBACK_OPERATION_COUNT = POSITIVE_ATTENTION_AUTO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveInterpretationAutoFeedbackImpl <em>Positive Interpretation Auto Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveInterpretationAutoFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveInterpretationAutoFeedback()
	 * @generated
	 */
	int POSITIVE_INTERPRETATION_AUTO_FEEDBACK = 114;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTERPRETATION_AUTO_FEEDBACK__BINDING = POSITIVE_PERCEPTION_AUTO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTERPRETATION_AUTO_FEEDBACK__SEMANTIC_CONTENT = POSITIVE_PERCEPTION_AUTO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTERPRETATION_AUTO_FEEDBACK__IS_ELLIPSIS = POSITIVE_PERCEPTION_AUTO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTERPRETATION_AUTO_FEEDBACK__KNOWLEDGE_ITEM = POSITIVE_PERCEPTION_AUTO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Positive Interpretation Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTERPRETATION_AUTO_FEEDBACK_FEATURE_COUNT = POSITIVE_PERCEPTION_AUTO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Interpretation Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTERPRETATION_AUTO_FEEDBACK_OPERATION_COUNT = POSITIVE_PERCEPTION_AUTO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveEvaluationAutoFeedbackImpl <em>Positive Evaluation Auto Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveEvaluationAutoFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveEvaluationAutoFeedback()
	 * @generated
	 */
	int POSITIVE_EVALUATION_AUTO_FEEDBACK = 110;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EVALUATION_AUTO_FEEDBACK__BINDING = POSITIVE_INTERPRETATION_AUTO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EVALUATION_AUTO_FEEDBACK__SEMANTIC_CONTENT = POSITIVE_INTERPRETATION_AUTO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EVALUATION_AUTO_FEEDBACK__IS_ELLIPSIS = POSITIVE_INTERPRETATION_AUTO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EVALUATION_AUTO_FEEDBACK__KNOWLEDGE_ITEM = POSITIVE_INTERPRETATION_AUTO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Positive Evaluation Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EVALUATION_AUTO_FEEDBACK_FEATURE_COUNT = POSITIVE_INTERPRETATION_AUTO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Evaluation Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EVALUATION_AUTO_FEEDBACK_OPERATION_COUNT = POSITIVE_INTERPRETATION_AUTO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveExecutionAutoFeedbackImpl <em>Positive Execution Auto Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveExecutionAutoFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveExecutionAutoFeedback()
	 * @generated
	 */
	int POSITIVE_EXECUTION_AUTO_FEEDBACK = 108;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EXECUTION_AUTO_FEEDBACK__BINDING = POSITIVE_EVALUATION_AUTO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EXECUTION_AUTO_FEEDBACK__SEMANTIC_CONTENT = POSITIVE_EVALUATION_AUTO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EXECUTION_AUTO_FEEDBACK__IS_ELLIPSIS = POSITIVE_EVALUATION_AUTO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EXECUTION_AUTO_FEEDBACK__KNOWLEDGE_ITEM = POSITIVE_EVALUATION_AUTO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Positive Execution Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EXECUTION_AUTO_FEEDBACK_FEATURE_COUNT = POSITIVE_EVALUATION_AUTO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Execution Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_EXECUTION_AUTO_FEEDBACK_OPERATION_COUNT = POSITIVE_EVALUATION_AUTO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeExecutionAutoFeedbackImpl <em>Negative Execution Auto Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeExecutionAutoFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeExecutionAutoFeedback()
	 * @generated
	 */
	int NEGATIVE_EXECUTION_AUTO_FEEDBACK = 109;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EXECUTION_AUTO_FEEDBACK__BINDING = NEGATIVE_AUTO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EXECUTION_AUTO_FEEDBACK__SEMANTIC_CONTENT = NEGATIVE_AUTO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EXECUTION_AUTO_FEEDBACK__IS_ELLIPSIS = NEGATIVE_AUTO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EXECUTION_AUTO_FEEDBACK__KNOWLEDGE_ITEM = NEGATIVE_AUTO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Negative Execution Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EXECUTION_AUTO_FEEDBACK_FEATURE_COUNT = NEGATIVE_AUTO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negative Execution Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EXECUTION_AUTO_FEEDBACK_OPERATION_COUNT = NEGATIVE_AUTO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeEvaluationAutoFeedbackImpl <em>Negative Evaluation Auto Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeEvaluationAutoFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeEvaluationAutoFeedback()
	 * @generated
	 */
	int NEGATIVE_EVALUATION_AUTO_FEEDBACK = 111;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EVALUATION_AUTO_FEEDBACK__BINDING = NEGATIVE_EXECUTION_AUTO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EVALUATION_AUTO_FEEDBACK__SEMANTIC_CONTENT = NEGATIVE_EXECUTION_AUTO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EVALUATION_AUTO_FEEDBACK__IS_ELLIPSIS = NEGATIVE_EXECUTION_AUTO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EVALUATION_AUTO_FEEDBACK__KNOWLEDGE_ITEM = NEGATIVE_EXECUTION_AUTO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Negative Evaluation Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EVALUATION_AUTO_FEEDBACK_FEATURE_COUNT = NEGATIVE_EXECUTION_AUTO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negative Evaluation Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_EVALUATION_AUTO_FEEDBACK_OPERATION_COUNT = NEGATIVE_EXECUTION_AUTO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeInterpretationAutoFeedbackImpl <em>Negative Interpretation Auto Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeInterpretationAutoFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeInterpretationAutoFeedback()
	 * @generated
	 */
	int NEGATIVE_INTERPRETATION_AUTO_FEEDBACK = 115;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_INTERPRETATION_AUTO_FEEDBACK__BINDING = NEGATIVE_EVALUATION_AUTO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_INTERPRETATION_AUTO_FEEDBACK__SEMANTIC_CONTENT = NEGATIVE_EVALUATION_AUTO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_INTERPRETATION_AUTO_FEEDBACK__IS_ELLIPSIS = NEGATIVE_EVALUATION_AUTO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_INTERPRETATION_AUTO_FEEDBACK__KNOWLEDGE_ITEM = NEGATIVE_EVALUATION_AUTO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Negative Interpretation Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_INTERPRETATION_AUTO_FEEDBACK_FEATURE_COUNT = NEGATIVE_EVALUATION_AUTO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negative Interpretation Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_INTERPRETATION_AUTO_FEEDBACK_OPERATION_COUNT = NEGATIVE_EVALUATION_AUTO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativePerceptionAutoFeedbackImpl <em>Negative Perception Auto Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativePerceptionAutoFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativePerceptionAutoFeedback()
	 * @generated
	 */
	int NEGATIVE_PERCEPTION_AUTO_FEEDBACK = 113;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PERCEPTION_AUTO_FEEDBACK__BINDING = NEGATIVE_INTERPRETATION_AUTO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PERCEPTION_AUTO_FEEDBACK__SEMANTIC_CONTENT = NEGATIVE_INTERPRETATION_AUTO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PERCEPTION_AUTO_FEEDBACK__IS_ELLIPSIS = NEGATIVE_INTERPRETATION_AUTO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PERCEPTION_AUTO_FEEDBACK__KNOWLEDGE_ITEM = NEGATIVE_INTERPRETATION_AUTO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Negative Perception Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PERCEPTION_AUTO_FEEDBACK_FEATURE_COUNT = NEGATIVE_INTERPRETATION_AUTO_FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negative Perception Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_PERCEPTION_AUTO_FEEDBACK_OPERATION_COUNT = NEGATIVE_INTERPRETATION_AUTO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeAttentionAutoFeedbackImpl <em>Negative Attention Auto Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeAttentionAutoFeedbackImpl
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeAttentionAutoFeedback()
	 * @generated
	 */
	int NEGATIVE_ATTENTION_AUTO_FEEDBACK = 117;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_ATTENTION_AUTO_FEEDBACK__BINDING = NEGATIVE_PERCEPTION_AUTO_FEEDBACK__BINDING;

	/**
	 * The feature id for the '<em><b>Semantic Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_ATTENTION_AUTO_FEEDBACK__SEMANTIC_CONTENT = NEGATIVE_PERCEPTION_AUTO_FEEDBACK__SEMANTIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Is Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_ATTENTION_AUTO_FEEDBACK__IS_ELLIPSIS = NEGATIVE_PERCEPTION_AUTO_FEEDBACK__IS_ELLIPSIS;

	/**
	 * The feature id for the '<em><b>Knowledge Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_ATTENTION_AUTO_FEEDBACK__KNOWLEDGE_ITEM = NEGATIVE_PERCEPTION_AUTO_FEEDBACK__KNOWLEDGE_ITEM;

	/**
	 * The number of structural features of the '<em>Negative Attention Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_ATTENTION_AUTO_FEEDBACK_FEATURE_COUNT = NEGATIVE_PERCEPTION_AUTO_FEEDBACK_FEATURE_COUNT + 0;


	/**
	 * The number of operations of the '<em>Negative Attention Auto Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_ATTENTION_AUTO_FEEDBACK_OPERATION_COUNT = NEGATIVE_PERCEPTION_AUTO_FEEDBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ResolveState <em>Resolve State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ResolveState
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getResolveState()
	 * @generated
	 */
	int RESOLVE_STATE = 119;

	/**
	 * The meta object id for the '<em>Resolve State Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getResolveStateObject()
	 * @generated
	 */
	int RESOLVE_STATE_OBJECT = 120;

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent <em>Semantic Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Content</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent
	 * @generated
	 */
	EClass getSemanticContent();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent#getContent()
	 * @see #getSemanticContent()
	 * @generated
	 */
	EReference getSemanticContent_Content();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent#getReference()
	 * @see #getSemanticContent()
	 * @generated
	 */
	EReference getSemanticContent_Reference();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent#getResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent#getResolved()
	 * @see #getSemanticContent()
	 * @generated
	 */
	EAttribute getSemanticContent_Resolved();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent#getId()
	 * @see #getSemanticContent()
	 * @generated
	 */
	EAttribute getSemanticContent_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent#getValidity <em>Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validity</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent#getValidity()
	 * @see #getSemanticContent()
	 * @generated
	 */
	EAttribute getSemanticContent_Validity();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction <em>Communicative Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communicative Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction
	 * @generated
	 */
	EClass getCommunicativeFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction#getSemanticContent <em>Semantic Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semantic Content</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction#getSemanticContent()
	 * @see #getCommunicativeFunction()
	 * @generated
	 */
	EReference getCommunicativeFunction_SemanticContent();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction#isIsEllipsis <em>Is Ellipsis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ellipsis</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction#isIsEllipsis()
	 * @see #getCommunicativeFunction()
	 * @generated
	 */
	EAttribute getCommunicativeFunction_IsEllipsis();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction#getKnowledgeItem <em>Knowledge Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Knowledge Item</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction#getKnowledgeItem()
	 * @see #getCommunicativeFunction()
	 * @generated
	 */
	EAttribute getCommunicativeFunction_KnowledgeItem();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.GeneralPurposeCommunicativeFunction <em>General Purpose Communicative Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Purpose Communicative Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.GeneralPurposeCommunicativeFunction
	 * @generated
	 */
	EClass getGeneralPurposeCommunicativeFunction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InformationTransferFunction <em>Information Transfer Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Transfer Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InformationTransferFunction
	 * @generated
	 */
	EClass getInformationTransferFunction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InformationSeekingFunction <em>Information Seeking Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Seeking Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InformationSeekingFunction
	 * @generated
	 */
	EClass getInformationSeekingFunction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InformationProvidingFunction <em>Information Providing Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Providing Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InformationProvidingFunction
	 * @generated
	 */
	EClass getInformationProvidingFunction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ActionDiscussionFunction <em>Action Discussion Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Discussion Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ActionDiscussionFunction
	 * @generated
	 */
	EClass getActionDiscussionFunction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Commissive <em>Commissive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commissive</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Commissive
	 * @generated
	 */
	EClass getCommissive();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Directive <em>Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directive</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Directive
	 * @generated
	 */
	EClass getDirective();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SetQuestion <em>Set Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Question</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.SetQuestion
	 * @generated
	 */
	EClass getSetQuestion();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PropositionalQuestion <em>Propositional Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propositional Question</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PropositionalQuestion
	 * @generated
	 */
	EClass getPropositionalQuestion();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.CheckQuestion <em>Check Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Question</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.CheckQuestion
	 * @generated
	 */
	EClass getCheckQuestion();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveCheckQuestion <em>Positive Check Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Check Question</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveCheckQuestion
	 * @generated
	 */
	EClass getPositiveCheckQuestion();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeCheckQuestion <em>Negative Check Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Check Question</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeCheckQuestion
	 * @generated
	 */
	EClass getNegativeCheckQuestion();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ChoiceQuestion <em>Choice Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Question</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ChoiceQuestion
	 * @generated
	 */
	EClass getChoiceQuestion();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Inform <em>Inform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inform</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Inform
	 * @generated
	 */
	EClass getInform();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Agreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agreement</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Agreement
	 * @generated
	 */
	EClass getAgreement();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Disagreement <em>Disagreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disagreement</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Disagreement
	 * @generated
	 */
	EClass getDisagreement();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Correction <em>Correction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correction</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Correction
	 * @generated
	 */
	EClass getCorrection();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Confirm <em>Confirm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confirm</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Confirm
	 * @generated
	 */
	EClass getConfirm();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Disconfirm <em>Disconfirm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disconfirm</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Disconfirm
	 * @generated
	 */
	EClass getDisconfirm();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Offer
	 * @generated
	 */
	EClass getOffer();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AddressSuggestion <em>Address Suggestion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Suggestion</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AddressSuggestion
	 * @generated
	 */
	EClass getAddressSuggestion();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Promise <em>Promise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Promise</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Promise
	 * @generated
	 */
	EClass getPromise();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Threat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Threat
	 * @generated
	 */
	EClass getThreat();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AddressRequest <em>Address Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Request</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AddressRequest
	 * @generated
	 */
	EClass getAddressRequest();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AcceptRequest <em>Accept Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Request</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AcceptRequest
	 * @generated
	 */
	EClass getAcceptRequest();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.DeclineRequest <em>Decline Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decline Request</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.DeclineRequest
	 * @generated
	 */
	EClass getDeclineRequest();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AcceptSuggestion <em>Accept Suggestion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Suggestion</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AcceptSuggestion
	 * @generated
	 */
	EClass getAcceptSuggestion();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.DeclineSuggestion <em>Decline Suggestion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decline Suggestion</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.DeclineSuggestion
	 * @generated
	 */
	EClass getDeclineSuggestion();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Request#getRequestInfo <em>Request Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Info</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Request#getRequestInfo()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_RequestInfo();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Instruct <em>Instruct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruct</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Instruct
	 * @generated
	 */
	EClass getInstruct();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AddressOffer <em>Address Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Offer</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AddressOffer
	 * @generated
	 */
	EClass getAddressOffer();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AcceptOffer <em>Accept Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Offer</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AcceptOffer
	 * @generated
	 */
	EClass getAcceptOffer();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.DeclineOffer <em>Decline Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decline Offer</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.DeclineOffer
	 * @generated
	 */
	EClass getDeclineOffer();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Suggestion <em>Suggestion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suggestion</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Suggestion
	 * @generated
	 */
	EClass getSuggestion();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.DimensionSpecificCommunicativeFunction <em>Dimension Specific Communicative Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Specific Communicative Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.DimensionSpecificCommunicativeFunction
	 * @generated
	 */
	EClass getDimensionSpecificCommunicativeFunction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.DialogueControlFunction <em>Dialogue Control Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialogue Control Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.DialogueControlFunction
	 * @generated
	 */
	EClass getDialogueControlFunction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackFunction <em>Feedback Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackFunction
	 * @generated
	 */
	EClass getFeedbackFunction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AutoFeedback <em>Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AutoFeedback
	 * @generated
	 */
	EClass getAutoFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AlloFeedback <em>Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allo Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AlloFeedback
	 * @generated
	 */
	EClass getAlloFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InteractionManagementFunction <em>Interaction Management Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Management Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InteractionManagementFunction
	 * @generated
	 */
	EClass getInteractionManagementFunction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnManagementFunction <em>Turn Management Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Management Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnManagementFunction
	 * @generated
	 */
	EClass getTurnManagementFunction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TimeManagementFunction <em>Time Management Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Management Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TimeManagementFunction
	 * @generated
	 */
	EClass getTimeManagementFunction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ContactManagementFunction <em>Contact Management Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Management Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ContactManagementFunction
	 * @generated
	 */
	EClass getContactManagementFunction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.OwnCommunicationManagementFunction <em>Own Communication Management Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Own Communication Management Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.OwnCommunicationManagementFunction
	 * @generated
	 */
	EClass getOwnCommunicationManagementFunction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PartnerCommunicationManagementFunction <em>Partner Communication Management Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partner Communication Management Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PartnerCommunicationManagementFunction
	 * @generated
	 */
	EClass getPartnerCommunicationManagementFunction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.DiscourseStructureManagementFunction <em>Discourse Structure Management Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discourse Structure Management Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.DiscourseStructureManagementFunction
	 * @generated
	 */
	EClass getDiscourseStructureManagementFunction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SocialObligationManagementFunction <em>Social Obligation Management Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Obligation Management Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.SocialObligationManagementFunction
	 * @generated
	 */
	EClass getSocialObligationManagementFunction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Salutation <em>Salutation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salutation</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Salutation
	 * @generated
	 */
	EClass getSalutation();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SelfIntroduction <em>Self Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self Introduction</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.SelfIntroduction
	 * @generated
	 */
	EClass getSelfIntroduction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Apologizing <em>Apologizing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apologizing</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Apologizing
	 * @generated
	 */
	EClass getApologizing();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Gratitude <em>Gratitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gratitude</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Gratitude
	 * @generated
	 */
	EClass getGratitude();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Valediction <em>Valediction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valediction</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Valediction
	 * @generated
	 */
	EClass getValediction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InitialGreeting <em>Initial Greeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Greeting</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InitialGreeting
	 * @generated
	 */
	EClass getInitialGreeting();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ReturnGreeting <em>Return Greeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Greeting</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ReturnGreeting
	 * @generated
	 */
	EClass getReturnGreeting();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InitialSelfIntroduction <em>Initial Self Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Self Introduction</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InitialSelfIntroduction
	 * @generated
	 */
	EClass getInitialSelfIntroduction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ReturnSelfIntroduction <em>Return Self Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Self Introduction</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ReturnSelfIntroduction
	 * @generated
	 */
	EClass getReturnSelfIntroduction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Apology <em>Apology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apology</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Apology
	 * @generated
	 */
	EClass getApology();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ApologyDownplay <em>Apology Downplay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apology Downplay</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ApologyDownplay
	 * @generated
	 */
	EClass getApologyDownplay();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Thanking <em>Thanking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thanking</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Thanking
	 * @generated
	 */
	EClass getThanking();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ThankingDownplay <em>Thanking Downplay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thanking Downplay</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ThankingDownplay
	 * @generated
	 */
	EClass getThankingDownplay();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InitialGoodbye <em>Initial Goodbye</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Goodbye</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InitialGoodbye
	 * @generated
	 */
	EClass getInitialGoodbye();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ReturnGoodbye <em>Return Goodbye</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Goodbye</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ReturnGoodbye
	 * @generated
	 */
	EClass getReturnGoodbye();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Opening <em>Opening</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opening</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Opening
	 * @generated
	 */
	EClass getOpening();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Preclosing <em>Preclosing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preclosing</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Preclosing
	 * @generated
	 */
	EClass getPreclosing();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TopicIntroduction <em>Topic Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic Introduction</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TopicIntroduction
	 * @generated
	 */
	EClass getTopicIntroduction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TopicShiftAnnouncement <em>Topic Shift Announcement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic Shift Announcement</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TopicShiftAnnouncement
	 * @generated
	 */
	EClass getTopicShiftAnnouncement();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TopicShift <em>Topic Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic Shift</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TopicShift
	 * @generated
	 */
	EClass getTopicShift();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Completion <em>Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Completion</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Completion
	 * @generated
	 */
	EClass getCompletion();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.CorrectMisspeaking <em>Correct Misspeaking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correct Misspeaking</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.CorrectMisspeaking
	 * @generated
	 */
	EClass getCorrectMisspeaking();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ErrorSignaling <em>Error Signaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Signaling</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ErrorSignaling
	 * @generated
	 */
	EClass getErrorSignaling();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Retraction <em>Retraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retraction</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Retraction
	 * @generated
	 */
	EClass getRetraction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SelfCorrection <em>Self Correction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self Correction</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.SelfCorrection
	 * @generated
	 */
	EClass getSelfCorrection();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ContactCheck <em>Contact Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Check</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ContactCheck
	 * @generated
	 */
	EClass getContactCheck();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ContactIndication <em>Contact Indication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Indication</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ContactIndication
	 * @generated
	 */
	EClass getContactIndication();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Stalling <em>Stalling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stalling</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Stalling
	 * @generated
	 */
	EClass getStalling();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Pausing <em>Pausing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pausing</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Pausing
	 * @generated
	 */
	EClass getPausing();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnUnitInitialFuntion <em>Turn Unit Initial Funtion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Unit Initial Funtion</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnUnitInitialFuntion
	 * @generated
	 */
	EClass getTurnUnitInitialFuntion();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnUnitFinalFunction <em>Turn Unit Final Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Unit Final Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnUnitFinalFunction
	 * @generated
	 */
	EClass getTurnUnitFinalFunction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnAccept <em>Turn Accept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Accept</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnAccept
	 * @generated
	 */
	EClass getTurnAccept();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnGrab <em>Turn Grab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Grab</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnGrab
	 * @generated
	 */
	EClass getTurnGrab();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnTake <em>Turn Take</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Take</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnTake
	 * @generated
	 */
	EClass getTurnTake();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnAssign <em>Turn Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Assign</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnAssign
	 * @generated
	 */
	EClass getTurnAssign();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnKeep <em>Turn Keep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Keep</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnKeep
	 * @generated
	 */
	EClass getTurnKeep();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnRelease <em>Turn Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Release</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnRelease
	 * @generated
	 */
	EClass getTurnRelease();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackElicitationFunction <em>Feedback Elicitation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Elicitation Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackElicitationFunction
	 * @generated
	 */
	EClass getFeedbackElicitationFunction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AttentionFeedbackElicitation <em>Attention Feedback Elicitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attention Feedback Elicitation</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AttentionFeedbackElicitation
	 * @generated
	 */
	EClass getAttentionFeedbackElicitation();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PerceptionFeedbackElicitation <em>Perception Feedback Elicitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perception Feedback Elicitation</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PerceptionFeedbackElicitation
	 * @generated
	 */
	EClass getPerceptionFeedbackElicitation();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InterpretationFeedbackElicitation <em>Interpretation Feedback Elicitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpretation Feedback Elicitation</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InterpretationFeedbackElicitation
	 * @generated
	 */
	EClass getInterpretationFeedbackElicitation();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.EvaluationFeedackElicitation <em>Evaluation Feedack Elicitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Feedack Elicitation</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.EvaluationFeedackElicitation
	 * @generated
	 */
	EClass getEvaluationFeedackElicitation();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ExecutionFeedbackElicitation <em>Execution Feedback Elicitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Feedback Elicitation</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ExecutionFeedbackElicitation
	 * @generated
	 */
	EClass getExecutionFeedbackElicitation();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackGivingFunction <em>Feedback Giving Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Giving Function</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackGivingFunction
	 * @generated
	 */
	EClass getFeedbackGivingFunction();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAlloFeedback <em>Positive Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Allo Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAlloFeedback
	 * @generated
	 */
	EClass getPositiveAlloFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAlloFeedback <em>Negative Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Allo Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAlloFeedback
	 * @generated
	 */
	EClass getNegativeAlloFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveExecutionAlloFeedback <em>Positive Execution Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Execution Allo Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveExecutionAlloFeedback
	 * @generated
	 */
	EClass getPositiveExecutionAlloFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeExecutionAlloFeedback <em>Negative Execution Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Execution Allo Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeExecutionAlloFeedback
	 * @generated
	 */
	EClass getNegativeExecutionAlloFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveEvaluationAlloFeedback <em>Positive Evaluation Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Evaluation Allo Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveEvaluationAlloFeedback
	 * @generated
	 */
	EClass getPositiveEvaluationAlloFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeEvaluationAlloFeedback <em>Negative Evaluation Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Evaluation Allo Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeEvaluationAlloFeedback
	 * @generated
	 */
	EClass getNegativeEvaluationAlloFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveInterpretationAlloFeedback <em>Positive Interpretation Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Interpretation Allo Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveInterpretationAlloFeedback
	 * @generated
	 */
	EClass getPositiveInterpretationAlloFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeInterpretationAlloFeedback <em>Negative Interpretation Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Interpretation Allo Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeInterpretationAlloFeedback
	 * @generated
	 */
	EClass getNegativeInterpretationAlloFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositivePerceptionAlloFeedback <em>Positive Perception Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Perception Allo Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositivePerceptionAlloFeedback
	 * @generated
	 */
	EClass getPositivePerceptionAlloFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativePerceptionAlloFeedback <em>Negative Perception Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Perception Allo Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativePerceptionAlloFeedback
	 * @generated
	 */
	EClass getNegativePerceptionAlloFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAttentionAlloFeedback <em>Negative Attention Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Attention Allo Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAttentionAlloFeedback
	 * @generated
	 */
	EClass getNegativeAttentionAlloFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAutoFeedback <em>Positive Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Auto Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAutoFeedback
	 * @generated
	 */
	EClass getPositiveAutoFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAutoFeedback <em>Negative Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Auto Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAutoFeedback
	 * @generated
	 */
	EClass getNegativeAutoFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveExecutionAutoFeedback <em>Positive Execution Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Execution Auto Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveExecutionAutoFeedback
	 * @generated
	 */
	EClass getPositiveExecutionAutoFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeExecutionAutoFeedback <em>Negative Execution Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Execution Auto Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeExecutionAutoFeedback
	 * @generated
	 */
	EClass getNegativeExecutionAutoFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveEvaluationAutoFeedback <em>Positive Evaluation Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Evaluation Auto Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveEvaluationAutoFeedback
	 * @generated
	 */
	EClass getPositiveEvaluationAutoFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeEvaluationAutoFeedback <em>Negative Evaluation Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Evaluation Auto Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeEvaluationAutoFeedback
	 * @generated
	 */
	EClass getNegativeEvaluationAutoFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositivePerceptionAutoFeedback <em>Positive Perception Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Perception Auto Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositivePerceptionAutoFeedback
	 * @generated
	 */
	EClass getPositivePerceptionAutoFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativePerceptionAutoFeedback <em>Negative Perception Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Perception Auto Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativePerceptionAutoFeedback
	 * @generated
	 */
	EClass getNegativePerceptionAutoFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveInterpretationAutoFeedback <em>Positive Interpretation Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Interpretation Auto Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveInterpretationAutoFeedback
	 * @generated
	 */
	EClass getPositiveInterpretationAutoFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeInterpretationAutoFeedback <em>Negative Interpretation Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Interpretation Auto Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeInterpretationAutoFeedback
	 * @generated
	 */
	EClass getNegativeInterpretationAutoFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAttentionAutoFeedback <em>Positive Attention Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Attention Auto Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAttentionAutoFeedback
	 * @generated
	 */
	EClass getPositiveAttentionAutoFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAttentionAutoFeedback <em>Negative Attention Auto Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Attention Auto Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.NegativeAttentionAutoFeedback
	 * @generated
	 */
	EClass getNegativeAttentionAutoFeedback();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAttentionAlloFeedback <em>Positive Attention Allo Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Attention Allo Feedback</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PositiveAttentionAlloFeedback
	 * @generated
	 */
	EClass getPositiveAttentionAlloFeedback();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ResolveState <em>Resolve State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resolve State</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ResolveState
	 * @generated
	 */
	EEnum getResolveState();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Resolve State Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Resolve State Object</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 *        extendedMetaData="baseType='ResolvedState'"
	 * @generated
	 */
	EDataType getResolveStateObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Communicative_functionsFactory getCommunicative_functionsFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SemanticContentImpl <em>Semantic Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SemanticContentImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getSemanticContent()
		 * @generated
		 */
		EClass SEMANTIC_CONTENT = eINSTANCE.getSemanticContent();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONTENT__CONTENT = eINSTANCE.getSemanticContent_Content();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CONTENT__REFERENCE = eINSTANCE.getSemanticContent_Reference();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_CONTENT__RESOLVED = eINSTANCE.getSemanticContent_Resolved();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_CONTENT__ID = eINSTANCE.getSemanticContent_Id();

		/**
		 * The meta object literal for the '<em><b>Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_CONTENT__VALIDITY = eINSTANCE.getSemanticContent_Validity();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction <em>Communicative Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getCommunicativeFunction()
		 * @generated
		 */
		EClass COMMUNICATIVE_FUNCTION = eINSTANCE.getCommunicativeFunction();

		/**
		 * The meta object literal for the '<em><b>Semantic Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATIVE_FUNCTION__SEMANTIC_CONTENT = eINSTANCE.getCommunicativeFunction_SemanticContent();

		/**
		 * The meta object literal for the '<em><b>Is Ellipsis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATIVE_FUNCTION__IS_ELLIPSIS = eINSTANCE.getCommunicativeFunction_IsEllipsis();

		/**
		 * The meta object literal for the '<em><b>Knowledge Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATIVE_FUNCTION__KNOWLEDGE_ITEM = eINSTANCE.getCommunicativeFunction_KnowledgeItem();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.GeneralPurposeCommunicativeFunction <em>General Purpose Communicative Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.GeneralPurposeCommunicativeFunction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getGeneralPurposeCommunicativeFunction()
		 * @generated
		 */
		EClass GENERAL_PURPOSE_COMMUNICATIVE_FUNCTION = eINSTANCE.getGeneralPurposeCommunicativeFunction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InformationTransferFunction <em>Information Transfer Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InformationTransferFunction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getInformationTransferFunction()
		 * @generated
		 */
		EClass INFORMATION_TRANSFER_FUNCTION = eINSTANCE.getInformationTransferFunction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InformationSeekingFunction <em>Information Seeking Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InformationSeekingFunction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getInformationSeekingFunction()
		 * @generated
		 */
		EClass INFORMATION_SEEKING_FUNCTION = eINSTANCE.getInformationSeekingFunction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InformationProvidingFunction <em>Information Providing Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InformationProvidingFunction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getInformationProvidingFunction()
		 * @generated
		 */
		EClass INFORMATION_PROVIDING_FUNCTION = eINSTANCE.getInformationProvidingFunction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ActionDiscussionFunction <em>Action Discussion Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ActionDiscussionFunction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getActionDiscussionFunction()
		 * @generated
		 */
		EClass ACTION_DISCUSSION_FUNCTION = eINSTANCE.getActionDiscussionFunction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Commissive <em>Commissive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Commissive
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getCommissive()
		 * @generated
		 */
		EClass COMMISSIVE = eINSTANCE.getCommissive();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Directive <em>Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Directive
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getDirective()
		 * @generated
		 */
		EClass DIRECTIVE = eINSTANCE.getDirective();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.QuestionImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SetQuestionImpl <em>Set Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SetQuestionImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getSetQuestion()
		 * @generated
		 */
		EClass SET_QUESTION = eINSTANCE.getSetQuestion();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PropositionalQuestion <em>Propositional Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PropositionalQuestion
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPropositionalQuestion()
		 * @generated
		 */
		EClass PROPOSITIONAL_QUESTION = eINSTANCE.getPropositionalQuestion();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.CheckQuestion <em>Check Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.CheckQuestion
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getCheckQuestion()
		 * @generated
		 */
		EClass CHECK_QUESTION = eINSTANCE.getCheckQuestion();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveCheckQuestionImpl <em>Positive Check Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveCheckQuestionImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveCheckQuestion()
		 * @generated
		 */
		EClass POSITIVE_CHECK_QUESTION = eINSTANCE.getPositiveCheckQuestion();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeCheckQuestionImpl <em>Negative Check Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeCheckQuestionImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeCheckQuestion()
		 * @generated
		 */
		EClass NEGATIVE_CHECK_QUESTION = eINSTANCE.getNegativeCheckQuestion();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ChoiceQuestion <em>Choice Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ChoiceQuestion
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getChoiceQuestion()
		 * @generated
		 */
		EClass CHOICE_QUESTION = eINSTANCE.getChoiceQuestion();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InformImpl <em>Inform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InformImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getInform()
		 * @generated
		 */
		EClass INFORM = eINSTANCE.getInform();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Agreement <em>Agreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Agreement
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAgreement()
		 * @generated
		 */
		EClass AGREEMENT = eINSTANCE.getAgreement();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Disagreement <em>Disagreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Disagreement
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getDisagreement()
		 * @generated
		 */
		EClass DISAGREEMENT = eINSTANCE.getDisagreement();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AnswerImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Correction <em>Correction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Correction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getCorrection()
		 * @generated
		 */
		EClass CORRECTION = eINSTANCE.getCorrection();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ConfirmImpl <em>Confirm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ConfirmImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getConfirm()
		 * @generated
		 */
		EClass CONFIRM = eINSTANCE.getConfirm();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.DisconfirmImpl <em>Disconfirm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.DisconfirmImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getDisconfirm()
		 * @generated
		 */
		EClass DISCONFIRM = eINSTANCE.getDisconfirm();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Offer <em>Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Offer
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getOffer()
		 * @generated
		 */
		EClass OFFER = eINSTANCE.getOffer();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AddressSuggestion <em>Address Suggestion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AddressSuggestion
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAddressSuggestion()
		 * @generated
		 */
		EClass ADDRESS_SUGGESTION = eINSTANCE.getAddressSuggestion();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Promise <em>Promise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Promise
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPromise()
		 * @generated
		 */
		EClass PROMISE = eINSTANCE.getPromise();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Threat <em>Threat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Threat
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getThreat()
		 * @generated
		 */
		EClass THREAT = eINSTANCE.getThreat();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AddressRequestImpl <em>Address Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AddressRequestImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAddressRequest()
		 * @generated
		 */
		EClass ADDRESS_REQUEST = eINSTANCE.getAddressRequest();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AcceptRequestImpl <em>Accept Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AcceptRequestImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAcceptRequest()
		 * @generated
		 */
		EClass ACCEPT_REQUEST = eINSTANCE.getAcceptRequest();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.DeclineRequestImpl <em>Decline Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.DeclineRequestImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getDeclineRequest()
		 * @generated
		 */
		EClass DECLINE_REQUEST = eINSTANCE.getDeclineRequest();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AcceptSuggestionImpl <em>Accept Suggestion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AcceptSuggestionImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAcceptSuggestion()
		 * @generated
		 */
		EClass ACCEPT_SUGGESTION = eINSTANCE.getAcceptSuggestion();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.DeclineSuggestionImpl <em>Decline Suggestion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.DeclineSuggestionImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getDeclineSuggestion()
		 * @generated
		 */
		EClass DECLINE_SUGGESTION = eINSTANCE.getDeclineSuggestion();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.RequestImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Request Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__REQUEST_INFO = eINSTANCE.getRequest_RequestInfo();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InstructImpl <em>Instruct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InstructImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getInstruct()
		 * @generated
		 */
		EClass INSTRUCT = eINSTANCE.getInstruct();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AddressOfferImpl <em>Address Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AddressOfferImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAddressOffer()
		 * @generated
		 */
		EClass ADDRESS_OFFER = eINSTANCE.getAddressOffer();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AcceptOfferImpl <em>Accept Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AcceptOfferImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAcceptOffer()
		 * @generated
		 */
		EClass ACCEPT_OFFER = eINSTANCE.getAcceptOffer();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.DeclineOfferImpl <em>Decline Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.DeclineOfferImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getDeclineOffer()
		 * @generated
		 */
		EClass DECLINE_OFFER = eINSTANCE.getDeclineOffer();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SuggestionImpl <em>Suggestion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SuggestionImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getSuggestion()
		 * @generated
		 */
		EClass SUGGESTION = eINSTANCE.getSuggestion();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.DimensionSpecificCommunicativeFunction <em>Dimension Specific Communicative Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.DimensionSpecificCommunicativeFunction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getDimensionSpecificCommunicativeFunction()
		 * @generated
		 */
		EClass DIMENSION_SPECIFIC_COMMUNICATIVE_FUNCTION = eINSTANCE.getDimensionSpecificCommunicativeFunction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.DialogueControlFunction <em>Dialogue Control Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.DialogueControlFunction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getDialogueControlFunction()
		 * @generated
		 */
		EClass DIALOGUE_CONTROL_FUNCTION = eINSTANCE.getDialogueControlFunction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackFunction <em>Feedback Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackFunction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getFeedbackFunction()
		 * @generated
		 */
		EClass FEEDBACK_FUNCTION = eINSTANCE.getFeedbackFunction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AutoFeedback <em>Auto Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AutoFeedback
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAutoFeedback()
		 * @generated
		 */
		EClass AUTO_FEEDBACK = eINSTANCE.getAutoFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.AlloFeedback <em>Allo Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.AlloFeedback
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAlloFeedback()
		 * @generated
		 */
		EClass ALLO_FEEDBACK = eINSTANCE.getAlloFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.InteractionManagementFunction <em>Interaction Management Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.InteractionManagementFunction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getInteractionManagementFunction()
		 * @generated
		 */
		EClass INTERACTION_MANAGEMENT_FUNCTION = eINSTANCE.getInteractionManagementFunction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnManagementFunction <em>Turn Management Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnManagementFunction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTurnManagementFunction()
		 * @generated
		 */
		EClass TURN_MANAGEMENT_FUNCTION = eINSTANCE.getTurnManagementFunction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TimeManagementFunction <em>Time Management Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TimeManagementFunction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTimeManagementFunction()
		 * @generated
		 */
		EClass TIME_MANAGEMENT_FUNCTION = eINSTANCE.getTimeManagementFunction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ContactManagementFunction <em>Contact Management Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ContactManagementFunction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getContactManagementFunction()
		 * @generated
		 */
		EClass CONTACT_MANAGEMENT_FUNCTION = eINSTANCE.getContactManagementFunction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.OwnCommunicationManagementFunction <em>Own Communication Management Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.OwnCommunicationManagementFunction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getOwnCommunicationManagementFunction()
		 * @generated
		 */
		EClass OWN_COMMUNICATION_MANAGEMENT_FUNCTION = eINSTANCE.getOwnCommunicationManagementFunction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.PartnerCommunicationManagementFunction <em>Partner Communication Management Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.PartnerCommunicationManagementFunction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPartnerCommunicationManagementFunction()
		 * @generated
		 */
		EClass PARTNER_COMMUNICATION_MANAGEMENT_FUNCTION = eINSTANCE.getPartnerCommunicationManagementFunction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.DiscourseStructureManagementFunction <em>Discourse Structure Management Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.DiscourseStructureManagementFunction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getDiscourseStructureManagementFunction()
		 * @generated
		 */
		EClass DISCOURSE_STRUCTURE_MANAGEMENT_FUNCTION = eINSTANCE.getDiscourseStructureManagementFunction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SocialObligationManagementFunction <em>Social Obligation Management Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.SocialObligationManagementFunction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getSocialObligationManagementFunction()
		 * @generated
		 */
		EClass SOCIAL_OBLIGATION_MANAGEMENT_FUNCTION = eINSTANCE.getSocialObligationManagementFunction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Salutation <em>Salutation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Salutation
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getSalutation()
		 * @generated
		 */
		EClass SALUTATION = eINSTANCE.getSalutation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.SelfIntroduction <em>Self Introduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.SelfIntroduction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getSelfIntroduction()
		 * @generated
		 */
		EClass SELF_INTRODUCTION = eINSTANCE.getSelfIntroduction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Apologizing <em>Apologizing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Apologizing
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getApologizing()
		 * @generated
		 */
		EClass APOLOGIZING = eINSTANCE.getApologizing();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Gratitude <em>Gratitude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Gratitude
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getGratitude()
		 * @generated
		 */
		EClass GRATITUDE = eINSTANCE.getGratitude();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.Valediction <em>Valediction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.Valediction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getValediction()
		 * @generated
		 */
		EClass VALEDICTION = eINSTANCE.getValediction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InitialGreetingImpl <em>Initial Greeting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InitialGreetingImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getInitialGreeting()
		 * @generated
		 */
		EClass INITIAL_GREETING = eINSTANCE.getInitialGreeting();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ReturnGreetingImpl <em>Return Greeting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ReturnGreetingImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getReturnGreeting()
		 * @generated
		 */
		EClass RETURN_GREETING = eINSTANCE.getReturnGreeting();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InitialSelfIntroductionImpl <em>Initial Self Introduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InitialSelfIntroductionImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getInitialSelfIntroduction()
		 * @generated
		 */
		EClass INITIAL_SELF_INTRODUCTION = eINSTANCE.getInitialSelfIntroduction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ReturnSelfIntroductionImpl <em>Return Self Introduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ReturnSelfIntroductionImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getReturnSelfIntroduction()
		 * @generated
		 */
		EClass RETURN_SELF_INTRODUCTION = eINSTANCE.getReturnSelfIntroduction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ApologyImpl <em>Apology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ApologyImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getApology()
		 * @generated
		 */
		EClass APOLOGY = eINSTANCE.getApology();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ApologyDownplayImpl <em>Apology Downplay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ApologyDownplayImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getApologyDownplay()
		 * @generated
		 */
		EClass APOLOGY_DOWNPLAY = eINSTANCE.getApologyDownplay();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ThankingImpl <em>Thanking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ThankingImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getThanking()
		 * @generated
		 */
		EClass THANKING = eINSTANCE.getThanking();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ThankingDownplayImpl <em>Thanking Downplay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ThankingDownplayImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getThankingDownplay()
		 * @generated
		 */
		EClass THANKING_DOWNPLAY = eINSTANCE.getThankingDownplay();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InitialGoodbyeImpl <em>Initial Goodbye</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InitialGoodbyeImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getInitialGoodbye()
		 * @generated
		 */
		EClass INITIAL_GOODBYE = eINSTANCE.getInitialGoodbye();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ReturnGoodbyeImpl <em>Return Goodbye</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ReturnGoodbyeImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getReturnGoodbye()
		 * @generated
		 */
		EClass RETURN_GOODBYE = eINSTANCE.getReturnGoodbye();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.OpeningImpl <em>Opening</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.OpeningImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getOpening()
		 * @generated
		 */
		EClass OPENING = eINSTANCE.getOpening();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PreclosingImpl <em>Preclosing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PreclosingImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPreclosing()
		 * @generated
		 */
		EClass PRECLOSING = eINSTANCE.getPreclosing();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TopicIntroductionImpl <em>Topic Introduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TopicIntroductionImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTopicIntroduction()
		 * @generated
		 */
		EClass TOPIC_INTRODUCTION = eINSTANCE.getTopicIntroduction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TopicShiftAnnouncementImpl <em>Topic Shift Announcement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TopicShiftAnnouncementImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTopicShiftAnnouncement()
		 * @generated
		 */
		EClass TOPIC_SHIFT_ANNOUNCEMENT = eINSTANCE.getTopicShiftAnnouncement();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TopicShiftImpl <em>Topic Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TopicShiftImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTopicShift()
		 * @generated
		 */
		EClass TOPIC_SHIFT = eINSTANCE.getTopicShift();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.CompletionImpl <em>Completion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.CompletionImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getCompletion()
		 * @generated
		 */
		EClass COMPLETION = eINSTANCE.getCompletion();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.CorrectMisspeakingImpl <em>Correct Misspeaking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.CorrectMisspeakingImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getCorrectMisspeaking()
		 * @generated
		 */
		EClass CORRECT_MISSPEAKING = eINSTANCE.getCorrectMisspeaking();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ErrorSignalingImpl <em>Error Signaling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ErrorSignalingImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getErrorSignaling()
		 * @generated
		 */
		EClass ERROR_SIGNALING = eINSTANCE.getErrorSignaling();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.RetractionImpl <em>Retraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.RetractionImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getRetraction()
		 * @generated
		 */
		EClass RETRACTION = eINSTANCE.getRetraction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SelfCorrectionImpl <em>Self Correction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.SelfCorrectionImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getSelfCorrection()
		 * @generated
		 */
		EClass SELF_CORRECTION = eINSTANCE.getSelfCorrection();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ContactCheckImpl <em>Contact Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ContactCheckImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getContactCheck()
		 * @generated
		 */
		EClass CONTACT_CHECK = eINSTANCE.getContactCheck();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ContactIndicationImpl <em>Contact Indication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ContactIndicationImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getContactIndication()
		 * @generated
		 */
		EClass CONTACT_INDICATION = eINSTANCE.getContactIndication();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.StallingImpl <em>Stalling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.StallingImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getStalling()
		 * @generated
		 */
		EClass STALLING = eINSTANCE.getStalling();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PausingImpl <em>Pausing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PausingImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPausing()
		 * @generated
		 */
		EClass PAUSING = eINSTANCE.getPausing();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnUnitInitialFuntion <em>Turn Unit Initial Funtion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnUnitInitialFuntion
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTurnUnitInitialFuntion()
		 * @generated
		 */
		EClass TURN_UNIT_INITIAL_FUNTION = eINSTANCE.getTurnUnitInitialFuntion();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.TurnUnitFinalFunction <em>Turn Unit Final Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.TurnUnitFinalFunction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTurnUnitFinalFunction()
		 * @generated
		 */
		EClass TURN_UNIT_FINAL_FUNCTION = eINSTANCE.getTurnUnitFinalFunction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnAcceptImpl <em>Turn Accept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnAcceptImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTurnAccept()
		 * @generated
		 */
		EClass TURN_ACCEPT = eINSTANCE.getTurnAccept();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnGrabImpl <em>Turn Grab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnGrabImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTurnGrab()
		 * @generated
		 */
		EClass TURN_GRAB = eINSTANCE.getTurnGrab();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnTakeImpl <em>Turn Take</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnTakeImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTurnTake()
		 * @generated
		 */
		EClass TURN_TAKE = eINSTANCE.getTurnTake();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnAssignImpl <em>Turn Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnAssignImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTurnAssign()
		 * @generated
		 */
		EClass TURN_ASSIGN = eINSTANCE.getTurnAssign();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnKeepImpl <em>Turn Keep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnKeepImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTurnKeep()
		 * @generated
		 */
		EClass TURN_KEEP = eINSTANCE.getTurnKeep();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnReleaseImpl <em>Turn Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnReleaseImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getTurnRelease()
		 * @generated
		 */
		EClass TURN_RELEASE = eINSTANCE.getTurnRelease();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackElicitationFunction <em>Feedback Elicitation Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackElicitationFunction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getFeedbackElicitationFunction()
		 * @generated
		 */
		EClass FEEDBACK_ELICITATION_FUNCTION = eINSTANCE.getFeedbackElicitationFunction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AttentionFeedbackElicitationImpl <em>Attention Feedback Elicitation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.AttentionFeedbackElicitationImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getAttentionFeedbackElicitation()
		 * @generated
		 */
		EClass ATTENTION_FEEDBACK_ELICITATION = eINSTANCE.getAttentionFeedbackElicitation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PerceptionFeedbackElicitationImpl <em>Perception Feedback Elicitation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PerceptionFeedbackElicitationImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPerceptionFeedbackElicitation()
		 * @generated
		 */
		EClass PERCEPTION_FEEDBACK_ELICITATION = eINSTANCE.getPerceptionFeedbackElicitation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InterpretationFeedbackElicitationImpl <em>Interpretation Feedback Elicitation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.InterpretationFeedbackElicitationImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getInterpretationFeedbackElicitation()
		 * @generated
		 */
		EClass INTERPRETATION_FEEDBACK_ELICITATION = eINSTANCE.getInterpretationFeedbackElicitation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.EvaluationFeedackElicitationImpl <em>Evaluation Feedack Elicitation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.EvaluationFeedackElicitationImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getEvaluationFeedackElicitation()
		 * @generated
		 */
		EClass EVALUATION_FEEDACK_ELICITATION = eINSTANCE.getEvaluationFeedackElicitation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ExecutionFeedbackElicitationImpl <em>Execution Feedback Elicitation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.ExecutionFeedbackElicitationImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getExecutionFeedbackElicitation()
		 * @generated
		 */
		EClass EXECUTION_FEEDBACK_ELICITATION = eINSTANCE.getExecutionFeedbackElicitation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackGivingFunction <em>Feedback Giving Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.FeedbackGivingFunction
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getFeedbackGivingFunction()
		 * @generated
		 */
		EClass FEEDBACK_GIVING_FUNCTION = eINSTANCE.getFeedbackGivingFunction();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveAlloFeedbackImpl <em>Positive Allo Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveAlloFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveAlloFeedback()
		 * @generated
		 */
		EClass POSITIVE_ALLO_FEEDBACK = eINSTANCE.getPositiveAlloFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeAlloFeedbackImpl <em>Negative Allo Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeAlloFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeAlloFeedback()
		 * @generated
		 */
		EClass NEGATIVE_ALLO_FEEDBACK = eINSTANCE.getNegativeAlloFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveExecutionAlloFeedbackImpl <em>Positive Execution Allo Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveExecutionAlloFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveExecutionAlloFeedback()
		 * @generated
		 */
		EClass POSITIVE_EXECUTION_ALLO_FEEDBACK = eINSTANCE.getPositiveExecutionAlloFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeExecutionAlloFeedbackImpl <em>Negative Execution Allo Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeExecutionAlloFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeExecutionAlloFeedback()
		 * @generated
		 */
		EClass NEGATIVE_EXECUTION_ALLO_FEEDBACK = eINSTANCE.getNegativeExecutionAlloFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveEvaluationAlloFeedbackImpl <em>Positive Evaluation Allo Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveEvaluationAlloFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveEvaluationAlloFeedback()
		 * @generated
		 */
		EClass POSITIVE_EVALUATION_ALLO_FEEDBACK = eINSTANCE.getPositiveEvaluationAlloFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeEvaluationAlloFeedbackImpl <em>Negative Evaluation Allo Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeEvaluationAlloFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeEvaluationAlloFeedback()
		 * @generated
		 */
		EClass NEGATIVE_EVALUATION_ALLO_FEEDBACK = eINSTANCE.getNegativeEvaluationAlloFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveInterpretationAlloFeedbackImpl <em>Positive Interpretation Allo Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveInterpretationAlloFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveInterpretationAlloFeedback()
		 * @generated
		 */
		EClass POSITIVE_INTERPRETATION_ALLO_FEEDBACK = eINSTANCE.getPositiveInterpretationAlloFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeInterpretationAlloFeedbackImpl <em>Negative Interpretation Allo Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeInterpretationAlloFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeInterpretationAlloFeedback()
		 * @generated
		 */
		EClass NEGATIVE_INTERPRETATION_ALLO_FEEDBACK = eINSTANCE.getNegativeInterpretationAlloFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositivePerceptionAlloFeedbackImpl <em>Positive Perception Allo Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositivePerceptionAlloFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositivePerceptionAlloFeedback()
		 * @generated
		 */
		EClass POSITIVE_PERCEPTION_ALLO_FEEDBACK = eINSTANCE.getPositivePerceptionAlloFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativePerceptionAlloFeedbackImpl <em>Negative Perception Allo Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativePerceptionAlloFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativePerceptionAlloFeedback()
		 * @generated
		 */
		EClass NEGATIVE_PERCEPTION_ALLO_FEEDBACK = eINSTANCE.getNegativePerceptionAlloFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeAttentionAlloFeedbackImpl <em>Negative Attention Allo Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeAttentionAlloFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeAttentionAlloFeedback()
		 * @generated
		 */
		EClass NEGATIVE_ATTENTION_ALLO_FEEDBACK = eINSTANCE.getNegativeAttentionAlloFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveAutoFeedbackImpl <em>Positive Auto Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveAutoFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveAutoFeedback()
		 * @generated
		 */
		EClass POSITIVE_AUTO_FEEDBACK = eINSTANCE.getPositiveAutoFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeAutoFeedbackImpl <em>Negative Auto Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeAutoFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeAutoFeedback()
		 * @generated
		 */
		EClass NEGATIVE_AUTO_FEEDBACK = eINSTANCE.getNegativeAutoFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveExecutionAutoFeedbackImpl <em>Positive Execution Auto Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveExecutionAutoFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveExecutionAutoFeedback()
		 * @generated
		 */
		EClass POSITIVE_EXECUTION_AUTO_FEEDBACK = eINSTANCE.getPositiveExecutionAutoFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeExecutionAutoFeedbackImpl <em>Negative Execution Auto Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeExecutionAutoFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeExecutionAutoFeedback()
		 * @generated
		 */
		EClass NEGATIVE_EXECUTION_AUTO_FEEDBACK = eINSTANCE.getNegativeExecutionAutoFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveEvaluationAutoFeedbackImpl <em>Positive Evaluation Auto Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveEvaluationAutoFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveEvaluationAutoFeedback()
		 * @generated
		 */
		EClass POSITIVE_EVALUATION_AUTO_FEEDBACK = eINSTANCE.getPositiveEvaluationAutoFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeEvaluationAutoFeedbackImpl <em>Negative Evaluation Auto Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeEvaluationAutoFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeEvaluationAutoFeedback()
		 * @generated
		 */
		EClass NEGATIVE_EVALUATION_AUTO_FEEDBACK = eINSTANCE.getNegativeEvaluationAutoFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositivePerceptionAutoFeedbackImpl <em>Positive Perception Auto Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositivePerceptionAutoFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositivePerceptionAutoFeedback()
		 * @generated
		 */
		EClass POSITIVE_PERCEPTION_AUTO_FEEDBACK = eINSTANCE.getPositivePerceptionAutoFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativePerceptionAutoFeedbackImpl <em>Negative Perception Auto Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativePerceptionAutoFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativePerceptionAutoFeedback()
		 * @generated
		 */
		EClass NEGATIVE_PERCEPTION_AUTO_FEEDBACK = eINSTANCE.getNegativePerceptionAutoFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveInterpretationAutoFeedbackImpl <em>Positive Interpretation Auto Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveInterpretationAutoFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveInterpretationAutoFeedback()
		 * @generated
		 */
		EClass POSITIVE_INTERPRETATION_AUTO_FEEDBACK = eINSTANCE.getPositiveInterpretationAutoFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeInterpretationAutoFeedbackImpl <em>Negative Interpretation Auto Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeInterpretationAutoFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeInterpretationAutoFeedback()
		 * @generated
		 */
		EClass NEGATIVE_INTERPRETATION_AUTO_FEEDBACK = eINSTANCE.getNegativeInterpretationAutoFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveAttentionAutoFeedbackImpl <em>Positive Attention Auto Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveAttentionAutoFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveAttentionAutoFeedback()
		 * @generated
		 */
		EClass POSITIVE_ATTENTION_AUTO_FEEDBACK = eINSTANCE.getPositiveAttentionAutoFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeAttentionAutoFeedbackImpl <em>Negative Attention Auto Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.NegativeAttentionAutoFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getNegativeAttentionAutoFeedback()
		 * @generated
		 */
		EClass NEGATIVE_ATTENTION_AUTO_FEEDBACK = eINSTANCE.getNegativeAttentionAutoFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveAttentionAlloFeedbackImpl <em>Positive Attention Allo Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.PositiveAttentionAlloFeedbackImpl
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getPositiveAttentionAlloFeedback()
		 * @generated
		 */
		EClass POSITIVE_ATTENTION_ALLO_FEEDBACK = eINSTANCE.getPositiveAttentionAlloFeedback();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.communicative_functions.ResolveState <em>Resolve State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.ResolveState
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getResolveState()
		 * @generated
		 */
		EEnum RESOLVE_STATE = eINSTANCE.getResolveState();

		/**
		 * The meta object literal for the '<em>Resolve State Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see de.dfki.iui.mmds.core.model.io.communicative_functions.impl.Communicative_functionsPackageImpl#getResolveStateObject()
		 * @generated
		 */
		EDataType RESOLVE_STATE_OBJECT = eINSTANCE.getResolveStateObject();

	}

} //Communicative_functionsPackage
