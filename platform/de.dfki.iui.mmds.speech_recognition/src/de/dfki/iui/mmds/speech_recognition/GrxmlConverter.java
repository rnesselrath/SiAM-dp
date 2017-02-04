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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Grammar1;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarFactory;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Item;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.OneOf;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.Ruleref;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.ScopeDatatype;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar.SpecialDatatype;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Entity;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.EntityType;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesFactory;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseMapping;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseValuePair;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Rule;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.SemanticMapping;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Utterance;

public class GrxmlConverter {

	boolean SUPPORT_FREETEXT;
	String TAG_FORMAT;
	String FILE_SUFFIX;
	private final Set<Ruleref> ruleRefs = new HashSet<Ruleref>();;

	public GrxmlConverter(String tagFormat, String fileSuffix, boolean supportFreetext) {
		SUPPORT_FREETEXT = supportFreetext;
		TAG_FORMAT = tagFormat;
		FILE_SUFFIX = fileSuffix;
	}

	public Grammar1 convert(Ruleset ruleset, HashMap<String, Grammar1> dynamicGrammars) {
		// TODO
		// Validator.validateObject(ruleset, Logger.getLogger(this.getClass()));
		ruleRefs.clear();
		Grammar1 grammar = GrammarFactory.eINSTANCE.createGrammar1();
		grammar.setVersion("1.0");
		grammar.setLang(ruleset.getLanguage());
		grammar.setTagFormat(TAG_FORMAT);
		if (ruleset.getIdentifier() == null) {
			Logger.getLogger(getClass()).error("Missing identifier in grammar ruleset");
			throw new NullPointerException("Missing identifier in grammar ruleset");
		}

		for (Rule rule : ruleset.getRules()) {

			if (rule instanceof Entity && ((Entity) rule).getType() == EntityType.DYNAMIC) {
				dynamicGrammars.put(ruleset.getIdentifier() + "@" + rule.getName(), convertDynamicGrammarRule((Entity) rule, ruleset.getLanguage()));
			} else {
				de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule newRule = convert(rule);
				grammar.getRule().add(newRule);
			}
		}

		// repair rulerefs to dynamic grammars
		for (String key : dynamicGrammars.keySet())
			if (!key.equals(ruleset.getIdentifier())) {
				String[] split = key.split("@");
				String grammarName = split[split.length - 1];
				for (Ruleref ref : ruleRefs)
					if (ref.getUri().equals('#' + grammarName)) {
						ref.setUri(key + FILE_SUFFIX + ref.getUri());
						ref.setType("application/srgs+xml");
					}
			}
		return grammar;
	}

	public Grammar1 convertDynamicGrammarRule(Entity rule, String language) {
		Grammar1 dynamic_grammar = GrammarFactory.eINSTANCE.createGrammar1();
		dynamic_grammar.setVersion("1.0");
		dynamic_grammar.setLang(language);
		dynamic_grammar.setTagFormat(TAG_FORMAT);
		de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule newRule = convert(rule);
		dynamic_grammar.getRule().add(newRule);
		return dynamic_grammar;
	}

