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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.scxml.model.Log;
import org.apache.commons.scxml.model.Transition;
import org.apache.commons.scxml.model.TransitionTarget;
import org.apache.log4j.Logger;

import de.dfki.iui.mmds.scxml.engine.events.SCXMLListener;

public class ScxmlLogger implements SCXMLListener {

	Logger logger = Logger.getLogger(DialogueComponent.class);
	List<String> activeStates = new ArrayList<String>();

	@Override
	public void onEntry(TransitionTarget state) {
		activeStates.add(state.getId());
		logger.debug(logActiveStates() + "// ENTERED: " + state.getId());

	}

	@Override
	public void onExit(TransitionTarget state) {
		activeStates.remove(state.getId());
		logger.debug(logActiveStates() + " // LEFT: " + state.getId());
	}

	@Override
	public void onTransition(TransitionTarget from, TransitionTarget to, Transition transition) {
		Log log = (Log) transition.getActions().get(0);
		logger.debug(String.format("TRANS %s: %s --> %s", log.getLabel(), from.getId(), to.getId()));
	}

	private String logActiveStates() {
		Object[] values = activeStates.toArray();
		StringBuilder builder = new StringBuilder();
		builder.append("ACTIVE STATES [");
		int i = 0;
		for (; i < values.length - 1; ++i) {
			builder.append(values[i] + ",");
		}
		if (i < values.length) {
			builder.append(values[i]);
		}
		builder.append("]");
		return builder.toString();

	}

	@Override
	public void onStable() {
		// TODO Auto-generated method stub

	}
}
