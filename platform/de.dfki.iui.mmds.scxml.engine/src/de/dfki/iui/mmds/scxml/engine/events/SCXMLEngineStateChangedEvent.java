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

import de.dfki.iui.mmds.scxml.engine.SCXMLEngine.State;

/**
 * <code>SCXMLEngineStateChangedEvent</code> can be used to inform listeners/handlers about the change of some engine's state.
 */
public class SCXMLEngineStateChangedEvent extends SCXMLEvent {
	
	public static final String EVENT_STATES = "eventStates",
							   STATE = "state",
							   TOPIC_SUFFIX = "/engine/state";

	/**
	 * @param id - The id of the Scxml engine that sends an <code>SCXMLEngineStateChangedEvent</code>.
	 * @return The topic containing the id and the static suffix of an <code>SCXMLEngineStateChangedEvent</code>.
	 */
	public static String getTopic( String id ) {
		return getTopic( id, TOPIC_SUFFIX );
	}
	
	public SCXMLEngineStateChangedEvent( String id, State state, Map<String, Map<String, List< Object[] >>> availableEventsStates ) {
		super( getTopic( id ), getProperties( id, state, availableEventsStates ));
	}
	
	/**
	 * Adds all 3 parameters to a map as properties of some event.
	 * 
	 * @param id
	 * @param state
	 * @param availableEventsStates
	 * @return The map containing all properties.
	 */
	protected static Map<String, Object> getProperties( String id, State state, Map<String, Map<String, List< Object[] >>> availableEventsStates ) {
		Map<String, Object> properties = new HashMap<String, Object>( 2 );
		SCXMLEvent.getProperties( id, properties );
		properties.put( EVENT_STATES, availableEventsStates );
		properties.put( STATE, state );
		return properties;
	}
	
	/**
	 * @return The new state of the engine.
	 */
	public State getState() {
		return (State) getProperty( STATE );
	}

	/**
	 * @return All available events and the corresponding states.
	 */
	@SuppressWarnings("unchecked")
	public Map< String, Map<String, List< Object[] >>> getEventStates() {
		return (Map< String, Map<String, List< Object[] >>>) getProperty( EVENT_STATES );
	}
}
