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

import org.osgi.service.event.Event;

public class SCXMLMacroMicroStepEvent extends SCXMLEventFiredEvent {
	
	public static final String TOPIC_INFIX = "/controls/step/",
							   TOPIC_SUFFIX_MACRO = TOPIC_INFIX + "macro",
							   TOPIC_SUFFIX_MICRO = TOPIC_INFIX + "micro";

	/**
	 * @param ev
	 * @return true iff the given event is instance of SCXMLMacroMicroStepEvent and represents a <u><code>macro</code></u> step.
	 */
	public static boolean isMacroStepEvent( Event ev ) {
		return ev.getTopic().endsWith( TOPIC_SUFFIX_MACRO );
	}
	
	/**
	 * @param ev
	 * @return true iff the given event is instance of SCXMLMacroMicroStepEvent and represents a <u><code>micro</code></u> step.
	 */
	public static boolean isMicroStepEvent( Event ev ) {
		return ev.getTopic().endsWith( TOPIC_SUFFIX_MICRO );
	}

	/**
	 * @param id - The id of the Scxml engine that sends an <code>SCXMLMacroMicroStepEvent</code>.
	 * @param macro
	 * @return The topic containing the id and the static suffix of an <code>SCXMLMacroMicroStepEvent</code>.
	 */
	public static String getTopic( String id, boolean macro ) {
		return getTopic( id, macro ? TOPIC_SUFFIX_MACRO : TOPIC_SUFFIX_MICRO );
	}

	
	/**
	 * @param id
	 */
	public SCXMLMacroMicroStepEvent( String id, boolean macro, String event ) {
		super( getTopic( id, macro ), event , getProperties( id, new HashMap<String, Object>( 2 )));
	}
}
