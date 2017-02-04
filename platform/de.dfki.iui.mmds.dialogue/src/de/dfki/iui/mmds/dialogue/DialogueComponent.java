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

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.commons.scxml.Context;
import org.apache.commons.scxml.SCXMLExpressionException;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EDataType;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.event.Event;

import de.dfki.iui.mmds.core.emf.computation.MatchReport;
import de.dfki.iui.mmds.core.evaluation.EvaluationService;
import de.dfki.iui.mmds.core.events.DialogPlatformEventManager;
import de.dfki.iui.mmds.core.events.InputEventHandler;
import de.dfki.iui.mmds.core.interfaces.IDialogueManager;
import de.dfki.iui.mmds.core.model.dialogue.AbstractState;
import de.dfki.iui.mmds.core.model.dialogue.Dialogue;
import de.dfki.iui.mmds.core.model.dialogue.Variable;
import de.dfki.iui.mmds.core.model.io.InputMessage;
import de.dfki.iui.mmds.scxml.CondEventTransition;
import de.dfki.iui.mmds.scxml.StateChart;
import de.dfki.iui.mmds.scxml.TransitionSource;
import de.dfki.iui.mmds.scxml.TransitionTarget;

public class DialogueComponent extends InputEventHandler implements IDialogueManager {

	public static Logger logger = Logger.getLogger(DialogueComponent.class);
	static DialogPlatformEventManager dialogPlatformEventService;
	static DialogueComponent INSTANCE = null;
	EvaluationService evaluationService;
	ComponentContext projectContext = null;

	ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

	private SiamStateMachine stateMachine;

	public SiamStateMachine getStateMachine() {
		return stateMachine;
	}

	private final HashMap<String, Object> registeredPlugins = new HashMap<String, Object>();
	public Dialogue dialogueModel;
	StateChart stateChartModel;
	Map<String, TransitionTarget> idToScxmlState;
	public Map<String, AbstractState> idToDialogueNode;

	public DialogueComponent() {
		if (INSTANCE == null) {
			INSTANCE = this;
		}
	};

	@Override
	protected void activate(ComponentContext context) {
		super.activate(context);
		dialogPlatformEventService = ((DialogPlatformEventManager) componentContext.locateService("DialogPlatformEventManager"));
		evaluationService = ((EvaluationService) componentContext.locateService("EvaluationService"));
		subscribe("SIAM-INF/subscription.pattern");
	}

	ComponentContext getComponentContext() {
		return this.componentContext;
	}

	@Override
	protected void handleEvent(final InputMessage input, Event event, MatchReport report) {
		if (stateMachine != null) {
			// getScxmlContext();
			if (!stateMachine.siamEvaluator.isDelayed()) {
				singleThreadExecutor.execute(new Runnable() {
					@Override
					public void run() {
						stateMachine.fireEvent("InputEvent", input);
					}
				});
			}
		} else {
			Logger.getLogger(this.getClass()).warn("No dialogue engine loaded. Is a dialogue model specified?");
		}
	}

	@Override
	public void loadDialog(Dialogue dialogue) {
		if (dialogue != null) {
			// Validator.validateObject(dialogue,
			// Logger.getLogger(this.getClass()));
			dialogueModel = dialogue;
			DialogueToSCXMLConverter converter = new DialogueToSCXMLConverter();
			stateChartModel = converter.convert(dialogue);
			idToScxmlState = converter.idToScxmlState;
			idToDialogueNode = converter.idToDialogueNode;

			stateMachine = new SiamStateMachine();
			for (String key : registeredPlugins.keySet()) {
				stateMachine.siamContext.set(key, registeredPlugins.get(key));
			}
		}
	}

	@Override
	public void startDialog() {
		stateMachine.addListener(new ScxmlLogger());
		stateMachine.start();
	}

	@Override
	public void registerPlugin(String pluginName, Object pluginInstance) {
		registeredPlugins.put(pluginName, pluginInstance);
		stateMachine.siamContext.set(pluginName, pluginInstance);
	}

	@Override
	public void reset() {

	}

	@Override
	public Map<String, Object> getCurrentScxmlContext() {
		Map<String, Object> result = new HashMap<String, Object>();
		Context currentContext = stateMachine.getCurrentContext();
		List<String> activeStates = stateMachine.getAllActiveStates();
		for (String stateId : activeStates) {
			AbstractState node = idToDialogueNode.get(stateId);
			for (Variable variable : node.getVariables()) {
				result.put(variable.getName(), currentContext.get(variable.getName()));
			}
		}
		return result;
	}

	public List<String> getActiveTransitions() {
		List<String> result = new ArrayList<String>();
		for (org.apache.commons.scxml.model.TransitionTarget target : stateMachine.getEngine().getCurrentStatus().getAllStates()) {
			TransitionTarget state = idToScxmlState.get(target.getId());
			if (state instanceof TransitionSource) {
				for (CondEventTransition transition : ((TransitionSource) state).getTransition()) {
					String label = transition.getLog().get(0).getLabel();
					if (label == null) {
						label = "null";
					}
					result.add(label);
				}
			}
		}
		return result;
	}

	@Override
	public void setProjectContext(ComponentContext context) {
		projectContext = context;
	}

	@Override
	public void raiseEvent(String event) {
		stateMachine.fireEvent(event, null);
	}
	
	@Override
	public void raiseEvent(final String event, final Object input) {
		if (!stateMachine.siamEvaluator.isDelayed()) {
			singleThreadExecutor.execute(new Runnable() {
				@Override
				public void run() {
					stateMachine.fireEvent(event, input);
				}
			});
		}
	}
	

	@Override
	public void resetCurrentScxmlContext() {
		Context currentContext = stateMachine.getCurrentContext();
		List<String> activeStates = stateMachine.getAllActiveStates();
		for (String stateId : activeStates) {
			AbstractState node = idToDialogueNode.get(stateId);
			for (Variable variable : node.getVariables()) {
				Object defaultValue = null;
				if (variable.getDefault() != null && !variable.getDefault().isEmpty()) {
					if (variable.getEmfType() != null && variable.getEmfType() instanceof EDataType) {
						defaultValue = variable.getEmfType().getEPackage().getEFactoryInstance().createFromString((EDataType) variable.getEmfType(), variable.getDefault());
					} else if (variable.getType() != null && !variable.getType().isEmpty()) {
						try {
							defaultValue = stateMachine.siamEvaluator.eval(currentContext, variable.getDefault());
						} catch (IllegalArgumentException | SecurityException | SCXMLExpressionException e) {
							final Writer result = new StringWriter();
							final PrintWriter printWriter = new PrintWriter(result);
							e.printStackTrace(printWriter);
							Logger.getLogger(this.getClass()).warn(
									String.format("Cannot create default variable value \"%s\" for variable \"%s\" of type %s!\n%s", variable.getDefault(), variable.getName(),
											variable.getType(), result.toString()));
						}
						if (defaultValue == null) {
							Logger.getLogger(this.getClass()).warn(
									String.format("Cannot create default variable value \"%s\" for variable \"%s\" of type %s!", variable.getDefault(), variable.getName(),
											variable.getType()));
						}
					} else {
						Logger.getLogger(this.getClass()).warn(
								String.format("Cannot create default value for variable \"%s\". The type %s is not serializable.", variable.getName(), variable.getEmfType()));
					}
				}
//				currentContext.set(name, value);
				currentContext.set(variable.getName(), defaultValue);
			}
		}
	}
}
