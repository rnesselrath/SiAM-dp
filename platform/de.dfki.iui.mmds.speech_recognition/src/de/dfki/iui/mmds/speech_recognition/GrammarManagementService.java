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
package de.dfki.iui.mmds.speech_recognition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.ComponentContext;

import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.events.DialogPlatformEventManager;
import de.dfki.iui.mmds.core.interfaces.IGrammarManagementService;
import de.dfki.iui.mmds.core.interfaces.IResourceManager;
import de.dfki.iui.mmds.core.model.io.IoFactory;
import de.dfki.iui.mmds.core.model.io.UpdateDeviceMode;
import de.dfki.iui.mmds.core.model.io.UpdateGrammar;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.DocumentRoot;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar1;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarFactory;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarPackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.OneOf;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.SpecialDatatype;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Entity;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.EntityType;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseValuePair;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Rule;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Utterance;

public class GrammarManagementService implements IGrammarManagementService {

	protected Logger logger;
	private final GrxmlConverter converter;
	private String LANGUAGE = "de-DE";

	@Override
	public String getLANGUAGE() {
		return LANGUAGE;
	}

	private ComponentContext context;

	private final List<Ruleset> ruleSets = new ArrayList<Ruleset>();
	HashMap<String, Grammar1> dynamicGrammars = new HashMap<String, Grammar1>();
	private final HashMap<Ruleset, Grammar1> grammarMappings = new HashMap<Ruleset, Grammar1>();
	private final Grammar1 rootGrammar;

	HashMap<String, EObject> publishedGrammars = new HashMap<String, EObject>();

	String GRAMMAR_FILE_SUFFIX = ".grxml";

	public GrammarManagementService() {
		String TAG_FORMAT = "semantics/1.0";
		boolean SUPPORT_FREETEXT = false;

		converter = new GrxmlConverter(TAG_FORMAT, GRAMMAR_FILE_SUFFIX, SUPPORT_FREETEXT);
		rootGrammar = GrammarFactory.eINSTANCE.createGrammar1();
		rootGrammar.setVersion("1.0");
		rootGrammar.setRoot("ROOT");
		de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule rootRule = GrammarFactory.eINSTANCE.createRule();
		rootRule.setId("ROOT");
		rootGrammar.getRule().add(rootRule);
	}

	protected void activate(ComponentContext context) {
		logger = Logger.getLogger(getClass());
		this.context = context;
		modified(context);
	}

	public synchronized void modified(ComponentContext context) {

		boolean configChanged = false;
		String TAG_FORMAT = (String) context.getProperties().get("TAG_FORMAT");
		if (TAG_FORMAT != null && !TAG_FORMAT.equals(converter.TAG_FORMAT)) {
			converter.TAG_FORMAT = TAG_FORMAT;
			configChanged = true;
		}
		GRAMMAR_FILE_SUFFIX = (String) context.getProperties().get("GRAMMAR_FILE_SUFFIX");
		if (GRAMMAR_FILE_SUFFIX != null && !GRAMMAR_FILE_SUFFIX.equals(converter.FILE_SUFFIX)) {
			converter.FILE_SUFFIX = GRAMMAR_FILE_SUFFIX;
			configChanged = true;
		}
		String SUPPORT_FREETEXT = (String) context.getProperties().get("SUPPORT_FREETEXT");
		if (SUPPORT_FREETEXT != null) {
			converter.SUPPORT_FREETEXT = Boolean.parseBoolean(SUPPORT_FREETEXT);
			configChanged = true;
		}
		String language = (String) context.getProperties().get("LANGUAGE");
		if (language != null) {
			LANGUAGE = language;
			configChanged = true;
		}
		if (configChanged) {
			dynamicGrammars.clear();
			grammarMappings.clear();
			refreshGrammars();
		}
	}

	private IResourceManager resourceManager = null;

	public void bindResourceManager(IResourceManager rm) {
		resourceManager = rm;
		resourceManager.addResources("grammars", publishedGrammars);
	}

	public void unbindResourceManager(IResourceManager rm) {
		resourceManager.removeResources("grammars");
		resourceManager = null;
	}

	@Override
	public void addRuleset(Ruleset ruleset) {
		ruleSets.add(ruleset);
		if (ruleset.getLanguage() == null) {
			Logger.getLogger(this.getClass()).warn(String.format("Language for ruleset %s not set!", ruleset.getIdentifier()));
		} else if (ruleset.getLanguage().equals(LANGUAGE)) {
			buildGrammar();
		}
	}

