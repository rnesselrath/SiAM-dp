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

import org.osgi.service.event.Event;

public class SCXMLTransitionEvent extends SCXMLEvent {
	
	/**
	 * Differentiates between versions of scxml events which use the same kind of information, i.e. the
	 * state id indicating where the transition starts and the transition position to be able to find
	 * the right transition.
	 */
	public enum Sort {
		COND( TOPIC_SUFFIX_COND + SEP + ALL ), COND_EVAL( TOPIC_SUFFIX_COND_EVAL ), ENABLED( TOPIC_SUFFIX_ENABLED );
		
		private String sfx;
		private Sort( String sfx ) {
			this.sfx = sfx;
		}
	}

	public static final String TOPIC_INFIX = "/dynamics/transitions",
							   TOPIC_SUFFIX_COND = TOPIC_INFIX + "/cond",
							   TOPIC_SUFFIX_COND_EVAL = TOPIC_SUFFIX_COND + "/eval",
							   TOPIC_SUFFIX_ENABLED = TOPIC_INFIX + "/enabled",
							   STATE_ID = "stateId",
							   TRANS_POS = "transPos";
	

	/**
	 * @param id - The id of the Scxml engine that sends an <code>SCXMLEvalTransitionCondEvent</code>.
	 * @param macro
	 * @return The topic containing the id and the static suffix of an <code>SCXMLEvalTransitionCondEvent</code>.
	 */
	public static String getTopic( String id, SCXMLTransitionEvent.Sort sort ) {
		return getTopic( id, sort.sfx );
	}
	
	/**
	 * @param ev
	 * @return true iff the given event is instance of SCXMLTransitionEvent and represents a <u><code>TransitionCondEvent</code></u>.
	 */
	public static boolean isTransitionCondEvent( Event ev ) {
		return ev instanceof SCXMLTransitionEvent && ev.getTopic().endsWith( TOPIC_SUFFIX_COND );
	}
	
	/**
	 * @param ev
	 * @return true iff the given event is instance of SCXMLTransitionEvent and represents a <u><code>EvalTransitionCondEvent</code></u>.
	 */
	public static boolean isEvalTransitionCondEvent( Event ev ) {
		return ev instanceof SCXMLTransitionEvent && ev.getTopic().endsWith( TOPIC_SUFFIX_COND_EVAL );
	}
	
	/**
	 * @param ev
	 * @return true iff the given event is instance of SCXMLTransitionEvent and represents a <u><code>EnabledTransitionEvent</code></u>.
	 */
	public static boolean isEnabledTransitionEvent( Event ev ) {
		return ev instanceof SCXMLTransitionEvent && ev.getTopic().endsWith( TOPIC_SUFFIX_ENABLED );
	}
	
	
	/**
	 * @param stateId
	 * @param transPos
	 * @param properties
	 * @return
	 */
	protected static Map<String, Object> getProperties( String stateId, int transPos, Map<String, Object> properties ) {
		properties.put( STATE_ID, stateId );
		properties.put( TRANS_POS, transPos );
		return properties;
	}


	/**
	 * Adds all 3 parameters to a map as properties of some event.
	 * 
	 * @param id
	 * @param dataId
	 * @param valueScript
	 * @return The map containing all properties.
	 */
	protected static Map<String, Object> getProperties( String id, String stateId, int transPos ) {
		Map<String, Object> properties = new HashMap<String, Object>( 4 );
		SCXMLEvent.getProperties( id, properties );
		properties.put( STATE_ID, stateId );
		properties.put( TRANS_POS, transPos );
		return properties;
	}

	
	public SCXMLTransitionEvent( String id, SCXMLTransitionEvent.Sort sort, String stateId, int transPos ) {
		super( getTopic( id, sort ), getProperties( id, stateId, transPos ));
	}
	
	/**
	 * This constructor can be used by the subclasses.
	 * 
	 * @param topic
	 * @param properties
	 */
	public SCXMLTransitionEvent( String topic, Map<String, Object> properties) {
		super( topic, properties );
	}
	
	/**
	 * @return The id of the state containing the transition.
	 */
	public String getStateId() {
		return (String) getProperty( STATE_ID );
	}
	
	/**
	 * @return The position of the transition.
	 */
	public int getTransPos() {
		return (Integer) getProperty( TRANS_POS );
	}
	
	/**
	 * @return The sort of the event or <code>null</code> if no sort can be identified.
	 */
	public Sort getSort() {
		String topic = getTopic();
		if ( topic.endsWith( TOPIC_SUFFIX_COND )) {
			return Sort.COND;
		} else if ( topic.endsWith( TOPIC_SUFFIX_COND_EVAL )) {
			return Sort.COND_EVAL;
		} else if ( topic.endsWith( TOPIC_SUFFIX_ENABLED )) {
			return Sort.ENABLED;
		}
		return null;
	}
}
