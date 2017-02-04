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

import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getGroup <em>Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getAudio <em>Audio</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getBreak <em>Break</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getMark <em>Mark</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getPhoneme <em>Phoneme</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getProsody <em>Prosody</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getSayAs <em>Say As</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getSub <em>Sub</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getVoice <em>Voice</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getAny <em>Any</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getId <em>Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getLang <em>Lang</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getOnlangfailure <em>Onlangfailure</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getRole <em>Role</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getTokenType()
 * @model extendedMetaData="name='tokenType' kind='mixed'"
 * @generated
 */
public interface TokenType extends EObject {
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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getTokenType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getTokenType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Audio</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audio</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audio</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getTokenType_Audio()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='audio' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<Audio> getAudio();

	/**
	 * Returns the value of the '<em><b>Break</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.Break}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Break</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Break</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getTokenType_Break()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='break' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<Break> getBreak();

	/**
	 * Returns the value of the '<em><b>Emphasis</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emphasis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emphasis</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getTokenType_Emphasis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='emphasis' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<Emphasis> getEmphasis();

	/**
	 * Returns the value of the '<em><b>Mark</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.Mark1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mark</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mark</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getTokenType_Mark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mark' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<Mark1> getMark();

	/**
	 * Returns the value of the '<em><b>Phoneme</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phoneme</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phoneme</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getTokenType_Phoneme()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='phoneme' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<Phoneme> getPhoneme();

	/**
	 * Returns the value of the '<em><b>Prosody</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prosody</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prosody</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getTokenType_Prosody()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='prosody' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<Prosody> getProsody();

	/**
	 * Returns the value of the '<em><b>Say As</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.SayAs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Say As</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Say As</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getTokenType_SayAs()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='say-as' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SayAs> getSayAs();

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.Sub}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getTokenType_Sub()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<Sub> getSub();

	/**
	 * Returns the value of the '<em><b>Voice</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.Voice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voice</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getTokenType_Voice()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='voice' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<Voice> getVoice();

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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getTokenType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':11' processing='lax' group='#group:1'"
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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getTokenType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getId <em>Id</em>}' attribute.
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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getTokenType_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getLang <em>Lang</em>}' attribute.
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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getTokenType_Onlangfailure()
	 * @model dataType="de.dfki.iui.mmds.core.model.speech_synthesis.OnlangfailureDatatype"
	 *        extendedMetaData="kind='attribute' name='onlangfailure'"
	 * @generated
	 */
	String getOnlangfailure();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getOnlangfailure <em>Onlangfailure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onlangfailure</em>' attribute.
	 * @see #getOnlangfailure()
	 * @generated
	 */
	void setOnlangfailure(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(List)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getTokenType_Role()
	 * @model dataType="de.dfki.iui.mmds.core.model.speech_synthesis.RoleDatatype" many="false"
	 *        extendedMetaData="kind='attribute' name='role'"
	 * @generated
	 */
	List<QName> getRole();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.TokenType#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(List<QName> value);

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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getTokenType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':16' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // TokenType
