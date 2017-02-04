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
package de.dfki.iui.mmds.dialogue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.scxml.Context;
import org.apache.commons.scxml.SCXMLExpressionException;
import org.apache.commons.scxml.env.jexl.JexlContext;
import org.apache.commons.scxml.env.jexl.JexlEvaluator;
import org.apache.commons.scxml.model.Log;
import org.apache.commons.scxml.model.Transition;
import org.apache.commons.scxml.model.TransitionTarget;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.dfki.iui.mmds.core.emf.computation.MatchReport;
import de.dfki.iui.mmds.core.emf.computation.MatchReport.MatchResult;
import de.dfki.iui.mmds.core.emf.computation.Matches;
import de.dfki.iui.mmds.core.emf.datatypes.BString;
import de.dfki.iui.mmds.core.model.dialogue.Variable;
import de.dfki.iui.mmds.core.model.pattern.PPattern;
import de.dfki.iui.mmds.core.model.pattern.PRestriction;
import de.dfki.iui.mmds.core.model.pattern.PStringRestriction;
import de.dfki.iui.mmds.scxml.engine.events.SCXMLListener;

public class SiamEvaluator extends JexlEvaluator implements SCXMLListener {

	private static final long serialVersionUID = -3210516063791954547L;
	SiamStateMachine siamStateMachine;
	private boolean delayed = false;
	
	/**
	 * This context is set when some Jexl expression is evaluated so that if "SIAM.evaluateContents" is called
	 * the context is available. Using "siamStateMachine.getCurrentContext().getVars()" in "SIAM.evaluateContents"
	 * can result in an error if the current active states are not set yet, e.g. in onEntry of the Root state.
	 */
	private JexlContext currentJexlCtx;

	public SiamEvaluator(SiamStateMachine siamStateMachine) {
		this.siamStateMachine = siamStateMachine;
	}

	public boolean isDelayed() {
		return delayed;
	}

	@Override
	public Context newContext(Context parent) {
		return new SiamContext(parent);
	}

	Map<String, Map<String, Object>> variableCache = new HashMap<String, Map<String, Object>>();

	public boolean unifies(PPattern pattern, String transitionId, String event) {

		try {
			pattern = resolveJexlExpressions(pattern);
		} catch (SCXMLExpressionException e1) {
			Logger.getLogger(getClass()).warn(e1.getLocalizedMessage());
			return false;
		}
		MatchReport matchReport = Matches.matches(((HashMap<String, ?>) siamStateMachine.getEngine().getRootContext().get("_eventdatamap")).get(event), pattern);
		// save variables in cache. they are needed in onTransition if the
		// tranisition is actually fired
		if (matchReport.result == MatchResult.MATCH_SUCCESS) {
			if (!variableCache.containsKey(transitionId)) {
				variableCache.put(transitionId, matchReport.variables);
			} else {
				variableCache.get(transitionId).putAll(matchReport.variables);
			}
			return true;
		} else
			return false;
	}
	
	/**
	 * Evaluates the contents of the given instance. All $expr expressions will be evaluated.
	 * 
	 * @param inst
	 * @return
	 */
	public EObject evaluateContents(EObject inst) {
		return DialogueComponent.INSTANCE.evaluationService.evaluateContents((EObject) inst, currentJexlCtx.getVars()).get(0);
	}
	
	public boolean unifies(Object inst, PPattern pattern, String transitionId) {
		Context currentContext = siamStateMachine.getCurrentContext();
		if (inst instanceof String) {
			try {
				inst = eval(currentContext, (String) inst);
			} catch (SCXMLExpressionException e) {
				Logger.getLogger(getClass()).warn(e.getLocalizedMessage());
			}
		} else if (inst instanceof EObject) {
			List<EObject> res = DialogueComponent.INSTANCE.evaluationService.evaluateContents((EObject) inst, currentContext.getVars());
			if (res.isEmpty()) {
				return false;
			}
			inst = res.get(0);
		}

		try {
			pattern = resolveJexlExpressions(pattern);
		} catch (SCXMLExpressionException e1) {
			Logger.getLogger(getClass()).warn(e1.getLocalizedMessage());
			return false;
		}
		
		MatchReport matchReport = Matches.matches(inst, pattern);
		if (matchReport.result == MatchResult.MATCH_SUCCESS) {
			if (!variableCache.containsKey(transitionId)) {
				variableCache.put(transitionId, matchReport.variables);
			} else {
				variableCache.get(transitionId).putAll(matchReport.variables);
			}
			return true;
		} else {
			return false;
		}
	}

