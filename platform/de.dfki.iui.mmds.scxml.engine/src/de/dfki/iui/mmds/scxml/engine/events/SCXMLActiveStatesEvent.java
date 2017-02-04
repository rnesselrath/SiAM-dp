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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.osgi.service.event.EventConstants;

public class SCXMLActiveStatesEvent extends SCXMLEvent {
	public static final String STATES = "states",
	   						   CLOSURE = "states",
							   ID = "id",
							   TOPIC_SUFFIX = "/activeStates";

	/**
	 * @param id - The id of the Scxml engine that sends an <code>SCXMLActiveStatesEvent</code>.
	 * @return The topic containing the id and the static suffix of an <code>SCXMLActiveStatesEvent</code>.
	 */
	public static String getTopic( String id ) {
		return getTopic( id, TOPIC_SUFFIX );
	}
	
	
	public SCXMLActiveStatesEvent(String id, List<String> activeStates, List<String> allActiveStates) {
		super(getTopic( id ), getMap(id, new ArrayList<String>(activeStates), new ArrayList<String>(allActiveStates)));
	}

	private static Map<String, Object> getMap(String id, ArrayList<String> activeStates, ArrayList<String> allActiveStates) {
		Map<String, Object> properties = new HashMap<String, Object>(5);		
		properties.put(STATES, activeStates);		
		properties.put(CLOSURE, allActiveStates);
		properties.put(ID, id);
		properties.put(EventConstants.TIMESTAMP,System.currentTimeMillis());
		return properties;
	}
	
	public List<String> getActiveStates() {
		return (List<String>)getProperty(STATES);
	}	
	
	public List<String> getAllActiveStates() {
		return (List<String>)getProperty(CLOSURE);
	}
}
