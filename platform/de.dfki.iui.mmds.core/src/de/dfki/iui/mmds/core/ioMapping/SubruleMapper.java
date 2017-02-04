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
package de.dfki.iui.mmds.core.ioMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.dfki.iui.mmds.core.emf.computation.MatchReport;
import de.dfki.iui.mmds.core.emf.computation.MatchReport.MatchResult;
import de.dfki.iui.mmds.core.emf.computation.Matches;
import de.dfki.iui.mmds.core.evaluation.EvaluationService;
import de.dfki.iui.mmds.core.model.base.BObject;
import de.dfki.iui.mmds.core.model.project.MappingSubRule;

public class SubruleMapper {

	private final EvaluationService evaluationService;

	public SubruleMapper(EvaluationService evaluationService) {
		this.evaluationService = evaluationService;
	}

	private final List<MappingSubRule> subRules = new ArrayList<MappingSubRule>();

	public List<EObject> map(BObject object) {
		List<EObject> result = new ArrayList<EObject>();
		for (MappingSubRule mapping : subRules) {
			if (!mapping.isActive())
				continue;
			MatchReport matchReport = Matches.matches(object, mapping.getCondition());
			if (matchReport.result == MatchResult.MATCH_SUCCESS) {
				Map<String, Object> context = new HashMap<String, Object>(matchReport.variables);
				context.put("Subrules", this);
				for (BObject target : mapping.getTarget()) {
					result.addAll(evaluationService.evaluateContents(target, context));
				}
				break;
			}
		}
		return result;
	}

	public List<EObject> map(List<BObject> list) {
		List<EObject> result = new ArrayList<EObject>();
		for (BObject object : list) {
			result.addAll(map(object));
		}
		return result;
	}

	public void registerMappings(EList<MappingSubRule> mappings) {
		subRules.addAll(mappings);
	}
}
