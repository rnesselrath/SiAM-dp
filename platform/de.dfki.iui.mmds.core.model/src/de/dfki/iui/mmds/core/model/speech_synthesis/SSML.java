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
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SSML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getAudio <em>Audio</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getAws <em>Aws</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getBreak <em>Break</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getDesc <em>Desc</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getLang <em>Lang</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getLookup <em>Lookup</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getMark <em>Mark</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getP <em>P</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getPhoneme <em>Phoneme</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getProsody <em>Prosody</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getS <em>S</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getSayAs <em>Say As</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getSpeak <em>Speak</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getSub <em>Sub</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getToken <em>Token</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getVoice <em>Voice</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getW <em>W</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface SSML extends EObject {
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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Audio</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audio</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_Audio()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='audio' namespace='##targetNamespace' affiliation='aws'"
	 * @generated
	 */
	EList<Audio> getAudio();

	/**
	 * Returns the value of the '<em><b>Aws</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 The 'allowed-within-sentence' group uses this
	 *                                 abstract element.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aws</em>' containment reference.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_Aws()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aws' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getAws();

	/**
	 * Returns the value of the '<em><b>Break</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.Break}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Break</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Break</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_Break()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='break' namespace='##targetNamespace' affiliation='aws'"
	 * @generated
	 */
	EList<Break> getBreak();

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' containment reference.
	 * @see #setDesc(Desc)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_Desc()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='desc' namespace='##targetNamespace'"
	 * @generated
	 */
	Desc getDesc();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getDesc <em>Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' containment reference.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(Desc value);

	/**
	 * Returns the value of the '<em><b>Emphasis</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emphasis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emphasis</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_Emphasis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='emphasis' namespace='##targetNamespace' affiliation='aws'"
	 * @generated
	 */
	EList<Emphasis> getEmphasis();

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' containment reference.
	 * @see #setLang(LangType)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_Lang()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lang' namespace='##targetNamespace' affiliation='aws'"
	 * @generated
	 */
	LangType getLang();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getLang <em>Lang</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' containment reference.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(LangType value);

	/**
	 * Returns the value of the '<em><b>Lookup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lookup</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lookup</em>' containment reference.
	 * @see #setLookup(LookupType)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_Lookup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lookup' namespace='##targetNamespace'"
	 * @generated
	 */
	LookupType getLookup();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getLookup <em>Lookup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lookup</em>' containment reference.
	 * @see #getLookup()
	 * @generated
	 */
	void setLookup(LookupType value);

	/**
	 * Returns the value of the '<em><b>Mark</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.Mark1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mark</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mark</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_Mark()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mark' namespace='##targetNamespace' affiliation='aws'"
	 * @generated
	 */
	EList<Mark1> getMark();

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_P()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace' affiliation='struct'"
	 * @generated
	 */
	EList<Paragraph> getP();

	/**
	 * Returns the value of the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct</em>' containment reference.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_Struct()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='struct' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getStruct();

	/**
	 * Returns the value of the '<em><b>Phoneme</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phoneme</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phoneme</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_Phoneme()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='phoneme' namespace='##targetNamespace' affiliation='aws'"
	 * @generated
	 */
	EList<Phoneme> getPhoneme();

	/**
	 * Returns the value of the '<em><b>Prosody</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prosody</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prosody</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_Prosody()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='prosody' namespace='##targetNamespace' affiliation='aws'"
	 * @generated
	 */
	EList<Prosody> getProsody();

	/**
	 * Returns the value of the '<em><b>S</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.Sentence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>S</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_S()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='s' namespace='##targetNamespace' affiliation='struct'"
	 * @generated
	 */
	EList<Sentence> getS();

	/**
	 * Returns the value of the '<em><b>Say As</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.SayAs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Say As</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Say As</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_SayAs()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='say-as' namespace='##targetNamespace' affiliation='aws'"
	 * @generated
	 */
	EList<SayAs> getSayAs();

	/**
	 * Returns the value of the '<em><b>Speak</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speak</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speak</em>' containment reference.
	 * @see #setSpeak(Speak)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_Speak()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='speak' namespace='##targetNamespace'"
	 * @generated
	 */
	Speak getSpeak();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getSpeak <em>Speak</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speak</em>' containment reference.
	 * @see #getSpeak()
	 * @generated
	 */
	void setSpeak(Speak value);

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.Sub}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_Sub()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace' affiliation='aws'"
	 * @generated
	 */
	EList<Sub> getSub();

	/**
	 * Returns the value of the '<em><b>Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' containment reference.
	 * @see #setToken(TokenType)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_Token()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='token' namespace='##targetNamespace' affiliation='aws'"
	 * @generated
	 */
	TokenType getToken();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getToken <em>Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' containment reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(TokenType value);

	/**
	 * Returns the value of the '<em><b>Voice</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.Voice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voice</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voice</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_Voice()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='voice' namespace='##targetNamespace' affiliation='aws'"
	 * @generated
	 */
	EList<Voice> getVoice();

	/**
	 * Returns the value of the '<em><b>W</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>W</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>W</em>' containment reference.
	 * @see #setW(TokenType)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getSSML_W()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='w' namespace='##targetNamespace' affiliation='aws'"
	 * @generated
	 */
	TokenType getW();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.SSML#getW <em>W</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>W</em>' containment reference.
	 * @see #getW()
	 * @generated
	 */
	void setW(TokenType value);

} // SSML