	private void buildGrammar() {
		HashSet<String> enabledUtterances = new HashSet<String>();
		for (Ruleset ruleset : ruleSets) {
			if (ruleset.getLanguage().equals(LANGUAGE)) {
				if (!grammarMappings.containsKey(ruleset)) {
					HashMap<String, Grammar1> newDynamicGrammars = new HashMap<String, Grammar1>();
					Grammar1 grammar = converter.convert(ruleset, newDynamicGrammars);
					grammarMappings.put(ruleset, grammar);
					dynamicGrammars.putAll(newDynamicGrammars);
					// for (String key : dynamicGrammars.keySet()) {
					// sendGrammarUpdate(key, dynamicGrammars.get(key), "");
					// }
				}
				for (Rule rule : ruleset.getRules())
					if (rule instanceof Utterance && rule.isEnabled()) {
						enabledUtterances.add(ruleset.getIdentifier() + converter.FILE_SUFFIX + "#" + rule.getName());
					}
			}
		}

		rootGrammar.setLang(LANGUAGE);
		rootGrammar.setTagFormat(converter.TAG_FORMAT);
		rootGrammar.getRule().get(0).getOneOf().clear();
		rootGrammar.getRule().get(0).getRuleref().clear();
		if (!enabledUtterances.isEmpty()) {
			OneOf oneOf = GrammarFactory.eINSTANCE.createOneOf();
			rootGrammar.getRule().get(0).getOneOf().add(oneOf);
			oneOf.getItem().clear();
			for (String ruleName : enabledUtterances) {
				Item item = GrammarFactory.eINSTANCE.createItem();
				oneOf.getItem().add(item);
				Ruleref ruleRef = GrammarFactory.eINSTANCE.createRuleref();
				ruleRef.setUri(ruleName);
				ruleRef.setType("application/srgs+xml");
				item.getRuleref().add(ruleRef);
				item.getTag().add("out=rules.latest()");
			}
		} else {
			Ruleref ruleref = GrammarFactory.eINSTANCE.createRuleref();
			ruleref.setSpecial(SpecialDatatype.GARBAGE);
			rootGrammar.getRule().get(0).getRuleref().add(ruleref);
		}
	}

	@Override
	public Rule getRule(String rulesetID, String ruleName) throws IllegalArgumentException {
		for (Ruleset ruleSet : grammarMappings.keySet()) {
			if (ruleSet.getIdentifier().equals(rulesetID)) {
				for (Rule rule : ruleSet.getRules()) {
					if (rule.getName().equals(ruleName))
						return rule;
				}
				throw new IllegalArgumentException(String.format("Cannot find rule %s in ruleset %s. Rule does not exist", ruleName, rulesetID));
			}
		}
		throw new IllegalArgumentException(String.format("Cannot find rule %s ins ruleset %s. Ruleset does not exist!", ruleName, rulesetID));
	}

	@Override
	public void disableRule(String rulesetID, String ruleName) {
		try {
			Rule rule = getRule(rulesetID, ruleName);
			if (rule instanceof Utterance)
				if (rule.isEnabled()) {
					rule.setEnabled(false);
					buildGrammar();
				} else {
					logger.warn(String.format("Error disabling rule %s in rulset %s. Rule is already disabled", ruleName, rulesetID));
				}
			else {
				logger.warn(String.format("Error disabling rule %s in rulset %s. Rule is no utterance rule", ruleName, rulesetID));
			}
		} catch (IllegalArgumentException ex) {
			logger.warn(String.format("Error disabling rule:  %s.", ex.getMessage()));
		}
	}

	@Override
	public void enableRule(String rulesetID, String ruleName) {
		try {
			Rule rule = getRule(rulesetID, ruleName);
			if (rule instanceof Utterance)
				if (!rule.isEnabled()) {
					rule.setEnabled(true);
					buildGrammar();
					logger.info(String.format("Enabling rule %s in rulset %s.", ruleName, rulesetID));
				} else {
					logger.info(String.format("Rule %s in rulset %s is already enabled", ruleName, rulesetID));
				}
			else {
				logger.warn(String.format("Error enabling rule %s in rulset %s. Rule is no utterance rule", ruleName, rulesetID));
			}
		} catch (IllegalArgumentException ex) {
			logger.warn(String.format("Error enabling rule: %s.", ex.getMessage()));
		}
	}

	private void sendGrammarUpdate(String key, Grammar1 grammar, String deviceID) {
		DocumentRoot root = GrammarFactory.eINSTANCE.createDocumentRoot();
		root.getXMLNSPrefixMap().put("", GrammarPackage.eNS_URI);
		root.setGrammar(grammar);

		UpdateDeviceMode updateMessage = IoFactory.eINSTANCE.createUpdateDeviceMode();
		updateMessage.setDevice(new BString(deviceID));
		UpdateGrammar grammarUpdate = IoFactory.eINSTANCE.createUpdateGrammar();
		grammarUpdate.setGrammarID(key);
		grammarUpdate.setGrammar(root);
		updateMessage.setDeviceMode(grammarUpdate);

		if ("".equals(deviceID)) {
			publishedGrammars.put(key + GRAMMAR_FILE_SUFFIX, root.getGrammar());
		}

		((DialogPlatformEventManager) context.locateService("DialogPlatformEventManager")).postOutputEvent(updateMessage, this);
	}

