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

import org.apache.commons.scxml.model.TransitionTarget;
import org.osgi.service.event.EventConstants;

public class SCXMLOnEntryEvent extends SCXMLEvent {
	public static final String TRANSITION_TARGET = "TransitionTarget",
							   ID = "id",
							   TOPIC_SUFFIX = "/onEntry";

	/**
	 * @param id - The id of the Scxml engine that sends an <code>SCXMLOnEntryEvent</code>.
	 * @return The topic containing the id and the static suffix of an <code>SCXMLOnEntryEvent</code>.
	 */
	public static String getTopic( String id ) {
		return getTopic( id, TOPIC_SUFFIX );
	}
	
	public SCXMLOnEntryEvent(String id, TransitionTarget state) {
		super(getTopic( id ), getMap( id, state ));
	}

	private static Map<String, Object> getMap(String id, TransitionTarget state) {
		Map<String, Object> properties = new HashMap<String, Object>(3);
		properties.put( ID, id );
		properties.put( TRANSITION_TARGET, state.getId() );
		properties.put( EventConstants.TIMESTAMP,System.currentTimeMillis() );
		return properties;
	}
	
	public String getScxmlId() {
		return (String) getProperty( ID );
	}
	
	public String getStateId() {
		return (String) getProperty( TRANSITION_TARGET );
	}
	
}
