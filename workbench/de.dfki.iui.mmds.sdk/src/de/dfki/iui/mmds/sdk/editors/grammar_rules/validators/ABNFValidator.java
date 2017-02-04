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
package de.dfki.iui.mmds.sdk.editors.grammar_rules.validators;

import java.util.Stack;

import org.eclipse.jface.viewers.ICellEditorValidator;

/**
 * this class implements the ICellEditorValidator and is used to validate the
 * phrases in the Editor that I designed for editing Grammar rules
 * 
 * @author Evica Ilieva
 *
 */
public class ABNFValidator implements ICellEditorValidator {

	@Override
	/**
	 * the isValid method takes as an input the object being edited at the moment,
	 * and returns the error message if something is wrong, otherwise it returns null.
	 * The validation is performed according to the rules in
	 * 
	 * http://www.w3.org/TR/speech-grammar/#S2.3
	 * 
	 * 
	 * @param value
	 */
	public String isValid(Object value) {
		Stack<Character> theStack = new Stack<Character>();
		String input = (String) value;
		String errorMessage = "";
		int countQuotes = 0;
		boolean result = true;
		boolean checkedAlternative = false;
		if (input.trim().length() == 0)
			return "Error: empty string is not allowed";
		for (int j = 0; j < input.length(); j++) {
			char ch = input.charAt(j);
			switch (ch) {
			case '$':
				if (!checkRefference(input)) {
					errorMessage = "Error in reference at position " + j;
					result = false;
				}
				break;
			case '|':
				if (!checkedAlternative) {
					if (!checkAlternatives(input)) {
						errorMessage = "Error in alternatives";
						result = false;
					}
					checkedAlternative = true;
				}
				break;
			case '<':
				theStack.push(ch); // push them
				if (!(input.charAt(j - 1) == '$')) {
					int endPosition = input.indexOf(">");
					if (endPosition != -1) {
						if (checkRepeat(input.substring(j, endPosition + 1))) {
							j = endPosition - 1;
						} else {
							errorMessage = "Error in repeat at position " + j;
							result = false;
						}
					} else {
						result = false;
					}
				}
				break;
			case '"':
				countQuotes = countQuotes + 1;
				break;
			case '{':
			case '[':
			case '(':
				theStack.push(ch); // push them
				break;

			case '}':
			case ']':
			case ')':
			case '>':
				if (!theStack.isEmpty()) // if stack not empty,
				{
					char chx = theStack.pop(); // pop and check
					if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[') || (ch == ')' && chx != '(') || (ch == '>' && chx != '<')) {
						errorMessage = "Error in brackets at position " + j;
						return errorMessage;
					}
				} else {
					errorMessage = "Error in brackets at position " + j;
					result = false;
				}
			default:
				break;
			}
		}
		if (!theStack.isEmpty()) {
			result = false;
			errorMessage = "Error in brackets - missing right delimiter ";
		}
		if (!(countQuotes % 2 == 0)) {
			errorMessage = "Error in quotes ";
			result = false;
		}
		if (!result)
			return errorMessage;
		return null;
	}

	private boolean checkAlternatives(String input) {
		boolean result = true;
		// System.out.println(input);
		int positionAt = input.indexOf("|");
		if (input.trim().endsWith("|"))
			return false;
		if (positionAt != -1) {
			String[] splits = input.split("\\|");
			for (int i = 0; i < splits.length; i++) {
				// System.out.println("Splits: "+splits[i]);
				// System.out.println("first condition"+splits[i].trim().equals(""));
				// System.out.println("second condition:"+!splits[i].matches("(.*)(.*\\w+.*)|\\(\\s*\\)(.*)"));
				if (splits[i].trim().equals("") || !splits[i].matches("(.*)(.*\\w+.*)|\\(\\s*\\)(.*)"))
					return false;
			}
		}
		return result;
	}

	private boolean checkRepeat(String input) {
		boolean result = false;
		// System.out.println("input:"+input);
		String repeatValue = input.substring(1, input.length() - 1);
		// System.out.println("repeatValue:"+repeatValue);
		if (repeatValue.contains("/")) {

			int startIndex = repeatValue.indexOf("/");
			int endIndex = repeatValue.indexOf("/", startIndex + 1) + 1;
			// System.out.println("startIndex:"+startIndex);
			// System.out.println("endIndex:"+endIndex);

			String weightString = repeatValue.substring(startIndex, endIndex);
			result = checkWeights(weightString);
			if (!result)
				return false;
			repeatValue = repeatValue.replace(weightString, "");
		}
		return repeatValue.trim().matches("([0-9]+-[1-9]+)|([0-9]+)|([0-9]+-)|(0-1)");
	}

	private boolean checkRefference(String input) {
		// TODO dat is quatsch
		boolean result = false;
		int positionAt = input.indexOf("$");
		while (positionAt != -1) {
			positionAt = positionAt + 1;
			if (positionAt + 1 >= input.length())
				return false;
			result = input.substring(positionAt, positionAt + 1).matches("[a-z]|[A-Z]|<");
			if (!result)
				return result;
			positionAt = input.indexOf("$", positionAt);
		}
		return result;
	}

	private boolean checkWeights(String input) {
		String[] splits = input.split("/");
		if (splits.length != 2)
			return false;
		else
			return splits[1].matches("([0-9]*\\.[0-9]+)|([0-9]+)|(([0-9]+\\.[0-9].))");
	}

}