	@Override
	public PhraseValueList getDynamicRuleEntities(String rulesetID, String ruleName) {
		PhraseValueList result = null;
		try {
			Rule rule = getRule(rulesetID, ruleName);
			result = new PhraseValueList();
			if (rule instanceof Entity && ((Entity) rule).getType() == EntityType.DYNAMIC) {
				for (PhraseValuePair pair : ((Entity) rule).getEntries()) {
					result.add(pair);
				}
			} else {
				logger.warn(String.format("Error in method getDynamicRuleEntities: Rule %s in ruleset %s is no dynamic entity rule", ruleName, rulesetID));
			}
		} catch (IllegalArgumentException ex) {
			logger.warn(String.format("Error in method getDynamicRuleEntities: %s.", ex.getMessage()));
		}
		return result;
	}

	@Override
	public void setDynamicRuleEntities(String rulesetID, String ruleName, PhraseValueList entities) {
		try {
			Rule rule = getRule(rulesetID, ruleName);
			if (rule instanceof Entity && ((Entity) rule).getType() == EntityType.DYNAMIC) {
				Entity entity = ((Entity) rule);
				entity.getEntries().clear();
				entity.getEntries().addAll(entities);
				Grammar1 grammar1 = converter.convertDynamicGrammarRule(entity, LANGUAGE);
				dynamicGrammars.put(rulesetID + '@' + ruleName, grammar1);
				// sendGrammarUpdate(rulesetID + '@' + ruleName, grammar1, "");
				// sendGrammarUpdate("ROOT", rootGrammar, "");
			} else {
				logger.warn(String.format("Error in method setDynamicRuleEntities: Rule %s in ruleset %s is no dynamic entity rule", ruleName, rulesetID));
			}
		} catch (IllegalArgumentException ex) {
			logger.warn(String.format("Error in method setDynamicRuleEntities: %s.", ex.getMessage()));
		}
	}

	@Override
	public void refreshGrammars() {
		buildGrammar();
		publishedGrammars.clear();
		commit();
	}

	private void sendGrammar(String id) {
		if (!grammarMappings.isEmpty()) {
			for (String key : dynamicGrammars.keySet()) {
				sendGrammarUpdate(key, dynamicGrammars.get(key), id);
			}
			for (Ruleset ruleSet : grammarMappings.keySet()) {
				sendGrammarUpdate(ruleSet.getIdentifier(), grammarMappings.get(ruleSet), id);
			}
			sendGrammarUpdate("ROOT", rootGrammar, id);
		}
	}

	@Override
	public void sendGrammarToDevice(String deviceId) {
		sendGrammar(deviceId);
	}

	@Override
	public void commit() {
		sendGrammar("");
	}

	@Override
	public void enableRuleset(String rulesetID) {
		setRulesetEnabled(rulesetID, true);
	}

	@Override
	public void disableRuleset(String rulesetID) {
		setRulesetEnabled(rulesetID, false);
	}

	private void setRulesetEnabled(String rulesetID, boolean enabled) {
		Ruleset ruleSet = null;
		for (Ruleset r : ruleSets) {
			if (r.getIdentifier().equals(rulesetID)) {
				ruleSet = r;
				break;
			}
		}
		if (ruleSet != null) {
			for (Rule rule : ruleSet.getRules()) {
				rule.setEnabled(enabled);
			}
			logger.info(String.format("%s rulset %s.", enabled ? "Enabling" : "Disabling", rulesetID));
			buildGrammar();
		} else {
			logger.warn(String.format("Error %s ruleset %s. Ruleset does not exist.", rulesetID, enabled ? "enabling" : "disabling"));
		}
	}

	@Override
	public void addEntityToDynamicRule(String rulesetID, String ruleName, String phrase, String value) {
		PhraseValueList result = getDynamicRuleEntities(rulesetID, ruleName);
		if (result != null) {
			if (result.size() == 1 && result.get(0).getPhrase().equals("$GARBAGE") && result.get(0).getValue().equals("null")) {
				result.clear();
			}
			Iterator<PhraseValuePair> iterator = result.iterator();
			while (iterator.hasNext())
				if (iterator.next().getValue().equals(value)) {
					iterator.remove();
					break;
				}
			result.addPhraseValue(phrase, value);
			setDynamicRuleEntities(rulesetID, ruleName, result);
		} else {
			logger.warn(String.format("Cannot add entity to rule %s in ruleset %s", ruleName, rulesetID));
		}
	}

	@Override
	public void clearDynamicRuleEntity(String rulesetID, String ruleName) {
		setDynamicRuleEntities(rulesetID, ruleName, new PhraseValueList());
	}

	@Override
	public void reset() {
		ruleSets.clear();
		dynamicGrammars.clear();
		grammarMappings.clear();
	}
}
