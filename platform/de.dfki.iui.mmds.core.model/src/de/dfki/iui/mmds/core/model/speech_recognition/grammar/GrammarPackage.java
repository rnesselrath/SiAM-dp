/**
 */
package de.dfki.iui.mmds.core.model.speech_recognition.grammar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * <!-- begin-model-doc -->
 * SRGS 1.0 Core Schema (2003, 20151204)
 * 
 *         Copyright 1998-2003 W3C (MIT, ERCIM, Keio),
 *         All Rights Reserved. Permission to use, copy, modify and
 *         distribute the SRGS core schema and its accompanying documentation
 *         for any purpose and without fee is hereby granted in
 *         perpetuity, provided that the above copyright notice and this
 *         paragraph appear in all copies.  The copyright holders make no
 *         representation about the suitability of the schema for any purpose. 
 *         It is provided "as is" without expressed or implied warranty.
 *       
 * General Datatypes
 * Grammar-specific datatypes
 * Grammar Attributes
 * Content Models
 * Global Elements
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *     <h1>About the XML namespace</h1>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 *      </p>
 *      <p>
 *       See <a href="http://www.w3.org/XML/1998/namespace.html">
 *       http://www.w3.org/XML/1998/namespace.html</a> and
 *       <a href="http://www.w3.org/TR/REC-xml">
 *       http://www.w3.org/TR/REC-xml</a> for information 
 *       about this namespace.
 *      </p>
 *      <p>
 *       Note that local names in this namespace are intended to be
 *       defined only by the World Wide Web Consortium or its subgroups.
 *       The names currently defined in this namespace are listed below.
 *       They should not be used with conflicting semantics by any Working
 *       Group, specification, or document instance.
 *      </p>
 *      <p>   
 *       See further below in this document for more information about <a href="#usage">how to refer to this schema document from your own
 *       XSD schema documents</a> and about <a href="#nsversioning">the
 *       namespace-versioning policy governing this schema document</a>.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *    
 *     <h3>Father (in any context at all)</h3> 
 * 
 *     <div class="bodytext">
 *      <p>
 *       denotes Jon Bosak, the chair of 
 *       the original XML Working Group.  This name is reserved by 
 *       the following decision of the W3C XML Plenary and 
 *       XML Coordination groups:
 *      </p>
 *      <blockquote>
 *        <p>
 * 	In appreciation for his vision, leadership and
 * 	dedication the W3C XML Plenary on this 10th day of
 * 	February, 2000, reserves for Jon Bosak in perpetuity
 * 	the XML name "xml:Father".
 *        </p>
 *      </blockquote>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="usage" xml:id="usage" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="usage">About this schema document</a>
 *     </h2>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema defines attributes and an attribute group suitable
 *       for use by schemas wishing to allow <code>xml:base</code>,
 *       <code>xml:lang</code>, <code>xml:space</code> or
 *       <code>xml:id</code> attributes on elements they define.
 *      </p>
 *      <p>
 *       To enable this, such a schema must import this schema for
 *       the XML namespace, e.g. as follows:
 *      </p>
 *      <pre>
 *           &lt;schema . . .&gt;
 *            . . .
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       or
 *      </p>
 *      <pre>
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2009/01/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       Subsequently, qualified reference to any of the attributes or the
 *       group defined below will have the desired effect, e.g.
 *      </p>
 *      <pre>
 *           &lt;type . . .&gt;
 *            . . .
 *            &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *      </pre>
 *      <p>
 *       will define a type which will schema-validate an instance element
 *       with any of those attributes.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="nsversioning" xml:id="nsversioning" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="nsversioning">Versioning policy for this schema document</a>
 *     </h2>
 *     <div class="bodytext">
 *      <p>
 *       In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd</a>.
 *      </p>
 *      <p>
 *       At the date of issue it can also be found at
 *       <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd</a>.
 *      </p>
 *      <p>
 *       The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML
 *       Schema itself, or with the XML namespace itself.  In other words,
 *       if the XML Schema or XML namespaces change, the version of this
 *       document at <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd 
 *       </a> 
 *       will change accordingly; the version at 
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd 
 *       </a> 
 *       will not change.
 *      </p>
 *      <p>
 *       Previous dated (and unchanging) versions of this schema 
 *       document are at:
 *      </p>
 *      <ul>
 *       <li>
 *           <a href="http://www.w3.org/2009/01/xml.xsd">
 * 	http://www.w3.org/2009/01/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2007/08/xml.xsd">
 * 	http://www.w3.org/2007/08/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2004/10/xml.xsd">
 * 	http://www.w3.org/2004/10/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2001/03/xml.xsd">
 * 	http://www.w3.org/2001/03/xml.xsd</a>
 *         </li>
 *      </ul>
 *     </div>
 *    </div>
 *   
 * <!-- end-model-doc -->
 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarFactory
 * @model kind="package"
 * @generated
 */
