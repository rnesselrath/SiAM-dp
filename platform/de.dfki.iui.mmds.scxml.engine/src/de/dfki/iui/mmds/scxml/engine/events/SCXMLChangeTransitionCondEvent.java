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

import java.util.Map;

import org.osgi.service.event.Event;

public class SCXMLChangeTransitionCondEvent extends SCXMLTransitionEvent {
	
	public static final String TOPIC_SUFFIX = TOPIC_SUFFIX_COND + "/change",
							   NEW_COND = "newCond";
	

	/**
	 * @param id - The id of the Scxml engine that sends an <code>SCXMLChangeTransitionCondEvent</code>.
	 * @return The topic containing the id and the static suffix of an <code>SCXMLChangeTransitionCondEvent</code>.
	 */
	public static String getTopic( String id ) {
		return getTopic( id, TOPIC_SUFFIX );
	}
	
	/**
	 * @param ev
	 * @return true iff the given event is instance of <u><code>SCXMLChangeTransitionCondEvent</code></u> and
	 * has the official used topic.
	 */
	public static boolean isChangeTransitionCondEvent( Event ev ) {
		return ev instanceof SCXMLChangeTransitionCondEvent && ev.getTopic().endsWith( TOPIC_SUFFIX );
	}


	/**
	 * Adds all 4 parameters to a map as properties of some event.
	 * 
	 * @param id
	 * @param stateId
	 * @param transPos
	 * @param newCond
	 * @return The map containing all properties.
	 */
	protected static Map<String, Object> getProperties( String id, String stateId, int transPos, String newCond ) {
		Map<String, Object> properties = SCXMLTransitionEvent.getProperties( id, stateId, transPos );
		properties.put( NEW_COND, newCond );
		return properties;
	}
	
	
	public SCXMLChangeTransitionCondEvent( String id, String stateId, int transPos, String newCond ) {
		super( getTopic( id ), getProperties( id, stateId, transPos, newCond ));
	}
	
	
	/**
	 * @return The position of the transition.
	 */
	public String getNewCond() {
		return (String) getProperty( NEW_COND );
	}

}
