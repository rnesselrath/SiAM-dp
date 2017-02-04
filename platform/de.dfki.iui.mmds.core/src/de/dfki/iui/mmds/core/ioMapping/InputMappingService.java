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

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.event.Event;

import de.dfki.iui.mmds.core.emf.computation.MatchReport;
import de.dfki.iui.mmds.core.emf.computation.MatchReport.MatchResult;
import de.dfki.iui.mmds.core.emf.computation.Matches;
import de.dfki.iui.mmds.core.evaluation.EvaluationService;
import de.dfki.iui.mmds.core.events.DialogPlatformEventManager.PREPROCESSOR_PRIORITY;
import de.dfki.iui.mmds.core.events.InputEventHandler;
import de.dfki.iui.mmds.core.model.io.CustomFormat;
import de.dfki.iui.mmds.core.model.io.Hypothesis;
import de.dfki.iui.mmds.core.model.io.InputAct;
import de.dfki.iui.mmds.core.model.io.InputMessage;
import de.dfki.iui.mmds.core.model.io.InputRepresentation;
import de.dfki.iui.mmds.core.model.json.JSONAbstractObject;
import de.dfki.iui.mmds.core.model.json.JSONParser;
import de.dfki.iui.mmds.core.model.json.JsonFactory;
import de.dfki.iui.mmds.core.model.project.InputMappingRule;
import de.dfki.iui.mmds.core.model.project.InputMappingRules;

public class InputMappingService extends InputEventHandler {

	private final List<InputMappingRule> inputMappings = new ArrayList<InputMappingRule>();
	private SubruleMapper subruleMapper;
	private EvaluationService evaluationService;

	public InputMappingService() {
		setPreprocessor(true, PREPROCESSOR_PRIORITY.EARLY);
	}

	@Override
	protected void activate(ComponentContext context) {
		super.activate(context);
		subscribe("/SIAM-INF/input_mapping_service.pattern");
		evaluationService = ((EvaluationService) componentContext.locateService("EvaluationService"));
		subruleMapper = new SubruleMapper(evaluationService);
	}

	public void registerMappings(InputMappingRules rules) {
		inputMappings.addAll(rules.getRules());
		subruleMapper.registerMappings(rules.getSubrules());
	}

	@Override
	protected void handleEvent(InputMessage input, Event event, MatchReport report) {
		List<InputRepresentation> r = (List<InputRepresentation>) report.variables.get("representation");
		InputAct inputAct = (InputAct) input;
		JSONParser parser = null;
		int i = 0;

		for (InputRepresentation representation : new ArrayList<InputRepresentation>(r)) {
			
			// 0) Define ecore model classes for JSONObject, ...
			// 1) Check if the representation is a CustomFormat and its type is "json"
			if (representation instanceof CustomFormat && ((CustomFormat) representation).getType().equals("json")) {
				if (parser == null) {
					parser = JsonFactory.eINSTANCE.createJSONParser();
				}
				
				// 2) Parse JSON object with json.simple and map to ecore model
				representation = parser.parse(((CustomFormat) representation).getContent().get("json").getValue());
				
				// 3) Replace representation with the new JSONObject / JSONValue
				inputAct.getRepresentation().set(i, representation);
			}
			
			for (InputMappingRule mapping : inputMappings) {
				if (!mapping.isActive())
					continue;
				MatchReport matchReport = Matches.matches(representation, mapping.getCondition());
				if (matchReport.result == MatchResult.MATCH_SUCCESS) {
					Map<String, Object> context = new HashMap<String, Object>(matchReport.variables);
					context.put("Subrules", subruleMapper);

					for (Hypothesis target : mapping.getTarget()) {
						List<EObject> results = evaluationService.evaluateContents(target, context);
						for (EObject result : results)
							if (result instanceof Hypothesis) {
								inputAct.getHypotheses().add((Hypothesis) result);
							}
					}
				}
			}
			
			i++;
		}
	}

}
