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
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import de.dfki.iui.mmds.core.model.speech_recognition.grammar.GrammarPackage;

enum ABNFNodeType {
	ITEM, ONE_OF, REFERENCE, REPEAT, WEIGHT
};

public class ABNFNode {
	String content;
	ABNFNodeType type;
	List<ABNFNode> children = new ArrayList<ABNFNode>();
	String weight;
	String repeat;
	String repeatProb;
	String variableName;

	static Pattern weightPattern;
	static Pattern repeatPattern;
	static Pattern onlyTextPattern;

	static {
		String weightPatternString = GrammarPackage.eINSTANCE.getWeightDatatype().getEAnnotation("http:///org/eclipse/emf/ecore/util/ExtendedMetaData").getDetails().get("pattern").replace(' ', '|');
		weightPattern = Pattern.compile(weightPatternString);
		String repeatPatternString = GrammarPackage.eINSTANCE.getRepeatDatatype().getEAnnotation("http:///org/eclipse/emf/ecore/util/ExtendedMetaData").getDetails().get("pattern").replace(' ', '|');
		repeatPatternString = "^(?<repeat>" + repeatPatternString + ")\\s*(/(?<prob>" + weightPattern + ")/)?$";
		repeatPattern = Pattern.compile(repeatPatternString);
		onlyTextPattern = Pattern.compile("^[A-Za-z ]+$");
	}

	public ABNFNode(ABNFNodeType type, String content, Boolean tokenize) {
		this.content = content.trim();
		this.type = type;
		if (tokenize) {
			tokenize();
		}

	}

	public ABNFNode(ABNFNodeType type, String content) {
		this(type, content, true);
	}

	public void tokenize() {
		int start_pos = 0;
		int i;
		for (i = 0; i < content.length(); ++i) {
			switch (content.charAt(i)) {
			case '(': // sequence
				parseEndSnippet(start_pos, i);
				start_pos = i + 1;
				int brackets = 1;
				int j;
				for (j = start_pos; j < content.length() && brackets > 0; ++j) {
					if (content.charAt(j) == '(') {
						brackets++;
					} else if ((content.charAt(j) == ')')) {
						brackets--;
					}
				}
				if (brackets > 0)
					throw new IllegalArgumentException("Missing closing bracket in: " + content);
				else {
					children.add(new ABNFNode(ABNFNodeType.ITEM, content.substring(start_pos, j - 1)));
				}
				start_pos = j;
				i = j - 1;
				break;
			case '|': // or
				type = ABNFNodeType.ONE_OF;
				parseEndSnippet(start_pos, i);
				if (children.size() == 0)
					throw new GrammarParsingException("Empty Alternative in: " + content);
				String weight = null;
				// verarbeite gewichtung für linke seite
				if (children.get(0).type == ABNFNodeType.WEIGHT) {
					String weightContent = children.get(0).content.substring(0, children.get(0).content.length());
					Matcher matcher = weightPattern.matcher(weightContent);
					if (!matcher.matches())
						throw new IllegalArgumentException("Weight pattern not valid: " + weightContent);
					weight = weightContent;
					children.remove(0);
				}
				// fasse linke seite zusammen, wenn mehrere nodes vorhanden oder
				// nicht item
				if (children.size() > 1 || children.get(0).type != ABNFNodeType.ITEM) {
					ABNFNode node = new ABNFNode(ABNFNodeType.ITEM, content.substring(0, i), false);
					node.children.addAll(children);
					children.clear();
					children.add(node);
				}
				children.get(0).weight = weight;
				// verarbeite rechte seite
				ABNFNode rightSide = new ABNFNode(ABNFNodeType.ITEM, content.substring(i + 1));
				children.add(rightSide);
				if (rightSide.children.size() > 1 && rightSide.children.get(0).type == ABNFNodeType.WEIGHT) {
					String weightContent = rightSide.children.get(0).content.substring(0, rightSide.children.get(0).content.length());
					Matcher matcher = weightPattern.matcher(weightContent);
					if (!matcher.matches())
						throw new IllegalArgumentException("Weight pattern not valid: " + weightContent);
					rightSide.children.remove(0);
					rightSide.weight = weightContent;
				}
				start_pos = i = content.length();
				break;
			case '$': // reference to other rules
				parseEndSnippet(start_pos, i);
				start_pos = i + 1;
				for (j = start_pos;; ++j) {
					if (j >= content.length()) {
						break;
					}
					char c = content.charAt(j);
					if (!(Character.isAlphabetic(c) || Character.isAlphabetic(c) || c == '_' || c == '=' || c == '#')) {
						break;
					}
				}
				String[] splitters = content.substring(start_pos, j).split("=");

				ABNFNode abnfNode = new ABNFNode(ABNFNodeType.REFERENCE, splitters[0], false);
				children.add(abnfNode);
				if (splitters.length > 1) {
					abnfNode.variableName = splitters[1];
				}

				start_pos = i = j;
				--i;
				break;
			case '<':
				String sub = content.substring(start_pos, i).trim();
				Matcher matcher = onlyTextPattern.matcher(sub);
				if (matcher.matches() && sub.contains(" ")) {
					int lastIndex = sub.lastIndexOf(" ");
					children.add(new ABNFNode(ABNFNodeType.ITEM, sub.substring(0, lastIndex)));
					children.add(new ABNFNode(ABNFNodeType.ITEM, sub.substring(lastIndex + 1)));
				} else {
					parseEndSnippet(start_pos, i);
				}
				start_pos = i + 1;
				for (j = start_pos; j < content.length() && content.charAt(j) != '>'; ++j) {
					;
				}
				if (j == content.length())
					throw new IllegalArgumentException("Missing closing bracket in: " + content);
				else {
					children.add(new ABNFNode(ABNFNodeType.REPEAT, content.substring(start_pos - 1, j + 1), false));
					start_pos = j + 1;
					i = j;
				}
				break;
			case '/': // weight for a rule
				parseEndSnippet(start_pos, i);
				start_pos = i + 1;
				for (j = start_pos; j < content.length() && content.charAt(j) != '/'; ++j) {
					;
				}
				if (j == content.length())
					throw new IllegalArgumentException("Missing closing slash in: " + content);
				else {
					children.add(new ABNFNode(ABNFNodeType.WEIGHT, content.substring(start_pos, j), false));
					start_pos = j + 1;
					i = j;
				}

				break;

			case '[':
				parseEndSnippet(start_pos, i);
				start_pos = i + 1;
				brackets = 1;

				for (j = start_pos; j < content.length() && brackets > 0; ++j) {
					if (content.charAt(j) == '[') {
						brackets++;
					} else if ((content.charAt(j) == ']')) {
						brackets--;
					}
				}
				if (brackets > 0)
					throw new IllegalArgumentException("Missing closing bracket in: " + content);
				else {
					children.add(new ABNFNode(ABNFNodeType.ITEM, content.substring(start_pos, j - 1)));
					children.get(children.size() - 1).repeat = "0-1";
					start_pos = j + 1;
					i = j;
				}

				break;
			default:
			}
		}
		// verarbeite Rest bis zum String-Ende
		if (start_pos > 0 && i - 1 > start_pos && !content.substring(start_pos, i).trim().isEmpty()) {
			children.add(new ABNFNode(ABNFNodeType.ITEM, content.substring(start_pos, i)));
		}
	}