public interface GrammarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "grammar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/2001/06/grammar";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "grammar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrammarPackage eINSTANCE = de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.DocumentRootImpl
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GRAMMAR = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarImpl <em>Grammar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarImpl
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getGrammar()
	 * @generated
	 */
	int GRAMMAR = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Lexicon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__LEXICON = 1;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__META = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__METADATA = 3;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__TAG = 4;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__GROUP1 = 5;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__RULE = 6;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__BASE = 7;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__LANG = 8;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__MODE = 9;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__ROOT = 10;

	/**
	 * The feature id for the '<em><b>Tag Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__TAG_FORMAT = 11;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__VERSION = 12;

	/**
	 * The number of structural features of the '<em>Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.Grammar1Impl <em>Grammar1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.Grammar1Impl
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getGrammar1()
	 * @generated
	 */
	int GRAMMAR1 = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR1__GROUP = GRAMMAR__GROUP;

	/**
	 * The feature id for the '<em><b>Lexicon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR1__LEXICON = GRAMMAR__LEXICON;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR1__META = GRAMMAR__META;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR1__METADATA = GRAMMAR__METADATA;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR1__TAG = GRAMMAR__TAG;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR1__GROUP1 = GRAMMAR__GROUP1;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR1__RULE = GRAMMAR__RULE;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR1__BASE = GRAMMAR__BASE;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR1__LANG = GRAMMAR__LANG;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR1__MODE = GRAMMAR__MODE;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR1__ROOT = GRAMMAR__ROOT;

	/**
	 * The feature id for the '<em><b>Tag Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR1__TAG_FORMAT = GRAMMAR__TAG_FORMAT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR1__VERSION = GRAMMAR__VERSION;

	/**
	 * The number of structural features of the '<em>Grammar1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR1_FEATURE_COUNT = GRAMMAR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Grammar1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR1_OPERATION_COUNT = GRAMMAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.ItemImpl
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Rule Expansion</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__RULE_EXPANSION = 1;

	/**
	 * The feature id for the '<em><b>Token</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__TOKEN = 2;

	/**
	 * The feature id for the '<em><b>Ruleref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__RULEREF = 3;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ITEM = 4;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ONE_OF = 5;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__TAG = 6;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__LANG = 7;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__REPEAT = 8;

	/**
	 * The feature id for the '<em><b>Repeat Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__REPEAT_PROB = 9;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__WEIGHT = 10;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.LexiconImpl <em>Lexicon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.LexiconImpl
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getLexicon()
	 * @generated
	 */
	int LEXICON = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICON__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICON__URI = 1;

	/**
	 * The number of structural features of the '<em>Lexicon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lexicon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXICON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.MetaImpl <em>Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.MetaImpl
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getMeta()
	 * @generated
	 */
	int META = 5;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Http Equiv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__HTTP_EQUIV = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__NAME = 2;

	/**
	 * The number of structural features of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.MetadataImpl
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.OneOfImpl <em>One Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.OneOfImpl
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getOneOf()
	 * @generated
	 */
	int ONE_OF = 7;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__ITEM = 1;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__LANG = 2;

	/**
	 * The number of structural features of the '<em>One Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>One Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.RuleImpl
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Token</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TOKEN = 2;

	/**
	 * The feature id for the '<em><b>Ruleref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULEREF = 3;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ITEM = 4;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ONE_OF = 5;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TAG = 6;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__EXAMPLE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ID = 8;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__SCOPE = 9;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.RulerefImpl <em>Ruleref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.RulerefImpl
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getRuleref()
	 * @generated
	 */
	int RULEREF = 9;

	/**
	 * The feature id for the '<em><b>Special</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULEREF__SPECIAL = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULEREF__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULEREF__URI = 2;

	/**
	 * The number of structural features of the '<em>Ruleref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULEREF_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ruleref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULEREF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.TokenImpl
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 10;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__LANG = 1;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.ModeDatatype <em>Mode Datatype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.ModeDatatype
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getModeDatatype()
	 * @generated
	 */
	int MODE_DATATYPE = 11;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.ScopeDatatype <em>Scope Datatype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.ScopeDatatype
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getScopeDatatype()
	 * @generated
	 */
	int SCOPE_DATATYPE = 12;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.SpecialDatatype <em>Special Datatype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.SpecialDatatype
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getSpecialDatatype()
	 * @generated
	 */
	int SPECIAL_DATATYPE = 13;

	/**
	 * The meta object id for the '<em>Example</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getExample()
	 * @generated
	 */
	int EXAMPLE = 14;

	/**
	 * The meta object id for the '<em>Id Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getIdDatatype()
	 * @generated
	 */
	int ID_DATATYPE = 15;

	/**
	 * The meta object id for the '<em>Mode Datatype Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.ModeDatatype
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getModeDatatypeObject()
	 * @generated
	 */
	int MODE_DATATYPE_OBJECT = 16;

	/**
	 * The meta object id for the '<em>Repeat Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getRepeatDatatype()
	 * @generated
	 */
	int REPEAT_DATATYPE = 17;

	/**
	 * The meta object id for the '<em>Repeat Prob Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getRepeatProbDatatype()
	 * @generated
	 */
	int REPEAT_PROB_DATATYPE = 18;

	/**
	 * The meta object id for the '<em>Root Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getRootDatatype()
	 * @generated
	 */
	int ROOT_DATATYPE = 19;

	/**
	 * The meta object id for the '<em>Scope Datatype Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.ScopeDatatype
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getScopeDatatypeObject()
	 * @generated
	 */
	int SCOPE_DATATYPE_OBJECT = 20;

	/**
	 * The meta object id for the '<em>Special Datatype Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.SpecialDatatype
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getSpecialDatatypeObject()
	 * @generated
	 */
	int SPECIAL_DATATYPE_OBJECT = 21;

	/**
	 * The meta object id for the '<em>Tag</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 22;

	/**
	 * The meta object id for the '<em>Tag Format Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getTagFormatDatatype()
	 * @generated
	 */
	int TAG_FORMAT_DATATYPE = 23;

	/**
	 * The meta object id for the '<em>Type Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getTypeDatatype()
	 * @generated
	 */
	int TYPE_DATATYPE = 24;

	/**
	 * The meta object id for the '<em>Version Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getVersionDatatype()
	 * @generated
	 */
	int VERSION_DATATYPE = 25;

	/**
	 * The meta object id for the '<em>Weight Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getWeightDatatype()
	 * @generated
	 */
	int WEIGHT_DATATYPE = 26;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.DocumentRoot#getGrammar <em>Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grammar</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.DocumentRoot#getGrammar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Grammar();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar <em>Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grammar</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar
	 * @generated
	 */
	EClass getGrammar();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getGroup()
	 * @see #getGrammar()
	 * @generated
	 */
	EAttribute getGrammar_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getLexicon <em>Lexicon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lexicon</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getLexicon()
	 * @see #getGrammar()
	 * @generated
	 */
	EReference getGrammar_Lexicon();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getMeta()
	 * @see #getGrammar()
	 * @generated
	 */
	EReference getGrammar_Meta();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getMetadata()
	 * @see #getGrammar()
	 * @generated
	 */
	EReference getGrammar_Metadata();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tag</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getTag()
	 * @see #getGrammar()
	 * @generated
	 */
	EAttribute getGrammar_Tag();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group1</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getGroup1()
	 * @see #getGrammar()
	 * @generated
	 */
	EAttribute getGrammar_Group1();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getRule()
	 * @see #getGrammar()
	 * @generated
	 */
	EReference getGrammar_Rule();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getBase()
	 * @see #getGrammar()
	 * @generated
	 */
	EAttribute getGrammar_Base();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getLang()
	 * @see #getGrammar()
	 * @generated
	 */
	EAttribute getGrammar_Lang();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getMode()
	 * @see #getGrammar()
	 * @generated
	 */
	EAttribute getGrammar_Mode();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getRoot()
	 * @see #getGrammar()
	 * @generated
	 */
	EAttribute getGrammar_Root();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getTagFormat <em>Tag Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag Format</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getTagFormat()
	 * @see #getGrammar()
	 * @generated
	 */
	EAttribute getGrammar_TagFormat();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar#getVersion()
	 * @see #getGrammar()
	 * @generated
	 */
	EAttribute getGrammar_Version();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar1 <em>Grammar1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grammar1</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar1
	 * @generated
	 */
	EClass getGrammar1();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getMixed()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getRuleExpansion <em>Rule Expansion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rule Expansion</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getRuleExpansion()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_RuleExpansion();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Token</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getToken()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Token();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getRuleref <em>Ruleref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ruleref</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getRuleref()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Ruleref();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getItem()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Item();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getOneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One Of</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getOneOf()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_OneOf();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tag</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getTag()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Tag();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getLang()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Lang();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getRepeat()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Repeat();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getRepeatProb <em>Repeat Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Prob</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getRepeatProb()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_RepeatProb();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item#getWeight()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Weight();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Lexicon <em>Lexicon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexicon</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Lexicon
	 * @generated
	 */
	EClass getLexicon();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Lexicon#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Lexicon#getType()
	 * @see #getLexicon()
	 * @generated
	 */
	EAttribute getLexicon_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Lexicon#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Lexicon#getUri()
	 * @see #getLexicon()
	 * @generated
	 */
	EAttribute getLexicon_Uri();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Meta
	 * @generated
	 */
	EClass getMeta();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Meta#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Meta#getContent()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_Content();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Meta#getHttpEquiv <em>Http Equiv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Equiv</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Meta#getHttpEquiv()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_HttpEquiv();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Meta#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Meta#getName()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_Name();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Metadata#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Metadata#getGroup()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Group();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Metadata#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Metadata#getAny()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Any();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Metadata#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Metadata#getAnyAttribute()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.OneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Of</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.OneOf
	 * @generated
	 */
	EClass getOneOf();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.OneOf#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.OneOf#getGroup()
	 * @see #getOneOf()
	 * @generated
	 */
	EAttribute getOneOf_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.OneOf#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.OneOf#getItem()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_Item();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.OneOf#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.OneOf#getLang()
	 * @see #getOneOf()
	 * @generated
	 */
	EAttribute getOneOf_Lang();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule#getMixed()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule#getGroup()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Token</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule#getToken()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Token();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule#getRuleref <em>Ruleref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ruleref</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule#getRuleref()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Ruleref();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule#getItem()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Item();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule#getOneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One Of</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule#getOneOf()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_OneOf();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tag</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule#getTag()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Tag();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule#getExample <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Example</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule#getExample()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Example();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule#getId()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule#getScope()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Scope();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref <em>Ruleref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ruleref</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref
	 * @generated
	 */
	EClass getRuleref();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref#getSpecial <em>Special</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref#getSpecial()
	 * @see #getRuleref()
	 * @generated
	 */
	EAttribute getRuleref_Special();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref#getType()
	 * @see #getRuleref()
	 * @generated
	 */
	EAttribute getRuleref_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref#getUri()
	 * @see #getRuleref()
	 * @generated
	 */
	EAttribute getRuleref_Uri();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Token#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Token#getMixed()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.Token#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.Token#getLang()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Lang();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.ModeDatatype <em>Mode Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode Datatype</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.ModeDatatype
	 * @generated
	 */
	EEnum getModeDatatype();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.ScopeDatatype <em>Scope Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope Datatype</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.ScopeDatatype
	 * @generated
	 */
	EEnum getScopeDatatype();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.SpecialDatatype <em>Special Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Special Datatype</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.SpecialDatatype
	 * @generated
	 */
	EEnum getSpecialDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Example</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='example' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getExample();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Id Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Id Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Id.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#ID' pattern='[^.:\\-]+'"
	 * @generated
	 */
	EDataType getIdDatatype();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.ModeDatatype <em>Mode Datatype Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mode Datatype Object</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.ModeDatatype
	 * @model instanceClass="de.dfki.iui.mmds.core.model.speech_recognition.grammar.ModeDatatype"
	 *        extendedMetaData="name='Mode.datatype:Object' baseType='Mode.datatype'"
	 * @generated
	 */
	EDataType getModeDatatypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Repeat Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Repeat Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Repeat.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[0-9]+ [0-9]+-([0-9]+)? ([0-9]+)?-[0-9]+'"
	 * @generated
	 */
	EDataType getRepeatDatatype();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Repeat Prob Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Repeat Prob Datatype</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='Repeat-prob.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0.0' maxInclusive='1.0'"
	 * @generated
	 */
	EDataType getRepeatProbDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Root Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Root Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Root.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#IDREF' pattern='[^.:\\-]+'"
	 * @generated
	 */
	EDataType getRootDatatype();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.ScopeDatatype <em>Scope Datatype Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scope Datatype Object</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.ScopeDatatype
	 * @model instanceClass="de.dfki.iui.mmds.core.model.speech_recognition.grammar.ScopeDatatype"
	 *        extendedMetaData="name='Scope.datatype:Object' baseType='Scope.datatype'"
	 * @generated
	 */
	EDataType getScopeDatatypeObject();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.SpecialDatatype <em>Special Datatype Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Special Datatype Object</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.SpecialDatatype
	 * @model instanceClass="de.dfki.iui.mmds.core.model.speech_recognition.grammar.SpecialDatatype"
	 *        extendedMetaData="name='Special.datatype:Object' baseType='Special.datatype'"
	 * @generated
	 */
	EDataType getSpecialDatatypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tag</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='tag' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getTag();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Tag Format Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tag Format Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Tag-format.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getTagFormatDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Type.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getTypeDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Version.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#NMTOKEN'"
	 * @generated
	 */
	EDataType getVersionDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Weight Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Weight Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Weight.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[0-9]+[.]? ([0-9]+)?[.][0-9]+'"
	 * @generated
	 */
	EDataType getWeightDatatype();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GrammarFactory getGrammarFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.DocumentRootImpl
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Grammar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GRAMMAR = eINSTANCE.getDocumentRoot_Grammar();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarImpl <em>Grammar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarImpl
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getGrammar()
		 * @generated
		 */
		EClass GRAMMAR = eINSTANCE.getGrammar();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR__GROUP = eINSTANCE.getGrammar_Group();

		/**
		 * The meta object literal for the '<em><b>Lexicon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR__LEXICON = eINSTANCE.getGrammar_Lexicon();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR__META = eINSTANCE.getGrammar_Meta();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR__METADATA = eINSTANCE.getGrammar_Metadata();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR__TAG = eINSTANCE.getGrammar_Tag();

		/**
		 * The meta object literal for the '<em><b>Group1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR__GROUP1 = eINSTANCE.getGrammar_Group1();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR__RULE = eINSTANCE.getGrammar_Rule();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR__BASE = eINSTANCE.getGrammar_Base();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR__LANG = eINSTANCE.getGrammar_Lang();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR__MODE = eINSTANCE.getGrammar_Mode();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR__ROOT = eINSTANCE.getGrammar_Root();

		/**
		 * The meta object literal for the '<em><b>Tag Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR__TAG_FORMAT = eINSTANCE.getGrammar_TagFormat();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR__VERSION = eINSTANCE.getGrammar_Version();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.Grammar1Impl <em>Grammar1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.Grammar1Impl
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getGrammar1()
		 * @generated
		 */
		EClass GRAMMAR1 = eINSTANCE.getGrammar1();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.ItemImpl
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__MIXED = eINSTANCE.getItem_Mixed();

		/**
		 * The meta object literal for the '<em><b>Rule Expansion</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__RULE_EXPANSION = eINSTANCE.getItem_RuleExpansion();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__TOKEN = eINSTANCE.getItem_Token();

		/**
		 * The meta object literal for the '<em><b>Ruleref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__RULEREF = eINSTANCE.getItem_Ruleref();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__ITEM = eINSTANCE.getItem_Item();

		/**
		 * The meta object literal for the '<em><b>One Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__ONE_OF = eINSTANCE.getItem_OneOf();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__TAG = eINSTANCE.getItem_Tag();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__LANG = eINSTANCE.getItem_Lang();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__REPEAT = eINSTANCE.getItem_Repeat();

		/**
		 * The meta object literal for the '<em><b>Repeat Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__REPEAT_PROB = eINSTANCE.getItem_RepeatProb();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__WEIGHT = eINSTANCE.getItem_Weight();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.LexiconImpl <em>Lexicon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.LexiconImpl
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getLexicon()
		 * @generated
		 */
		EClass LEXICON = eINSTANCE.getLexicon();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEXICON__TYPE = eINSTANCE.getLexicon_Type();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEXICON__URI = eINSTANCE.getLexicon_Uri();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.MetaImpl <em>Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.MetaImpl
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getMeta()
		 * @generated
		 */
		EClass META = eINSTANCE.getMeta();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__CONTENT = eINSTANCE.getMeta_Content();

		/**
		 * The meta object literal for the '<em><b>Http Equiv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__HTTP_EQUIV = eINSTANCE.getMeta_HttpEquiv();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__NAME = eINSTANCE.getMeta_Name();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.MetadataImpl
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__GROUP = eINSTANCE.getMetadata_Group();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__ANY = eINSTANCE.getMetadata_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__ANY_ATTRIBUTE = eINSTANCE.getMetadata_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.OneOfImpl <em>One Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.OneOfImpl
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getOneOf()
		 * @generated
		 */
		EClass ONE_OF = eINSTANCE.getOneOf();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_OF__GROUP = eINSTANCE.getOneOf_Group();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__ITEM = eINSTANCE.getOneOf_Item();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_OF__LANG = eINSTANCE.getOneOf_Lang();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.RuleImpl
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__MIXED = eINSTANCE.getRule_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__GROUP = eINSTANCE.getRule_Group();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__TOKEN = eINSTANCE.getRule_Token();

		/**
		 * The meta object literal for the '<em><b>Ruleref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULEREF = eINSTANCE.getRule_Ruleref();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__ITEM = eINSTANCE.getRule_Item();

		/**
		 * The meta object literal for the '<em><b>One Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__ONE_OF = eINSTANCE.getRule_OneOf();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__TAG = eINSTANCE.getRule_Tag();

		/**
		 * The meta object literal for the '<em><b>Example</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__EXAMPLE = eINSTANCE.getRule_Example();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ID = eINSTANCE.getRule_Id();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__SCOPE = eINSTANCE.getRule_Scope();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.RulerefImpl <em>Ruleref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.RulerefImpl
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getRuleref()
		 * @generated
		 */
		EClass RULEREF = eINSTANCE.getRuleref();

		/**
		 * The meta object literal for the '<em><b>Special</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULEREF__SPECIAL = eINSTANCE.getRuleref_Special();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULEREF__TYPE = eINSTANCE.getRuleref_Type();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULEREF__URI = eINSTANCE.getRuleref_Uri();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.TokenImpl
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__MIXED = eINSTANCE.getToken_Mixed();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__LANG = eINSTANCE.getToken_Lang();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.ModeDatatype <em>Mode Datatype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.ModeDatatype
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getModeDatatype()
		 * @generated
		 */
		EEnum MODE_DATATYPE = eINSTANCE.getModeDatatype();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.ScopeDatatype <em>Scope Datatype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.ScopeDatatype
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getScopeDatatype()
		 * @generated
		 */
		EEnum SCOPE_DATATYPE = eINSTANCE.getScopeDatatype();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar.SpecialDatatype <em>Special Datatype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.SpecialDatatype
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getSpecialDatatype()
		 * @generated
		 */
		EEnum SPECIAL_DATATYPE = eINSTANCE.getSpecialDatatype();

		/**
		 * The meta object literal for the '<em>Example</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getExample()
		 * @generated
		 */
		EDataType EXAMPLE = eINSTANCE.getExample();

		/**
		 * The meta object literal for the '<em>Id Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getIdDatatype()
		 * @generated
		 */
		EDataType ID_DATATYPE = eINSTANCE.getIdDatatype();

		/**
		 * The meta object literal for the '<em>Mode Datatype Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.ModeDatatype
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getModeDatatypeObject()
		 * @generated
		 */
		EDataType MODE_DATATYPE_OBJECT = eINSTANCE.getModeDatatypeObject();

		/**
		 * The meta object literal for the '<em>Repeat Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getRepeatDatatype()
		 * @generated
		 */
		EDataType REPEAT_DATATYPE = eINSTANCE.getRepeatDatatype();

		/**
		 * The meta object literal for the '<em>Repeat Prob Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getRepeatProbDatatype()
		 * @generated
		 */
		EDataType REPEAT_PROB_DATATYPE = eINSTANCE.getRepeatProbDatatype();

		/**
		 * The meta object literal for the '<em>Root Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getRootDatatype()
		 * @generated
		 */
		EDataType ROOT_DATATYPE = eINSTANCE.getRootDatatype();

		/**
		 * The meta object literal for the '<em>Scope Datatype Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.ScopeDatatype
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getScopeDatatypeObject()
		 * @generated
		 */
		EDataType SCOPE_DATATYPE_OBJECT = eINSTANCE.getScopeDatatypeObject();

		/**
		 * The meta object literal for the '<em>Special Datatype Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.SpecialDatatype
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getSpecialDatatypeObject()
		 * @generated
		 */
		EDataType SPECIAL_DATATYPE_OBJECT = eINSTANCE.getSpecialDatatypeObject();

		/**
		 * The meta object literal for the '<em>Tag</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getTag()
		 * @generated
		 */
		EDataType TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em>Tag Format Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getTagFormatDatatype()
		 * @generated
		 */
		EDataType TAG_FORMAT_DATATYPE = eINSTANCE.getTagFormatDatatype();

		/**
		 * The meta object literal for the '<em>Type Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getTypeDatatype()
		 * @generated
		 */
		EDataType TYPE_DATATYPE = eINSTANCE.getTypeDatatype();

		/**
		 * The meta object literal for the '<em>Version Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getVersionDatatype()
		 * @generated
		 */
		EDataType VERSION_DATATYPE = eINSTANCE.getVersionDatatype();

		/**
		 * The meta object literal for the '<em>Weight Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl.GrammarPackageImpl#getWeightDatatype()
		 * @generated
		 */
		EDataType WEIGHT_DATATYPE = eINSTANCE.getWeightDatatype();

	}

} //GrammarPackage