	// TODO expression konzept abschaffen, auslagern auf value und zentral
	// auswerten?
	private PPattern resolveJexlExpressions(PPattern pattern) throws SCXMLExpressionException {
		Context currentContext = siamStateMachine.getCurrentContext();
		PPattern patternClone = EcoreUtil.copy(pattern);
		TreeIterator<EObject> it = patternClone.eAllContents();
		while (it.hasNext()) {
			EObject next = it.next();
			if (next instanceof PRestriction && ((PRestriction) next).getExpression() != null && !((PRestriction) next).getExpression().isEmpty()) {
				Object result = eval(currentContext, ((PRestriction) next).getExpression());
				if (result == null)
					throw new SCXMLExpressionException("Cannot resolve expression: " + ((PRestriction) next).getExpression());
				try {
					// TODO alle Datentypen unterstützen
					if (next instanceof PStringRestriction) {
						((PRestriction) next).setValue(new BString(result.toString()));
					}
				} catch (ClassCastException ex) {
					throw new SCXMLExpressionException(String.format("Cannot cast result of expression %s, which is of type %s, to value of restriction with type %s.",
							((PRestriction) next).getExpression(), result.getClass().toString(), ((PRestriction) next).eClass().getName()));
				}

			}
		}
		return patternClone;
	}

	// TODO prüfen, scheint in manchen situationen einen deadlock zu geben?
	public void delay(long milliseconds) {
		try {
			delayed = true;
			Thread.sleep(milliseconds);
			delayed = false;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getUUID() {
		return UUID.randomUUID().toString();
	}

	@Override
	public void onTransition(TransitionTarget from, TransitionTarget to, Transition transition) {
		// save variables of firing transition to context that were filled
		// during transition pattern matching process
		Context currentContext = siamStateMachine.getCurrentContext();
		Log log = (Log) transition.getActions().get(0);
		String transitionId = log.getLabel();
		if (variableCache.containsKey(transitionId)) {
			Map<String, Object> variables = variableCache.get(transitionId);
			// set context variables
			for (String key : variables.keySet()) {
				Variable variable = (Variable) currentContext.get("_variable$" + key);
				if (variable == null) {
					Logger.getLogger(this.getClass())
							.warn(String.format("In transition \'%s': Variable \"%s\" is not defined for scope of state \"%s\"", transitionId, key, currentContext.get("stateID")));
				} else {
					try {
						currentContext.set(key, variables.get(key));
					} catch (IllegalArgumentException ex) {
						Logger.getLogger(getClass()).warn(String.format("In transition \'%s': %s", transitionId, ex.getLocalizedMessage()));
					}
				}

			}
		}
		variableCache.remove(transitionId);
	}

	@Override
	public void onEntry(TransitionTarget state) {
		// nothing
	}

	@Override
	public void onExit(TransitionTarget state) {
		// nothing
	}

	@Override
	public void onStable() {
		// nothing
	}
	
	@Override
	public Object eval(final Context ctx, final String expr) throws SCXMLExpressionException {
		if (expr == null)
			return null;
		currentJexlCtx = getEffectiveContext((JexlContext) ctx);
		Object result = DialogueComponent.INSTANCE.evaluationService.eval(currentJexlCtx.getVars(), expr);
		currentJexlCtx = null;
		return result;
	}

	@Override
	public Boolean evalCond(Context ctx, String expr) throws SCXMLExpressionException {
		if (expr == null)
			return null;
		currentJexlCtx = getEffectiveContext((JexlContext) ctx);
		Object result = DialogueComponent.INSTANCE.evaluationService.eval(currentJexlCtx.getVars(), expr);
		currentJexlCtx = null;
		return (Boolean) result;
	}

	JexlContext getTheEffectiveContext(JexlContext ctx) {
		return super.getEffectiveContext(ctx);
	}
}
