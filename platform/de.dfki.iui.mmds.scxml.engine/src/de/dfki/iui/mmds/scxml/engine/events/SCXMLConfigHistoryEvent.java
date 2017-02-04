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
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <code>SCXMLConfigHistoryEvent</code> is used by the engine to inform all clients about the current history.
 * The configuration used in the engine is a tree of states that changes whenever a transition is taken. The leafs
 * of such a tree are sent to the clients using this event. From these ones the clients can reproduce the whole
 * configuration if they want to.
 * <BR>Such events are sent whenever the configuration changed and usually (but not guaranteed) after an event
 * {@link SCXMLEngineStateChangedEvent} is sent.
 *
 */
public class SCXMLConfigHistoryEvent extends SCXMLEvent {

	public static final String TOPIC_SUFFIX = "/config/history",
							   CONFIG_HISTORY = "configHistory";
	

	/**
	 * @param id - The id of the Scxml engine that sends an <code>SCXMLConfigHistoryEvent</code>.
	 * @return The topic containing the id and the static suffix of an <code>SCXMLConfigHistoryEvent</code>.
	 */
	public static String getTopic( String id ) {
		return getTopic( id, TOPIC_SUFFIX );
	}
	
	/**
	 * @param id
	 * @param history
	 */
	public SCXMLConfigHistoryEvent( String id, List< Set< String >> history ) {
		super( getTopic( id ), getProperties( id, history ));
	}
	
	/**
	 * Adds all 2 parameters to a map as properties of some event.
	 * 
	 * @param id
	 * @param history
	 * @return
	 */
	protected static Map<String, Object> getProperties( String id, List< Set< String >> history ) {
		Map<String, Object> properties = new HashMap<String, Object>( 2 );
		SCXMLEvent.getProperties( id, properties );
		properties.put( CONFIG_HISTORY, history );
		return properties;
	}
	
	/**
	 * @return The history of a certain length.
	 */
	@SuppressWarnings("unchecked")
	public List< Set< String >> getConfigHistory() {
		return (List< Set< String >>) getProperty( CONFIG_HISTORY );
	}
}
