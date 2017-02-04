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
package de.dfki.iui.mmds.core.model.speech_synthesis.util;

import de.dfki.iui.mmds.core.model.speech_synthesis.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;
import de.dfki.iui.mmds.core.model.speech_synthesis.Audio;
import de.dfki.iui.mmds.core.model.speech_synthesis.Break;
import de.dfki.iui.mmds.core.model.speech_synthesis.Desc;
import de.dfki.iui.mmds.core.model.speech_synthesis.Emphasis;
import de.dfki.iui.mmds.core.model.speech_synthesis.GenderDatatype;
import de.dfki.iui.mmds.core.model.speech_synthesis.HeightScale;
import de.dfki.iui.mmds.core.model.speech_synthesis.LangType;
import de.dfki.iui.mmds.core.model.speech_synthesis.LevelDatatype;
import de.dfki.iui.mmds.core.model.speech_synthesis.LookupType;
import de.dfki.iui.mmds.core.model.speech_synthesis.Mark;
import de.dfki.iui.mmds.core.model.speech_synthesis.Mark1;
import de.dfki.iui.mmds.core.model.speech_synthesis.Paragraph;
import de.dfki.iui.mmds.core.model.speech_synthesis.Phoneme;
import de.dfki.iui.mmds.core.model.speech_synthesis.Prosody;
import de.dfki.iui.mmds.core.model.speech_synthesis.SSML;
import de.dfki.iui.mmds.core.model.speech_synthesis.SayAs;
import de.dfki.iui.mmds.core.model.speech_synthesis.Sentence;
import de.dfki.iui.mmds.core.model.speech_synthesis.Speak;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage;
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeedScale;
import de.dfki.iui.mmds.core.model.speech_synthesis.SsmlLexicon;
import de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMeta;
import de.dfki.iui.mmds.core.model.speech_synthesis.SsmlMetadata;
import de.dfki.iui.mmds.core.model.speech_synthesis.StrengthDatatype;
import de.dfki.iui.mmds.core.model.speech_synthesis.Sub;
import de.dfki.iui.mmds.core.model.speech_synthesis.TokenType;
import de.dfki.iui.mmds.core.model.speech_synthesis.Voice;
import de.dfki.iui.mmds.core.model.speech_synthesis.VolumeScale;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisPackage
 * @generated
 */
