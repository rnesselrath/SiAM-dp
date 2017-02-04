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
package de.dfki.iui.mmds.core.model.speech_synthesis.impl;

import de.dfki.iui.mmds.core.model.speech_synthesis.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
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
import de.dfki.iui.mmds.core.model.speech_synthesis.SpeechSynthesisFactory;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpeechSynthesisFactoryImpl extends EFactoryImpl implements SpeechSynthesisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpeechSynthesisFactory init() {
		try {
			SpeechSynthesisFactory theSpeechSynthesisFactory = (SpeechSynthesisFactory)EPackage.Registry.INSTANCE.getEFactory(SpeechSynthesisPackage.eNS_URI);
			if (theSpeechSynthesisFactory != null) {
				return theSpeechSynthesisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpeechSynthesisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechSynthesisFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SpeechSynthesisPackage.SSML_SPEECH_SYNTHESIS: return createSSMLSpeechSynthesis();
			case SpeechSynthesisPackage.AUDIO: return createAudio();
			case SpeechSynthesisPackage.BREAK: return createBreak();
			case SpeechSynthesisPackage.DESC: return createDesc();
			case SpeechSynthesisPackage.SSML: return createSSML();
			case SpeechSynthesisPackage.EMPHASIS: return createEmphasis();
			case SpeechSynthesisPackage.LANG_TYPE: return createLangType();
			case SpeechSynthesisPackage.LOOKUP_TYPE: return createLookupType();
			case SpeechSynthesisPackage.MARK: return createMark();
			case SpeechSynthesisPackage.MARK1: return createMark1();
			case SpeechSynthesisPackage.PARAGRAPH: return createParagraph();
			case SpeechSynthesisPackage.PHONEME: return createPhoneme();
			case SpeechSynthesisPackage.PROSODY: return createProsody();
			case SpeechSynthesisPackage.SAY_AS: return createSayAs();
			case SpeechSynthesisPackage.SENTENCE: return createSentence();
			case SpeechSynthesisPackage.SPEAK: return createSpeak();
			case SpeechSynthesisPackage.SSML_LEXICON: return createSsmlLexicon();
			case SpeechSynthesisPackage.SSML_META: return createSsmlMeta();
			case SpeechSynthesisPackage.SSML_METADATA: return createSsmlMetadata();
			case SpeechSynthesisPackage.SUB: return createSub();
			case SpeechSynthesisPackage.TOKEN_TYPE: return createTokenType();
			case SpeechSynthesisPackage.VOICE: return createVoice();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SpeechSynthesisPackage.GENDER_DATATYPE:
				return createGenderDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.HEIGHT_SCALE:
				return createHeightScaleFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.LEVEL_DATATYPE:
				return createLevelDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.SPEED_SCALE:
				return createSpeedScaleFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.STRENGTH_DATATYPE:
				return createStrengthDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.VOLUME_SCALE:
				return createVolumeScaleFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.AGE_DATATYPE:
				return createAgeDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.ALPHABET_DATATYPE:
				return createAlphabetDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.CONTOUR_DATATYPE:
				return createContourDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.CONTOURPOINT_DATATYPE:
				return createContourpointDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.DB_DATATYPE:
				return createDbDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.DURATION:
				return createDurationFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.EMPTYSTRING_DATATYPE:
				return createEmptystringDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.FETCHHINT_DATATYPE:
				return createFetchhintDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.GENDER_DATATYPE_OBJECT:
				return createGenderDatatypeObjectFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.HEIGHT_SCALE_OBJECT:
				return createHeightScaleObjectFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.HERTZ_NUMBER:
				return createHertzNumberFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.HERTZ_RELATIVE:
				return createHertzRelativeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.LANGUAGES_DATATYPE:
				return createLanguagesDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.LEVEL_DATATYPE_OBJECT:
				return createLevelDatatypeObjectFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.NAME_DATATYPE:
				return createNameDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.NONNEGPERCENT:
				return createNonnegpercentFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.NUMBER:
				return createNumberFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.ONLANGFAILURE_DATATYPE:
				return createOnlangfailureDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.ONVOICEFAILURE_DATATYPE:
				return createOnvoicefailureDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.ORDERING_DATATYPE:
				return createOrderingDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.ORDERINGITEM_DATATYPE:
				return createOrderingitemDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.ORDERINGLIST_DATATYPE:
				return createOrderinglistDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.PERCENT:
				return createPercentFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.PHONEMETYPE_DATATYPE:
				return createPhonemetypeDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.PITCH_DATATYPE:
				return createPitchDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.RANGE_DATATYPE:
				return createRangeDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.RATE_DATATYPE:
				return createRateDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.RELATIVE:
				return createRelativeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.REQUIRED_DATATYPE:
				return createRequiredDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.REQUIREDITEM_DATATYPE:
				return createRequireditemDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.REQUIREDLIST_DATATYPE:
				return createRequiredlistDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.ROLE_DATATYPE:
				return createRoleDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.SEMITONE:
				return createSemitoneFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.SPEED_SCALE_OBJECT:
				return createSpeedScaleObjectFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.STRENGTH_DATATYPE_OBJECT:
				return createStrengthDatatypeObjectFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.TIMEDESIGNATION_DATATYPE:
				return createTimedesignationDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.VARIANT_DATATYPE:
				return createVariantDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.VERSION_DATATYPE:
				return createVersionDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.VOICENAME_DATATYPE:
				return createVoicenameDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.VOICENAMES_DATATYPE:
				return createVoicenamesDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.VOLUME_DATATYPE:
				return createVolumeDatatypeFromString(eDataType, initialValue);
			case SpeechSynthesisPackage.VOLUME_SCALE_OBJECT:
				return createVolumeScaleObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SpeechSynthesisPackage.GENDER_DATATYPE:
				return convertGenderDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.HEIGHT_SCALE:
				return convertHeightScaleToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.LEVEL_DATATYPE:
				return convertLevelDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.SPEED_SCALE:
				return convertSpeedScaleToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.STRENGTH_DATATYPE:
				return convertStrengthDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.VOLUME_SCALE:
				return convertVolumeScaleToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.AGE_DATATYPE:
				return convertAgeDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.ALPHABET_DATATYPE:
				return convertAlphabetDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.CONTOUR_DATATYPE:
				return convertContourDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.CONTOURPOINT_DATATYPE:
				return convertContourpointDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.DB_DATATYPE:
				return convertDbDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.DURATION:
				return convertDurationToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.EMPTYSTRING_DATATYPE:
				return convertEmptystringDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.FETCHHINT_DATATYPE:
				return convertFetchhintDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.GENDER_DATATYPE_OBJECT:
				return convertGenderDatatypeObjectToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.HEIGHT_SCALE_OBJECT:
				return convertHeightScaleObjectToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.HERTZ_NUMBER:
				return convertHertzNumberToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.HERTZ_RELATIVE:
				return convertHertzRelativeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.LANGUAGES_DATATYPE:
				return convertLanguagesDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.LEVEL_DATATYPE_OBJECT:
				return convertLevelDatatypeObjectToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.NAME_DATATYPE:
				return convertNameDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.NONNEGPERCENT:
				return convertNonnegpercentToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.NUMBER:
				return convertNumberToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.ONLANGFAILURE_DATATYPE:
				return convertOnlangfailureDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.ONVOICEFAILURE_DATATYPE:
				return convertOnvoicefailureDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.ORDERING_DATATYPE:
				return convertOrderingDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.ORDERINGITEM_DATATYPE:
				return convertOrderingitemDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.ORDERINGLIST_DATATYPE:
				return convertOrderinglistDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.PERCENT:
				return convertPercentToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.PHONEMETYPE_DATATYPE:
				return convertPhonemetypeDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.PITCH_DATATYPE:
				return convertPitchDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.RANGE_DATATYPE:
				return convertRangeDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.RATE_DATATYPE:
				return convertRateDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.RELATIVE:
				return convertRelativeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.REQUIRED_DATATYPE:
				return convertRequiredDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.REQUIREDITEM_DATATYPE:
				return convertRequireditemDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.REQUIREDLIST_DATATYPE:
				return convertRequiredlistDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.ROLE_DATATYPE:
				return convertRoleDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.SEMITONE:
				return convertSemitoneToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.SPEED_SCALE_OBJECT:
				return convertSpeedScaleObjectToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.STRENGTH_DATATYPE_OBJECT:
				return convertStrengthDatatypeObjectToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.TIMEDESIGNATION_DATATYPE:
				return convertTimedesignationDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.VARIANT_DATATYPE:
				return convertVariantDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.VERSION_DATATYPE:
				return convertVersionDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.VOICENAME_DATATYPE:
				return convertVoicenameDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.VOICENAMES_DATATYPE:
				return convertVoicenamesDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.VOLUME_DATATYPE:
				return convertVolumeDatatypeToString(eDataType, instanceValue);
			case SpeechSynthesisPackage.VOLUME_SCALE_OBJECT:
				return convertVolumeScaleObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSMLSpeechSynthesis createSSMLSpeechSynthesis() {
		SSMLSpeechSynthesisImpl ssmlSpeechSynthesis = new SSMLSpeechSynthesisImpl();
		return ssmlSpeechSynthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Audio createAudio() {
		AudioImpl audio = new AudioImpl();
		return audio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Break createBreak() {
		BreakImpl break_ = new BreakImpl();
		return break_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Desc createDesc() {
		DescImpl desc = new DescImpl();
		return desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSML createSSML() {
		SSMLImpl ssml = new SSMLImpl();
		return ssml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emphasis createEmphasis() {
		EmphasisImpl emphasis = new EmphasisImpl();
		return emphasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangType createLangType() {
		LangTypeImpl langType = new LangTypeImpl();
		return langType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupType createLookupType() {
		LookupTypeImpl lookupType = new LookupTypeImpl();
		return lookupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mark createMark() {
		MarkImpl mark = new MarkImpl();
		return mark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mark1 createMark1() {
		Mark1Impl mark1 = new Mark1Impl();
		return mark1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phoneme createPhoneme() {
		PhonemeImpl phoneme = new PhonemeImpl();
		return phoneme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prosody createProsody() {
		ProsodyImpl prosody = new ProsodyImpl();
		return prosody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SayAs createSayAs() {
		SayAsImpl sayAs = new SayAsImpl();
		return sayAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentence createSentence() {
		SentenceImpl sentence = new SentenceImpl();
		return sentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Speak createSpeak() {
		SpeakImpl speak = new SpeakImpl();
		return speak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsmlLexicon createSsmlLexicon() {
		SsmlLexiconImpl ssmlLexicon = new SsmlLexiconImpl();
		return ssmlLexicon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsmlMeta createSsmlMeta() {
		SsmlMetaImpl ssmlMeta = new SsmlMetaImpl();
		return ssmlMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsmlMetadata createSsmlMetadata() {
		SsmlMetadataImpl ssmlMetadata = new SsmlMetadataImpl();
		return ssmlMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sub createSub() {
		SubImpl sub = new SubImpl();
		return sub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenType createTokenType() {
		TokenTypeImpl tokenType = new TokenTypeImpl();
		return tokenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voice createVoice() {
		VoiceImpl voice = new VoiceImpl();
		return voice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenderDatatype createGenderDatatypeFromString(EDataType eDataType, String initialValue) {
		GenderDatatype result = GenderDatatype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenderDatatypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeightScale createHeightScaleFromString(EDataType eDataType, String initialValue) {
		HeightScale result = HeightScale.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHeightScaleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelDatatype createLevelDatatypeFromString(EDataType eDataType, String initialValue) {
		LevelDatatype result = LevelDatatype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelDatatypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeedScale createSpeedScaleFromString(EDataType eDataType, String initialValue) {
		SpeedScale result = SpeedScale.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpeedScaleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrengthDatatype createStrengthDatatypeFromString(EDataType eDataType, String initialValue) {
		StrengthDatatype result = StrengthDatatype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrengthDatatypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumeScale createVolumeScaleFromString(EDataType eDataType, String initialValue) {
		VolumeScale result = VolumeScale.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVolumeScaleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createAgeDatatypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createEmptystringDatatypeFromString(SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAgeDatatypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE.isInstance(instanceValue)) {
			try {
				String value = convertEmptystringDatatypeToString(SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAlphabetDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlphabetDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createContourDatatypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add(createContourpointDatatypeFromString(SpeechSynthesisPackage.Literals.CONTOURPOINT_DATATYPE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContourDatatypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertContourpointDatatypeToString(SpeechSynthesisPackage.Literals.CONTOURPOINT_DATATYPE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createContourpointDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContourpointDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDbDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDurationFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEmptystringDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEmptystringDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFetchhintDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFetchhintDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenderDatatype createGenderDatatypeObjectFromString(EDataType eDataType, String initialValue) {
		return createGenderDatatypeFromString(SpeechSynthesisPackage.Literals.GENDER_DATATYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenderDatatypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGenderDatatypeToString(SpeechSynthesisPackage.Literals.GENDER_DATATYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeightScale createHeightScaleObjectFromString(EDataType eDataType, String initialValue) {
		return createHeightScaleFromString(SpeechSynthesisPackage.Literals.HEIGHT_SCALE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHeightScaleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHeightScaleToString(SpeechSynthesisPackage.Literals.HEIGHT_SCALE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHertzNumberFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHertzNumberToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHertzRelativeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHertzRelativeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createLanguagesDatatypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NMTOKENS, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createEmptystringDatatypeFromString(SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguagesDatatypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.NMTOKENS.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NMTOKENS, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE.isInstance(instanceValue)) {
			try {
				String value = convertEmptystringDatatypeToString(SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelDatatype createLevelDatatypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLevelDatatypeFromString(SpeechSynthesisPackage.Literals.LEVEL_DATATYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelDatatypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLevelDatatypeToString(SpeechSynthesisPackage.Literals.LEVEL_DATATYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createNameDatatypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createVoicenamesDatatypeFromString(SpeechSynthesisPackage.Literals.VOICENAMES_DATATYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createEmptystringDatatypeFromString(SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameDatatypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (SpeechSynthesisPackage.Literals.VOICENAMES_DATATYPE.isInstance(instanceValue)) {
			try {
				String value = convertVoicenamesDatatypeToString(SpeechSynthesisPackage.Literals.VOICENAMES_DATATYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE.isInstance(instanceValue)) {
			try {
				String value = convertEmptystringDatatypeToString(SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNonnegpercentFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonnegpercentToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createNumberFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOnlangfailureDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnlangfailureDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOnvoicefailureDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnvoicefailureDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createOrderingDatatypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createOrderinglistDatatypeFromString(SpeechSynthesisPackage.Literals.ORDERINGLIST_DATATYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createEmptystringDatatypeFromString(SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderingDatatypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (SpeechSynthesisPackage.Literals.ORDERINGLIST_DATATYPE.isInstance(instanceValue)) {
			try {
				String value = convertOrderinglistDatatypeToString(SpeechSynthesisPackage.Literals.ORDERINGLIST_DATATYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE.isInstance(instanceValue)) {
			try {
				String value = convertEmptystringDatatypeToString(SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOrderingitemDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderingitemDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createOrderinglistDatatypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add(createOrderingitemDatatypeFromString(SpeechSynthesisPackage.Literals.ORDERINGITEM_DATATYPE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderinglistDatatypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertOrderingitemDatatypeToString(SpeechSynthesisPackage.Literals.ORDERINGITEM_DATATYPE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPercentFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPercentToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPhonemetypeDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhonemetypeDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createPitchDatatypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createHertzNumberFromString(SpeechSynthesisPackage.Literals.HERTZ_NUMBER, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createHertzRelativeFromString(SpeechSynthesisPackage.Literals.HERTZ_RELATIVE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createPercentFromString(SpeechSynthesisPackage.Literals.PERCENT, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createSemitoneFromString(SpeechSynthesisPackage.Literals.SEMITONE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createHeightScaleFromString(SpeechSynthesisPackage.Literals.HEIGHT_SCALE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPitchDatatypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (SpeechSynthesisPackage.Literals.HERTZ_NUMBER.isInstance(instanceValue)) {
			try {
				String value = convertHertzNumberToString(SpeechSynthesisPackage.Literals.HERTZ_NUMBER, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SpeechSynthesisPackage.Literals.HERTZ_RELATIVE.isInstance(instanceValue)) {
			try {
				String value = convertHertzRelativeToString(SpeechSynthesisPackage.Literals.HERTZ_RELATIVE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SpeechSynthesisPackage.Literals.PERCENT.isInstance(instanceValue)) {
			try {
				String value = convertPercentToString(SpeechSynthesisPackage.Literals.PERCENT, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SpeechSynthesisPackage.Literals.SEMITONE.isInstance(instanceValue)) {
			try {
				String value = convertSemitoneToString(SpeechSynthesisPackage.Literals.SEMITONE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SpeechSynthesisPackage.Literals.HEIGHT_SCALE.isInstance(instanceValue)) {
			try {
				String value = convertHeightScaleToString(SpeechSynthesisPackage.Literals.HEIGHT_SCALE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createRangeDatatypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createHertzNumberFromString(SpeechSynthesisPackage.Literals.HERTZ_NUMBER, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createHertzRelativeFromString(SpeechSynthesisPackage.Literals.HERTZ_RELATIVE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createPercentFromString(SpeechSynthesisPackage.Literals.PERCENT, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createSemitoneFromString(SpeechSynthesisPackage.Literals.SEMITONE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createHeightScaleFromString(SpeechSynthesisPackage.Literals.HEIGHT_SCALE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeDatatypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (SpeechSynthesisPackage.Literals.HERTZ_NUMBER.isInstance(instanceValue)) {
			try {
				String value = convertHertzNumberToString(SpeechSynthesisPackage.Literals.HERTZ_NUMBER, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SpeechSynthesisPackage.Literals.HERTZ_RELATIVE.isInstance(instanceValue)) {
			try {
				String value = convertHertzRelativeToString(SpeechSynthesisPackage.Literals.HERTZ_RELATIVE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SpeechSynthesisPackage.Literals.PERCENT.isInstance(instanceValue)) {
			try {
				String value = convertPercentToString(SpeechSynthesisPackage.Literals.PERCENT, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SpeechSynthesisPackage.Literals.SEMITONE.isInstance(instanceValue)) {
			try {
				String value = convertSemitoneToString(SpeechSynthesisPackage.Literals.SEMITONE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SpeechSynthesisPackage.Literals.HEIGHT_SCALE.isInstance(instanceValue)) {
			try {
				String value = convertHeightScaleToString(SpeechSynthesisPackage.Literals.HEIGHT_SCALE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createRateDatatypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNumberFromString(SpeechSynthesisPackage.Literals.NUMBER, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNonnegpercentFromString(SpeechSynthesisPackage.Literals.NONNEGPERCENT, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createSpeedScaleFromString(SpeechSynthesisPackage.Literals.SPEED_SCALE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRateDatatypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (SpeechSynthesisPackage.Literals.NUMBER.isInstance(instanceValue)) {
			try {
				String value = convertNumberToString(SpeechSynthesisPackage.Literals.NUMBER, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SpeechSynthesisPackage.Literals.NONNEGPERCENT.isInstance(instanceValue)) {
			try {
				String value = convertNonnegpercentToString(SpeechSynthesisPackage.Literals.NONNEGPERCENT, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SpeechSynthesisPackage.Literals.SPEED_SCALE.isInstance(instanceValue)) {
			try {
				String value = convertSpeedScaleToString(SpeechSynthesisPackage.Literals.SPEED_SCALE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRelativeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelativeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createRequiredDatatypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createRequiredlistDatatypeFromString(SpeechSynthesisPackage.Literals.REQUIREDLIST_DATATYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createEmptystringDatatypeFromString(SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequiredDatatypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (SpeechSynthesisPackage.Literals.REQUIREDLIST_DATATYPE.isInstance(instanceValue)) {
			try {
				String value = convertRequiredlistDatatypeToString(SpeechSynthesisPackage.Literals.REQUIREDLIST_DATATYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE.isInstance(instanceValue)) {
			try {
				String value = convertEmptystringDatatypeToString(SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRequireditemDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequireditemDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createRequiredlistDatatypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add(createRequireditemDatatypeFromString(SpeechSynthesisPackage.Literals.REQUIREDITEM_DATATYPE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequiredlistDatatypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertRequireditemDatatypeToString(SpeechSynthesisPackage.Literals.REQUIREDITEM_DATATYPE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QName> createRoleDatatypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<QName> result = new ArrayList<QName>();
		for (String item : split(initialValue)) {
			result.add((QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleDatatypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSemitoneFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSemitoneToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeedScale createSpeedScaleObjectFromString(EDataType eDataType, String initialValue) {
		return createSpeedScaleFromString(SpeechSynthesisPackage.Literals.SPEED_SCALE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpeedScaleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpeedScaleToString(SpeechSynthesisPackage.Literals.SPEED_SCALE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrengthDatatype createStrengthDatatypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStrengthDatatypeFromString(SpeechSynthesisPackage.Literals.STRENGTH_DATATYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrengthDatatypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStrengthDatatypeToString(SpeechSynthesisPackage.Literals.STRENGTH_DATATYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTimedesignationDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimedesignationDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createVariantDatatypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createEmptystringDatatypeFromString(SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariantDatatypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.POSITIVE_INTEGER.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE.isInstance(instanceValue)) {
			try {
				String value = convertEmptystringDatatypeToString(SpeechSynthesisPackage.Literals.EMPTYSTRING_DATATYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVersionDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NMTOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NMTOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVoicenameDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVoicenameDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createVoicenamesDatatypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add(createVoicenameDatatypeFromString(SpeechSynthesisPackage.Literals.VOICENAME_DATATYPE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVoicenamesDatatypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertVoicenameDatatypeToString(SpeechSynthesisPackage.Literals.VOICENAME_DATATYPE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createVolumeDatatypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createDbDatatypeFromString(SpeechSynthesisPackage.Literals.DB_DATATYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createVolumeScaleFromString(SpeechSynthesisPackage.Literals.VOLUME_SCALE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVolumeDatatypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (SpeechSynthesisPackage.Literals.DB_DATATYPE.isInstance(instanceValue)) {
			try {
				String value = convertDbDatatypeToString(SpeechSynthesisPackage.Literals.DB_DATATYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SpeechSynthesisPackage.Literals.VOLUME_SCALE.isInstance(instanceValue)) {
			try {
				String value = convertVolumeScaleToString(SpeechSynthesisPackage.Literals.VOLUME_SCALE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumeScale createVolumeScaleObjectFromString(EDataType eDataType, String initialValue) {
		return createVolumeScaleFromString(SpeechSynthesisPackage.Literals.VOLUME_SCALE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVolumeScaleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVolumeScaleToString(SpeechSynthesisPackage.Literals.VOLUME_SCALE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechSynthesisPackage getSpeechSynthesisPackage() {
		return (SpeechSynthesisPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpeechSynthesisPackage getPackage() {
		return SpeechSynthesisPackage.eINSTANCE;
	}

} //SpeechSynthesisFactoryImpl
