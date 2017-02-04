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

public class SCXMLEventFiredEvent extends SCXMLEvent {


	public static final String EVENT = "event",
							   TOPIC_SUFFIX = "/events/activation";
	
	/**
	 * @param id - The id of the Scxml engine that sends an <code>SCXMLEventFiredEvent</code>.
	 * @return The topic containing the id and the static suffix of an <code>SCXMLEventFiredEvent</code>.
	 */
	public static String getTopic( String id ) {
		return getTopic( id, TOPIC_SUFFIX );
	}

	/**
	 * Adds all 2 parameters to a map as properties of some event.
	 * 
	 * @param id
	 * @param event
	 * @return The map containing all properties.
	 */
	protected static Map<String, Object> getProperties( String id, String event ) {
		Map<String, Object> properties = new HashMap<String, Object>( 2 );
		SCXMLEvent.getProperties( id, properties );
		properties.put( EVENT, event );
		return properties;
	}

	protected static Map<String, Object> updateProperties( String event, Map<String, Object> properties ) {
		properties.put( EVENT, event );
		return properties;
	}
	

	/**
	 * @param id
	 * @param event
	 */
	public SCXMLEventFiredEvent( String id, String event ) {
		super( getTopic( id ), getProperties( id, event ));
	}
	

	/**
	 * @param id
	 * @param event
	 */
	public SCXMLEventFiredEvent( String topic, String event, Map<String, Object> properties ) {
		super( topic, updateProperties( event, properties ));
	}
	
	/**
	 * @return The fired event.
	 */
	public String getEvent() {
		return (String) getProperty( EVENT );
	}
}