public class SpeechSynthesisValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SpeechSynthesisValidator INSTANCE = new SpeechSynthesisValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.dfki.iui.mmds.core.model.speech_synthesis";

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
	public SpeechSynthesisValidator() {
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
	  return SpeechSynthesisPackage.eINSTANCE;
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
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS:
				return validateSSMLSpeechSynthesis((SSMLSpeechSynthesis)value, diagnostics, context);
			case SpeechSynthesisPackage.AUDIO:
				return validateAudio((Audio)value, diagnostics, context);
			case SpeechSynthesisPackage.BREAK:
				return validateBreak((Break)value, diagnostics, context);
			case SpeechSynthesisPackage.DESC:
				return validateDesc((Desc)value, diagnostics, context);
			case SpeechSynthesisPackage.SSML:
				return validateSSML((SSML)value, diagnostics, context);
			case SpeechSynthesisPackage.EMPHASIS:
				return validateEmphasis((Emphasis)value, diagnostics, context);
			case SpeechSynthesisPackage.LANG_TYPE:
				return validateLangType((LangType)value, diagnostics, context);
			case SpeechSynthesisPackage.LOOKUP_TYPE:
				return validateLookupType((LookupType)value, diagnostics, context);
			case SpeechSynthesisPackage.MARK:
				return validateMark((Mark)value, diagnostics, context);
			case SpeechSynthesisPackage.MARK1:
				return validateMark1((Mark1)value, diagnostics, context);
			case SpeechSynthesisPackage.PARAGRAPH:
				return validateParagraph((Paragraph)value, diagnostics, context);
			case SpeechSynthesisPackage.PHONEME:
				return validatePhoneme((Phoneme)value, diagnostics, context);
			case SpeechSynthesisPackage.PROSODY:
				return validateProsody((Prosody)value, diagnostics, context);
			case SpeechSynthesisPackage.SAY_AS:
				return validateSayAs((SayAs)value, diagnostics, context);
			case SpeechSynthesisPackage.SENTENCE:
				return validateSentence((Sentence)value, diagnostics, context);
			case SpeechSynthesisPackage.SPEAK:
				return validateSpeak((Speak)value, diagnostics, context);
			case SpeechSynthesisPackage.SSML_LEXICON:
				return validateSsmlLexicon((SsmlLexicon)value, diagnostics, context);
			case SpeechSynthesisPackage.SSML_META:
				return validateSsmlMeta((SsmlMeta)value, diagnostics, context);
			case SpeechSynthesisPackage.SSML_METADATA:
				return validateSsmlMetadata((SsmlMetadata)value, diagnostics, context);
			case SpeechSynthesisPackage.SUB:
				return validateSub((Sub)value, diagnostics, context);
			case SpeechSynthesisPackage.TOKEN_TYPE:
				return validateTokenType((TokenType)value, diagnostics, context);
			case SpeechSynthesisPackage.VOICE:
				return validateVoice((Voice)value, diagnostics, context);
			case SpeechSynthesisPackage.GENDER_DATATYPE:
				return validateGenderDatatype((GenderDatatype)value, diagnostics, context);
			case SpeechSynthesisPackage.HEIGHT_SCALE:
				return validateHeightScale((HeightScale)value, diagnostics, context);
			case SpeechSynthesisPackage.LEVEL_DATATYPE:
				return validateLevelDatatype((LevelDatatype)value, diagnostics, context);
			case SpeechSynthesisPackage.SPEED_SCALE:
				return validateSpeedScale((SpeedScale)value, diagnostics, context);
			case SpeechSynthesisPackage.STRENGTH_DATATYPE:
				return validateStrengthDatatype((StrengthDatatype)value, diagnostics, context);
			case SpeechSynthesisPackage.VOLUME_SCALE:
				return validateVolumeScale((VolumeScale)value, diagnostics, context);
			case SpeechSynthesisPackage.AGE_DATATYPE:
				return validateAgeDatatype(value, diagnostics, context);
			case SpeechSynthesisPackage.ALPHABET_DATATYPE:
				return validateAlphabetDatatype((String)value, diagnostics, context);
			case SpeechSynthesisPackage.CONTOUR_DATATYPE:
				return validateContourDatatype((List<?>)value, diagnostics, context);
			case SpeechSynthesisPackage.CONTOURPOINT_DATATYPE:
				return validateContourpointDatatype((String)value, diagnostics, context);
			case SpeechSynthesisPackage.DB_DATATYPE:
				return validateDbDatatype((String)value, diagnostics, context);
			case SpeechSynthesisPackage.DURATION:
				return validateDuration((String)value, diagnostics, context);
			case SpeechSynthesisPackage.EMPTYSTRING_DATATYPE:
				return validateEmptystringDatatype((String)value, diagnostics, context);
			case SpeechSynthesisPackage.FETCHHINT_DATATYPE:
				return validateFetchhintDatatype((String)value, diagnostics, context);
			case SpeechSynthesisPackage.GENDER_DATATYPE_OBJECT:
				return validateGenderDatatypeObject((GenderDatatype)value, diagnostics, context);
			case SpeechSynthesisPackage.HEIGHT_SCALE_OBJECT:
				return validateHeightScaleObject((HeightScale)value, diagnostics, context);
			case SpeechSynthesisPackage.HERTZ_NUMBER:
				return validateHertzNumber((String)value, diagnostics, context);
			case SpeechSynthesisPackage.HERTZ_RELATIVE:
				return validateHertzRelative((String)value, diagnostics, context);
			case SpeechSynthesisPackage.LANGUAGES_DATATYPE:
				return validateLanguagesDatatype(value, diagnostics, context);
			case SpeechSynthesisPackage.LEVEL_DATATYPE_OBJECT:
				return validateLevelDatatypeObject((LevelDatatype)value, diagnostics, context);
			case SpeechSynthesisPackage.NAME_DATATYPE:
				return validateNameDatatype(value, diagnostics, context);
			case SpeechSynthesisPackage.NONNEGPERCENT:
				return validateNonnegpercent((String)value, diagnostics, context);
			case SpeechSynthesisPackage.NUMBER:
				return validateNumber((BigDecimal)value, diagnostics, context);
			case SpeechSynthesisPackage.ONLANGFAILURE_DATATYPE:
				return validateOnlangfailureDatatype((String)value, diagnostics, context);
			case SpeechSynthesisPackage.ONVOICEFAILURE_DATATYPE:
				return validateOnvoicefailureDatatype((String)value, diagnostics, context);
			case SpeechSynthesisPackage.ORDERING_DATATYPE:
				return validateOrderingDatatype(value, diagnostics, context);
			case SpeechSynthesisPackage.ORDERINGITEM_DATATYPE:
				return validateOrderingitemDatatype((String)value, diagnostics, context);
			case SpeechSynthesisPackage.ORDERINGLIST_DATATYPE:
				return validateOrderinglistDatatype((List<?>)value, diagnostics, context);
			case SpeechSynthesisPackage.PERCENT:
				return validatePercent((String)value, diagnostics, context);
			case SpeechSynthesisPackage.PHONEMETYPE_DATATYPE:
				return validatePhonemetypeDatatype((String)value, diagnostics, context);
			case SpeechSynthesisPackage.PITCH_DATATYPE:
				return validatePitchDatatype(value, diagnostics, context);
			case SpeechSynthesisPackage.RANGE_DATATYPE:
				return validateRangeDatatype(value, diagnostics, context);
			case SpeechSynthesisPackage.RATE_DATATYPE:
				return validateRateDatatype(value, diagnostics, context);
			case SpeechSynthesisPackage.RELATIVE:
				return validateRelative((String)value, diagnostics, context);
			case SpeechSynthesisPackage.REQUIRED_DATATYPE:
				return validateRequiredDatatype(value, diagnostics, context);
			case SpeechSynthesisPackage.REQUIREDITEM_DATATYPE:
				return validateRequireditemDatatype((String)value, diagnostics, context);
			case SpeechSynthesisPackage.REQUIREDLIST_DATATYPE:
				return validateRequiredlistDatatype((List<?>)value, diagnostics, context);
			case SpeechSynthesisPackage.ROLE_DATATYPE:
				return validateRoleDatatype((List<?>)value, diagnostics, context);
			case SpeechSynthesisPackage.SEMITONE:
				return validateSemitone((String)value, diagnostics, context);
			case SpeechSynthesisPackage.SPEED_SCALE_OBJECT:
				return validateSpeedScaleObject((SpeedScale)value, diagnostics, context);
			case SpeechSynthesisPackage.STRENGTH_DATATYPE_OBJECT:
				return validateStrengthDatatypeObject((StrengthDatatype)value, diagnostics, context);
			case SpeechSynthesisPackage.TIMEDESIGNATION_DATATYPE:
				return validateTimedesignationDatatype((String)value, diagnostics, context);
			case SpeechSynthesisPackage.VARIANT_DATATYPE:
				return validateVariantDatatype(value, diagnostics, context);
			case SpeechSynthesisPackage.VERSION_DATATYPE:
				return validateVersionDatatype((String)value, diagnostics, context);
			case SpeechSynthesisPackage.VOICENAME_DATATYPE:
				return validateVoicenameDatatype((String)value, diagnostics, context);
			case SpeechSynthesisPackage.VOICENAMES_DATATYPE:
				return validateVoicenamesDatatype((List<?>)value, diagnostics, context);
			case SpeechSynthesisPackage.VOLUME_DATATYPE:
				return validateVolumeDatatype(value, diagnostics, context);
			case SpeechSynthesisPackage.VOLUME_SCALE_OBJECT:
				return validateVolumeScaleObject((VolumeScale)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSSMLSpeechSynthesis(SSMLSpeechSynthesis ssmlSpeechSynthesis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ssmlSpeechSynthesis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAudio(Audio audio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(audio, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreak(Break break_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(break_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesc(Desc desc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(desc, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSSML(SSML ssml, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ssml, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmphasis(Emphasis emphasis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emphasis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLangType(LangType langType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(langType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLookupType(LookupType lookupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lookupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMark(Mark mark, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mark, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMark1(Mark1 mark1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mark1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParagraph(Paragraph paragraph, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paragraph, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhoneme(Phoneme phoneme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(phoneme, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProsody(Prosody prosody, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prosody, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSayAs(SayAs sayAs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sayAs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSentence(Sentence sentence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sentence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpeak(Speak speak, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(speak, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSsmlLexicon(SsmlLexicon ssmlLexicon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ssmlLexicon, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSsmlMeta(SsmlMeta ssmlMeta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ssmlMeta, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSsmlMetadata(SsmlMetadata ssmlMetadata, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ssmlMetadata, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSub(Sub sub, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sub, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTokenType(TokenType tokenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tokenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoice(Voice voice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(voice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderDatatype(GenderDatatype genderDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeightScale(HeightScale heightScale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelDatatype(LevelDatatype levelDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpeedScale(SpeedScale speedScale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrengthDatatype(StrengthDatatype strengthDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolumeScale(VolumeScale volumeScale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeDatatype(Object ageDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAgeDatatype_MemberTypes(ageDatatype, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Age Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeDatatype_MemberTypes(Object ageDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(ageDatatype)) {
				if (xmlTypeValidator.validateNonNegativeInteger((BigInteger)ageDatatype, tempDiagnostics, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE.isInstance(ageDatatype)) {
				if (validateEmptystringDatatype((String)ageDatatype, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(ageDatatype)) {
				if (xmlTypeValidator.validateNonNegativeInteger((BigInteger)ageDatatype, null, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE.isInstance(ageDatatype)) {
				if (validateEmptystringDatatype((String)ageDatatype, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlphabetDatatype(String alphabetDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAlphabetDatatype_Pattern(alphabetDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAlphabetDatatype_Pattern
	 */
	public static final  PatternMatcher [][] ALPHABET_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(ipa|x-.*)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Alphabet Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlphabetDatatype_Pattern(String alphabetDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SpeechSynthesisPackage.Literals.ALPHABET_DATATYPE, alphabetDatatype, ALPHABET_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContourDatatype(List<?> contourDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateContourDatatype_ItemType(contourDatatype, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Contour Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContourDatatype_ItemType(List<?> contourDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = contourDatatype.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (SpeechSynthesisPackage.Literals.CONTOURPOINT_DATATYPE.isInstance(item)) {
				result &= validateContourpointDatatype((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(SpeechSynthesisPackage.Literals.CONTOURPOINT_DATATYPE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContourpointDatatype(String contourpointDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateContourpointDatatype_Pattern(contourpointDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateContourpointDatatype_Pattern
	 */
	public static final  PatternMatcher [][] CONTOURPOINT_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\(([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)%,(([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)Hz|[+\\-]([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)Hz|[+\\-]?([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)%|[+\\-]([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)st|x-high|high|medium|low|x-low|default)\\)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Contourpoint Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContourpointDatatype_Pattern(String contourpointDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SpeechSynthesisPackage.Literals.CONTOURPOINT_DATATYPE, contourpointDatatype, CONTOURPOINT_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbDatatype(String dbDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDbDatatype_Pattern(dbDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDbDatatype_Pattern
	 */
	public static final  PatternMatcher [][] DB_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(\\+|-)?([0-9]*\\.)?[0-9]+dB")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Db Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDbDatatype_Pattern(String dbDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SpeechSynthesisPackage.Literals.DB_DATATYPE, dbDatatype, DB_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDuration(String duration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDuration_Pattern(duration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDuration_Pattern
	 */
	public static final  PatternMatcher [][] DURATION__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(\\+)?([0-9]*\\.)?[0-9]+(ms|s)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDuration_Pattern(String duration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SpeechSynthesisPackage.Literals.DURATION, duration, DURATION__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmptystringDatatype(String emptystringDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEmptystringDatatype_MaxLength(emptystringDatatype, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Emptystring Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmptystringDatatype_MaxLength(String emptystringDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = emptystringDatatype.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE, emptystringDatatype, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetchhintDatatype(String fetchhintDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFetchhintDatatype_Pattern(fetchhintDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFetchhintDatatype_Pattern
	 */
	public static final  PatternMatcher [][] FETCHHINT_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("safe"),
				XMLTypeUtil.createPatternMatcher("prefetch")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Fetchhint Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetchhintDatatype_Pattern(String fetchhintDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SpeechSynthesisPackage.Literals.FETCHHINT_DATATYPE, fetchhintDatatype, FETCHHINT_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderDatatypeObject(GenderDatatype genderDatatypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeightScaleObject(HeightScale heightScaleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHertzNumber(String hertzNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHertzNumber_Pattern(hertzNumber, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHertzNumber_Pattern
	 */
	public static final  PatternMatcher [][] HERTZ_NUMBER__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)Hz")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Hertz Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHertzNumber_Pattern(String hertzNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SpeechSynthesisPackage.Literals.HERTZ_NUMBER, hertzNumber, HERTZ_NUMBER__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHertzRelative(String hertzRelative, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHertzRelative_Pattern(hertzRelative, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHertzRelative_Pattern
	 */
	public static final  PatternMatcher [][] HERTZ_RELATIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[+\\-]([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)Hz")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Hertz Relative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHertzRelative_Pattern(String hertzRelative, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SpeechSynthesisPackage.Literals.HERTZ_RELATIVE, hertzRelative, HERTZ_RELATIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguagesDatatype(Object languagesDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLanguagesDatatype_MemberTypes(languagesDatatype, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Languages Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguagesDatatype_MemberTypes(Object languagesDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.NMTOKENS.isInstance(languagesDatatype)) {
				if (xmlTypeValidator.validateNMTOKENS((List)languagesDatatype, tempDiagnostics, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE.isInstance(languagesDatatype)) {
				if (validateEmptystringDatatype((String)languagesDatatype, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.NMTOKENS.isInstance(languagesDatatype)) {
				if (xmlTypeValidator.validateNMTOKENS((List)languagesDatatype, null, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE.isInstance(languagesDatatype)) {
				if (validateEmptystringDatatype((String)languagesDatatype, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelDatatypeObject(LevelDatatype levelDatatypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameDatatype(Object nameDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNameDatatype_MemberTypes(nameDatatype, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Name Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameDatatype_MemberTypes(Object nameDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (SpeechSynthesisPackage.Literals.VOICENAMES_DATATYPE.isInstance(nameDatatype)) {
				if (validateVoicenamesDatatype((List<?>)nameDatatype, tempDiagnostics, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE.isInstance(nameDatatype)) {
				if (validateEmptystringDatatype((String)nameDatatype, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (SpeechSynthesisPackage.Literals.VOICENAMES_DATATYPE.isInstance(nameDatatype)) {
				if (validateVoicenamesDatatype((List<?>)nameDatatype, null, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE.isInstance(nameDatatype)) {
				if (validateEmptystringDatatype((String)nameDatatype, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonnegpercent(String nonnegpercent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonnegpercent_Pattern(nonnegpercent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNonnegpercent_Pattern
	 */
	public static final  PatternMatcher [][] NONNEGPERCENT__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)%")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Nonnegpercent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonnegpercent_Pattern(String nonnegpercent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SpeechSynthesisPackage.Literals.NONNEGPERCENT, nonnegpercent, NONNEGPERCENT__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber(BigDecimal number, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNumber_Min(number, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNumber_Min
	 */
	public static final BigDecimal NUMBER__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Min(BigDecimal number, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = number.compareTo(NUMBER__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(SpeechSynthesisPackage.Literals.NUMBER, number, NUMBER__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlangfailureDatatype(String onlangfailureDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOnlangfailureDatatype_Pattern(onlangfailureDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOnlangfailureDatatype_Pattern
	 */
	public static final  PatternMatcher [][] ONLANGFAILURE_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("changevoice"),
				XMLTypeUtil.createPatternMatcher("ignoretext"),
				XMLTypeUtil.createPatternMatcher("ignorelang"),
				XMLTypeUtil.createPatternMatcher("processorchoice")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Onlangfailure Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlangfailureDatatype_Pattern(String onlangfailureDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SpeechSynthesisPackage.Literals.ONLANGFAILURE_DATATYPE, onlangfailureDatatype, ONLANGFAILURE_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnvoicefailureDatatype(String onvoicefailureDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOnvoicefailureDatatype_Pattern(onvoicefailureDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOnvoicefailureDatatype_Pattern
	 */
	public static final  PatternMatcher [][] ONVOICEFAILURE_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("priorityselect"),
				XMLTypeUtil.createPatternMatcher("keepexisting"),
				XMLTypeUtil.createPatternMatcher("processorchoice")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Onvoicefailure Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnvoicefailureDatatype_Pattern(String onvoicefailureDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SpeechSynthesisPackage.Literals.ONVOICEFAILURE_DATATYPE, onvoicefailureDatatype, ONVOICEFAILURE_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderingDatatype(Object orderingDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOrderingDatatype_MemberTypes(orderingDatatype, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Ordering Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderingDatatype_MemberTypes(Object orderingDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (SpeechSynthesisPackage.Literals.ORDERINGLIST_DATATYPE.isInstance(orderingDatatype)) {
				if (validateOrderinglistDatatype((List<?>)orderingDatatype, tempDiagnostics, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE.isInstance(orderingDatatype)) {
				if (validateEmptystringDatatype((String)orderingDatatype, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (SpeechSynthesisPackage.Literals.ORDERINGLIST_DATATYPE.isInstance(orderingDatatype)) {
				if (validateOrderinglistDatatype((List<?>)orderingDatatype, null, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE.isInstance(orderingDatatype)) {
				if (validateEmptystringDatatype((String)orderingDatatype, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderingitemDatatype(String orderingitemDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOrderingitemDatatype_Pattern(orderingitemDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOrderingitemDatatype_Pattern
	 */
	public static final  PatternMatcher [][] ORDERINGITEM_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("name"),
				XMLTypeUtil.createPatternMatcher("languages"),
				XMLTypeUtil.createPatternMatcher("gender"),
				XMLTypeUtil.createPatternMatcher("age"),
				XMLTypeUtil.createPatternMatcher("variant")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Orderingitem Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderingitemDatatype_Pattern(String orderingitemDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SpeechSynthesisPackage.Literals.ORDERINGITEM_DATATYPE, orderingitemDatatype, ORDERINGITEM_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderinglistDatatype(List<?> orderinglistDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOrderinglistDatatype_ItemType(orderinglistDatatype, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Orderinglist Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderinglistDatatype_ItemType(List<?> orderinglistDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = orderinglistDatatype.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (SpeechSynthesisPackage.Literals.ORDERINGITEM_DATATYPE.isInstance(item)) {
				result &= validateOrderingitemDatatype((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(SpeechSynthesisPackage.Literals.ORDERINGITEM_DATATYPE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercent(String percent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePercent_Pattern(percent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePercent_Pattern
	 */
	public static final  PatternMatcher [][] PERCENT__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[+\\-]?([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)%")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Percent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercent_Pattern(String percent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SpeechSynthesisPackage.Literals.PERCENT, percent, PERCENT__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhonemetypeDatatype(String phonemetypeDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePhonemetypeDatatype_Pattern(phonemetypeDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePhonemetypeDatatype_Pattern
	 */
	public static final  PatternMatcher [][] PHONEMETYPE_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("default"),
				XMLTypeUtil.createPatternMatcher("ruby")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Phonemetype Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhonemetypeDatatype_Pattern(String phonemetypeDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SpeechSynthesisPackage.Literals.PHONEMETYPE_DATATYPE, phonemetypeDatatype, PHONEMETYPE_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePitchDatatype(Object pitchDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePitchDatatype_MemberTypes(pitchDatatype, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Pitch Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePitchDatatype_MemberTypes(Object pitchDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (SpeechSynthesisPackage.Literals.HERTZ_NUMBER.isInstance(pitchDatatype)) {
				if (validateHertzNumber((String)pitchDatatype, tempDiagnostics, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.HERTZ_RELATIVE.isInstance(pitchDatatype)) {
				if (validateHertzRelative((String)pitchDatatype, tempDiagnostics, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.PERCENT.isInstance(pitchDatatype)) {
				if (validatePercent((String)pitchDatatype, tempDiagnostics, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.SEMITONE.isInstance(pitchDatatype)) {
				if (validateSemitone((String)pitchDatatype, tempDiagnostics, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.HEIGHT_SCALE.isInstance(pitchDatatype)) {
				if (validateHeightScale((HeightScale)pitchDatatype, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (SpeechSynthesisPackage.Literals.HERTZ_NUMBER.isInstance(pitchDatatype)) {
				if (validateHertzNumber((String)pitchDatatype, null, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.HERTZ_RELATIVE.isInstance(pitchDatatype)) {
				if (validateHertzRelative((String)pitchDatatype, null, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.PERCENT.isInstance(pitchDatatype)) {
				if (validatePercent((String)pitchDatatype, null, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.SEMITONE.isInstance(pitchDatatype)) {
				if (validateSemitone((String)pitchDatatype, null, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.HEIGHT_SCALE.isInstance(pitchDatatype)) {
				if (validateHeightScale((HeightScale)pitchDatatype, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeDatatype(Object rangeDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRangeDatatype_MemberTypes(rangeDatatype, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Range Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeDatatype_MemberTypes(Object rangeDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (SpeechSynthesisPackage.Literals.HERTZ_NUMBER.isInstance(rangeDatatype)) {
				if (validateHertzNumber((String)rangeDatatype, tempDiagnostics, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.HERTZ_RELATIVE.isInstance(rangeDatatype)) {
				if (validateHertzRelative((String)rangeDatatype, tempDiagnostics, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.PERCENT.isInstance(rangeDatatype)) {
				if (validatePercent((String)rangeDatatype, tempDiagnostics, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.SEMITONE.isInstance(rangeDatatype)) {
				if (validateSemitone((String)rangeDatatype, tempDiagnostics, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.HEIGHT_SCALE.isInstance(rangeDatatype)) {
				if (validateHeightScale((HeightScale)rangeDatatype, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (SpeechSynthesisPackage.Literals.HERTZ_NUMBER.isInstance(rangeDatatype)) {
				if (validateHertzNumber((String)rangeDatatype, null, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.HERTZ_RELATIVE.isInstance(rangeDatatype)) {
				if (validateHertzRelative((String)rangeDatatype, null, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.PERCENT.isInstance(rangeDatatype)) {
				if (validatePercent((String)rangeDatatype, null, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.SEMITONE.isInstance(rangeDatatype)) {
				if (validateSemitone((String)rangeDatatype, null, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.HEIGHT_SCALE.isInstance(rangeDatatype)) {
				if (validateHeightScale((HeightScale)rangeDatatype, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRateDatatype(Object rateDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRateDatatype_MemberTypes(rateDatatype, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Rate Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRateDatatype_MemberTypes(Object rateDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (SpeechSynthesisPackage.Literals.NUMBER.isInstance(rateDatatype)) {
				if (validateNumber((BigDecimal)rateDatatype, tempDiagnostics, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.NONNEGPERCENT.isInstance(rateDatatype)) {
				if (validateNonnegpercent((String)rateDatatype, tempDiagnostics, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.SPEED_SCALE.isInstance(rateDatatype)) {
				if (validateSpeedScale((SpeedScale)rateDatatype, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (SpeechSynthesisPackage.Literals.NUMBER.isInstance(rateDatatype)) {
				if (validateNumber((BigDecimal)rateDatatype, null, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.NONNEGPERCENT.isInstance(rateDatatype)) {
				if (validateNonnegpercent((String)rateDatatype, null, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.SPEED_SCALE.isInstance(rateDatatype)) {
				if (validateSpeedScale((SpeedScale)rateDatatype, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelative(String relative, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRelative_Pattern(relative, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRelative_Pattern
	 */
	public static final  PatternMatcher [][] RELATIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[+\\-]([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Relative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelative_Pattern(String relative, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SpeechSynthesisPackage.Literals.RELATIVE, relative, RELATIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredDatatype(Object requiredDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRequiredDatatype_MemberTypes(requiredDatatype, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Required Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredDatatype_MemberTypes(Object requiredDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (SpeechSynthesisPackage.Literals.REQUIREDLIST_DATATYPE.isInstance(requiredDatatype)) {
				if (validateRequiredlistDatatype((List<?>)requiredDatatype, tempDiagnostics, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE.isInstance(requiredDatatype)) {
				if (validateEmptystringDatatype((String)requiredDatatype, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (SpeechSynthesisPackage.Literals.REQUIREDLIST_DATATYPE.isInstance(requiredDatatype)) {
				if (validateRequiredlistDatatype((List<?>)requiredDatatype, null, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE.isInstance(requiredDatatype)) {
				if (validateEmptystringDatatype((String)requiredDatatype, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequireditemDatatype(String requireditemDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRequireditemDatatype_Pattern(requireditemDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRequireditemDatatype_Pattern
	 */
	public static final  PatternMatcher [][] REQUIREDITEM_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("name"),
				XMLTypeUtil.createPatternMatcher("languages"),
				XMLTypeUtil.createPatternMatcher("gender"),
				XMLTypeUtil.createPatternMatcher("age"),
				XMLTypeUtil.createPatternMatcher("variant")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Requireditem Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequireditemDatatype_Pattern(String requireditemDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SpeechSynthesisPackage.Literals.REQUIREDITEM_DATATYPE, requireditemDatatype, REQUIREDITEM_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredlistDatatype(List<?> requiredlistDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRequiredlistDatatype_ItemType(requiredlistDatatype, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Requiredlist Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredlistDatatype_ItemType(List<?> requiredlistDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = requiredlistDatatype.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (SpeechSynthesisPackage.Literals.REQUIREDITEM_DATATYPE.isInstance(item)) {
				result &= validateRequireditemDatatype((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(SpeechSynthesisPackage.Literals.REQUIREDITEM_DATATYPE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleDatatype(List<?> roleDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRoleDatatype_ItemType(roleDatatype, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Role Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleDatatype_ItemType(List<?> roleDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = roleDatatype.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.QNAME.isInstance(item)) {
				result &= xmlTypeValidator.validateQName((QName)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.QNAME, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemitone(String semitone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSemitone_Pattern(semitone, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSemitone_Pattern
	 */
	public static final  PatternMatcher [][] SEMITONE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[+\\-]([0-9]+|[0-9]+.[0-9]*|[0-9]*.[0-9]+)st")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Semitone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemitone_Pattern(String semitone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SpeechSynthesisPackage.Literals.SEMITONE, semitone, SEMITONE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpeedScaleObject(SpeedScale speedScaleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrengthDatatypeObject(StrengthDatatype strengthDatatypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedesignationDatatype(String timedesignationDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimedesignationDatatype_Pattern(timedesignationDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTimedesignationDatatype_Pattern
	 */
	public static final  PatternMatcher [][] TIMEDESIGNATION_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(\\+)?([0-9]*\\.)?[0-9]+(ms|s)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Timedesignation Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedesignationDatatype_Pattern(String timedesignationDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SpeechSynthesisPackage.Literals.TIMEDESIGNATION_DATATYPE, timedesignationDatatype, TIMEDESIGNATION_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariantDatatype(Object variantDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVariantDatatype_MemberTypes(variantDatatype, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Variant Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariantDatatype_MemberTypes(Object variantDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.POSITIVE_INTEGER.isInstance(variantDatatype)) {
				if (xmlTypeValidator.validatePositiveInteger((BigInteger)variantDatatype, tempDiagnostics, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE.isInstance(variantDatatype)) {
				if (validateEmptystringDatatype((String)variantDatatype, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.POSITIVE_INTEGER.isInstance(variantDatatype)) {
				if (xmlTypeValidator.validatePositiveInteger((BigInteger)variantDatatype, null, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE.isInstance(variantDatatype)) {
				if (validateEmptystringDatatype((String)variantDatatype, null, context)) return true;
			}
		}
		return false;
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
	public boolean validateVoicenameDatatype(String voicenameDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVoicenameDatatype_Pattern(voicenameDatatype, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVoicenameDatatype_Pattern
	 */
	public static final  PatternMatcher [][] VOICENAME_DATATYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\S+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Voicename Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoicenameDatatype_Pattern(String voicenameDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SpeechSynthesisPackage.Literals.VOICENAME_DATATYPE, voicenameDatatype, VOICENAME_DATATYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoicenamesDatatype(List<?> voicenamesDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVoicenamesDatatype_ItemType(voicenamesDatatype, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Voicenames Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoicenamesDatatype_ItemType(List<?> voicenamesDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = voicenamesDatatype.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (SpeechSynthesisPackage.Literals.VOICENAME_DATATYPE.isInstance(item)) {
				result &= validateVoicenameDatatype((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(SpeechSynthesisPackage.Literals.VOICENAME_DATATYPE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolumeDatatype(Object volumeDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVolumeDatatype_MemberTypes(volumeDatatype, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Volume Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolumeDatatype_MemberTypes(Object volumeDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (SpeechSynthesisPackage.Literals.DB_DATATYPE.isInstance(volumeDatatype)) {
				if (validateDbDatatype((String)volumeDatatype, tempDiagnostics, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.VOLUME_SCALE.isInstance(volumeDatatype)) {
				if (validateVolumeScale((VolumeScale)volumeDatatype, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (SpeechSynthesisPackage.Literals.DB_DATATYPE.isInstance(volumeDatatype)) {
				if (validateDbDatatype((String)volumeDatatype, null, context)) return true;
			}
			if (SpeechSynthesisPackage.Literals.VOLUME_SCALE.isInstance(volumeDatatype)) {
				if (validateVolumeScale((VolumeScale)volumeDatatype, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolumeScaleObject(VolumeScale volumeScaleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //SpeechSynthesisValidator
