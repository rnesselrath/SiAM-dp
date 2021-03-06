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
package de.dfki.iui.mmds.core.model.speech_synthesis;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sentence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getSentenceClass <em>Sentence Class</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getAwsGroup <em>Aws Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getAws <em>Aws</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getLookup <em>Lookup</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getAny <em>Any</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getLang <em>Lang</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getOnlangfailure <em>Onlangfailure</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSentence()
 * @model extendedMetaData="name='sentence' kind='mixed'"
 * @generated
 */
public interface Sentence extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSentence_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Sentence Class</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sentence Class</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentence Class</em>' attribute list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSentence_SentenceClass()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='SentenceClass:1'"
	 * @generated
	 */
	FeatureMap getSentenceClass();

	/**
	 * Returns the value of the '<em><b>Aws Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 The 'allowed-within-sentence' group uses this
	 *                                 abstract element.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aws Group</em>' attribute list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSentence_AwsGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='aws:group' namespace='##targetNamespace' group='#SentenceClass:1'"
	 * @generated
	 */
	FeatureMap getAwsGroup();

	/**
	 * Returns the value of the '<em><b>Aws</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 The 'allowed-within-sentence' group uses this
	 *                                 abstract element.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aws</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSentence_Aws()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aws' namespace='##targetNamespace' group='aws:group'"
	 * @generated
	 */
	EList<EObject> getAws();

	/**
	 * Returns the value of the '<em><b>Lookup</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.LookupType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lookup</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lookup</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSentence_Lookup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lookup' namespace='##targetNamespace' group='#SentenceClass:1'"
	 * @generated
	 */
	EList<LookupType> getLookup();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSentence_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':5' processing='lax' group='#SentenceClass:1'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *     <div xmlns="http://www.w3.org/1999/xhtml">
	 *      
	 *       <h3>id (as an attribute name)</h3> 
	 *       <p>
	 *        denotes an attribute whose value
	 *        should be interpreted as if declared to be of type ID.
	 *        This name is reserved by virtue of its definition in the
	 *        xml:id specification.</p>
	 *      
	 *      <p>
	 *       See <a href="http://www.w3.org/TR/xml-id/">http://www.w3.org/TR/xml-id/</a>
	 *       for information about this attribute.
	 *      </p>
	 *     </div>
	 *    
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSentence_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *     <div xmlns="http://www.w3.org/1999/xhtml">
	 *      
	 *       <h3>lang (as an attribute name)</h3>
	 *       <p>
	 *        denotes an attribute whose value
	 *        is a language code for the natural language of the content of
	 *        any element; its value is inherited.  This name is reserved
	 *        by virtue of its definition in the XML specification.</p>
	 *      
	 *     </div>
	 *     <div xmlns="http://www.w3.org/1999/xhtml">
	 *      <h4>Notes</h4>
	 *      <p>
	 *       Attempting to install the relevant ISO 2- and 3-letter
	 *       codes as the enumerated possible values is probably never
	 *       going to be a realistic possibility.  
	 *      </p>
	 *      <p>
	 *       See BCP 47 at <a href="http://www.rfc-editor.org/rfc/bcp/bcp47.txt">
	 *        http://www.rfc-editor.org/rfc/bcp/bcp47.txt</a>
	 *       and the IANA language subtag registry at
	 *       <a href="http://www.iana.org/assignments/language-subtag-registry">
	 *        http://www.iana.org/assignments/language-subtag-registry</a>
	 *       for further information.
	 *      </p>
	 *      <p>
	 *       The union allows for the 'un-declaration' of xml:lang with
	 *       the empty string.
	 *      </p>
	 *     </div>
	 *    
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSentence_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Onlangfailure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onlangfailure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onlangfailure</em>' attribute.
	 * @see #setOnlangfailure(String)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSentence_Onlangfailure()
	 * @model dataType="de.dfki.iui.mmds.core.model.speech_synthesis.OnlangfailureDatatype"
	 *        extendedMetaData="kind='attribute' name='onlangfailure'"
	 * @generated
	 */
	String getOnlangfailure();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence#getOnlangfailure <em>Onlangfailure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onlangfailure</em>' attribute.
	 * @see #getOnlangfailure()
	 * @generated
	 */
	void setOnlangfailure(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSentence_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':9' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // Sentence
