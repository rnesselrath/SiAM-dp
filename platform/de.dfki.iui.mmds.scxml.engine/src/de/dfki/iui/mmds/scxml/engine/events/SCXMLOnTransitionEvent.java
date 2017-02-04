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
package de.dfki.iui.mmds.scxml.engine.events;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.scxml.model.Transition;
import org.apache.commons.scxml.model.TransitionTarget;
import org.osgi.service.event.EventConstants;

public class SCXMLOnTransitionEvent extends SCXMLEvent {
	public static final String FROM = "from",
	   						   TO = "to",
	   						   TRANSITION = "transition",
	   						   CONDITION = "condition",
							   ID = "id",
							   TOPIC_SUFFIX = "/onTransition";

	/**
	 * @param id - The id of the Scxml engine that sends an <code>SCXMLOnTransitionEvent</code>.
	 * @return The topic containing the id and the static suffix of an <code>SCXMLOnTransitionEvent</code>.
	 */
	public static String getTopic( String id ) {
		return getTopic( id, TOPIC_SUFFIX );
	}
	
	public SCXMLOnTransitionEvent(String id, TransitionTarget from, TransitionTarget to, Transition transition) {
		super(getTopic( id ), getMap(id, from, to, transition));
	}

	private static Map<String, Object> getMap(String id, TransitionTarget from, TransitionTarget to, Transition transition) {
		Map<String, Object> properties = new HashMap<String, Object>(6);
		properties.put(FROM, from.getId());
		properties.put(TO, to.getId());
		properties.put(TRANSITION, transition.getEvent());
		properties.put(CONDITION, transition.getCond());
		properties.put(ID, id);
		properties.put(EventConstants.TIMESTAMP,System.currentTimeMillis());
		return properties;
	}
	
	public String getScxmlId() {
		return (String)getProperty(ID);
	}
	
	public String getSourceId() {
		return (String)getProperty(FROM);
	}
	
	public String getEvent() {
		return (String)getProperty(TRANSITION);
	}
	
	public String getCondition() {
		return (String)getProperty(CONDITION);
	}
	
	
}
