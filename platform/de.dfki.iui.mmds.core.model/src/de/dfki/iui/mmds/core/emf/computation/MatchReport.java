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
package de.dfki.iui.mmds.core.emf.computation;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;

import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.model.pattern.PPattern;

public class MatchReport {
	public Object instance;
	public PPattern pattern;
	public MatchResult result;
	String reason;

	public String getReason() {
		String result = reason;
		if (result.contains("$object")) {
			if (instance instanceof EObject) {
				result = result.replaceAll("\\$object", EmfPersistence.writeToString((EObject) instance));
			} else {
				result = result.replaceAll("\\$object", instance.toString());
			}
		}
		if (result.contains("$pattern")) {
			result = result.replaceAll("\\$pattern", EmfPersistence.writeToString(pattern));
		}
		return result;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public HashMap<String, Object> variables = new HashMap<String, Object>();

	public MatchReport(Object instance, PPattern pattern) {
		this.instance = instance;
		this.pattern = pattern;
	}

	public enum MatchResult {
		AND_FAILED, OR_FAILED, NOT_FAILED, NOT_VALIDATED, MATCH_SUCCESS, NO_COMMON_LEAST_UPPER_BOUND, FEATURE_NOT_SET, VALUE_MATCH_FAILED, MULTI_FEATURE_MATCH_FAILED, ILLEGAL_PATTERN, FEATURE_NOT_EMPTY, NOT_EXISTS_FAILED, FOR_ALL_FAILED
	}

}
