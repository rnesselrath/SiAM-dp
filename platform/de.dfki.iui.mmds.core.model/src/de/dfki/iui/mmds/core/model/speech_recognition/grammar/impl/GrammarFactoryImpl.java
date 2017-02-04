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
package de.dfki.iui.mmds.core.model.speech_recognition.grammar.impl;

import java.math.BigDecimal;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.DocumentRoot;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar1;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarFactory;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrammarFactoryImpl extends EFactoryImpl implements GrammarFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GrammarFactory init() {
		try {
			GrammarFactory theGrammarFactory = (GrammarFactory)EPackage.Registry.INSTANCE.getEFactory(GrammarPackage.eNS_URI);
			if (theGrammarFactory != null) {
				return theGrammarFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GrammarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarFactoryImpl() {
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
			case GrammarPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case GrammarPackage.GRAMMAR: return createGrammar();
			case GrammarPackage.GRAMMAR1: return createGrammar1();
			case GrammarPackage.ITEM: return createItem();
			case GrammarPackage.LEXICON: return createLexicon();
			case GrammarPackage.META: return createMeta();
			case GrammarPackage.METADATA: return createMetadata();
			case GrammarPackage.ONE_OF: return createOneOf();
			case GrammarPackage.RULE: return createRule();
			case GrammarPackage.RULEREF: return createRuleref();
			case GrammarPackage.TOKEN: return createToken();
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
			case GrammarPackage.MODE_DATATYPE:
				return createModeDatatypeFromString(eDataType, initialValue);
			case GrammarPackage.SCOPE_DATATYPE:
				return createScopeDatatypeFromString(eDataType, initialValue);
			case GrammarPackage.SPECIAL_DATATYPE:
				return createSpecialDatatypeFromString(eDataType, initialValue);
			case GrammarPackage.EXAMPLE:
				return createExampleFromString(eDataType, initialValue);
			case GrammarPackage.ID_DATATYPE:
				return createIdDatatypeFromString(eDataType, initialValue);
			case GrammarPackage.MODE_DATATYPE_OBJECT:
				return createModeDatatypeObjectFromString(eDataType, initialValue);
			case GrammarPackage.REPEAT_DATATYPE:
				return createRepeatDatatypeFromString(eDataType, initialValue);
			case GrammarPackage.REPEAT_PROB_DATATYPE:
				return createRepeatProbDatatypeFromString(eDataType, initialValue);
			case GrammarPackage.ROOT_DATATYPE:
				return createRootDatatypeFromString(eDataType, initialValue);
			case GrammarPackage.SCOPE_DATATYPE_OBJECT:
				return createScopeDatatypeObjectFromString(eDataType, initialValue);
			case GrammarPackage.SPECIAL_DATATYPE_OBJECT:
				return createSpecialDatatypeObjectFromString(eDataType, initialValue);
			case GrammarPackage.TAG:
				return createTagFromString(eDataType, initialValue);
			case GrammarPackage.TAG_FORMAT_DATATYPE:
				return createTagFormatDatatypeFromString(eDataType, initialValue);
			case GrammarPackage.TYPE_DATATYPE:
				return createTypeDatatypeFromString(eDataType, initialValue);
			case GrammarPackage.VERSION_DATATYPE:
				return createVersionDatatypeFromString(eDataType, initialValue);
			case GrammarPackage.WEIGHT_DATATYPE:
				return createWeightDatatypeFromString(eDataType, initialValue);
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
			case GrammarPackage.MODE_DATATYPE:
				return convertModeDatatypeToString(eDataType, instanceValue);
			case GrammarPackage.SCOPE_DATATYPE:
				return convertScopeDatatypeToString(eDataType, instanceValue);
			case GrammarPackage.SPECIAL_DATATYPE:
				return convertSpecialDatatypeToString(eDataType, instanceValue);
			case GrammarPackage.EXAMPLE:
				return convertExampleToString(eDataType, instanceValue);
			case GrammarPackage.ID_DATATYPE:
				return convertIdDatatypeToString(eDataType, instanceValue);
			case GrammarPackage.MODE_DATATYPE_OBJECT:
				return convertModeDatatypeObjectToString(eDataType, instanceValue);
			case GrammarPackage.REPEAT_DATATYPE:
				return convertRepeatDatatypeToString(eDataType, instanceValue);
			case GrammarPackage.REPEAT_PROB_DATATYPE:
				return convertRepeatProbDatatypeToString(eDataType, instanceValue);
			case GrammarPackage.ROOT_DATATYPE:
				return convertRootDatatypeToString(eDataType, instanceValue);
			case GrammarPackage.SCOPE_DATATYPE_OBJECT:
				return convertScopeDatatypeObjectToString(eDataType, instanceValue);
			case GrammarPackage.SPECIAL_DATATYPE_OBJECT:
				return convertSpecialDatatypeObjectToString(eDataType, instanceValue);
			case GrammarPackage.TAG:
				return convertTagToString(eDataType, instanceValue);
			case GrammarPackage.TAG_FORMAT_DATATYPE:
				return convertTagFormatDatatypeToString(eDataType, instanceValue);
			case GrammarPackage.TYPE_DATATYPE:
				return convertTypeDatatypeToString(eDataType, instanceValue);
			case GrammarPackage.VERSION_DATATYPE:
				return convertVersionDatatypeToString(eDataType, instanceValue);
			case GrammarPackage.WEIGHT_DATATYPE:
				return convertWeightDatatypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grammar createGrammar() {
		GrammarImpl grammar = new GrammarImpl();
		return grammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grammar1 createGrammar1() {
		Grammar1Impl grammar1 = new Grammar1Impl();
		return grammar1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lexicon createLexicon() {
		LexiconImpl lexicon = new LexiconImpl();
		return lexicon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta createMeta() {
		MetaImpl meta = new MetaImpl();
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneOf createOneOf() {
		OneOfImpl oneOf = new OneOfImpl();
		return oneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruleref createRuleref() {
		RulerefImpl ruleref = new RulerefImpl();
		return ruleref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeDatatype createModeDatatypeFromString(EDataType eDataType, String initialValue) {
		ModeDatatype result = ModeDatatype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeDatatypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeDatatype createScopeDatatypeFromString(EDataType eDataType, String initialValue) {
		ScopeDatatype result = ScopeDatatype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeDatatypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialDatatype createSpecialDatatypeFromString(EDataType eDataType, String initialValue) {
		SpecialDatatype result = SpecialDatatype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecialDatatypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createExampleFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExampleToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIdDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ID, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ID, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeDatatype createModeDatatypeObjectFromString(EDataType eDataType, String initialValue) {
		return createModeDatatypeFromString(GrammarPackage.Literals.MODE_DATATYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeDatatypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModeDatatypeToString(GrammarPackage.Literals.MODE_DATATYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRepeatDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepeatDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createRepeatProbDatatypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepeatProbDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRootDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.IDREF, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRootDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.IDREF, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeDatatype createScopeDatatypeObjectFromString(EDataType eDataType, String initialValue) {
		return createScopeDatatypeFromString(GrammarPackage.Literals.SCOPE_DATATYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeDatatypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScopeDatatypeToString(GrammarPackage.Literals.SCOPE_DATATYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialDatatype createSpecialDatatypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSpecialDatatypeFromString(GrammarPackage.Literals.SPECIAL_DATATYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecialDatatypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpecialDatatypeToString(GrammarPackage.Literals.SPECIAL_DATATYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTagFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTagToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTagFormatDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTagFormatDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
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
	public String createWeightDatatypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeightDatatypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarPackage getGrammarPackage() {
		return (GrammarPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GrammarPackage getPackage() {
		return GrammarPackage.eINSTANCE;
	}

} //GrammarFactoryImpl
