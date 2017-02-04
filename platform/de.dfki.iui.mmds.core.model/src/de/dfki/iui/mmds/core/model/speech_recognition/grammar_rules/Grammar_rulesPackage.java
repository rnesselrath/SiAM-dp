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
package de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesFactory
 * @model kind="package"
 * @generated
 */
public interface Grammar_rulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "grammar_rules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/mmds/core/model/speech_recognition/grammar_rules";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "grammar_rules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Grammar_rulesPackage eINSTANCE = de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.Grammar_rulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.RulesetImpl <em>Ruleset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.RulesetImpl
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.Grammar_rulesPackageImpl#getRuleset()
	 * @generated
	 */
	int RULESET = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULESET__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULESET__RULES = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULESET__LANGUAGE = 2;

	/**
	 * The number of structural features of the '<em>Ruleset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULESET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ruleset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULESET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Rule <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Rule
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.Grammar_rulesPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ENABLED = 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.UtteranceImpl <em>Utterance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.UtteranceImpl
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.Grammar_rulesPackageImpl#getUtterance()
	 * @generated
	 */
	int UTTERANCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE__ENABLED = RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE__INTERPRETATION = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phrases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE__PHRASES = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE__ANNOTATION = RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Utterance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_FEATURE_COUNT = RULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Utterance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.EntityImpl
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.Grammar_rulesPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENABLED = RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TYPE = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTRIES = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__INTERPRETATION = RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = RULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.SemanticMappingImpl <em>Semantic Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.SemanticMappingImpl
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.Grammar_rulesPackageImpl#getSemanticMapping()
	 * @generated
	 */
	int SEMANTIC_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_MAPPING__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_MAPPING__ENABLED = RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Phrase Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_MAPPING__PHRASE_MAPPINGS = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_MAPPING__MAPPING_TARGET = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Semantic Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_MAPPING_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Semantic Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_MAPPING_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.PhraseMappingImpl <em>Phrase Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.PhraseMappingImpl
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.Grammar_rulesPackageImpl#getPhraseMapping()
	 * @generated
	 */
	int PHRASE_MAPPING = 5;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHRASE_MAPPING__INTERPRETATION = 0;

	/**
	 * The feature id for the '<em><b>Phrases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHRASE_MAPPING__PHRASES = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHRASE_MAPPING__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Phrase Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHRASE_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Phrase Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHRASE_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.PhraseValuePairImpl <em>Phrase Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.PhraseValuePairImpl
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.Grammar_rulesPackageImpl#getPhraseValuePair()
	 * @generated
	 */
	int PHRASE_VALUE_PAIR = 6;

	/**
	 * The feature id for the '<em><b>Phrase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHRASE_VALUE_PAIR__PHRASE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHRASE_VALUE_PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Phrase Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHRASE_VALUE_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Phrase Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHRASE_VALUE_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.EntityType <em>Entity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.EntityType
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.Grammar_rulesPackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset <em>Ruleset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ruleset</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset
	 * @generated
	 */
	EClass getRuleset();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset#getIdentifier()
	 * @see #getRuleset()
	 * @generated
	 */
	EAttribute getRuleset_Identifier();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset#getRules()
	 * @see #getRuleset()
	 * @generated
	 */
	EReference getRuleset_Rules();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset#getLanguage()
	 * @see #getRuleset()
	 * @generated
	 */
	EAttribute getRuleset_Language();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Rule#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Rule#isEnabled()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Enabled();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Utterance <em>Utterance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utterance</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Utterance
	 * @generated
	 */
	EClass getUtterance();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Utterance#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interpretation</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Utterance#getInterpretation()
	 * @see #getUtterance()
	 * @generated
	 */
	EReference getUtterance_Interpretation();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Utterance#getPhrases <em>Phrases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Phrases</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Utterance#getPhrases()
	 * @see #getUtterance()
	 * @generated
	 */
	EAttribute getUtterance_Phrases();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Utterance#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Utterance#getAnnotation()
	 * @see #getUtterance()
	 * @generated
	 */
	EReference getUtterance_Annotation();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Entity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Entity#getType()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Entity#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Entity#getEntries()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Entries();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Entity#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interpretation</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Entity#getInterpretation()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Interpretation();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.SemanticMapping <em>Semantic Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Mapping</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.SemanticMapping
	 * @generated
	 */
	EClass getSemanticMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.SemanticMapping#getPhraseMappings <em>Phrase Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phrase Mappings</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.SemanticMapping#getPhraseMappings()
	 * @see #getSemanticMapping()
	 * @generated
	 */
	EReference getSemanticMapping_PhraseMappings();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.SemanticMapping#getMappingTarget <em>Mapping Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping Target</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.SemanticMapping#getMappingTarget()
	 * @see #getSemanticMapping()
	 * @generated
	 */
	EReference getSemanticMapping_MappingTarget();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseMapping <em>Phrase Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phrase Mapping</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseMapping
	 * @generated
	 */
	EClass getPhraseMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseMapping#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interpretation</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseMapping#getInterpretation()
	 * @see #getPhraseMapping()
	 * @generated
	 */
	EReference getPhraseMapping_Interpretation();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseMapping#getPhrases <em>Phrases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Phrases</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseMapping#getPhrases()
	 * @see #getPhraseMapping()
	 * @generated
	 */
	EAttribute getPhraseMapping_Phrases();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseMapping#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseMapping#getDescription()
	 * @see #getPhraseMapping()
	 * @generated
	 */
	EAttribute getPhraseMapping_Description();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseValuePair <em>Phrase Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phrase Value Pair</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseValuePair
	 * @generated
	 */
	EClass getPhraseValuePair();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseValuePair#getPhrase <em>Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phrase</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseValuePair#getPhrase()
	 * @see #getPhraseValuePair()
	 * @generated
	 */
	EAttribute getPhraseValuePair_Phrase();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseValuePair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseValuePair#getValue()
	 * @see #getPhraseValuePair()
	 * @generated
	 */
	EAttribute getPhraseValuePair_Value();

	/**
	 * Returns the meta object for enum '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Type</em>'.
	 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.EntityType
	 * @generated
	 */
	EEnum getEntityType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Grammar_rulesFactory getGrammar_rulesFactory();

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
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.RulesetImpl <em>Ruleset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.RulesetImpl
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.Grammar_rulesPackageImpl#getRuleset()
		 * @generated
		 */
		EClass RULESET = eINSTANCE.getRuleset();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULESET__IDENTIFIER = eINSTANCE.getRuleset_Identifier();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULESET__RULES = eINSTANCE.getRuleset_Rules();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULESET__LANGUAGE = eINSTANCE.getRuleset_Language();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Rule <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Rule
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.Grammar_rulesPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ENABLED = eINSTANCE.getRule_Enabled();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.UtteranceImpl <em>Utterance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.UtteranceImpl
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.Grammar_rulesPackageImpl#getUtterance()
		 * @generated
		 */
		EClass UTTERANCE = eINSTANCE.getUtterance();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTTERANCE__INTERPRETATION = eINSTANCE.getUtterance_Interpretation();

		/**
		 * The meta object literal for the '<em><b>Phrases</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTTERANCE__PHRASES = eINSTANCE.getUtterance_Phrases();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTTERANCE__ANNOTATION = eINSTANCE.getUtterance_Annotation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.EntityImpl
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.Grammar_rulesPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__TYPE = eINSTANCE.getEntity_Type();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ENTRIES = eINSTANCE.getEntity_Entries();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__INTERPRETATION = eINSTANCE.getEntity_Interpretation();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.SemanticMappingImpl <em>Semantic Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.SemanticMappingImpl
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.Grammar_rulesPackageImpl#getSemanticMapping()
		 * @generated
		 */
		EClass SEMANTIC_MAPPING = eINSTANCE.getSemanticMapping();

		/**
		 * The meta object literal for the '<em><b>Phrase Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_MAPPING__PHRASE_MAPPINGS = eINSTANCE.getSemanticMapping_PhraseMappings();

		/**
		 * The meta object literal for the '<em><b>Mapping Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_MAPPING__MAPPING_TARGET = eINSTANCE.getSemanticMapping_MappingTarget();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.PhraseMappingImpl <em>Phrase Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.PhraseMappingImpl
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.Grammar_rulesPackageImpl#getPhraseMapping()
		 * @generated
		 */
		EClass PHRASE_MAPPING = eINSTANCE.getPhraseMapping();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHRASE_MAPPING__INTERPRETATION = eINSTANCE.getPhraseMapping_Interpretation();

		/**
		 * The meta object literal for the '<em><b>Phrases</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHRASE_MAPPING__PHRASES = eINSTANCE.getPhraseMapping_Phrases();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHRASE_MAPPING__DESCRIPTION = eINSTANCE.getPhraseMapping_Description();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.PhraseValuePairImpl <em>Phrase Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.PhraseValuePairImpl
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.Grammar_rulesPackageImpl#getPhraseValuePair()
		 * @generated
		 */
		EClass PHRASE_VALUE_PAIR = eINSTANCE.getPhraseValuePair();

		/**
		 * The meta object literal for the '<em><b>Phrase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHRASE_VALUE_PAIR__PHRASE = eINSTANCE.getPhraseValuePair_Phrase();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHRASE_VALUE_PAIR__VALUE = eINSTANCE.getPhraseValuePair_Value();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.EntityType <em>Entity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.EntityType
		 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.impl.Grammar_rulesPackageImpl#getEntityType()
		 * @generated
		 */
		EEnum ENTITY_TYPE = eINSTANCE.getEntityType();

	}

} //Grammar_rulesPackage
