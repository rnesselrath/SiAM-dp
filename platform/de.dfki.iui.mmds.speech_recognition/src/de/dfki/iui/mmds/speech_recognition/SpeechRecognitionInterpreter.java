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
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.event.Event;

import de.dfki.iui.mmds.core.emf.computation.MatchReport;
import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.evaluation.EvaluationService;
import de.dfki.iui.mmds.core.events.InputEventHandler;
import de.dfki.iui.mmds.core.interfaces.IGrammarManagementService;
import de.dfki.iui.mmds.core.model.io.Hypothesis;
import de.dfki.iui.mmds.core.model.io.InputAct;
import de.dfki.iui.mmds.core.model.io.InputMessage;
import de.dfki.iui.mmds.core.model.io.SpeechHypothesis;
import de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction;
import de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Entity;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Rule;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.SemanticMapping;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Utterance;

public class SpeechRecognitionInterpreter extends InputEventHandler {

	private Ruleset ruleset;
	private IGrammarManagementService grammarService;
	private EvaluationService evaluationService;

	public SpeechRecognitionInterpreter() {
		setPreprocessor(true);
	}

	@Override
	protected void activate(ComponentContext context) {
		super.activate(context);
		grammarService = (IGrammarManagementService) context.locateService("GrammarManagementService");
		evaluationService = ((EvaluationService) componentContext.locateService("EvaluationService"));
		subscribe("SIAM-INF/subscription.pattern");
	}

	public CommunicativeFunction interpretAnswer(SpeechHypothesis hypothesis) {
		return interpretAnswer(hypothesis, null);
	}

	public CommunicativeFunction interpretAnswer(SpeechHypothesis hypothesis, Ruleset rules) {
		EMap<String, BString> tokens = hypothesis.getTokens();
		// ruleset is only used in testcase. otherwise the grammer_service
		// provides the rule
		ruleset = rules;
		CommunicativeFunction interpretation = null;

		if (tokens.get("RULE_ID") != null) {
			String utteranceId = tokens.get("RULE_ID").toString();
			Utterance rule = (Utterance) getRule(utteranceId);
			interpretation = rule.getInterpretation();
			if (interpretation != null && interpretation.getSemanticContent() != null) {
				List<EObject> result = resolveBindings(interpretation, "", hypothesis.getTokens(), rule.getName());

				if (!result.isEmpty()) {
					interpretation = (CommunicativeFunction) result.get(0);
				}
			} else {
				Logger.getLogger(SpeechRecognitionInterpreter.class).warn(String.format("Utterance with id %s has no semantic content", utteranceId));
			}
		}
		return interpretation;
	}