	private void parseEndSnippet(int start_pos, int i) {
		if (i > start_pos) {
			String sub = content.substring(start_pos, i).trim();
			if (!sub.isEmpty()) {
				children.add(new ABNFNode(ABNFNodeType.ITEM, sub));
			}
		}
	}

	public void postProcess() {
		for (int i = 0; i < children.size(); ++i) {
			children.get(i).postProcess();
		}
		// verarbeite repeat und weight
		for (int i = 0; i < children.size(); ++i) {
			if (children.get(i).type == ABNFNodeType.REPEAT) {
				String repeatContent = children.get(i).content.substring(1, children.get(i).content.length() - 1);
				Matcher matcher = repeatPattern.matcher(repeatContent);
				if (!matcher.matches())
					throw new IllegalArgumentException("Repeat pattern not valid: " + repeatContent);
				ABNFNode contentItem = children.get(i - 1);
				if (contentItem.type == ABNFNodeType.ITEM) {
					contentItem.repeat = matcher.group("repeat");
					contentItem.repeatProb = matcher.group("prob");
				} else {
					ABNFNode newItem = new ABNFNode(ABNFNodeType.ITEM, contentItem.content + children.get(i).content, false);

					newItem.repeat = matcher.group("repeat");
					newItem.repeatProb = matcher.group("prob");
					newItem.children.add(contentItem);
					children.set(i - 1, newItem);
				}
				children.remove(i);
			}
		}
		// führe verschachtelte Alternativen zusammen
		if (type == ABNFNodeType.ONE_OF && children.get(1).type == ABNFNodeType.ONE_OF) {
			children.addAll(children.get(1).children);
			children.remove(1);
			// ersetzte doppeltes ITEM durch einfaches
		} else if (type == ABNFNodeType.ITEM && children.size() == 1 && children.get(0).type == ABNFNodeType.ITEM) {
			children.addAll(children.get(0).children);
			content = children.get(0).content;
			type = children.get(0).type;
			repeat = children.get(0).repeat;
			repeatProb = children.get(0).repeatProb;
			children.remove(0);
		}
	}
}
