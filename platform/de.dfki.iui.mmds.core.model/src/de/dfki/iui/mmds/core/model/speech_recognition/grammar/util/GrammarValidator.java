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
package de.dfki.iui.mmds.core.model.speech_recognition.grammar.util;

import java.math.BigDecimal;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.DocumentRoot;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar1;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarPackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Lexicon;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Meta;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Metadata;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.ModeDatatype;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.OneOf;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.ScopeDatatype;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.SpecialDatatype;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Token;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarPackage
 * @generated
 */
public class GrammarValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GrammarValidator INSTANCE = new GrammarValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.dfki.iui.mmds.core.model.speech_recognition.grammar";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return GrammarPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case GrammarPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case GrammarPackage.GRAMMAR:
				return validateGrammar((Grammar)value, diagnostics, context);
			case GrammarPackage.GRAMMAR1:
				return validateGrammar1((Grammar1)value, diagnostics, context);
			case GrammarPackage.ITEM:
				return validateItem((Item)value, diagnostics, context);
			case GrammarPackage.LEXICON:
				return validateLexicon((Lexicon)value, diagnostics, context);
			case GrammarPackage.META:
				return validateMeta((Meta)value, diagnostics, context);
			case GrammarPackage.METADATA:
				return validateMetadata((Metadata)value, diagnostics, context);
			case GrammarPackage.ONE_OF:
				return validateOneOf((OneOf)value, diagnostics, context);
			case GrammarPackage.RULE:
				return validateRule((Rule)value, diagnostics, context);
			case GrammarPackage.RULEREF:
				return validateRuleref((Ruleref)value, diagnostics, context);
			case GrammarPackage.TOKEN:
				return validateToken((Token)value, diagnostics, context);
			case GrammarPackage.MODE_DATATYPE:
				return validateModeDatatype((ModeDatatype)value, diagnostics, context);
			case GrammarPackage.SCOPE_DATATYPE:
				return validateScopeDatatype((ScopeDatatype)value, diagnostics, context);
			case GrammarPackage.SPECIAL_DATATYPE:
				return validateSpecialDatatype((SpecialDatatype)value, diagnostics, context);
			case GrammarPackage.EXAMPLE:
				return validateExample((String)value, diagnostics, context);
			case GrammarPackage.ID_DATATYPE:
				return validateIdDatatype((String)value, diagnostics, context);
			case GrammarPackage.MODE_DATATYPE_OBJECT:
				return validateModeDatatypeObject((ModeDatatype)value, diagnostics, context);
			case GrammarPackage.REPEAT_DATATYPE:
				return validateRepeatDatatype((String)value, diagnostics, context);
			case GrammarPackage.REPEAT_PROB_DATATYPE:
				return validateRepeatProbDatatype((BigDecimal)value, diagnostics, context);
			case GrammarPackage.ROOT_DATATYPE:
				return validateRootDatatype((String)value, diagnostics, context);
			case GrammarPackage.SCOPE_DATATYPE_OBJECT:
				return validateScopeDatatypeObject((ScopeDatatype)value, diagnostics, context);
			case GrammarPackage.SPECIAL_DATATYPE_OBJECT:
				return validateSpecialDatatypeObject((SpecialDatatype)value, diagnostics, context);
			case GrammarPackage.TAG:
				return validateTag((String)value, diagnostics, context);
			case GrammarPackage.TAG_FORMAT_DATATYPE:
				return validateTagFormatDatatype((String)value, diagnostics, context);
			case GrammarPackage.TYPE_DATATYPE:
				return validateTypeDatatype((String)value, diagnostics, context);
			case GrammarPackage.VERSION_DATATYPE:
				return validateVersionDatatype((String)value, diagnostics, context);
			case GrammarPackage.WEIGHT_DATATYPE:
				return validateWeightDatatype((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrammar(Grammar grammar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(grammar, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrammar1(Grammar1 grammar1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(grammar1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(item, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLexicon(Lexicon lexicon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lexicon, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeta(Meta meta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(meta, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetadata(Metadata metadata, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metadata, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneOf(OneOf oneOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oneOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRule(Rule rule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleref(Ruleref ruleref, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ruleref, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToken(Token token, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(token, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeDatatype(ModeDatatype modeDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScopeDatatype(ScopeDatatype scopeDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialDatatype(SpecialDatatype specialDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExample(String example, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdDatatype(String idDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIdDatatype_Pattern(idDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIdDatatype_Pattern
	 */
	public static final  PatternMatcher [][] ID_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^.:\\-]+")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\i-[:]][\\c-[:]]*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Id Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdDatatype_Pattern(String idDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GrammarPackage.Literals.ID_DATATYPE, idDatatype, ID_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeDatatypeObject(ModeDatatype modeDatatypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeatDatatype(String repeatDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRepeatDatatype_Pattern(repeatDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRepeatDatatype_Pattern
	 */
	public static final  PatternMatcher [][] REPEAT_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]+"),
				XMLTypeUtil.createPatternMatcher("[0-9]+-([0-9]+)?"),
				XMLTypeUtil.createPatternMatcher("([0-9]+)?-[0-9]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Repeat Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeatDatatype_Pattern(String repeatDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GrammarPackage.Literals.REPEAT_DATATYPE, repeatDatatype, REPEAT_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeatProbDatatype(BigDecimal repeatProbDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRepeatProbDatatype_Min(repeatProbDatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validateRepeatProbDatatype_Max(repeatProbDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRepeatProbDatatype_Min
	 */
	public static final BigDecimal REPEAT_PROB_DATATYPE__MIN__VALUE = new BigDecimal("0.0");

	/**
	 * Validates the Min constraint of '<em>Repeat Prob Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeatProbDatatype_Min(BigDecimal repeatProbDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = repeatProbDatatype.compareTo(REPEAT_PROB_DATATYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(GrammarPackage.Literals.REPEAT_PROB_DATATYPE, repeatProbDatatype, REPEAT_PROB_DATATYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRepeatProbDatatype_Max
	 */
	public static final BigDecimal REPEAT_PROB_DATATYPE__MAX__VALUE = new BigDecimal("1.0");

	/**
	 * Validates the Max constraint of '<em>Repeat Prob Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeatProbDatatype_Max(BigDecimal repeatProbDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = repeatProbDatatype.compareTo(REPEAT_PROB_DATATYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(GrammarPackage.Literals.REPEAT_PROB_DATATYPE, repeatProbDatatype, REPEAT_PROB_DATATYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRootDatatype(String rootDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRootDatatype_Pattern(rootDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRootDatatype_Pattern
	 */
	public static final  PatternMatcher [][] ROOT_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^.:\\-]+")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\i-[:]][\\c-[:]]*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\i\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Root Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRootDatatype_Pattern(String rootDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GrammarPackage.Literals.ROOT_DATATYPE, rootDatatype, ROOT_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScopeDatatypeObject(ScopeDatatype scopeDatatypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialDatatypeObject(SpecialDatatype specialDatatypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTag(String tag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagFormatDatatype(String tagFormatDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDatatype(String typeDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionDatatype(String versionDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNMTOKEN_Pattern(versionDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeightDatatype(String weightDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateWeightDatatype_Pattern(weightDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateWeightDatatype_Pattern
	 */
	public static final  PatternMatcher [][] WEIGHT_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]+[.]?"),
				XMLTypeUtil.createPatternMatcher("([0-9]+)?[.][0-9]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Weight Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeightDatatype_Pattern(String weightDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GrammarPackage.Literals.WEIGHT_DATATYPE, weightDatatype, WEIGHT_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //GrammarValidator
