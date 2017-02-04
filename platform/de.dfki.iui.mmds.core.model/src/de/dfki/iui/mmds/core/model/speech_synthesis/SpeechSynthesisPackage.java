/**
 */
package de.dfki.iui.mmds.core.model.speech_synthesis;

import de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage;
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
 * 
 *                         SSML 1.1 (Core Profile) no-namespace Schema (2008, 20160823)
 *                 
 * 
 *                         Copyright 1998-2008 W3C (MIT, ERCIM, Keio), All Rights
 *                         Reserved. Permission to use, copy, modify and distribute
 *                         the SSML core schema and its accompanying documentation
 *                         for any purpose and without fee is hereby granted in
 *                         perpetuity, provided that the above copyright notice and
 *                         this paragraph appear in all copies. The copyright
 *                         holders make no representation about the suitability of
 *                         the schema for any purpose. It is provided "as is"
 *                         without expressed or implied warranty.
 *                 
 * 
 *                         Importing dependent namespaces
 *                 
 * General Datatypes
 * Attributes and Groups
 * Content Models
 * Elements
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
 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisFactory
 * @model kind="package"
 * @generated
 */
public interface SpeechSynthesisPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "speech_synthesis";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/2001/10/synthesis";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "speech_synthesis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpeechSynthesisPackage eINSTANCE = de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLSpeechSynthesisImpl <em>SSML Speech Synthesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLSpeechSynthesisImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSSMLSpeechSynthesis()
	 * @generated
	 */
	int SSML_SPEECH_SYNTHESIS = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_SPEECH_SYNTHESIS__BINDING = Io_interfacesPackage.ISPEECH_SYNTHESIS__BINDING;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_SPEECH_SYNTHESIS__DEVICE = Io_interfacesPackage.ISPEECH_SYNTHESIS__DEVICE;

	/**
	 * The feature id for the '<em><b>Service Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_SPEECH_SYNTHESIS__SERVICE_INSTANCE = Io_interfacesPackage.ISPEECH_SYNTHESIS__SERVICE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_SPEECH_SYNTHESIS__SERVICE_NAME = Io_interfacesPackage.ISPEECH_SYNTHESIS__SERVICE_NAME;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_SPEECH_SYNTHESIS__BEGIN_TIME = Io_interfacesPackage.ISPEECH_SYNTHESIS__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_SPEECH_SYNTHESIS__DURATION = Io_interfacesPackage.ISPEECH_SYNTHESIS__DURATION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_SPEECH_SYNTHESIS__LANGUAGE = Io_interfacesPackage.ISPEECH_SYNTHESIS__LANGUAGE;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_SPEECH_SYNTHESIS__USER_ALIAS = Io_interfacesPackage.ISPEECH_SYNTHESIS__USER_ALIAS;

	/**
	 * The feature id for the '<em><b>Ssml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_SPEECH_SYNTHESIS__SSML = Io_interfacesPackage.ISPEECH_SYNTHESIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ssml Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_SPEECH_SYNTHESIS__SSML_DOCUMENT = Io_interfacesPackage.ISPEECH_SYNTHESIS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SSML Speech Synthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_SPEECH_SYNTHESIS_FEATURE_COUNT = Io_interfacesPackage.ISPEECH_SYNTHESIS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SSML Speech Synthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_SPEECH_SYNTHESIS_OPERATION_COUNT = Io_interfacesPackage.ISPEECH_SYNTHESIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.AudioImpl <em>Audio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.AudioImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getAudio()
	 * @generated
	 */
	int AUDIO = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Desc And Sentence And Structure Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__DESC_AND_SENTENCE_AND_STRUCTURE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Aws Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__AWS_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Aws</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__AWS = 3;

	/**
	 * The feature id for the '<em><b>Struct Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__STRUCT_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__STRUCT = 5;

	/**
	 * The feature id for the '<em><b>Lookup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__LOOKUP = 6;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__DESC = 7;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__ANY = 8;

	/**
	 * The feature id for the '<em><b>Fetchhint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__FETCHHINT = 9;

	/**
	 * The feature id for the '<em><b>Fetchtimeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__FETCHTIMEOUT = 10;

	/**
	 * The feature id for the '<em><b>Maxage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__MAXAGE = 11;

	/**
	 * The feature id for the '<em><b>Maxstale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__MAXSTALE = 12;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__SRC = 13;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__ANY_ATTRIBUTE = 14;

	/**
	 * The number of structural features of the '<em>Audio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Audio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.BreakImpl <em>Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.BreakImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getBreak()
	 * @generated
	 */
	int BREAK = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__ANY = 0;

	/**
	 * The feature id for the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__STRENGTH = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__TIME = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.DescImpl <em>Desc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.DescImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getDesc()
	 * @generated
	 */
	int DESC = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC__ANY = 1;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC__LANG = 2;

	/**
	 * The feature id for the '<em><b>Onlangfailure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC__ONLANGFAILURE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Desc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Desc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl <em>SSML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSSML()
	 * @generated
	 */
	int SSML = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Audio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__AUDIO = 3;

	/**
	 * The feature id for the '<em><b>Aws</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__AWS = 4;

	/**
	 * The feature id for the '<em><b>Break</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__BREAK = 5;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__DESC = 6;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__EMPHASIS = 7;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__LANG = 8;

	/**
	 * The feature id for the '<em><b>Lookup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__LOOKUP = 9;

	/**
	 * The feature id for the '<em><b>Mark</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__MARK = 10;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__P = 11;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__STRUCT = 12;

	/**
	 * The feature id for the '<em><b>Phoneme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__PHONEME = 13;

	/**
	 * The feature id for the '<em><b>Prosody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__PROSODY = 14;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__S = 15;

	/**
	 * The feature id for the '<em><b>Say As</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__SAY_AS = 16;

	/**
	 * The feature id for the '<em><b>Speak</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__SPEAK = 17;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__SUB = 18;

	/**
	 * The feature id for the '<em><b>Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__TOKEN = 19;

	/**
	 * The feature id for the '<em><b>Voice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__VOICE = 20;

	/**
	 * The feature id for the '<em><b>W</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML__W = 21;

	/**
	 * The number of structural features of the '<em>SSML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_FEATURE_COUNT = 22;

	/**
	 * The number of operations of the '<em>SSML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.EmphasisImpl <em>Emphasis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.EmphasisImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getEmphasis()
	 * @generated
	 */
	int EMPHASIS = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Sentence Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS__SENTENCE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Aws Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS__AWS_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Aws</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS__AWS = 3;

	/**
	 * The feature id for the '<em><b>Lookup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS__LOOKUP = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS__ANY = 5;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS__LEVEL = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS__ANY_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LangTypeImpl <em>Lang Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.LangTypeImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getLangType()
	 * @generated
	 */
	int LANG_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Audio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__AUDIO = 2;

	/**
	 * The feature id for the '<em><b>Break</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__BREAK = 3;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__EMPHASIS = 4;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__LANG = 5;

	/**
	 * The feature id for the '<em><b>Lookup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__LOOKUP = 6;

	/**
	 * The feature id for the '<em><b>Mark</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__MARK = 7;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__P = 8;

	/**
	 * The feature id for the '<em><b>Phoneme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__PHONEME = 9;

	/**
	 * The feature id for the '<em><b>Prosody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__PROSODY = 10;

	/**
	 * The feature id for the '<em><b>Say As</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__SAY_AS = 11;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__SUB = 12;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__S = 13;

	/**
	 * The feature id for the '<em><b>Token</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__TOKEN = 14;

	/**
	 * The feature id for the '<em><b>Voice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__VOICE = 15;

	/**
	 * The feature id for the '<em><b>W</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__W = 16;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__ANY = 17;

	/**
	 * The feature id for the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__LANG1 = 18;

	/**
	 * The feature id for the '<em><b>Onlangfailure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__ONLANGFAILURE = 19;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE__ANY_ATTRIBUTE = 20;

	/**
	 * The number of structural features of the '<em>Lang Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Lang Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl <em>Lookup Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getLookupType()
	 * @generated
	 */
	int LOOKUP_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Audio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE__AUDIO = 2;

	/**
	 * The feature id for the '<em><b>Break</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE__BREAK = 3;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE__EMPHASIS = 4;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE__LANG = 5;

	/**
	 * The feature id for the '<em><b>Lookup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE__LOOKUP = 6;

	/**
	 * The feature id for the '<em><b>Mark</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE__MARK = 7;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE__P = 8;

	/**
	 * The feature id for the '<em><b>Phoneme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE__PHONEME = 9;

	/**
	 * The feature id for the '<em><b>Prosody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE__PROSODY = 10;

	/**
	 * The feature id for the '<em><b>Say As</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE__SAY_AS = 11;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE__SUB = 12;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE__S = 13;

	/**
	 * The feature id for the '<em><b>Token</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE__TOKEN = 14;

	/**
	 * The feature id for the '<em><b>Voice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE__VOICE = 15;

	/**
	 * The feature id for the '<em><b>W</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE__W = 16;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE__ANY = 17;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE__REF = 18;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE__ANY_ATTRIBUTE = 19;

	/**
	 * The number of structural features of the '<em>Lookup Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Lookup Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.MarkImpl <em>Mark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.MarkImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getMark()
	 * @generated
	 */
	int MARK = 8;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__ANY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__NAME = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.Mark1Impl <em>Mark1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.Mark1Impl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getMark1()
	 * @generated
	 */
	int MARK1 = 9;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK1__ANY = MARK__ANY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK1__NAME = MARK__NAME;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK1__ANY_ATTRIBUTE = MARK__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Mark1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK1_FEATURE_COUNT = MARK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mark1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK1_OPERATION_COUNT = MARK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.ParagraphImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 10;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Aws Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__AWS_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Aws</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__AWS = 3;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__S = 4;

	/**
	 * The feature id for the '<em><b>Lookup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__LOOKUP = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ANY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ID = 7;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__LANG = 8;

	/**
	 * The feature id for the '<em><b>Onlangfailure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ONLANGFAILURE = 9;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ANY_ATTRIBUTE = 10;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.PhonemeImpl <em>Phoneme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.PhonemeImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getPhoneme()
	 * @generated
	 */
	int PHONEME = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONEME__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONEME__ANY = 1;

	/**
	 * The feature id for the '<em><b>Alphabet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONEME__ALPHABET = 2;

	/**
	 * The feature id for the '<em><b>Ph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONEME__PH = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONEME__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONEME__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Phoneme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONEME_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Phoneme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONEME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.ProsodyImpl <em>Prosody</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.ProsodyImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getProsody()
	 * @generated
	 */
	int PROSODY = 12;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSODY__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Sentence And Structure Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSODY__SENTENCE_AND_STRUCTURE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Aws Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSODY__AWS_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Aws</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSODY__AWS = 3;

	/**
	 * The feature id for the '<em><b>Struct Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSODY__STRUCT_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSODY__STRUCT = 5;

	/**
	 * The feature id for the '<em><b>Lookup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSODY__LOOKUP = 6;

	/**
	 * The feature id for the '<em><b>Contour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSODY__CONTOUR = 7;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSODY__DURATION = 8;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSODY__PITCH = 9;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSODY__RANGE = 10;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSODY__RATE = 11;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSODY__VOLUME = 12;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSODY__ANY_ATTRIBUTE = 13;

	/**
	 * The number of structural features of the '<em>Prosody</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSODY_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Prosody</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROSODY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SayAsImpl <em>Say As</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SayAsImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSayAs()
	 * @generated
	 */
	int SAY_AS = 13;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_AS__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_AS__ANY = 1;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_AS__DETAIL = 2;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_AS__FORMAT = 3;

	/**
	 * The feature id for the '<em><b>Interpret As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_AS__INTERPRET_AS = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_AS__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Say As</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_AS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Say As</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_AS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SentenceImpl <em>Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SentenceImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSentence()
	 * @generated
	 */
	int SENTENCE = 14;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Sentence Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__SENTENCE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Aws Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__AWS_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Aws</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__AWS = 3;

	/**
	 * The feature id for the '<em><b>Lookup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__LOOKUP = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__ANY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__ID = 6;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__LANG = 7;

	/**
	 * The feature id for the '<em><b>Onlangfailure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__ONLANGFAILURE = 8;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__ANY_ATTRIBUTE = 9;

	/**
	 * The number of structural features of the '<em>Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl <em>Speak</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSpeak()
	 * @generated
	 */
	int SPEAK = 15;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__META = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__METADATA = 3;

	/**
	 * The feature id for the '<em><b>Lexicon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__LEXICON = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__ANY = 5;

	/**
	 * The feature id for the '<em><b>Aws Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__AWS_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Aws</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__AWS = 7;

	/**
	 * The feature id for the '<em><b>Struct Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__STRUCT_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__STRUCT = 9;

	/**
	 * The feature id for the '<em><b>Lookup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__LOOKUP = 10;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__GROUP1 = 11;

	/**
	 * The feature id for the '<em><b>Aws Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__AWS_GROUP1 = 12;

	/**
	 * The feature id for the '<em><b>Aws1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__AWS1 = 13;

	/**
	 * The feature id for the '<em><b>Struct Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__STRUCT_GROUP1 = 14;

	/**
	 * The feature id for the '<em><b>Struct1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__STRUCT1 = 15;

	/**
	 * The feature id for the '<em><b>Lookup1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__LOOKUP1 = 16;

	/**
	 * The feature id for the '<em><b>Any1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__ANY1 = 17;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__BASE = 18;

	/**
	 * The feature id for the '<em><b>Endmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__ENDMARK = 19;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__LANG = 20;

	/**
	 * The feature id for the '<em><b>Onlangfailure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__ONLANGFAILURE = 21;

	/**
	 * The feature id for the '<em><b>Startmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__STARTMARK = 22;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__VERSION = 23;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK__ANY_ATTRIBUTE = 24;

	/**
	 * The number of structural features of the '<em>Speak</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>Speak</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SsmlLexiconImpl <em>Ssml Lexicon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SsmlLexiconImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSsmlLexicon()
	 * @generated
	 */
	int SSML_LEXICON = 16;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_LEXICON__ANY = 0;

	/**
	 * The feature id for the '<em><b>Fetchtimeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_LEXICON__FETCHTIMEOUT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_LEXICON__ID = 2;

	/**
	 * The feature id for the '<em><b>Maxage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_LEXICON__MAXAGE = 3;

	/**
	 * The feature id for the '<em><b>Maxstale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_LEXICON__MAXSTALE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_LEXICON__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_LEXICON__URI = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_LEXICON__ANY_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Ssml Lexicon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_LEXICON_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Ssml Lexicon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_LEXICON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SsmlMetaImpl <em>Ssml Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SsmlMetaImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSsmlMeta()
	 * @generated
	 */
	int SSML_META = 17;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_META__ANY = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_META__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Http Equiv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_META__HTTP_EQUIV = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_META__NAME = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_META__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Ssml Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_META_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Ssml Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_META_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SsmlMetadataImpl <em>Ssml Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SsmlMetadataImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSsmlMetadata()
	 * @generated
	 */
	int SSML_METADATA = 18;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_METADATA__ANY = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_METADATA__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Ssml Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_METADATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ssml Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSML_METADATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SubImpl <em>Sub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SubImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSub()
	 * @generated
	 */
	int SUB = 19;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__ANY = 1;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__ALIAS = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl <em>Token Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getTokenType()
	 * @generated
	 */
	int TOKEN_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Audio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__AUDIO = 2;

	/**
	 * The feature id for the '<em><b>Break</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__BREAK = 3;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__EMPHASIS = 4;

	/**
	 * The feature id for the '<em><b>Mark</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__MARK = 5;

	/**
	 * The feature id for the '<em><b>Phoneme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__PHONEME = 6;

	/**
	 * The feature id for the '<em><b>Prosody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__PROSODY = 7;

	/**
	 * The feature id for the '<em><b>Say As</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__SAY_AS = 8;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__SUB = 9;

	/**
	 * The feature id for the '<em><b>Voice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__VOICE = 10;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__ANY = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__ID = 12;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__LANG = 13;

	/**
	 * The feature id for the '<em><b>Onlangfailure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__ONLANGFAILURE = 14;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__ROLE = 15;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE__ANY_ATTRIBUTE = 16;

	/**
	 * The number of structural features of the '<em>Token Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Token Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.VoiceImpl <em>Voice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.VoiceImpl
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getVoice()
	 * @generated
	 */
	int VOICE = 21;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Sentence And Structure Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE__SENTENCE_AND_STRUCTURE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Aws Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE__AWS_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Aws</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE__AWS = 3;

	/**
	 * The feature id for the '<em><b>Struct Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE__STRUCT_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE__STRUCT = 5;

	/**
	 * The feature id for the '<em><b>Lookup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE__LOOKUP = 6;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE__AGE = 7;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE__GENDER = 8;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE__LANGUAGES = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE__NAME = 10;

	/**
	 * The feature id for the '<em><b>Onvoicefailure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE__ONVOICEFAILURE = 11;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE__ORDERING = 12;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE__REQUIRED = 13;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE__VARIANT = 14;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE__ANY_ATTRIBUTE = 15;

	/**
	 * The number of structural features of the '<em>Voice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Voice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.GenderDatatype <em>Gender Datatype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.GenderDatatype
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getGenderDatatype()
	 * @generated
	 */
	int GENDER_DATATYPE = 22;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.HeightScale <em>Height Scale</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.HeightScale
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getHeightScale()
	 * @generated
	 */
	int HEIGHT_SCALE = 23;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LevelDatatype <em>Level Datatype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LevelDatatype
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getLevelDatatype()
	 * @generated
	 */
	int LEVEL_DATATYPE = 24;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SpeedScale <em>Speed Scale</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeedScale
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSpeedScale()
	 * @generated
	 */
	int SPEED_SCALE = 25;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.StrengthDatatype <em>Strength Datatype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.StrengthDatatype
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getStrengthDatatype()
	 * @generated
	 */
	int STRENGTH_DATATYPE = 26;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.VolumeScale <em>Volume Scale</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.VolumeScale
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getVolumeScale()
	 * @generated
	 */
	int VOLUME_SCALE = 27;

	/**
	 * The meta object id for the '<em>Age Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getAgeDatatype()
	 * @generated
	 */
	int AGE_DATATYPE = 28;

	/**
	 * The meta object id for the '<em>Alphabet Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getAlphabetDatatype()
	 * @generated
	 */
	int ALPHABET_DATATYPE = 29;

	/**
	 * The meta object id for the '<em>Contour Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getContourDatatype()
	 * @generated
	 */
	int CONTOUR_DATATYPE = 30;

	/**
	 * The meta object id for the '<em>Contourpoint Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getContourpointDatatype()
	 * @generated
	 */
	int CONTOURPOINT_DATATYPE = 31;

	/**
	 * The meta object id for the '<em>Db Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getDbDatatype()
	 * @generated
	 */
	int DB_DATATYPE = 32;

	/**
	 * The meta object id for the '<em>Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 33;

	/**
	 * The meta object id for the '<em>Emptystring Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getEmptystringDatatype()
	 * @generated
	 */
	int EMPTYSTRING_DATATYPE = 34;

	/**
	 * The meta object id for the '<em>Fetchhint Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getFetchhintDatatype()
	 * @generated
	 */
	int FETCHHINT_DATATYPE = 35;

	/**
	 * The meta object id for the '<em>Gender Datatype Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.GenderDatatype
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getGenderDatatypeObject()
	 * @generated
	 */
	int GENDER_DATATYPE_OBJECT = 36;

	/**
	 * The meta object id for the '<em>Height Scale Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.HeightScale
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getHeightScaleObject()
	 * @generated
	 */
	int HEIGHT_SCALE_OBJECT = 37;

	/**
	 * The meta object id for the '<em>Hertz Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getHertzNumber()
	 * @generated
	 */
	int HERTZ_NUMBER = 38;

	/**
	 * The meta object id for the '<em>Hertz Relative</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getHertzRelative()
	 * @generated
	 */
	int HERTZ_RELATIVE = 39;

	/**
	 * The meta object id for the '<em>Languages Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getLanguagesDatatype()
	 * @generated
	 */
	int LANGUAGES_DATATYPE = 40;

	/**
	 * The meta object id for the '<em>Level Datatype Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LevelDatatype
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getLevelDatatypeObject()
	 * @generated
	 */
	int LEVEL_DATATYPE_OBJECT = 41;

	/**
	 * The meta object id for the '<em>Name Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getNameDatatype()
	 * @generated
	 */
	int NAME_DATATYPE = 42;

	/**
	 * The meta object id for the '<em>Nonnegpercent</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getNonnegpercent()
	 * @generated
	 */
	int NONNEGPERCENT = 43;

	/**
	 * The meta object id for the '<em>Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 44;

	/**
	 * The meta object id for the '<em>Onlangfailure Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getOnlangfailureDatatype()
	 * @generated
	 */
	int ONLANGFAILURE_DATATYPE = 45;

	/**
	 * The meta object id for the '<em>Onvoicefailure Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getOnvoicefailureDatatype()
	 * @generated
	 */
	int ONVOICEFAILURE_DATATYPE = 46;

	/**
	 * The meta object id for the '<em>Ordering Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getOrderingDatatype()
	 * @generated
	 */
	int ORDERING_DATATYPE = 47;

	/**
	 * The meta object id for the '<em>Orderingitem Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getOrderingitemDatatype()
	 * @generated
	 */
	int ORDERINGITEM_DATATYPE = 48;

	/**
	 * The meta object id for the '<em>Orderinglist Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getOrderinglistDatatype()
	 * @generated
	 */
	int ORDERINGLIST_DATATYPE = 49;

	/**
	 * The meta object id for the '<em>Percent</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getPercent()
	 * @generated
	 */
	int PERCENT = 50;

	/**
	 * The meta object id for the '<em>Phonemetype Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getPhonemetypeDatatype()
	 * @generated
	 */
	int PHONEMETYPE_DATATYPE = 51;

	/**
	 * The meta object id for the '<em>Pitch Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getPitchDatatype()
	 * @generated
	 */
	int PITCH_DATATYPE = 52;

	/**
	 * The meta object id for the '<em>Range Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getRangeDatatype()
	 * @generated
	 */
	int RANGE_DATATYPE = 53;

	/**
	 * The meta object id for the '<em>Rate Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getRateDatatype()
	 * @generated
	 */
	int RATE_DATATYPE = 54;

	/**
	 * The meta object id for the '<em>Relative</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getRelative()
	 * @generated
	 */
	int RELATIVE = 55;

	/**
	 * The meta object id for the '<em>Required Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getRequiredDatatype()
	 * @generated
	 */
	int REQUIRED_DATATYPE = 56;

	/**
	 * The meta object id for the '<em>Requireditem Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getRequireditemDatatype()
	 * @generated
	 */
	int REQUIREDITEM_DATATYPE = 57;

	/**
	 * The meta object id for the '<em>Requiredlist Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getRequiredlistDatatype()
	 * @generated
	 */
	int REQUIREDLIST_DATATYPE = 58;

	/**
	 * The meta object id for the '<em>Role Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getRoleDatatype()
	 * @generated
	 */
	int ROLE_DATATYPE = 59;

	/**
	 * The meta object id for the '<em>Semitone</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSemitone()
	 * @generated
	 */
	int SEMITONE = 60;

	/**
	 * The meta object id for the '<em>Speed Scale Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeedScale
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSpeedScaleObject()
	 * @generated
	 */
	int SPEED_SCALE_OBJECT = 61;

	/**
	 * The meta object id for the '<em>Strength Datatype Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.StrengthDatatype
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getStrengthDatatypeObject()
	 * @generated
	 */
	int STRENGTH_DATATYPE_OBJECT = 62;

	/**
	 * The meta object id for the '<em>Timedesignation Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getTimedesignationDatatype()
	 * @generated
	 */
	int TIMEDESIGNATION_DATATYPE = 63;

	/**
	 * The meta object id for the '<em>Variant Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getVariantDatatype()
	 * @generated
	 */
	int VARIANT_DATATYPE = 64;

	/**
	 * The meta object id for the '<em>Version Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getVersionDatatype()
	 * @generated
	 */
	int VERSION_DATATYPE = 65;

	/**
	 * The meta object id for the '<em>Voicename Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getVoicenameDatatype()
	 * @generated
	 */
	int VOICENAME_DATATYPE = 66;

	/**
	 * The meta object id for the '<em>Voicenames Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getVoicenamesDatatype()
	 * @generated
	 */
	int VOICENAMES_DATATYPE = 67;

	/**
	 * The meta object id for the '<em>Volume Datatype</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getVolumeDatatype()
	 * @generated
	 */
	int VOLUME_DATATYPE = 68;

	/**
	 * The meta object id for the '<em>Volume Scale Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.VolumeScale
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getVolumeScaleObject()
	 * @generated
	 */
	int VOLUME_SCALE_OBJECT = 69;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSMLSpeechSynthesis <em>SSML Speech Synthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSML Speech Synthesis</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSMLSpeechSynthesis
	 * @generated
	 */
	EClass getSSMLSpeechSynthesis();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSMLSpeechSynthesis#getSsml <em>Ssml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssml</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSMLSpeechSynthesis#getSsml()
	 * @see #getSSMLSpeechSynthesis()
	 * @generated
	 */
	EAttribute getSSMLSpeechSynthesis_Ssml();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSMLSpeechSynthesis#getSsmlDocument <em>Ssml Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ssml Document</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSMLSpeechSynthesis#getSsmlDocument()
	 * @see #getSSMLSpeechSynthesis()
	 * @generated
	 */
	EReference getSSMLSpeechSynthesis_SsmlDocument();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Audio
	 * @generated
	 */
	EClass getAudio();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getMixed()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getDescAndSentenceAndStructureClass <em>Desc And Sentence And Structure Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Desc And Sentence And Structure Class</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getDescAndSentenceAndStructureClass()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_DescAndSentenceAndStructureClass();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getAwsGroup <em>Aws Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Aws Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getAwsGroup()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_AwsGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getAws <em>Aws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aws</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getAws()
	 * @see #getAudio()
	 * @generated
	 */
	EReference getAudio_Aws();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getStructGroup <em>Struct Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Struct Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getStructGroup()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_StructGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getStruct()
	 * @see #getAudio()
	 * @generated
	 */
	EReference getAudio_Struct();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getLookup <em>Lookup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lookup</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getLookup()
	 * @see #getAudio()
	 * @generated
	 */
	EReference getAudio_Lookup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Desc</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getDesc()
	 * @see #getAudio()
	 * @generated
	 */
	EReference getAudio_Desc();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getAny()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_Any();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getFetchhint <em>Fetchhint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetchhint</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getFetchhint()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_Fetchhint();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getFetchtimeout <em>Fetchtimeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetchtimeout</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getFetchtimeout()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_Fetchtimeout();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getMaxage <em>Maxage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxage</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getMaxage()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_Maxage();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getMaxstale <em>Maxstale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxstale</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getMaxstale()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_Maxstale();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getSrc()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_Src();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getAnyAttribute()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Break <em>Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Break
	 * @generated
	 */
	EClass getBreak();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Break#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Break#getAny()
	 * @see #getBreak()
	 * @generated
	 */
	EAttribute getBreak_Any();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Break#getStrength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strength</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Break#getStrength()
	 * @see #getBreak()
	 * @generated
	 */
	EAttribute getBreak_Strength();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Break#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Break#getTime()
	 * @see #getBreak()
	 * @generated
	 */
	EAttribute getBreak_Time();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Break#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Break#getAnyAttribute()
	 * @see #getBreak()
	 * @generated
	 */
	EAttribute getBreak_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Desc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Desc</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Desc
	 * @generated
	 */
	EClass getDesc();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Desc#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Desc#getMixed()
	 * @see #getDesc()
	 * @generated
	 */
	EAttribute getDesc_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Desc#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Desc#getAny()
	 * @see #getDesc()
	 * @generated
	 */
	EAttribute getDesc_Any();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Desc#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Desc#getLang()
	 * @see #getDesc()
	 * @generated
	 */
	EAttribute getDesc_Lang();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Desc#getOnlangfailure <em>Onlangfailure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onlangfailure</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Desc#getOnlangfailure()
	 * @see #getDesc()
	 * @generated
	 */
	EAttribute getDesc_Onlangfailure();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Desc#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Desc#getAnyAttribute()
	 * @see #getDesc()
	 * @generated
	 */
	EAttribute getDesc_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML <em>SSML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSML</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML
	 * @generated
	 */
	EClass getSSML();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getMixed()
	 * @see #getSSML()
	 * @generated
	 */
	EAttribute getSSML_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getXMLNSPrefixMap()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getXSISchemaLocation()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getAudio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Audio</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getAudio()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_Audio();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getAws <em>Aws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aws</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getAws()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_Aws();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getBreak <em>Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Break</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getBreak()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_Break();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Desc</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getDesc()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_Desc();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getEmphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emphasis</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getEmphasis()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_Emphasis();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lang</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getLang()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_Lang();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getLookup <em>Lookup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lookup</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getLookup()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_Lookup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mark</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getMark()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_Mark();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getP()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_P();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getStruct()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_Struct();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getPhoneme <em>Phoneme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phoneme</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getPhoneme()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_Phoneme();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getProsody <em>Prosody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prosody</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getProsody()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_Prosody();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>S</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getS()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_S();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getSayAs <em>Say As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Say As</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getSayAs()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_SayAs();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getSpeak <em>Speak</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speak</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getSpeak()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_Speak();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getSub()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_Sub();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Token</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getToken()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_Token();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getVoice <em>Voice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Voice</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getVoice()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_Voice();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>W</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getW()
	 * @see #getSSML()
	 * @generated
	 */
	EReference getSSML_W();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emphasis</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis
	 * @generated
	 */
	EClass getEmphasis();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis#getMixed()
	 * @see #getEmphasis()
	 * @generated
	 */
	EAttribute getEmphasis_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis#getSentenceClass <em>Sentence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sentence Class</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis#getSentenceClass()
	 * @see #getEmphasis()
	 * @generated
	 */
	EAttribute getEmphasis_SentenceClass();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis#getAwsGroup <em>Aws Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Aws Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis#getAwsGroup()
	 * @see #getEmphasis()
	 * @generated
	 */
	EAttribute getEmphasis_AwsGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis#getAws <em>Aws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aws</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis#getAws()
	 * @see #getEmphasis()
	 * @generated
	 */
	EReference getEmphasis_Aws();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis#getLookup <em>Lookup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lookup</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis#getLookup()
	 * @see #getEmphasis()
	 * @generated
	 */
	EReference getEmphasis_Lookup();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis#getAny()
	 * @see #getEmphasis()
	 * @generated
	 */
	EAttribute getEmphasis_Any();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis#getLevel()
	 * @see #getEmphasis()
	 * @generated
	 */
	EAttribute getEmphasis_Level();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis#getAnyAttribute()
	 * @see #getEmphasis()
	 * @generated
	 */
	EAttribute getEmphasis_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType <em>Lang Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lang Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType
	 * @generated
	 */
	EClass getLangType();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getMixed()
	 * @see #getLangType()
	 * @generated
	 */
	EAttribute getLangType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getGroup()
	 * @see #getLangType()
	 * @generated
	 */
	EAttribute getLangType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getAudio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Audio</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getAudio()
	 * @see #getLangType()
	 * @generated
	 */
	EReference getLangType_Audio();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getBreak <em>Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Break</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getBreak()
	 * @see #getLangType()
	 * @generated
	 */
	EReference getLangType_Break();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getEmphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emphasis</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getEmphasis()
	 * @see #getLangType()
	 * @generated
	 */
	EReference getLangType_Emphasis();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lang</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getLang()
	 * @see #getLangType()
	 * @generated
	 */
	EReference getLangType_Lang();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getLookup <em>Lookup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lookup</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getLookup()
	 * @see #getLangType()
	 * @generated
	 */
	EReference getLangType_Lookup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mark</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getMark()
	 * @see #getLangType()
	 * @generated
	 */
	EReference getLangType_Mark();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getP()
	 * @see #getLangType()
	 * @generated
	 */
	EReference getLangType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getPhoneme <em>Phoneme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phoneme</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getPhoneme()
	 * @see #getLangType()
	 * @generated
	 */
	EReference getLangType_Phoneme();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getProsody <em>Prosody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prosody</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getProsody()
	 * @see #getLangType()
	 * @generated
	 */
	EReference getLangType_Prosody();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getSayAs <em>Say As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Say As</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getSayAs()
	 * @see #getLangType()
	 * @generated
	 */
	EReference getLangType_SayAs();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getSub()
	 * @see #getLangType()
	 * @generated
	 */
	EReference getLangType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>S</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getS()
	 * @see #getLangType()
	 * @generated
	 */
	EReference getLangType_S();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Token</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getToken()
	 * @see #getLangType()
	 * @generated
	 */
	EReference getLangType_Token();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getVoice <em>Voice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Voice</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getVoice()
	 * @see #getLangType()
	 * @generated
	 */
	EReference getLangType_Voice();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>W</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getW()
	 * @see #getLangType()
	 * @generated
	 */
	EReference getLangType_W();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getAny()
	 * @see #getLangType()
	 * @generated
	 */
	EAttribute getLangType_Any();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getLang1 <em>Lang1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang1</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getLang1()
	 * @see #getLangType()
	 * @generated
	 */
	EAttribute getLangType_Lang1();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getOnlangfailure <em>Onlangfailure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onlangfailure</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getOnlangfailure()
	 * @see #getLangType()
	 * @generated
	 */
	EAttribute getLangType_Onlangfailure();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LangType#getAnyAttribute()
	 * @see #getLangType()
	 * @generated
	 */
	EAttribute getLangType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType <em>Lookup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lookup Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType
	 * @generated
	 */
	EClass getLookupType();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getMixed()
	 * @see #getLookupType()
	 * @generated
	 */
	EAttribute getLookupType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getGroup()
	 * @see #getLookupType()
	 * @generated
	 */
	EAttribute getLookupType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getAudio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Audio</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getAudio()
	 * @see #getLookupType()
	 * @generated
	 */
	EReference getLookupType_Audio();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getBreak <em>Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Break</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getBreak()
	 * @see #getLookupType()
	 * @generated
	 */
	EReference getLookupType_Break();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getEmphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emphasis</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getEmphasis()
	 * @see #getLookupType()
	 * @generated
	 */
	EReference getLookupType_Emphasis();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lang</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getLang()
	 * @see #getLookupType()
	 * @generated
	 */
	EReference getLookupType_Lang();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getLookup <em>Lookup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lookup</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getLookup()
	 * @see #getLookupType()
	 * @generated
	 */
	EReference getLookupType_Lookup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mark</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getMark()
	 * @see #getLookupType()
	 * @generated
	 */
	EReference getLookupType_Mark();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getP()
	 * @see #getLookupType()
	 * @generated
	 */
	EReference getLookupType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getPhoneme <em>Phoneme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phoneme</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getPhoneme()
	 * @see #getLookupType()
	 * @generated
	 */
	EReference getLookupType_Phoneme();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getProsody <em>Prosody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prosody</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getProsody()
	 * @see #getLookupType()
	 * @generated
	 */
	EReference getLookupType_Prosody();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getSayAs <em>Say As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Say As</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getSayAs()
	 * @see #getLookupType()
	 * @generated
	 */
	EReference getLookupType_SayAs();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getSub()
	 * @see #getLookupType()
	 * @generated
	 */
	EReference getLookupType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>S</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getS()
	 * @see #getLookupType()
	 * @generated
	 */
	EReference getLookupType_S();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Token</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getToken()
	 * @see #getLookupType()
	 * @generated
	 */
	EReference getLookupType_Token();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getVoice <em>Voice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Voice</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getVoice()
	 * @see #getLookupType()
	 * @generated
	 */
	EReference getLookupType_Voice();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>W</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getW()
	 * @see #getLookupType()
	 * @generated
	 */
	EReference getLookupType_W();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getAny()
	 * @see #getLookupType()
	 * @generated
	 */
	EAttribute getLookupType_Any();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getRef()
	 * @see #getLookupType()
	 * @generated
	 */
	EAttribute getLookupType_Ref();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LookupType#getAnyAttribute()
	 * @see #getLookupType()
	 * @generated
	 */
	EAttribute getLookupType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Mark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Mark
	 * @generated
	 */
	EClass getMark();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Mark#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Mark#getAny()
	 * @see #getMark()
	 * @generated
	 */
	EAttribute getMark_Any();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Mark#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Mark#getName()
	 * @see #getMark()
	 * @generated
	 */
	EAttribute getMark_Name();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Mark#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Mark#getAnyAttribute()
	 * @see #getMark()
	 * @generated
	 */
	EAttribute getMark_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Mark1 <em>Mark1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark1</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Mark1
	 * @generated
	 */
	EClass getMark1();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getMixed()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getGroup()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Group();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getAwsGroup <em>Aws Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Aws Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getAwsGroup()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_AwsGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getAws <em>Aws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aws</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getAws()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_Aws();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>S</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getS()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_S();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getLookup <em>Lookup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lookup</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getLookup()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_Lookup();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getAny()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Any();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getId()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getLang()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Lang();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getOnlangfailure <em>Onlangfailure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onlangfailure</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getOnlangfailure()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Onlangfailure();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph#getAnyAttribute()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme <em>Phoneme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phoneme</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme
	 * @generated
	 */
	EClass getPhoneme();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme#getMixed()
	 * @see #getPhoneme()
	 * @generated
	 */
	EAttribute getPhoneme_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme#getAny()
	 * @see #getPhoneme()
	 * @generated
	 */
	EAttribute getPhoneme_Any();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme#getAlphabet <em>Alphabet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alphabet</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme#getAlphabet()
	 * @see #getPhoneme()
	 * @generated
	 */
	EAttribute getPhoneme_Alphabet();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme#getPh <em>Ph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ph</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme#getPh()
	 * @see #getPhoneme()
	 * @generated
	 */
	EAttribute getPhoneme_Ph();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme#getType()
	 * @see #getPhoneme()
	 * @generated
	 */
	EAttribute getPhoneme_Type();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme#getAnyAttribute()
	 * @see #getPhoneme()
	 * @generated
	 */
	EAttribute getPhoneme_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody <em>Prosody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prosody</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Prosody
	 * @generated
	 */
	EClass getProsody();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getMixed()
	 * @see #getProsody()
	 * @generated
	 */
	EAttribute getProsody_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getSentenceAndStructureClass <em>Sentence And Structure Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sentence And Structure Class</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getSentenceAndStructureClass()
	 * @see #getProsody()
	 * @generated
	 */
	EAttribute getProsody_SentenceAndStructureClass();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getAwsGroup <em>Aws Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Aws Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getAwsGroup()
	 * @see #getProsody()
	 * @generated
	 */
	EAttribute getProsody_AwsGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getAws <em>Aws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aws</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getAws()
	 * @see #getProsody()
	 * @generated
	 */
	EReference getProsody_Aws();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getStructGroup <em>Struct Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Struct Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getStructGroup()
	 * @see #getProsody()
	 * @generated
	 */
	EAttribute getProsody_StructGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getStruct()
	 * @see #getProsody()
	 * @generated
	 */
	EReference getProsody_Struct();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getLookup <em>Lookup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lookup</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getLookup()
	 * @see #getProsody()
	 * @generated
	 */
	EReference getProsody_Lookup();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getContour <em>Contour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contour</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getContour()
	 * @see #getProsody()
	 * @generated
	 */
	EAttribute getProsody_Contour();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getDuration()
	 * @see #getProsody()
	 * @generated
	 */
	EAttribute getProsody_Duration();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getPitch()
	 * @see #getProsody()
	 * @generated
	 */
	EAttribute getProsody_Pitch();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getRange()
	 * @see #getProsody()
	 * @generated
	 */
	EAttribute getProsody_Range();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getRate()
	 * @see #getProsody()
	 * @generated
	 */
	EAttribute getProsody_Rate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getVolume()
	 * @see #getProsody()
	 * @generated
	 */
	EAttribute getProsody_Volume();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getAnyAttribute()
	 * @see #getProsody()
	 * @generated
	 */
	EAttribute getProsody_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SayAs <em>Say As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Say As</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SayAs
	 * @generated
	 */
	EClass getSayAs();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SayAs#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SayAs#getMixed()
	 * @see #getSayAs()
	 * @generated
	 */
	EAttribute getSayAs_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SayAs#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SayAs#getAny()
	 * @see #getSayAs()
	 * @generated
	 */
	EAttribute getSayAs_Any();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SayAs#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SayAs#getDetail()
	 * @see #getSayAs()
	 * @generated
	 */
	EAttribute getSayAs_Detail();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SayAs#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SayAs#getFormat()
	 * @see #getSayAs()
	 * @generated
	 */
	EAttribute getSayAs_Format();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SayAs#getInterpretAs <em>Interpret As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpret As</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SayAs#getInterpretAs()
	 * @see #getSayAs()
	 * @generated
	 */
	EAttribute getSayAs_InterpretAs();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SayAs#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SayAs#getAnyAttribute()
	 * @see #getSayAs()
	 * @generated
	 */
	EAttribute getSayAs_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence <em>Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sentence</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Sentence
	 * @generated
	 */
	EClass getSentence();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getMixed()
	 * @see #getSentence()
	 * @generated
	 */
	EAttribute getSentence_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getSentenceClass <em>Sentence Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sentence Class</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getSentenceClass()
	 * @see #getSentence()
	 * @generated
	 */
	EAttribute getSentence_SentenceClass();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getAwsGroup <em>Aws Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Aws Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getAwsGroup()
	 * @see #getSentence()
	 * @generated
	 */
	EAttribute getSentence_AwsGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getAws <em>Aws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aws</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getAws()
	 * @see #getSentence()
	 * @generated
	 */
	EReference getSentence_Aws();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getLookup <em>Lookup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lookup</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getLookup()
	 * @see #getSentence()
	 * @generated
	 */
	EReference getSentence_Lookup();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getAny()
	 * @see #getSentence()
	 * @generated
	 */
	EAttribute getSentence_Any();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getId()
	 * @see #getSentence()
	 * @generated
	 */
	EAttribute getSentence_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getLang()
	 * @see #getSentence()
	 * @generated
	 */
	EAttribute getSentence_Lang();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getOnlangfailure <em>Onlangfailure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onlangfailure</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getOnlangfailure()
	 * @see #getSentence()
	 * @generated
	 */
	EAttribute getSentence_Onlangfailure();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getAnyAttribute()
	 * @see #getSentence()
	 * @generated
	 */
	EAttribute getSentence_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak <em>Speak</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speak</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak
	 * @generated
	 */
	EClass getSpeak();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getMixed()
	 * @see #getSpeak()
	 * @generated
	 */
	EAttribute getSpeak_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getGroup()
	 * @see #getSpeak()
	 * @generated
	 */
	EAttribute getSpeak_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getMeta()
	 * @see #getSpeak()
	 * @generated
	 */
	EReference getSpeak_Meta();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getMetadata()
	 * @see #getSpeak()
	 * @generated
	 */
	EReference getSpeak_Metadata();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getLexicon <em>Lexicon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lexicon</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getLexicon()
	 * @see #getSpeak()
	 * @generated
	 */
	EReference getSpeak_Lexicon();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getAny()
	 * @see #getSpeak()
	 * @generated
	 */
	EAttribute getSpeak_Any();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getAwsGroup <em>Aws Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Aws Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getAwsGroup()
	 * @see #getSpeak()
	 * @generated
	 */
	EAttribute getSpeak_AwsGroup();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getAws <em>Aws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aws</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getAws()
	 * @see #getSpeak()
	 * @generated
	 */
	EReference getSpeak_Aws();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getStructGroup <em>Struct Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Struct Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getStructGroup()
	 * @see #getSpeak()
	 * @generated
	 */
	EAttribute getSpeak_StructGroup();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getStruct()
	 * @see #getSpeak()
	 * @generated
	 */
	EReference getSpeak_Struct();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getLookup <em>Lookup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lookup</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getLookup()
	 * @see #getSpeak()
	 * @generated
	 */
	EReference getSpeak_Lookup();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group1</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getGroup1()
	 * @see #getSpeak()
	 * @generated
	 */
	EAttribute getSpeak_Group1();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getAwsGroup1 <em>Aws Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Aws Group1</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getAwsGroup1()
	 * @see #getSpeak()
	 * @generated
	 */
	EAttribute getSpeak_AwsGroup1();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getAws1 <em>Aws1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aws1</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getAws1()
	 * @see #getSpeak()
	 * @generated
	 */
	EReference getSpeak_Aws1();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getStructGroup1 <em>Struct Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Struct Group1</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getStructGroup1()
	 * @see #getSpeak()
	 * @generated
	 */
	EAttribute getSpeak_StructGroup1();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getStruct1 <em>Struct1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct1</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getStruct1()
	 * @see #getSpeak()
	 * @generated
	 */
	EReference getSpeak_Struct1();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getLookup1 <em>Lookup1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lookup1</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getLookup1()
	 * @see #getSpeak()
	 * @generated
	 */
	EReference getSpeak_Lookup1();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getAny1 <em>Any1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any1</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getAny1()
	 * @see #getSpeak()
	 * @generated
	 */
	EAttribute getSpeak_Any1();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getBase()
	 * @see #getSpeak()
	 * @generated
	 */
	EAttribute getSpeak_Base();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getEndmark <em>Endmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endmark</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getEndmark()
	 * @see #getSpeak()
	 * @generated
	 */
	EAttribute getSpeak_Endmark();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getLang()
	 * @see #getSpeak()
	 * @generated
	 */
	EAttribute getSpeak_Lang();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getOnlangfailure <em>Onlangfailure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onlangfailure</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getOnlangfailure()
	 * @see #getSpeak()
	 * @generated
	 */
	EAttribute getSpeak_Onlangfailure();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getStartmark <em>Startmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startmark</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getStartmark()
	 * @see #getSpeak()
	 * @generated
	 */
	EAttribute getSpeak_Startmark();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getVersion()
	 * @see #getSpeak()
	 * @generated
	 */
	EAttribute getSpeak_Version();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Speak#getAnyAttribute()
	 * @see #getSpeak()
	 * @generated
	 */
	EAttribute getSpeak_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon <em>Ssml Lexicon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssml Lexicon</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon
	 * @generated
	 */
	EClass getSsmlLexicon();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon#getAny()
	 * @see #getSsmlLexicon()
	 * @generated
	 */
	EAttribute getSsmlLexicon_Any();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon#getFetchtimeout <em>Fetchtimeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetchtimeout</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon#getFetchtimeout()
	 * @see #getSsmlLexicon()
	 * @generated
	 */
	EAttribute getSsmlLexicon_Fetchtimeout();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon#getId()
	 * @see #getSsmlLexicon()
	 * @generated
	 */
	EAttribute getSsmlLexicon_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon#getMaxage <em>Maxage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxage</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon#getMaxage()
	 * @see #getSsmlLexicon()
	 * @generated
	 */
	EAttribute getSsmlLexicon_Maxage();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon#getMaxstale <em>Maxstale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxstale</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon#getMaxstale()
	 * @see #getSsmlLexicon()
	 * @generated
	 */
	EAttribute getSsmlLexicon_Maxstale();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon#getType()
	 * @see #getSsmlLexicon()
	 * @generated
	 */
	EAttribute getSsmlLexicon_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon#getUri()
	 * @see #getSsmlLexicon()
	 * @generated
	 */
	EAttribute getSsmlLexicon_Uri();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon#getAnyAttribute()
	 * @see #getSsmlLexicon()
	 * @generated
	 */
	EAttribute getSsmlLexicon_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMeta <em>Ssml Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssml Meta</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMeta
	 * @generated
	 */
	EClass getSsmlMeta();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMeta#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMeta#getAny()
	 * @see #getSsmlMeta()
	 * @generated
	 */
	EAttribute getSsmlMeta_Any();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMeta#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMeta#getContent()
	 * @see #getSsmlMeta()
	 * @generated
	 */
	EAttribute getSsmlMeta_Content();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMeta#getHttpEquiv <em>Http Equiv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Equiv</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMeta#getHttpEquiv()
	 * @see #getSsmlMeta()
	 * @generated
	 */
	EAttribute getSsmlMeta_HttpEquiv();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMeta#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMeta#getName()
	 * @see #getSsmlMeta()
	 * @generated
	 */
	EAttribute getSsmlMeta_Name();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMeta#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMeta#getAnyAttribute()
	 * @see #getSsmlMeta()
	 * @generated
	 */
	EAttribute getSsmlMeta_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMetadata <em>Ssml Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssml Metadata</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMetadata
	 * @generated
	 */
	EClass getSsmlMetadata();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMetadata#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMetadata#getAny()
	 * @see #getSsmlMetadata()
	 * @generated
	 */
	EAttribute getSsmlMetadata_Any();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMetadata#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMetadata#getAnyAttribute()
	 * @see #getSsmlMetadata()
	 * @generated
	 */
	EAttribute getSsmlMetadata_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Sub
	 * @generated
	 */
	EClass getSub();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sub#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Sub#getMixed()
	 * @see #getSub()
	 * @generated
	 */
	EAttribute getSub_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sub#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Sub#getAny()
	 * @see #getSub()
	 * @generated
	 */
	EAttribute getSub_Any();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sub#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Sub#getAlias()
	 * @see #getSub()
	 * @generated
	 */
	EAttribute getSub_Alias();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sub#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Sub#getAnyAttribute()
	 * @see #getSub()
	 * @generated
	 */
	EAttribute getSub_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType <em>Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.TokenType
	 * @generated
	 */
	EClass getTokenType();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getMixed()
	 * @see #getTokenType()
	 * @generated
	 */
	EAttribute getTokenType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getGroup()
	 * @see #getTokenType()
	 * @generated
	 */
	EAttribute getTokenType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getAudio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Audio</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getAudio()
	 * @see #getTokenType()
	 * @generated
	 */
	EReference getTokenType_Audio();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getBreak <em>Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Break</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getBreak()
	 * @see #getTokenType()
	 * @generated
	 */
	EReference getTokenType_Break();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getEmphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emphasis</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getEmphasis()
	 * @see #getTokenType()
	 * @generated
	 */
	EReference getTokenType_Emphasis();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mark</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getMark()
	 * @see #getTokenType()
	 * @generated
	 */
	EReference getTokenType_Mark();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getPhoneme <em>Phoneme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phoneme</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getPhoneme()
	 * @see #getTokenType()
	 * @generated
	 */
	EReference getTokenType_Phoneme();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getProsody <em>Prosody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prosody</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getProsody()
	 * @see #getTokenType()
	 * @generated
	 */
	EReference getTokenType_Prosody();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getSayAs <em>Say As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Say As</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getSayAs()
	 * @see #getTokenType()
	 * @generated
	 */
	EReference getTokenType_SayAs();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getSub()
	 * @see #getTokenType()
	 * @generated
	 */
	EReference getTokenType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getVoice <em>Voice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Voice</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getVoice()
	 * @see #getTokenType()
	 * @generated
	 */
	EReference getTokenType_Voice();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getAny()
	 * @see #getTokenType()
	 * @generated
	 */
	EAttribute getTokenType_Any();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getId()
	 * @see #getTokenType()
	 * @generated
	 */
	EAttribute getTokenType_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getLang()
	 * @see #getTokenType()
	 * @generated
	 */
	EAttribute getTokenType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getOnlangfailure <em>Onlangfailure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onlangfailure</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getOnlangfailure()
	 * @see #getTokenType()
	 * @generated
	 */
	EAttribute getTokenType_Onlangfailure();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getRole()
	 * @see #getTokenType()
	 * @generated
	 */
	EAttribute getTokenType_Role();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getAnyAttribute()
	 * @see #getTokenType()
	 * @generated
	 */
	EAttribute getTokenType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Voice <em>Voice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voice</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Voice
	 * @generated
	 */
	EClass getVoice();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getMixed()
	 * @see #getVoice()
	 * @generated
	 */
	EAttribute getVoice_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getSentenceAndStructureClass <em>Sentence And Structure Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sentence And Structure Class</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getSentenceAndStructureClass()
	 * @see #getVoice()
	 * @generated
	 */
	EAttribute getVoice_SentenceAndStructureClass();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getAwsGroup <em>Aws Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Aws Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getAwsGroup()
	 * @see #getVoice()
	 * @generated
	 */
	EAttribute getVoice_AwsGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getAws <em>Aws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aws</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getAws()
	 * @see #getVoice()
	 * @generated
	 */
	EReference getVoice_Aws();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getStructGroup <em>Struct Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Struct Group</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getStructGroup()
	 * @see #getVoice()
	 * @generated
	 */
	EAttribute getVoice_StructGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getStruct()
	 * @see #getVoice()
	 * @generated
	 */
	EReference getVoice_Struct();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getLookup <em>Lookup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lookup</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getLookup()
	 * @see #getVoice()
	 * @generated
	 */
	EReference getVoice_Lookup();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getAge()
	 * @see #getVoice()
	 * @generated
	 */
	EAttribute getVoice_Age();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getGender()
	 * @see #getVoice()
	 * @generated
	 */
	EAttribute getVoice_Gender();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Languages</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getLanguages()
	 * @see #getVoice()
	 * @generated
	 */
	EAttribute getVoice_Languages();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getName()
	 * @see #getVoice()
	 * @generated
	 */
	EAttribute getVoice_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getOnvoicefailure <em>Onvoicefailure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onvoicefailure</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getOnvoicefailure()
	 * @see #getVoice()
	 * @generated
	 */
	EAttribute getVoice_Onvoicefailure();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getOrdering()
	 * @see #getVoice()
	 * @generated
	 */
	EAttribute getVoice_Ordering();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getRequired()
	 * @see #getVoice()
	 * @generated
	 */
	EAttribute getVoice_Required();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getVariant()
	 * @see #getVoice()
	 * @generated
	 */
	EAttribute getVoice_Variant();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.Voice#getAnyAttribute()
	 * @see #getVoice()
	 * @generated
	 */
	EAttribute getVoice_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.speech_synthesis.GenderDatatype <em>Gender Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender Datatype</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.GenderDatatype
	 * @generated
	 */
	EEnum getGenderDatatype();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.speech_synthesis.HeightScale <em>Height Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Height Scale</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.HeightScale
	 * @generated
	 */
	EEnum getHeightScale();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LevelDatatype <em>Level Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Level Datatype</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LevelDatatype
	 * @generated
	 */
	EEnum getLevelDatatype();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SpeedScale <em>Speed Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Speed Scale</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeedScale
	 * @generated
	 */
	EEnum getSpeedScale();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.speech_synthesis.StrengthDatatype <em>Strength Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Strength Datatype</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.StrengthDatatype
	 * @generated
	 */
	EEnum getStrengthDatatype();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.speech_synthesis.VolumeScale <em>Volume Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Volume Scale</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.VolumeScale
	 * @generated
	 */
	EEnum getVolumeScale();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Age Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Age Datatype</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='age.datatype' memberTypes='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger emptystring.datatype'"
	 * @generated
	 */
	EDataType getAgeDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Alphabet Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Alphabet Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='alphabet.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='(ipa|x-.*)'"
	 * @generated
	 */
	EDataType getAlphabetDatatype();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Contour Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Contour Datatype</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='contour.datatype' itemType='contourpoint.datatype'"
	 * @generated
	 */
	EDataType getContourDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Contourpoint Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Contourpoint Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='contourpoint.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='\\(([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)%25,(([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)Hz|[+\\-]([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)Hz|[+\\-]?([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)%25|[+\\-]([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)st|x-high|high|medium|low|x-low|default)\\)'"
	 * @generated
	 */
	EDataType getContourpointDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Db Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Db Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='db.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='(\\+|-)?([0-9]*\\.)?[0-9]+dB'"
	 * @generated
	 */
	EDataType getDbDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Duration</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='duration' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='(\\+)?([0-9]*\\.)?[0-9]+(ms|s)'"
	 * @generated
	 */
	EDataType getDuration();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Emptystring Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Emptystring Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='emptystring.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='0'"
	 * @generated
	 */
	EDataType getEmptystringDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Fetchhint Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fetchhint Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='fetchhint.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='safe prefetch'"
	 * @generated
	 */
	EDataType getFetchhintDatatype();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.model.speech_synthesis.GenderDatatype <em>Gender Datatype Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gender Datatype Object</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.GenderDatatype
	 * @model instanceClass="de.dfki.iui.mmds.core.model.speech_synthesis.GenderDatatype"
	 *        extendedMetaData="name='gender.datatype:Object' baseType='gender.datatype'"
	 * @generated
	 */
	EDataType getGenderDatatypeObject();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.model.speech_synthesis.HeightScale <em>Height Scale Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Height Scale Object</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.HeightScale
	 * @model instanceClass="de.dfki.iui.mmds.core.model.speech_synthesis.HeightScale"
	 *        extendedMetaData="name='height.scale:Object' baseType='height.scale'"
	 * @generated
	 */
	EDataType getHeightScaleObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hertz Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hertz Number</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='hertz.number' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)Hz'"
	 * @generated
	 */
	EDataType getHertzNumber();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hertz Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hertz Relative</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='hertz.relative' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[+\\-]([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)Hz'"
	 * @generated
	 */
	EDataType getHertzRelative();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Languages Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Languages Datatype</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='languages.datatype' memberTypes='http://www.eclipse.org/emf/2003/XMLType#NMTOKENS emptystring.datatype'"
	 * @generated
	 */
	EDataType getLanguagesDatatype();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LevelDatatype <em>Level Datatype Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Level Datatype Object</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LevelDatatype
	 * @model instanceClass="de.dfki.iui.mmds.core.model.speech_synthesis.LevelDatatype"
	 *        extendedMetaData="name='level.datatype:Object' baseType='level.datatype'"
	 * @generated
	 */
	EDataType getLevelDatatypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Name Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Datatype</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='name.datatype' memberTypes='voicenames.datatype emptystring.datatype'"
	 * @generated
	 */
	EDataType getNameDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Nonnegpercent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Nonnegpercent</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='nonnegpercent' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)%25'"
	 * @generated
	 */
	EDataType getNonnegpercent();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='number' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0'"
	 * @generated
	 */
	EDataType getNumber();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Onlangfailure Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Onlangfailure Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='onlangfailure.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='changevoice ignoretext ignorelang processorchoice'"
	 * @generated
	 */
	EDataType getOnlangfailureDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Onvoicefailure Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Onvoicefailure Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='onvoicefailure.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='priorityselect keepexisting processorchoice'"
	 * @generated
	 */
	EDataType getOnvoicefailureDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Ordering Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ordering Datatype</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='ordering.datatype' memberTypes='orderinglist.datatype emptystring.datatype'"
	 * @generated
	 */
	EDataType getOrderingDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Orderingitem Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orderingitem Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='orderingitem.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='name languages gender age variant'"
	 * @generated
	 */
	EDataType getOrderingitemDatatype();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Orderinglist Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orderinglist Datatype</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='orderinglist.datatype' itemType='orderingitem.datatype'"
	 * @generated
	 */
	EDataType getOrderinglistDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Percent</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='percent' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[+\\-]?([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)%25'"
	 * @generated
	 */
	EDataType getPercent();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Phonemetype Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Phonemetype Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='phonemetype.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='default ruby'"
	 * @generated
	 */
	EDataType getPhonemetypeDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Pitch Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pitch Datatype</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='pitch.datatype' memberTypes='hertz.number hertz.relative percent semitone height.scale'"
	 * @generated
	 */
	EDataType getPitchDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Range Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Range Datatype</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='range.datatype' memberTypes='hertz.number hertz.relative percent semitone height.scale'"
	 * @generated
	 */
	EDataType getRangeDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Rate Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rate Datatype</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='rate.datatype' memberTypes='number nonnegpercent speed.scale'"
	 * @generated
	 */
	EDataType getRateDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Relative</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='relative' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[+\\-]([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)'"
	 * @generated
	 */
	EDataType getRelative();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Required Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Required Datatype</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='required.datatype' memberTypes='requiredlist.datatype emptystring.datatype'"
	 * @generated
	 */
	EDataType getRequiredDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Requireditem Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Requireditem Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='requireditem.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='name languages gender age variant'"
	 * @generated
	 */
	EDataType getRequireditemDatatype();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Requiredlist Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Requiredlist Datatype</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='requiredlist.datatype' itemType='requireditem.datatype'"
	 * @generated
	 */
	EDataType getRequiredlistDatatype();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Role Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Role Datatype</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='role.datatype' itemType='http://www.eclipse.org/emf/2003/XMLType#QName'"
	 * @generated
	 */
	EDataType getRoleDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Semitone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Semitone</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='semitone' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[+\\-]([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)st'"
	 * @generated
	 */
	EDataType getSemitone();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SpeedScale <em>Speed Scale Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Speed Scale Object</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeedScale
	 * @model instanceClass="de.dfki.iui.mmds.core.model.speech_synthesis.SpeedScale"
	 *        extendedMetaData="name='speed.scale:Object' baseType='speed.scale'"
	 * @generated
	 */
	EDataType getSpeedScaleObject();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.model.speech_synthesis.StrengthDatatype <em>Strength Datatype Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Strength Datatype Object</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.StrengthDatatype
	 * @model instanceClass="de.dfki.iui.mmds.core.model.speech_synthesis.StrengthDatatype"
	 *        extendedMetaData="name='strength.datatype:Object' baseType='strength.datatype'"
	 * @generated
	 */
	EDataType getStrengthDatatypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Timedesignation Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timedesignation Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='timedesignation.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='(\\+)?([0-9]*\\.)?[0-9]+(ms|s)'"
	 * @generated
	 */
	EDataType getTimedesignationDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Variant Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Variant Datatype</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='variant.datatype' memberTypes='http://www.eclipse.org/emf/2003/XMLType#positiveInteger emptystring.datatype'"
	 * @generated
	 */
	EDataType getVariantDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='version.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#NMTOKEN'"
	 * @generated
	 */
	EDataType getVersionDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Voicename Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Voicename Datatype</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='voicename.datatype' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='\\S+'"
	 * @generated
	 */
	EDataType getVoicenameDatatype();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Voicenames Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Voicenames Datatype</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='voicenames.datatype' itemType='voicename.datatype'"
	 * @generated
	 */
	EDataType getVoicenamesDatatype();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Volume Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Volume Datatype</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='volume.datatype' memberTypes='db.datatype volume.scale'"
	 * @generated
	 */
	EDataType getVolumeDatatype();

	/**
	 * Returns the meta object for data type '{@link de.dfki.iui.mmds.core.model.speech_synthesis.VolumeScale <em>Volume Scale Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Volume Scale Object</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.VolumeScale
	 * @model instanceClass="de.dfki.iui.mmds.core.model.speech_synthesis.VolumeScale"
	 *        extendedMetaData="name='volume.scale:Object' baseType='volume.scale'"
	 * @generated
	 */
	EDataType getVolumeScaleObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpeechSynthesisFactory getSpeechSynthesisFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLSpeechSynthesisImpl <em>SSML Speech Synthesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLSpeechSynthesisImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSSMLSpeechSynthesis()
		 * @generated
		 */
		EClass SSML_SPEECH_SYNTHESIS = eINSTANCE.getSSMLSpeechSynthesis();

		/**
		 * The meta object literal for the '<em><b>Ssml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSML_SPEECH_SYNTHESIS__SSML = eINSTANCE.getSSMLSpeechSynthesis_Ssml();

		/**
		 * The meta object literal for the '<em><b>Ssml Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML_SPEECH_SYNTHESIS__SSML_DOCUMENT = eINSTANCE.getSSMLSpeechSynthesis_SsmlDocument();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.AudioImpl <em>Audio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.AudioImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getAudio()
		 * @generated
		 */
		EClass AUDIO = eINSTANCE.getAudio();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__MIXED = eINSTANCE.getAudio_Mixed();

		/**
		 * The meta object literal for the '<em><b>Desc And Sentence And Structure Class</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__DESC_AND_SENTENCE_AND_STRUCTURE_CLASS = eINSTANCE.getAudio_DescAndSentenceAndStructureClass();

		/**
		 * The meta object literal for the '<em><b>Aws Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__AWS_GROUP = eINSTANCE.getAudio_AwsGroup();

		/**
		 * The meta object literal for the '<em><b>Aws</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO__AWS = eINSTANCE.getAudio_Aws();

		/**
		 * The meta object literal for the '<em><b>Struct Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__STRUCT_GROUP = eINSTANCE.getAudio_StructGroup();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO__STRUCT = eINSTANCE.getAudio_Struct();

		/**
		 * The meta object literal for the '<em><b>Lookup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO__LOOKUP = eINSTANCE.getAudio_Lookup();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO__DESC = eINSTANCE.getAudio_Desc();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__ANY = eINSTANCE.getAudio_Any();

		/**
		 * The meta object literal for the '<em><b>Fetchhint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__FETCHHINT = eINSTANCE.getAudio_Fetchhint();

		/**
		 * The meta object literal for the '<em><b>Fetchtimeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__FETCHTIMEOUT = eINSTANCE.getAudio_Fetchtimeout();

		/**
		 * The meta object literal for the '<em><b>Maxage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__MAXAGE = eINSTANCE.getAudio_Maxage();

		/**
		 * The meta object literal for the '<em><b>Maxstale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__MAXSTALE = eINSTANCE.getAudio_Maxstale();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__SRC = eINSTANCE.getAudio_Src();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__ANY_ATTRIBUTE = eINSTANCE.getAudio_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.BreakImpl <em>Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.BreakImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getBreak()
		 * @generated
		 */
		EClass BREAK = eINSTANCE.getBreak();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAK__ANY = eINSTANCE.getBreak_Any();

		/**
		 * The meta object literal for the '<em><b>Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAK__STRENGTH = eINSTANCE.getBreak_Strength();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAK__TIME = eINSTANCE.getBreak_Time();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAK__ANY_ATTRIBUTE = eINSTANCE.getBreak_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.DescImpl <em>Desc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.DescImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getDesc()
		 * @generated
		 */
		EClass DESC = eINSTANCE.getDesc();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESC__MIXED = eINSTANCE.getDesc_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESC__ANY = eINSTANCE.getDesc_Any();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESC__LANG = eINSTANCE.getDesc_Lang();

		/**
		 * The meta object literal for the '<em><b>Onlangfailure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESC__ONLANGFAILURE = eINSTANCE.getDesc_Onlangfailure();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESC__ANY_ATTRIBUTE = eINSTANCE.getDesc_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl <em>SSML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SSMLImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSSML()
		 * @generated
		 */
		EClass SSML = eINSTANCE.getSSML();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSML__MIXED = eINSTANCE.getSSML_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__XMLNS_PREFIX_MAP = eINSTANCE.getSSML_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__XSI_SCHEMA_LOCATION = eINSTANCE.getSSML_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Audio</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__AUDIO = eINSTANCE.getSSML_Audio();

		/**
		 * The meta object literal for the '<em><b>Aws</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__AWS = eINSTANCE.getSSML_Aws();

		/**
		 * The meta object literal for the '<em><b>Break</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__BREAK = eINSTANCE.getSSML_Break();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__DESC = eINSTANCE.getSSML_Desc();

		/**
		 * The meta object literal for the '<em><b>Emphasis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__EMPHASIS = eINSTANCE.getSSML_Emphasis();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__LANG = eINSTANCE.getSSML_Lang();

		/**
		 * The meta object literal for the '<em><b>Lookup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__LOOKUP = eINSTANCE.getSSML_Lookup();

		/**
		 * The meta object literal for the '<em><b>Mark</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__MARK = eINSTANCE.getSSML_Mark();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__P = eINSTANCE.getSSML_P();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__STRUCT = eINSTANCE.getSSML_Struct();

		/**
		 * The meta object literal for the '<em><b>Phoneme</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__PHONEME = eINSTANCE.getSSML_Phoneme();

		/**
		 * The meta object literal for the '<em><b>Prosody</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__PROSODY = eINSTANCE.getSSML_Prosody();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__S = eINSTANCE.getSSML_S();

		/**
		 * The meta object literal for the '<em><b>Say As</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__SAY_AS = eINSTANCE.getSSML_SayAs();

		/**
		 * The meta object literal for the '<em><b>Speak</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__SPEAK = eINSTANCE.getSSML_Speak();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__SUB = eINSTANCE.getSSML_Sub();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__TOKEN = eINSTANCE.getSSML_Token();

		/**
		 * The meta object literal for the '<em><b>Voice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__VOICE = eINSTANCE.getSSML_Voice();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSML__W = eINSTANCE.getSSML_W();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.EmphasisImpl <em>Emphasis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.EmphasisImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getEmphasis()
		 * @generated
		 */
		EClass EMPHASIS = eINSTANCE.getEmphasis();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPHASIS__MIXED = eINSTANCE.getEmphasis_Mixed();

		/**
		 * The meta object literal for the '<em><b>Sentence Class</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPHASIS__SENTENCE_CLASS = eINSTANCE.getEmphasis_SentenceClass();

		/**
		 * The meta object literal for the '<em><b>Aws Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPHASIS__AWS_GROUP = eINSTANCE.getEmphasis_AwsGroup();

		/**
		 * The meta object literal for the '<em><b>Aws</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPHASIS__AWS = eINSTANCE.getEmphasis_Aws();

		/**
		 * The meta object literal for the '<em><b>Lookup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPHASIS__LOOKUP = eINSTANCE.getEmphasis_Lookup();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPHASIS__ANY = eINSTANCE.getEmphasis_Any();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPHASIS__LEVEL = eINSTANCE.getEmphasis_Level();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPHASIS__ANY_ATTRIBUTE = eINSTANCE.getEmphasis_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LangTypeImpl <em>Lang Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.LangTypeImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getLangType()
		 * @generated
		 */
		EClass LANG_TYPE = eINSTANCE.getLangType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANG_TYPE__MIXED = eINSTANCE.getLangType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANG_TYPE__GROUP = eINSTANCE.getLangType_Group();

		/**
		 * The meta object literal for the '<em><b>Audio</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANG_TYPE__AUDIO = eINSTANCE.getLangType_Audio();

		/**
		 * The meta object literal for the '<em><b>Break</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANG_TYPE__BREAK = eINSTANCE.getLangType_Break();

		/**
		 * The meta object literal for the '<em><b>Emphasis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANG_TYPE__EMPHASIS = eINSTANCE.getLangType_Emphasis();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANG_TYPE__LANG = eINSTANCE.getLangType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lookup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANG_TYPE__LOOKUP = eINSTANCE.getLangType_Lookup();

		/**
		 * The meta object literal for the '<em><b>Mark</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANG_TYPE__MARK = eINSTANCE.getLangType_Mark();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANG_TYPE__P = eINSTANCE.getLangType_P();

		/**
		 * The meta object literal for the '<em><b>Phoneme</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANG_TYPE__PHONEME = eINSTANCE.getLangType_Phoneme();

		/**
		 * The meta object literal for the '<em><b>Prosody</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANG_TYPE__PROSODY = eINSTANCE.getLangType_Prosody();

		/**
		 * The meta object literal for the '<em><b>Say As</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANG_TYPE__SAY_AS = eINSTANCE.getLangType_SayAs();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANG_TYPE__SUB = eINSTANCE.getLangType_Sub();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANG_TYPE__S = eINSTANCE.getLangType_S();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANG_TYPE__TOKEN = eINSTANCE.getLangType_Token();

		/**
		 * The meta object literal for the '<em><b>Voice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANG_TYPE__VOICE = eINSTANCE.getLangType_Voice();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANG_TYPE__W = eINSTANCE.getLangType_W();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANG_TYPE__ANY = eINSTANCE.getLangType_Any();

		/**
		 * The meta object literal for the '<em><b>Lang1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANG_TYPE__LANG1 = eINSTANCE.getLangType_Lang1();

		/**
		 * The meta object literal for the '<em><b>Onlangfailure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANG_TYPE__ONLANGFAILURE = eINSTANCE.getLangType_Onlangfailure();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANG_TYPE__ANY_ATTRIBUTE = eINSTANCE.getLangType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl <em>Lookup Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.LookupTypeImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getLookupType()
		 * @generated
		 */
		EClass LOOKUP_TYPE = eINSTANCE.getLookupType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_TYPE__MIXED = eINSTANCE.getLookupType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_TYPE__GROUP = eINSTANCE.getLookupType_Group();

		/**
		 * The meta object literal for the '<em><b>Audio</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_TYPE__AUDIO = eINSTANCE.getLookupType_Audio();

		/**
		 * The meta object literal for the '<em><b>Break</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_TYPE__BREAK = eINSTANCE.getLookupType_Break();

		/**
		 * The meta object literal for the '<em><b>Emphasis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_TYPE__EMPHASIS = eINSTANCE.getLookupType_Emphasis();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_TYPE__LANG = eINSTANCE.getLookupType_Lang();

		/**
		 * The meta object literal for the '<em><b>Lookup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_TYPE__LOOKUP = eINSTANCE.getLookupType_Lookup();

		/**
		 * The meta object literal for the '<em><b>Mark</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_TYPE__MARK = eINSTANCE.getLookupType_Mark();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_TYPE__P = eINSTANCE.getLookupType_P();

		/**
		 * The meta object literal for the '<em><b>Phoneme</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_TYPE__PHONEME = eINSTANCE.getLookupType_Phoneme();

		/**
		 * The meta object literal for the '<em><b>Prosody</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_TYPE__PROSODY = eINSTANCE.getLookupType_Prosody();

		/**
		 * The meta object literal for the '<em><b>Say As</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_TYPE__SAY_AS = eINSTANCE.getLookupType_SayAs();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_TYPE__SUB = eINSTANCE.getLookupType_Sub();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_TYPE__S = eINSTANCE.getLookupType_S();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_TYPE__TOKEN = eINSTANCE.getLookupType_Token();

		/**
		 * The meta object literal for the '<em><b>Voice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_TYPE__VOICE = eINSTANCE.getLookupType_Voice();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_TYPE__W = eINSTANCE.getLookupType_W();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_TYPE__ANY = eINSTANCE.getLookupType_Any();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_TYPE__REF = eINSTANCE.getLookupType_Ref();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_TYPE__ANY_ATTRIBUTE = eINSTANCE.getLookupType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.MarkImpl <em>Mark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.MarkImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getMark()
		 * @generated
		 */
		EClass MARK = eINSTANCE.getMark();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARK__ANY = eINSTANCE.getMark_Any();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARK__NAME = eINSTANCE.getMark_Name();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARK__ANY_ATTRIBUTE = eINSTANCE.getMark_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.Mark1Impl <em>Mark1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.Mark1Impl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getMark1()
		 * @generated
		 */
		EClass MARK1 = eINSTANCE.getMark1();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.ParagraphImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__MIXED = eINSTANCE.getParagraph_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__GROUP = eINSTANCE.getParagraph_Group();

		/**
		 * The meta object literal for the '<em><b>Aws Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__AWS_GROUP = eINSTANCE.getParagraph_AwsGroup();

		/**
		 * The meta object literal for the '<em><b>Aws</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__AWS = eINSTANCE.getParagraph_Aws();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__S = eINSTANCE.getParagraph_S();

		/**
		 * The meta object literal for the '<em><b>Lookup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__LOOKUP = eINSTANCE.getParagraph_Lookup();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__ANY = eINSTANCE.getParagraph_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__ID = eINSTANCE.getParagraph_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__LANG = eINSTANCE.getParagraph_Lang();

		/**
		 * The meta object literal for the '<em><b>Onlangfailure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__ONLANGFAILURE = eINSTANCE.getParagraph_Onlangfailure();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__ANY_ATTRIBUTE = eINSTANCE.getParagraph_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.PhonemeImpl <em>Phoneme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.PhonemeImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getPhoneme()
		 * @generated
		 */
		EClass PHONEME = eINSTANCE.getPhoneme();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONEME__MIXED = eINSTANCE.getPhoneme_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONEME__ANY = eINSTANCE.getPhoneme_Any();

		/**
		 * The meta object literal for the '<em><b>Alphabet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONEME__ALPHABET = eINSTANCE.getPhoneme_Alphabet();

		/**
		 * The meta object literal for the '<em><b>Ph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONEME__PH = eINSTANCE.getPhoneme_Ph();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONEME__TYPE = eINSTANCE.getPhoneme_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONEME__ANY_ATTRIBUTE = eINSTANCE.getPhoneme_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.ProsodyImpl <em>Prosody</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.ProsodyImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getProsody()
		 * @generated
		 */
		EClass PROSODY = eINSTANCE.getProsody();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROSODY__MIXED = eINSTANCE.getProsody_Mixed();

		/**
		 * The meta object literal for the '<em><b>Sentence And Structure Class</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROSODY__SENTENCE_AND_STRUCTURE_CLASS = eINSTANCE.getProsody_SentenceAndStructureClass();

		/**
		 * The meta object literal for the '<em><b>Aws Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROSODY__AWS_GROUP = eINSTANCE.getProsody_AwsGroup();

		/**
		 * The meta object literal for the '<em><b>Aws</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROSODY__AWS = eINSTANCE.getProsody_Aws();

		/**
		 * The meta object literal for the '<em><b>Struct Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROSODY__STRUCT_GROUP = eINSTANCE.getProsody_StructGroup();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROSODY__STRUCT = eINSTANCE.getProsody_Struct();

		/**
		 * The meta object literal for the '<em><b>Lookup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROSODY__LOOKUP = eINSTANCE.getProsody_Lookup();

		/**
		 * The meta object literal for the '<em><b>Contour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROSODY__CONTOUR = eINSTANCE.getProsody_Contour();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROSODY__DURATION = eINSTANCE.getProsody_Duration();

		/**
		 * The meta object literal for the '<em><b>Pitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROSODY__PITCH = eINSTANCE.getProsody_Pitch();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROSODY__RANGE = eINSTANCE.getProsody_Range();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROSODY__RATE = eINSTANCE.getProsody_Rate();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROSODY__VOLUME = eINSTANCE.getProsody_Volume();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROSODY__ANY_ATTRIBUTE = eINSTANCE.getProsody_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SayAsImpl <em>Say As</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SayAsImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSayAs()
		 * @generated
		 */
		EClass SAY_AS = eINSTANCE.getSayAs();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAY_AS__MIXED = eINSTANCE.getSayAs_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAY_AS__ANY = eINSTANCE.getSayAs_Any();

		/**
		 * The meta object literal for the '<em><b>Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAY_AS__DETAIL = eINSTANCE.getSayAs_Detail();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAY_AS__FORMAT = eINSTANCE.getSayAs_Format();

		/**
		 * The meta object literal for the '<em><b>Interpret As</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAY_AS__INTERPRET_AS = eINSTANCE.getSayAs_InterpretAs();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAY_AS__ANY_ATTRIBUTE = eINSTANCE.getSayAs_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SentenceImpl <em>Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SentenceImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSentence()
		 * @generated
		 */
		EClass SENTENCE = eINSTANCE.getSentence();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTENCE__MIXED = eINSTANCE.getSentence_Mixed();

		/**
		 * The meta object literal for the '<em><b>Sentence Class</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTENCE__SENTENCE_CLASS = eINSTANCE.getSentence_SentenceClass();

		/**
		 * The meta object literal for the '<em><b>Aws Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTENCE__AWS_GROUP = eINSTANCE.getSentence_AwsGroup();

		/**
		 * The meta object literal for the '<em><b>Aws</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCE__AWS = eINSTANCE.getSentence_Aws();

		/**
		 * The meta object literal for the '<em><b>Lookup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCE__LOOKUP = eINSTANCE.getSentence_Lookup();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTENCE__ANY = eINSTANCE.getSentence_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTENCE__ID = eINSTANCE.getSentence_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTENCE__LANG = eINSTANCE.getSentence_Lang();

		/**
		 * The meta object literal for the '<em><b>Onlangfailure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTENCE__ONLANGFAILURE = eINSTANCE.getSentence_Onlangfailure();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTENCE__ANY_ATTRIBUTE = eINSTANCE.getSentence_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl <em>Speak</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeakImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSpeak()
		 * @generated
		 */
		EClass SPEAK = eINSTANCE.getSpeak();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAK__MIXED = eINSTANCE.getSpeak_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAK__GROUP = eINSTANCE.getSpeak_Group();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEAK__META = eINSTANCE.getSpeak_Meta();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEAK__METADATA = eINSTANCE.getSpeak_Metadata();

		/**
		 * The meta object literal for the '<em><b>Lexicon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEAK__LEXICON = eINSTANCE.getSpeak_Lexicon();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAK__ANY = eINSTANCE.getSpeak_Any();

		/**
		 * The meta object literal for the '<em><b>Aws Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAK__AWS_GROUP = eINSTANCE.getSpeak_AwsGroup();

		/**
		 * The meta object literal for the '<em><b>Aws</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEAK__AWS = eINSTANCE.getSpeak_Aws();

		/**
		 * The meta object literal for the '<em><b>Struct Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAK__STRUCT_GROUP = eINSTANCE.getSpeak_StructGroup();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEAK__STRUCT = eINSTANCE.getSpeak_Struct();

		/**
		 * The meta object literal for the '<em><b>Lookup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEAK__LOOKUP = eINSTANCE.getSpeak_Lookup();

		/**
		 * The meta object literal for the '<em><b>Group1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAK__GROUP1 = eINSTANCE.getSpeak_Group1();

		/**
		 * The meta object literal for the '<em><b>Aws Group1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAK__AWS_GROUP1 = eINSTANCE.getSpeak_AwsGroup1();

		/**
		 * The meta object literal for the '<em><b>Aws1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEAK__AWS1 = eINSTANCE.getSpeak_Aws1();

		/**
		 * The meta object literal for the '<em><b>Struct Group1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAK__STRUCT_GROUP1 = eINSTANCE.getSpeak_StructGroup1();

		/**
		 * The meta object literal for the '<em><b>Struct1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEAK__STRUCT1 = eINSTANCE.getSpeak_Struct1();

		/**
		 * The meta object literal for the '<em><b>Lookup1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEAK__LOOKUP1 = eINSTANCE.getSpeak_Lookup1();

		/**
		 * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAK__ANY1 = eINSTANCE.getSpeak_Any1();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAK__BASE = eINSTANCE.getSpeak_Base();

		/**
		 * The meta object literal for the '<em><b>Endmark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAK__ENDMARK = eINSTANCE.getSpeak_Endmark();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAK__LANG = eINSTANCE.getSpeak_Lang();

		/**
		 * The meta object literal for the '<em><b>Onlangfailure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAK__ONLANGFAILURE = eINSTANCE.getSpeak_Onlangfailure();

		/**
		 * The meta object literal for the '<em><b>Startmark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAK__STARTMARK = eINSTANCE.getSpeak_Startmark();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAK__VERSION = eINSTANCE.getSpeak_Version();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAK__ANY_ATTRIBUTE = eINSTANCE.getSpeak_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SsmlLexiconImpl <em>Ssml Lexicon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SsmlLexiconImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSsmlLexicon()
		 * @generated
		 */
		EClass SSML_LEXICON = eINSTANCE.getSsmlLexicon();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSML_LEXICON__ANY = eINSTANCE.getSsmlLexicon_Any();

		/**
		 * The meta object literal for the '<em><b>Fetchtimeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSML_LEXICON__FETCHTIMEOUT = eINSTANCE.getSsmlLexicon_Fetchtimeout();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSML_LEXICON__ID = eINSTANCE.getSsmlLexicon_Id();

		/**
		 * The meta object literal for the '<em><b>Maxage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSML_LEXICON__MAXAGE = eINSTANCE.getSsmlLexicon_Maxage();

		/**
		 * The meta object literal for the '<em><b>Maxstale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSML_LEXICON__MAXSTALE = eINSTANCE.getSsmlLexicon_Maxstale();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSML_LEXICON__TYPE = eINSTANCE.getSsmlLexicon_Type();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSML_LEXICON__URI = eINSTANCE.getSsmlLexicon_Uri();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSML_LEXICON__ANY_ATTRIBUTE = eINSTANCE.getSsmlLexicon_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SsmlMetaImpl <em>Ssml Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SsmlMetaImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSsmlMeta()
		 * @generated
		 */
		EClass SSML_META = eINSTANCE.getSsmlMeta();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSML_META__ANY = eINSTANCE.getSsmlMeta_Any();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSML_META__CONTENT = eINSTANCE.getSsmlMeta_Content();

		/**
		 * The meta object literal for the '<em><b>Http Equiv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSML_META__HTTP_EQUIV = eINSTANCE.getSsmlMeta_HttpEquiv();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSML_META__NAME = eINSTANCE.getSsmlMeta_Name();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSML_META__ANY_ATTRIBUTE = eINSTANCE.getSsmlMeta_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SsmlMetadataImpl <em>Ssml Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SsmlMetadataImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSsmlMetadata()
		 * @generated
		 */
		EClass SSML_METADATA = eINSTANCE.getSsmlMetadata();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSML_METADATA__ANY = eINSTANCE.getSsmlMetadata_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSML_METADATA__ANY_ATTRIBUTE = eINSTANCE.getSsmlMetadata_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.SubImpl <em>Sub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SubImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSub()
		 * @generated
		 */
		EClass SUB = eINSTANCE.getSub();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB__MIXED = eINSTANCE.getSub_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB__ANY = eINSTANCE.getSub_Any();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB__ALIAS = eINSTANCE.getSub_Alias();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB__ANY_ATTRIBUTE = eINSTANCE.getSub_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl <em>Token Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.TokenTypeImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getTokenType()
		 * @generated
		 */
		EClass TOKEN_TYPE = eINSTANCE.getTokenType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_TYPE__MIXED = eINSTANCE.getTokenType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_TYPE__GROUP = eINSTANCE.getTokenType_Group();

		/**
		 * The meta object literal for the '<em><b>Audio</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_TYPE__AUDIO = eINSTANCE.getTokenType_Audio();

		/**
		 * The meta object literal for the '<em><b>Break</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_TYPE__BREAK = eINSTANCE.getTokenType_Break();

		/**
		 * The meta object literal for the '<em><b>Emphasis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_TYPE__EMPHASIS = eINSTANCE.getTokenType_Emphasis();

		/**
		 * The meta object literal for the '<em><b>Mark</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_TYPE__MARK = eINSTANCE.getTokenType_Mark();

		/**
		 * The meta object literal for the '<em><b>Phoneme</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_TYPE__PHONEME = eINSTANCE.getTokenType_Phoneme();

		/**
		 * The meta object literal for the '<em><b>Prosody</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_TYPE__PROSODY = eINSTANCE.getTokenType_Prosody();

		/**
		 * The meta object literal for the '<em><b>Say As</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_TYPE__SAY_AS = eINSTANCE.getTokenType_SayAs();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_TYPE__SUB = eINSTANCE.getTokenType_Sub();

		/**
		 * The meta object literal for the '<em><b>Voice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_TYPE__VOICE = eINSTANCE.getTokenType_Voice();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_TYPE__ANY = eINSTANCE.getTokenType_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_TYPE__ID = eINSTANCE.getTokenType_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_TYPE__LANG = eINSTANCE.getTokenType_Lang();

		/**
		 * The meta object literal for the '<em><b>Onlangfailure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_TYPE__ONLANGFAILURE = eINSTANCE.getTokenType_Onlangfailure();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_TYPE__ROLE = eINSTANCE.getTokenType_Role();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_TYPE__ANY_ATTRIBUTE = eINSTANCE.getTokenType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.impl.VoiceImpl <em>Voice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.VoiceImpl
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getVoice()
		 * @generated
		 */
		EClass VOICE = eINSTANCE.getVoice();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOICE__MIXED = eINSTANCE.getVoice_Mixed();

		/**
		 * The meta object literal for the '<em><b>Sentence And Structure Class</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOICE__SENTENCE_AND_STRUCTURE_CLASS = eINSTANCE.getVoice_SentenceAndStructureClass();

		/**
		 * The meta object literal for the '<em><b>Aws Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOICE__AWS_GROUP = eINSTANCE.getVoice_AwsGroup();

		/**
		 * The meta object literal for the '<em><b>Aws</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOICE__AWS = eINSTANCE.getVoice_Aws();

		/**
		 * The meta object literal for the '<em><b>Struct Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOICE__STRUCT_GROUP = eINSTANCE.getVoice_StructGroup();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOICE__STRUCT = eINSTANCE.getVoice_Struct();

		/**
		 * The meta object literal for the '<em><b>Lookup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOICE__LOOKUP = eINSTANCE.getVoice_Lookup();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOICE__AGE = eINSTANCE.getVoice_Age();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOICE__GENDER = eINSTANCE.getVoice_Gender();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOICE__LANGUAGES = eINSTANCE.getVoice_Languages();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOICE__NAME = eINSTANCE.getVoice_Name();

		/**
		 * The meta object literal for the '<em><b>Onvoicefailure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOICE__ONVOICEFAILURE = eINSTANCE.getVoice_Onvoicefailure();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOICE__ORDERING = eINSTANCE.getVoice_Ordering();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOICE__REQUIRED = eINSTANCE.getVoice_Required();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOICE__VARIANT = eINSTANCE.getVoice_Variant();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOICE__ANY_ATTRIBUTE = eINSTANCE.getVoice_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.GenderDatatype <em>Gender Datatype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.GenderDatatype
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getGenderDatatype()
		 * @generated
		 */
		EEnum GENDER_DATATYPE = eINSTANCE.getGenderDatatype();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.HeightScale <em>Height Scale</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.HeightScale
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getHeightScale()
		 * @generated
		 */
		EEnum HEIGHT_SCALE = eINSTANCE.getHeightScale();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.LevelDatatype <em>Level Datatype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LevelDatatype
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getLevelDatatype()
		 * @generated
		 */
		EEnum LEVEL_DATATYPE = eINSTANCE.getLevelDatatype();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SpeedScale <em>Speed Scale</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeedScale
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSpeedScale()
		 * @generated
		 */
		EEnum SPEED_SCALE = eINSTANCE.getSpeedScale();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.StrengthDatatype <em>Strength Datatype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.StrengthDatatype
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getStrengthDatatype()
		 * @generated
		 */
		EEnum STRENGTH_DATATYPE = eINSTANCE.getStrengthDatatype();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.VolumeScale <em>Volume Scale</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.VolumeScale
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getVolumeScale()
		 * @generated
		 */
		EEnum VOLUME_SCALE = eINSTANCE.getVolumeScale();

		/**
		 * The meta object literal for the '<em>Age Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getAgeDatatype()
		 * @generated
		 */
		EDataType AGE_DATATYPE = eINSTANCE.getAgeDatatype();

		/**
		 * The meta object literal for the '<em>Alphabet Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getAlphabetDatatype()
		 * @generated
		 */
		EDataType ALPHABET_DATATYPE = eINSTANCE.getAlphabetDatatype();

		/**
		 * The meta object literal for the '<em>Contour Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getContourDatatype()
		 * @generated
		 */
		EDataType CONTOUR_DATATYPE = eINSTANCE.getContourDatatype();

		/**
		 * The meta object literal for the '<em>Contourpoint Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getContourpointDatatype()
		 * @generated
		 */
		EDataType CONTOURPOINT_DATATYPE = eINSTANCE.getContourpointDatatype();

		/**
		 * The meta object literal for the '<em>Db Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getDbDatatype()
		 * @generated
		 */
		EDataType DB_DATATYPE = eINSTANCE.getDbDatatype();

		/**
		 * The meta object literal for the '<em>Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getDuration()
		 * @generated
		 */
		EDataType DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '<em>Emptystring Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getEmptystringDatatype()
		 * @generated
		 */
		EDataType EMPTYSTRING_DATATYPE = eINSTANCE.getEmptystringDatatype();

		/**
		 * The meta object literal for the '<em>Fetchhint Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getFetchhintDatatype()
		 * @generated
		 */
		EDataType FETCHHINT_DATATYPE = eINSTANCE.getFetchhintDatatype();

		/**
		 * The meta object literal for the '<em>Gender Datatype Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.GenderDatatype
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getGenderDatatypeObject()
		 * @generated
		 */
		EDataType GENDER_DATATYPE_OBJECT = eINSTANCE.getGenderDatatypeObject();

		/**
		 * The meta object literal for the '<em>Height Scale Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.HeightScale
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getHeightScaleObject()
		 * @generated
		 */
		EDataType HEIGHT_SCALE_OBJECT = eINSTANCE.getHeightScaleObject();

		/**
		 * The meta object literal for the '<em>Hertz Number</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getHertzNumber()
		 * @generated
		 */
		EDataType HERTZ_NUMBER = eINSTANCE.getHertzNumber();

		/**
		 * The meta object literal for the '<em>Hertz Relative</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getHertzRelative()
		 * @generated
		 */
		EDataType HERTZ_RELATIVE = eINSTANCE.getHertzRelative();

		/**
		 * The meta object literal for the '<em>Languages Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getLanguagesDatatype()
		 * @generated
		 */
		EDataType LANGUAGES_DATATYPE = eINSTANCE.getLanguagesDatatype();

		/**
		 * The meta object literal for the '<em>Level Datatype Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.LevelDatatype
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getLevelDatatypeObject()
		 * @generated
		 */
		EDataType LEVEL_DATATYPE_OBJECT = eINSTANCE.getLevelDatatypeObject();

		/**
		 * The meta object literal for the '<em>Name Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getNameDatatype()
		 * @generated
		 */
		EDataType NAME_DATATYPE = eINSTANCE.getNameDatatype();

		/**
		 * The meta object literal for the '<em>Nonnegpercent</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getNonnegpercent()
		 * @generated
		 */
		EDataType NONNEGPERCENT = eINSTANCE.getNonnegpercent();

		/**
		 * The meta object literal for the '<em>Number</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getNumber()
		 * @generated
		 */
		EDataType NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em>Onlangfailure Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getOnlangfailureDatatype()
		 * @generated
		 */
		EDataType ONLANGFAILURE_DATATYPE = eINSTANCE.getOnlangfailureDatatype();

		/**
		 * The meta object literal for the '<em>Onvoicefailure Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getOnvoicefailureDatatype()
		 * @generated
		 */
		EDataType ONVOICEFAILURE_DATATYPE = eINSTANCE.getOnvoicefailureDatatype();

		/**
		 * The meta object literal for the '<em>Ordering Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getOrderingDatatype()
		 * @generated
		 */
		EDataType ORDERING_DATATYPE = eINSTANCE.getOrderingDatatype();

		/**
		 * The meta object literal for the '<em>Orderingitem Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getOrderingitemDatatype()
		 * @generated
		 */
		EDataType ORDERINGITEM_DATATYPE = eINSTANCE.getOrderingitemDatatype();

		/**
		 * The meta object literal for the '<em>Orderinglist Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getOrderinglistDatatype()
		 * @generated
		 */
		EDataType ORDERINGLIST_DATATYPE = eINSTANCE.getOrderinglistDatatype();

		/**
		 * The meta object literal for the '<em>Percent</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getPercent()
		 * @generated
		 */
		EDataType PERCENT = eINSTANCE.getPercent();

		/**
		 * The meta object literal for the '<em>Phonemetype Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getPhonemetypeDatatype()
		 * @generated
		 */
		EDataType PHONEMETYPE_DATATYPE = eINSTANCE.getPhonemetypeDatatype();

		/**
		 * The meta object literal for the '<em>Pitch Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getPitchDatatype()
		 * @generated
		 */
		EDataType PITCH_DATATYPE = eINSTANCE.getPitchDatatype();

		/**
		 * The meta object literal for the '<em>Range Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getRangeDatatype()
		 * @generated
		 */
		EDataType RANGE_DATATYPE = eINSTANCE.getRangeDatatype();

		/**
		 * The meta object literal for the '<em>Rate Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getRateDatatype()
		 * @generated
		 */
		EDataType RATE_DATATYPE = eINSTANCE.getRateDatatype();

		/**
		 * The meta object literal for the '<em>Relative</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getRelative()
		 * @generated
		 */
		EDataType RELATIVE = eINSTANCE.getRelative();

		/**
		 * The meta object literal for the '<em>Required Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getRequiredDatatype()
		 * @generated
		 */
		EDataType REQUIRED_DATATYPE = eINSTANCE.getRequiredDatatype();

		/**
		 * The meta object literal for the '<em>Requireditem Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getRequireditemDatatype()
		 * @generated
		 */
		EDataType REQUIREDITEM_DATATYPE = eINSTANCE.getRequireditemDatatype();

		/**
		 * The meta object literal for the '<em>Requiredlist Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getRequiredlistDatatype()
		 * @generated
		 */
		EDataType REQUIREDLIST_DATATYPE = eINSTANCE.getRequiredlistDatatype();

		/**
		 * The meta object literal for the '<em>Role Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getRoleDatatype()
		 * @generated
		 */
		EDataType ROLE_DATATYPE = eINSTANCE.getRoleDatatype();

		/**
		 * The meta object literal for the '<em>Semitone</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSemitone()
		 * @generated
		 */
		EDataType SEMITONE = eINSTANCE.getSemitone();

		/**
		 * The meta object literal for the '<em>Speed Scale Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeedScale
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getSpeedScaleObject()
		 * @generated
		 */
		EDataType SPEED_SCALE_OBJECT = eINSTANCE.getSpeedScaleObject();

		/**
		 * The meta object literal for the '<em>Strength Datatype Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.StrengthDatatype
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getStrengthDatatypeObject()
		 * @generated
		 */
		EDataType STRENGTH_DATATYPE_OBJECT = eINSTANCE.getStrengthDatatypeObject();

		/**
		 * The meta object literal for the '<em>Timedesignation Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getTimedesignationDatatype()
		 * @generated
		 */
		EDataType TIMEDESIGNATION_DATATYPE = eINSTANCE.getTimedesignationDatatype();

		/**
		 * The meta object literal for the '<em>Variant Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getVariantDatatype()
		 * @generated
		 */
		EDataType VARIANT_DATATYPE = eINSTANCE.getVariantDatatype();

		/**
		 * The meta object literal for the '<em>Version Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getVersionDatatype()
		 * @generated
		 */
		EDataType VERSION_DATATYPE = eINSTANCE.getVersionDatatype();

		/**
		 * The meta object literal for the '<em>Voicename Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getVoicenameDatatype()
		 * @generated
		 */
		EDataType VOICENAME_DATATYPE = eINSTANCE.getVoicenameDatatype();

		/**
		 * The meta object literal for the '<em>Voicenames Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getVoicenamesDatatype()
		 * @generated
		 */
		EDataType VOICENAMES_DATATYPE = eINSTANCE.getVoicenamesDatatype();

		/**
		 * The meta object literal for the '<em>Volume Datatype</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getVolumeDatatype()
		 * @generated
		 */
		EDataType VOLUME_DATATYPE = eINSTANCE.getVolumeDatatype();

		/**
		 * The meta object literal for the '<em>Volume Scale Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.VolumeScale
		 * @see de.dfki.iui.mmds.core.model.speech_synthesis.impl.SpeechSynthesisPackageImpl#getVolumeScaleObject()
		 * @generated
		 */
		EDataType VOLUME_SCALE_OBJECT = eINSTANCE.getVolumeScaleObject();

	}

} //SpeechSynthesisPackage
