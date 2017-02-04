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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prosody</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getSentenceAndStructureClass <em>Sentence And Structure Class</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getAwsGroup <em>Aws Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getAws <em>Aws</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getStructGroup <em>Struct Group</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getLookup <em>Lookup</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getContour <em>Contour</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getPitch <em>Pitch</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getRange <em>Range</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getRate <em>Rate</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getVolume <em>Volume</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getProsody()
 * @model extendedMetaData="name='prosody' kind='mixed'"
 * @generated
 */
public interface Prosody extends EObject {
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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getProsody_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Sentence And Structure Class</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sentence And Structure Class</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentence And Structure Class</em>' attribute list.
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getProsody_SentenceAndStructureClass()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='SentenceAndStructureClass:1'"
	 * @generated
	 */
	FeatureMap getSentenceAndStructureClass();

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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getProsody_AwsGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='aws:group' namespace='##targetNamespace' group='#SentenceAndStructureClass:1'"
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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getProsody_Aws()
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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getProsody_StructGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='struct:group' namespace='##targetNamespace' group='#SentenceAndStructureClass:1'"
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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getProsody_Struct()
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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getProsody_Lookup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lookup' namespace='##targetNamespace' group='#SentenceAndStructureClass:1'"
	 * @generated
	 */
	EList<LookupType> getLookup();

	/**
	 * Returns the value of the '<em><b>Contour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contour</em>' attribute.
	 * @see #setContour(List)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getProsody_Contour()
	 * @model dataType="de.dfki.iui.mmds.core.model.speech_synthesis.ContourDatatype" many="false"
	 *        extendedMetaData="kind='attribute' name='contour'"
	 * @generated
	 */
	List<String> getContour();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getContour <em>Contour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contour</em>' attribute.
	 * @see #getContour()
	 * @generated
	 */
	void setContour(List<String> value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getProsody_Duration()
	 * @model dataType="de.dfki.iui.mmds.core.model.speech_synthesis.Duration"
	 *        extendedMetaData="kind='attribute' name='duration'"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pitch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pitch</em>' attribute.
	 * @see #setPitch(Object)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getProsody_Pitch()
	 * @model dataType="de.dfki.iui.mmds.core.model.speech_synthesis.PitchDatatype"
	 *        extendedMetaData="kind='attribute' name='pitch'"
	 * @generated
	 */
	Object getPitch();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getPitch <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pitch</em>' attribute.
	 * @see #getPitch()
	 * @generated
	 */
	void setPitch(Object value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(Object)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getProsody_Range()
	 * @model dataType="de.dfki.iui.mmds.core.model.speech_synthesis.RangeDatatype"
	 *        extendedMetaData="kind='attribute' name='range'"
	 * @generated
	 */
	Object getRange();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Object value);

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(Object)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getProsody_Rate()
	 * @model dataType="de.dfki.iui.mmds.core.model.speech_synthesis.RateDatatype"
	 *        extendedMetaData="kind='attribute' name='rate'"
	 * @generated
	 */
	Object getRate();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(Object value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * The default value is <code>"+0.0dB"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #isSetVolume()
	 * @see #unsetVolume()
	 * @see #setVolume(Object)
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getProsody_Volume()
	 * @model default="+0.0dB" unsettable="true" dataType="de.dfki.iui.mmds.core.model.speech_synthesis.VolumeDatatype"
	 *        extendedMetaData="kind='attribute' name='volume'"
	 * @generated
	 */
	Object getVolume();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #isSetVolume()
	 * @see #unsetVolume()
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(Object value);

	/**
	 * Unsets the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVolume()
	 * @see #getVolume()
	 * @see #setVolume(Object)
	 * @generated
	 */
	void unsetVolume();

	/**
	 * Returns whether the value of the '{@link de.dfki.iui.mmds.core.model.speech_synthesis.Prosody#getVolume <em>Volume</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Volume</em>' attribute is set.
	 * @see #unsetVolume()
	 * @see #getVolume()
	 * @see #setVolume(Object)
	 * @generated
	 */
	boolean isSetVolume();

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
	 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage#getProsody_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':13' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // Prosody