	private de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule convert(Rule rule) {
		de.dfki.iui.mmds.core.model.speech_recognition.grammar.Rule newRule = GrammarFactory.eINSTANCE.createRule();
		if (rule.getName() == null || rule.getName().isEmpty()) {
			Logger.getLogger(getClass()).warn(String.format("No name defined for a grammar rule. Rule skipped!"));
			return null;
		}
		newRule.setScope(ScopeDatatype.PUBLIC);
		newRule.setId(rule.getName());
		newRule.getTag().add("out.RULE_ID=\"" + ((Ruleset) rule.eContainer()).getIdentifier() + '@' + rule.getName() + "\"");
		newRule.getTag().add("out.text= meta.current().text");
		newRule.getTag().add("out.score= meta.current().score");
		if (rule instanceof Utterance) {
			List<EObject> mappings = new ArrayList<EObject>();
			EList<String> phrases = ((Utterance) rule).getPhrases();
			if (phrases.size() == 0) {
				Logger.getLogger(getClass()).warn(String.format("No phrases defined for grammar rule %s. Rule skipped!", ((Utterance) rule).getPhrases()));
				return null;
			}
			List<EObject> items = new ArrayList<EObject>();
			for (String phrase : phrases) {
				EObject item = compileUtterance(phrase, rule.getName());
				items.add(item);
			}
			if (items.size() == 1) {
				mappings.add(items.get(0));
			} else if (items.size() > 1) {
				OneOf oneOf = GrammarFactory.eINSTANCE.createOneOf();
				mappings.add(oneOf);
				for (EObject item : items)
					if (item instanceof Item) {
						oneOf.getItem().add((Item) item);
					} else if (item instanceof OneOf) {
						EList<Item> item2 = ((OneOf) item).getItem();
						oneOf.getItem().addAll(item2);
					} else
						throw new IllegalStateException("WTF?");
			}
			if (mappings.get(0) instanceof Item) {
				newRule.getItem().add((Item) mappings.get(0));
			} else if (mappings.get(0) instanceof OneOf) {
				newRule.getOneOf().add((OneOf) mappings.get(0));
			} else
				throw new IllegalStateException("WTF?");
		} else if (rule instanceof Entity) {

			EList<PhraseValuePair> entries = ((Entity) rule).getEntries();
			if (entries.isEmpty()) {
				PhraseValuePair phraseValuePair = Grammar_rulesFactory.eINSTANCE.createPhraseValuePair();
				phraseValuePair.setPhrase("$GARBAGE");
				phraseValuePair.setValue("null");
				entries.add(phraseValuePair);
			}

			OneOf oneOf = GrammarFactory.eINSTANCE.createOneOf();
			for (PhraseValuePair pair : ((Entity) rule).getEntries()) {
				Item item = null;
				EObject o = compileUtterance(pair.getPhrase(), rule.getName());
				if (o instanceof Item) {
					item = (Item) o;
				} else if (o instanceof OneOf) {
					item = GrammarFactory.eINSTANCE.createItem();
					item.getOneOf().add((OneOf) o);
				} else
					throw new IllegalStateException("WTF?");
				item.getTag().add(String.format("out.value = '%s';", pair.getValue()));
				oneOf.getItem().add(item);
			}
			if (oneOf.getItem().size() > 1) {
				newRule.getOneOf().add(oneOf);
			} else {
				newRule.getItem().add(oneOf.getItem().get(0));
			}

		} else if (rule instanceof SemanticMapping) {
			List<Item> mappings = new ArrayList<Item>();
			for (int i = 0; i < ((SemanticMapping) rule).getPhraseMappings().size(); ++i) {
				PhraseMapping phraseMapping = ((SemanticMapping) rule).getPhraseMappings().get(i);
				List<EObject> items = new ArrayList<EObject>();
				for (String phrase : phraseMapping.getPhrases()) {
					EObject item = compileUtterance(phrase, rule.getName());
					items.add(item);
				}
				Item newItem = GrammarFactory.eINSTANCE.createItem();
				if (items.size() == 1) {
					if (items.get(0) instanceof Item) {
						newItem = (Item) items.get(0);
					} else {
						newItem.getOneOf().add((OneOf) items.get(0));
					}
				} else if (items.size() > 1) {
					OneOf oneOf = GrammarFactory.eINSTANCE.createOneOf();
					newItem.getOneOf().add(oneOf);
					for (EObject item : items)
						if (item instanceof Item) {
							oneOf.getItem().add((Item) item);
						} else if (item instanceof OneOf) {
							EList<Item> item2 = ((OneOf) item).getItem();
							oneOf.getItem().addAll(item2);
						} else
							throw new IllegalStateException("WTF?");
				}
				newItem.getTag().add(String.format("out.PHRASE_INDEX = '%d';", i));
				mappings.add(newItem);
			}

			if (mappings.size() == 1) {
				newRule.getItem().add(mappings.get(0));
			} else if (mappings.size() > 1) {
				OneOf oneOf = GrammarFactory.eINSTANCE.createOneOf();
				newRule.getOneOf().add(oneOf);
				for (Item item : mappings) {
					oneOf.getItem().add(item);
				}
			}
		}
		return newRule;
	}

