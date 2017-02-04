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
package de.dfki.iui.mmds.core.emf.datatypes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BString extends BDataType<String> {

	public BString() {
	};

	public BString(String input) {
		if (input == null)
			throw new NullPointerException("Input argument must not be <null>");
		Matcher matcher = Pattern.compile("\\$expr\\((.*)\\)").matcher(input);
		if (matcher.matches()) {
			expression = matcher.toMatchResult().group(1);
		} else {
			value = input;
			resolved = true;
		}
	}

	static public BString valueOf(String input) {
		return new BString(input);
	}

	@Override
	public void setValue(String value) {
		{
			BString rhs = BString.valueOf(value);
			this.value = rhs.value;
			this.expression = rhs.expression;
			this.resolved = rhs.resolved;
		}
	}

	public String toLowerCase() {
		return this.getValue().toLowerCase();
	}

	public String toUpperCase() {
		return this.getValue().toUpperCase();
	}

	public boolean isEmpty() {
		return getValue() == null || getValue().isEmpty();
	}

	public static boolean isNullOrEmpty(BString device) {
		return device == null || device.isEmpty();
	}

	public boolean equalsIgnoreCase(BString rhs) {
		if (resolved)
			return value.equalsIgnoreCase(rhs.toString());
		else
			return this.equals(rhs);
	}

	public boolean equalsIgnoreCase(String rhs) {
		if (resolved)
			return value.equalsIgnoreCase(rhs);
		else
			return false;
	}
}
