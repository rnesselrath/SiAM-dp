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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getDescAndSentenceAndStructureClass <em>Desc And Sentence And Structure Class</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getAwsGroup <em>Aws Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getAws <em>Aws</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getStructGroup <em>Struct Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getLookup <em>Lookup</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getDesc <em>Desc</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getAny <em>Any</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getFetchhint <em>Fetchhint</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getFetchtimeout <em>Fetchtimeout</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getMaxage <em>Maxage</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getMaxstale <em>Maxstale</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getSrc <em>Src</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getAudio()
 * @model extendedMetaData="name='audio' kind='mixed'"
 * @generated
 */
public interface Audio extends EObject {
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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getAudio_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Desc And Sentence And Structure Class</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc And Sentence And Structure Class</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc And Sentence And Structure Class</em>' attribute list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getAudio_DescAndSentenceAndStructureClass()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='DescAndSentenceAndStructureClass:1'"
	 * @generated
	 */
	FeatureMap getDescAndSentenceAndStructureClass();

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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getAudio_AwsGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='aws:group' namespace='##targetNamespace' group='#DescAndSentenceAndStructureClass:1'"
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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getAudio_Aws()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aws' namespace='##targetNamespace' group='aws:group'"
	 * @generated
	 */
	EList<EObject> getAws();

	/**
	 * Returns the value of the '<em><b>Struct Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct Group</em>' attribute list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getAudio_StructGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='struct:group' namespace='##targetNamespace' group='#DescAndSentenceAndStructureClass:1'"
	 * @generated
	 */
	FeatureMap getStructGroup();

	/**
	 * Returns the value of the '<em><b>Struct</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getAudio_Struct()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='struct' namespace='##targetNamespace' group='struct:group'"
	 * @generated
	 */
	EList<EObject> getStruct();

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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getAudio_Lookup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lookup' namespace='##targetNamespace' group='#DescAndSentenceAndStructureClass:1'"
	 * @generated
	 */
	EList<LookupType> getLookup();

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.speech_synthesis.Desc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getAudio_Desc()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='desc' namespace='##targetNamespace' group='#DescAndSentenceAndStructureClass:1'"
	 * @generated
	 */
	EList<Desc> getDesc();

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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getAudio_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':8' processing='lax' group='#DescAndSentenceAndStructureClass:1'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Fetchhint</b></em>' attribute.
	 * The default value is <code>"prefetch"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fetchhint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fetchhint</em>' attribute.
	 * @see #isSetFetchhint()
	 * @see #unsetFetchhint()
	 * @see #setFetchhint(String)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getAudio_Fetchhint()
	 * @model default="prefetch" unsettable="true" dataType="de.dfki.iui.mmds.core.model.speech_synthesis.FetchhintDatatype"
	 *        extendedMetaData="kind='attribute' name='fetchhint'"
	 * @generated
	 */
	String getFetchhint();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getFetchhint <em>Fetchhint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fetchhint</em>' attribute.
	 * @see #isSetFetchhint()
	 * @see #unsetFetchhint()
	 * @see #getFetchhint()
	 * @generated
	 */
	void setFetchhint(String value);

	/**
	 * Unsets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getFetchhint <em>Fetchhint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFetchhint()
	 * @see #getFetchhint()
	 * @see #setFetchhint(String)
	 * @generated
	 */
	void unsetFetchhint();

	/**
	 * Returns whether the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getFetchhint <em>Fetchhint</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fetchhint</em>' attribute is set.
	 * @see #unsetFetchhint()
	 * @see #getFetchhint()
	 * @see #setFetchhint(String)
	 * @generated
	 */
	boolean isSetFetchhint();

	/**
	 * Returns the value of the '<em><b>Fetchtimeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fetchtimeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fetchtimeout</em>' attribute.
	 * @see #setFetchtimeout(String)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getAudio_Fetchtimeout()
	 * @model dataType="de.dfki.iui.mmds.core.model.speech_synthesis.TimedesignationDatatype"
	 *        extendedMetaData="kind='attribute' name='fetchtimeout'"
	 * @generated
	 */
	String getFetchtimeout();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getFetchtimeout <em>Fetchtimeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fetchtimeout</em>' attribute.
	 * @see #getFetchtimeout()
	 * @generated
	 */
	void setFetchtimeout(String value);

	/**
	 * Returns the value of the '<em><b>Maxage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maxage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxage</em>' attribute.
	 * @see #setMaxage(BigInteger)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getAudio_Maxage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='maxage'"
	 * @generated
	 */
	BigInteger getMaxage();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getMaxage <em>Maxage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxage</em>' attribute.
	 * @see #getMaxage()
	 * @generated
	 */
	void setMaxage(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Maxstale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maxstale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxstale</em>' attribute.
	 * @see #setMaxstale(BigInteger)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getAudio_Maxstale()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='maxstale'"
	 * @generated
	 */
	BigInteger getMaxstale();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getMaxstale <em>Maxstale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxstale</em>' attribute.
	 * @see #getMaxstale()
	 * @generated
	 */
	void setMaxstale(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getAudio_Src()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='src'"
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Audio#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getAudio_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':14' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // Audio