	private EObject compileUtterance(String utterance, String rulename) {
		String abnf = utterance.replaceAll("\\s{2,}", " ");
		abnf = abnf.replaceAll(" =", "=");
		abnf = abnf.replaceAll("= ", "=");
		abnf = abnf.replaceAll("\\?", "<0-1>");
		abnf = abnf.replaceAll("\\*", "<0->");
		abnf = abnf.replaceAll("\\+", "<1->");
		ABNFNode rootNode = new ABNFNode(ABNFNodeType.ITEM, abnf);
		rootNode.postProcess();
		return parseNode(rootNode, rulename);

	}

	private EObject parseNode(ABNFNode node, String rulename) {
		if (node.type == ABNFNodeType.ITEM) {
			Item item = GrammarFactory.eINSTANCE.createItem();
			if (node.children.size() == 0) {
				item.getMixed().add(FeatureMapUtil.createTextEntry(node.content));
			} else {
				for (ABNFNode childNode : node.children)
					if (childNode.type == ABNFNodeType.ITEM) {
						item.getItem().add((Item) parseNode(childNode, rulename));
					} else if (childNode.type == ABNFNodeType.ONE_OF) {
						item.getOneOf().add((OneOf) parseNode(childNode, rulename));
					} else if (childNode.type == ABNFNodeType.REFERENCE) {
						item.getRuleref().add((Ruleref) parseNode(childNode, rulename));
						if (childNode.variableName != null && !childNode.variableName.isEmpty()) {
							item.getTag().add(String.format("out.%s = rules.latest();", childNode.variableName, childNode.content));
						} else if (childNode.content.equals("FREETEXT")) {
							item.getTag().add("out.UseDictation = 1");
						} else if (!childNode.content.equals("GARBAGE")) {
							item.getTag().add(String.format("out.%s = rules.latest();", childNode.content.replace("#", "__"), childNode.content));
						}

					}
			}
			if (node.weight != null) {
				item.setWeight(node.weight);
			}
			if (node.repeat != null) {
				item.setRepeat(node.repeat);
			}
			if (node.repeatProb != null) {
				item.setRepeatProb(BigDecimal.valueOf(Double.valueOf(node.repeatProb)));
			}
			return item;
		} else if (node.type == ABNFNodeType.ONE_OF) {
			OneOf oneOf = GrammarFactory.eINSTANCE.createOneOf();
			for (ABNFNode childNode : node.children)
				if (childNode.type == ABNFNodeType.ITEM) {
					oneOf.getItem().add((Item) parseNode(childNode, rulename));
				} else
					throw new IllegalStateException("Element of OneOf must be an item and not " + childNode.type.name() + " in " + node.content);
			return oneOf;
		} else if (node.type == ABNFNodeType.REFERENCE) {
			Ruleref ruleRef = GrammarFactory.eINSTANCE.createRuleref();
			if (SpecialDatatype.getByName(node.content) != null) {
				ruleRef.setSpecial(SpecialDatatype.valueOf(node.content));
			} else if (node.content.equals("FREETEXT")) {
				ruleRef.setSpecial(SpecialDatatype.valueOf("GARBAGE"));
			} else {
				if (node.content.contains("#"))
					ruleRef.setUri(node.content);
				else
					ruleRef.setUri("#" + node.content);
				ruleRefs.add(ruleRef);
			}
			return ruleRef;
		} else
			throw new IllegalStateException("Unknown node type " + node.type.name());
	}
}
