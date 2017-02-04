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
package de.dfki.iui.mmds.core.interfaces;

import java.util.ArrayList;

import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesFactory;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseValuePair;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Rule;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Ruleset;

public interface IGrammarManagementService {

	void addRuleset(Ruleset ruleset);

	void disableRule(String rulesetID, String ruleName);

	void enableRule(String rulesetID, String ruleName);

	void enableRuleset(String rulesetID);

	void disableRuleset(String rulesetID);

	PhraseValueList getDynamicRuleEntities(String rulesetID, String ruleName);

	void setDynamicRuleEntities(String rulesetID, String ruleName, PhraseValueList entities);

	void addEntityToDynamicRule(String rulesetID, String ruleName, String phrase, String value);

	void clearDynamicRuleEntity(String rulesetID, String ruleName);

	Rule getRule(String rulesetID, String ruleName) throws IllegalArgumentException;

	void refreshGrammars();

	String getLANGUAGE();

	void sendGrammarToDevice(String siamId);

	void commit();

	void reset();

	public class PhraseValueList extends ArrayList<PhraseValuePair> {

		private static final long serialVersionUID = 1L;

		public void addPhraseValue(String phrase, String value) {
			PhraseValuePair createPhraseValuePair = Grammar_rulesFactory.eINSTANCE.createPhraseValuePair();
			createPhraseValuePair.setPhrase(phrase);
			createPhraseValuePair.setValue(value);
			this.add(createPhraseValuePair);
		}
	}

}