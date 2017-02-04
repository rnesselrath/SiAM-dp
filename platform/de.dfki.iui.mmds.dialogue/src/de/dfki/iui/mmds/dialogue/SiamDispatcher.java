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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.scxml.Context;
import org.apache.commons.scxml.EventDispatcher;
import org.apache.commons.scxml.env.jexl.JexlContext;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.w3c.dom.Node;

import de.dfki.iui.mmds.core.emf.persistence.EmfPersistence;
import de.dfki.iui.mmds.core.model.io.OutputMessage;
import de.dfki.iui.mmds.scxml.Send;
import de.dfki.iui.mmds.scxml.TransitionTarget;

class SiamDispatcher implements EventDispatcher {

	SiamStateMachine siamStateMachine;
	HashMap<String, OutputMessage> outputMessageMap = new HashMap<String, OutputMessage>();
	Set<EObject> alreadyEvaluated = new HashSet<EObject>(); // avoiding loops

	SiamDispatcher(SiamStateMachine siamStateMachine) {
		this.siamStateMachine = siamStateMachine;
		TreeIterator<EObject> eAllContents = DialogueComponent.INSTANCE.stateChartModel.eAllContents();
		while (eAllContents.hasNext()) {
			EObject next = eAllContents.next();
			if (next instanceof Send) {
				if (((Send) next).getContent() instanceof OutputMessage) {
					outputMessageMap.put(((Send) next).getId(), (OutputMessage) ((Send) next).getContent());
				}
			}
		}
	}

	@Override
	public void cancel(String sendId) {
		// TODO Auto-generated method stub
	}

	@Override
	public void send(String sendId, String target, String type, String event, Map<String, Object> params, Object hints,
			long delay, List<Node> externalNodes) {
		alreadyEvaluated.clear();
		if (type.equals("output_event")) {
			if (outputMessageMap.containsKey(sendId)) {
				// find context
				OutputMessage outputMessage = outputMessageMap.get(sendId);
				EObject temp = outputMessage;
				while (!(temp instanceof TransitionTarget)) {
					temp = temp.eContainer();
				}
				Context context = siamStateMachine.getContext(((TransitionTarget) temp).getId());
				// resolve bound entities
				context = ((SiamEvaluator) siamStateMachine.getEngine().getEvaluator())
						.getTheEffectiveContext((JexlContext) context);
				List<EObject> evaluateContents = DialogueComponent.INSTANCE.evaluationService
						.evaluateContents(outputMessage, context.getVars());
				if (evaluateContents.size() == 1) {
					DialogueComponent.dialogPlatformEventService
							.postOutputEvent((OutputMessage) evaluateContents.get(0), DialogueComponent.INSTANCE);
				} else {
					Logger.getLogger(this.getClass())
							.error("Cannot send the following output event. There occured an error while evaluating inner script expressions!\n"
									+ EmfPersistence.writeToString(outputMessage));
				}
			} else {
				Logger.getLogger(this.getClass())
						.warn(String.format(
								"Cannot raise send event with id: %s. The id must belong to an object of type OutputRequest!",
								sendId));
			}
		} else {
			siamStateMachine.fireEvent(type, null);
		}
	}

}
