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
package de.dfki.iui.mmds.core.model.json;

import de.dfki.iui.mmds.core.model.io.IoPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see de.dfki.iui.mmds.core.model.json.JsonFactory
 * @model kind="package"
 * @generated
 */
public interface JsonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "json";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/mmds/core/model/json";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "json";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JsonPackage eINSTANCE = de.dfki.iui.mmds.core.model.json.impl.JsonPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.json.impl.JSONAbstractObjectImpl <em>JSON Abstract Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.json.impl.JSONAbstractObjectImpl
	 * @see de.dfki.iui.mmds.core.model.json.impl.JsonPackageImpl#getJSONAbstractObject()
	 * @generated
	 */
	int JSON_ABSTRACT_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ABSTRACT_OBJECT__BINDING = IoPackage.INPUT_REPRESENTATION__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ABSTRACT_OBJECT__DEVICE = IoPackage.INPUT_REPRESENTATION__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ABSTRACT_OBJECT__SERVICE_INSTANCE = IoPackage.INPUT_REPRESENTATION__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ABSTRACT_OBJECT__SERVICE_NAME = IoPackage.INPUT_REPRESENTATION__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ABSTRACT_OBJECT__BEGIN_TIME = IoPackage.INPUT_REPRESENTATION__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ABSTRACT_OBJECT__DURATION = IoPackage.INPUT_REPRESENTATION__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ABSTRACT_OBJECT__LANGUAGE = IoPackage.INPUT_REPRESENTATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ABSTRACT_OBJECT__USER_ALIAS = IoPackage.INPUT_REPRESENTATION__USER_ALIAS;

	/**
	 * The number of structural features of the '<em>JSON Abstract Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ABSTRACT_OBJECT_FEATURE_COUNT = IoPackage.INPUT_REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>JSON Abstract Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ABSTRACT_OBJECT_OPERATION_COUNT = IoPackage.INPUT_REPRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.json.impl.JSONObjectImpl <em>JSON Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.json.impl.JSONObjectImpl
	 * @see de.dfki.iui.mmds.core.model.json.impl.JsonPackageImpl#getJSONObject()
	 * @generated
	 */
	int JSON_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT__BINDING = JSON_ABSTRACT_OBJECT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT__DEVICE = JSON_ABSTRACT_OBJECT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT__SERVICE_INSTANCE = JSON_ABSTRACT_OBJECT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT__SERVICE_NAME = JSON_ABSTRACT_OBJECT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT__BEGIN_TIME = JSON_ABSTRACT_OBJECT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT__DURATION = JSON_ABSTRACT_OBJECT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT__LANGUAGE = JSON_ABSTRACT_OBJECT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT__USER_ALIAS = JSON_ABSTRACT_OBJECT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT__ATTRIBUTE = JSON_ABSTRACT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JSON Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_FEATURE_COUNT = JSON_ABSTRACT_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JSON Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_OPERATION_COUNT = JSON_ABSTRACT_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.json.impl.JSONAttributeImpl <em>JSON Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.json.impl.JSONAttributeImpl
	 * @see de.dfki.iui.mmds.core.model.json.impl.JsonPackageImpl#getJSONAttribute()
	 * @generated
	 */
	int JSON_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ATTRIBUTE__RANGE = 1;

	/**
	 * The number of structural features of the '<em>JSON Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>JSON Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.json.impl.JSONValueImpl <em>JSON Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.json.impl.JSONValueImpl
	 * @see de.dfki.iui.mmds.core.model.json.impl.JsonPackageImpl#getJSONValue()
	 * @generated
	 */
	int JSON_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VALUE__BINDING = JSON_ABSTRACT_OBJECT__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VALUE__DEVICE = JSON_ABSTRACT_OBJECT__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VALUE__SERVICE_INSTANCE = JSON_ABSTRACT_OBJECT__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VALUE__SERVICE_NAME = JSON_ABSTRACT_OBJECT__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VALUE__BEGIN_TIME = JSON_ABSTRACT_OBJECT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VALUE__DURATION = JSON_ABSTRACT_OBJECT__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VALUE__LANGUAGE = JSON_ABSTRACT_OBJECT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VALUE__USER_ALIAS = JSON_ABSTRACT_OBJECT__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VALUE__VALUE = JSON_ABSTRACT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JSON Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VALUE_FEATURE_COUNT = JSON_ABSTRACT_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JSON Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_VALUE_OPERATION_COUNT = JSON_ABSTRACT_OBJECT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.json.impl.JSONParserImpl <em>JSON Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.json.impl.JSONParserImpl
	 * @see de.dfki.iui.mmds.core.model.json.impl.JsonPackageImpl#getJSONParser()
	 * @generated
	 */
	int JSON_PARSER = 4;

	/**
	 * The number of structural features of the '<em>JSON Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_PARSER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Parse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_PARSER___PARSE__STRING = 0;

	/**
	 * The number of operations of the '<em>JSON Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_PARSER_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.json.JSONAbstractObject <em>JSON Abstract Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Abstract Object</em>'.
	 * @see de.dfki.iui.mmds.core.model.json.JSONAbstractObject
	 * @generated
	 */
	EClass getJSONAbstractObject();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.json.JSONObject <em>JSON Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Object</em>'.
	 * @see de.dfki.iui.mmds.core.model.json.JSONObject
	 * @generated
	 */
	EClass getJSONObject();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.json.JSONObject#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.json.JSONObject#getAttribute()
	 * @see #getJSONObject()
	 * @generated
	 */
	EReference getJSONObject_Attribute();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.json.JSONAttribute <em>JSON Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.json.JSONAttribute
	 * @generated
	 */
	EClass getJSONAttribute();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.json.JSONAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.iui.mmds.core.model.json.JSONAttribute#getName()
	 * @see #getJSONAttribute()
	 * @generated
	 */
	EAttribute getJSONAttribute_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.json.JSONAttribute#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Range</em>'.
	 * @see de.dfki.iui.mmds.core.model.json.JSONAttribute#getRange()
	 * @see #getJSONAttribute()
	 * @generated
	 */
	EReference getJSONAttribute_Range();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.json.JSONValue <em>JSON Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Value</em>'.
	 * @see de.dfki.iui.mmds.core.model.json.JSONValue
	 * @generated
	 */
	EClass getJSONValue();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.json.JSONValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.iui.mmds.core.model.json.JSONValue#getValue()
	 * @see #getJSONValue()
	 * @generated
	 */
	EAttribute getJSONValue_Value();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.json.JSONParser <em>JSON Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Parser</em>'.
	 * @see de.dfki.iui.mmds.core.model.json.JSONParser
	 * @generated
	 */
	EClass getJSONParser();

	/**
	 * Returns the meta object for the '{@link de.dfki.iui.mmds.core.model.json.JSONParser#parse(java.lang.String) <em>Parse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parse</em>' operation.
	 * @see de.dfki.iui.mmds.core.model.json.JSONParser#parse(java.lang.String)
	 * @generated
	 */
	EOperation getJSONParser__Parse__String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JsonFactory getJsonFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.json.impl.JSONAbstractObjectImpl <em>JSON Abstract Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.json.impl.JSONAbstractObjectImpl
		 * @see de.dfki.iui.mmds.core.model.json.impl.JsonPackageImpl#getJSONAbstractObject()
		 * @generated
		 */
		EClass JSON_ABSTRACT_OBJECT = eINSTANCE.getJSONAbstractObject();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.json.impl.JSONObjectImpl <em>JSON Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.json.impl.JSONObjectImpl
		 * @see de.dfki.iui.mmds.core.model.json.impl.JsonPackageImpl#getJSONObject()
		 * @generated
		 */
		EClass JSON_OBJECT = eINSTANCE.getJSONObject();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSON_OBJECT__ATTRIBUTE = eINSTANCE.getJSONObject_Attribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.json.impl.JSONAttributeImpl <em>JSON Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.json.impl.JSONAttributeImpl
		 * @see de.dfki.iui.mmds.core.model.json.impl.JsonPackageImpl#getJSONAttribute()
		 * @generated
		 */
		EClass JSON_ATTRIBUTE = eINSTANCE.getJSONAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_ATTRIBUTE__NAME = eINSTANCE.getJSONAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JSON_ATTRIBUTE__RANGE = eINSTANCE.getJSONAttribute_Range();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.json.impl.JSONValueImpl <em>JSON Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.json.impl.JSONValueImpl
		 * @see de.dfki.iui.mmds.core.model.json.impl.JsonPackageImpl#getJSONValue()
		 * @generated
		 */
		EClass JSON_VALUE = eINSTANCE.getJSONValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_VALUE__VALUE = eINSTANCE.getJSONValue_Value();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.json.impl.JSONParserImpl <em>JSON Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.json.impl.JSONParserImpl
		 * @see de.dfki.iui.mmds.core.model.json.impl.JsonPackageImpl#getJSONParser()
		 * @generated
		 */
		EClass JSON_PARSER = eINSTANCE.getJSONParser();

		/**
		 * The meta object literal for the '<em><b>Parse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JSON_PARSER___PARSE__STRING = eINSTANCE.getJSONParser__Parse__String();

	}

} //JsonPackage