	// resolves bindings in the EObject interpretation. The content of
	// interpretation is not changed
	private List<EObject> resolveBindings(EObject interpretation, String prefix, EMap<String, BString> tokens, String rulename) {
		Map<String, Object> context = new HashMap<String, Object>();
		if (!prefix.isEmpty()) {
			prefix = prefix + '.';
		}

		for (String key : tokens.keySet()) {
			if (key.startsWith(prefix) && key.endsWith("RULE_ID") && key.substring(prefix.length()).split("\\.").length == 2) {
				BString ruleID = tokens.get(key);
				String newPrefix = key.substring(prefix.length()).split("\\.")[0];
				Rule rule = getRule(ruleID.toString());
				if (rule instanceof SemanticMapping) {
					SemanticMapping semanticMapping = (SemanticMapping) rule;
					int index = 0;
					key = key.replace("RULE_ID", "PHRASE_INDEX");
					if (tokens.containsKey(key)) {
						index = Integer.valueOf(tokens.get(key).toString());
					}
					for (SemanticContent content : semanticMapping.getPhraseMappings().get(index).getInterpretation()) {
						List<EObject> contents;
						if (context.containsKey(newPrefix)) {
							contents = (List<EObject>) context.get(newPrefix);
						} else {
							contents = new ArrayList<EObject>();
							context.put(newPrefix, contents);
						}
						contents.addAll(resolveBindings(content, prefix + newPrefix, tokens, rule.getName()));
					}
				} else if (rule instanceof Entity) {
					Entity entity = (Entity) rule;
					context.put(newPrefix, resolveBindings(entity.getInterpretation(), prefix + newPrefix, tokens, rule.getName()));
				}

			} else if (key.startsWith(prefix) && key.endsWith("value") && key.substring(prefix.length()).split("\\.").length == 2) {
				context.put(key.substring(prefix.length()), tokens.get(key).toString());
			}

		}

		if (tokens.containsKey(prefix + "value")) {
			context.put("value", tokens.get(prefix + "value"));
		}

		return evaluationService.evaluateContents(interpretation, context);

		// List<EObject> result = new ArrayList<EObject>();
		// String binding = null;
		// if (interpretation instanceof BObject) {
		// binding = ((BObject) interpretation).getBinding();
		// }
		// if (binding != null && !binding.isEmpty()) {
		// String newPrefix = prefix + (prefix.isEmpty() ? "" : ".") + binding;
		// BString ruleID = tokens.get(newPrefix + ".RULE_ID");
		// if (ruleID == null) {
		// Logger.getLogger(this.getClass()).error(String.format("There is no
		// reference to rule %s in rule %s",
		// binding.substring(1), rulename));
		// } else {
		// // replace instance with binding
		// Rule rule = getRule(ruleID.toString());
		// if (rule == null) {
		// rule = getRule(tokens.get(newPrefix + ".RULE_ID").toString());
		// }
		// if (rule instanceof SemanticMapping) {
		// SemanticMapping semanticMapping = (SemanticMapping) rule;
		// int index = Integer.valueOf(tokens.get(newPrefix +
		// ".PHRASE_INDEX").toString());
		// for (SemanticContent content :
		// semanticMapping.getPhraseMappings().get(index).getInterpretation()) {
		// SemanticContent newContent = EmfUtils.clone(content);
		// result.addAll(resolveBindings(newContent, newPrefix, tokens,
		// rule.getName()));
		//
		// }
		// } else if (rule instanceof Entity) {
		// Entity entity = (Entity) rule;
		// SemanticContent newContent =
		// EmfUtils.clone(entity.getInterpretation());
		// result.add(newContent);
		// result.addAll(resolveBindings(newContent, newPrefix, tokens,
		// rule.getName()));
		// }
		// }
		// } else {
		// List<EObject> contents = new ArrayList<EObject>();
		// contents.addAll(interpretation.eContents());
		// for (int i = 0; i < contents.size(); ++i) {
		// EObject innerObject = contents.get(i);
		// if (innerObject instanceof EObject) {
		// EObject innerResult = resolveBindings(innerObject, prefix, tokens,
		// rulename).get(0);
		//
		// try {
		// EcoreUtil.replace(innerObject, innerResult);
		// // if (innerObject.eContainingFeature().isMany()) {
		// // List<EObject> tempList = ((List<EObject>)
		// // innerObject.eContainer().eGet(innerObject.eContainingFeature()));
		// // tempList.clear();
		// // tempList.add(innerResult);
		// // } else {
		// // }
		// } catch (ClassCastException ex) {
		// Logger.getLogger(this.getClass())
		// .error(String.format("Cannot cast result from subrule %s to feature
		// %s of rule %s",
		// ((BObject) innerObject).getBinding(),
		// innerObject.eContainingFeature().getName(),
		// rulename));
		// }
		// }
		// }
		//
		// // evaluateAttributes
		// for (EAttribute attribute :
		// interpretation.eClass().getEAllAttributes()) {
		// if (attribute.getEType().getInstanceClass().getSuperclass() ==
		// BDataType.class) {
		// if (attribute.isMany()) {
		// EList<BDataType<?>> dataTypes = (EList<BDataType<?>>)
		// interpretation.eGet(attribute, true);
		// for (int i = 0; i < dataTypes.size(); ++i) {
		// BDataType<?> value = dataTypes.get(i);
		// if (value != null && !value.isResolved()) {
		// String newContent = tokens.get(prefix + "." +
		// value.getExpression()).toString();
		// try {
		// dataTypes.set(i,
		// value.getClass().getConstructor(String.class).newInstance(newContent));
		// } catch (InstantiationException | IllegalAccessException |
		// IllegalArgumentException | InvocationTargetException |
		// NoSuchMethodException | SecurityException e) {
		// e.printStackTrace();
		// }
		// }
		// }
		// } else {
		// BDataType<?> value = (BDataType<?>) interpretation.eGet(attribute,
		// true);
		// if (value != null && !value.isResolved())
		// if (value.getExpression().equals("value")) {
		// Object o = tokens.get(prefix + ".value");
		// String newContent = null;
		// if (o == null) {
		// Rule rule = getRule(tokens.get(prefix + ".RULE_ID").toString());
		// if (rule != null && rule instanceof Entity) {
		// EList<PhraseValuePair> entries = ((Entity) rule).getEntries();
		// if (entries.size() == 1) {
		// newContent = ((Entity) rule).getEntries().get(0).getValue();
		// }
		// }
		// } else {
		// newContent = o.toString();
		// }
		// if (newContent != null) {
		// try {
		// interpretation.eSet(attribute,
		// value.getClass().getConstructor(String.class).newInstance(newContent));
		// } catch (InstantiationException | IllegalAccessException |
		// IllegalArgumentException | InvocationTargetException |
		// NoSuchMethodException | SecurityException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// } else {
		// // if an attribute is filled with the value of
		// // an entity rule
		// Object o = tokens.get(value.getExpression() + ".value");
		// if (o != null) {
		// value.setValue(o.toString());
		// } else {
		// Logger.getLogger(getClass()).warn(String.format("Token with name %s
		// does not exist in rule %s",
		// value.getExpression() + ".value", rulename));
		// }
		// }
		// }
		// }
		// }
		// result.add(interpretation);
		// }
	}

	private Rule getRule(String utteranceId) {
		if (ruleset != null) {
			for (Rule rule : ruleset.getRules()) {
				if (rule.getName().equals(utteranceId))
					return rule;
			}
		} else {
			String[] split = utteranceId.split("@");
			return grammarService.getRule(split[0], split[1]);
		}
		return null;
	}

	@Override
	protected void handleEvent(InputMessage content, Event event, MatchReport report) {
		EList<Hypothesis> hypotheses = ((InputAct) content).getHypotheses();
		for (Hypothesis hypothesis : hypotheses) {
			hypothesis.setCommunicativeFunction(interpretAnswer((SpeechHypothesis) hypothesis));
		}
	}
}
