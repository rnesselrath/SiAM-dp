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

public class SCXMLChangeDataValueEvent extends SCXMLEvent {

	public static final String TOPIC_SUFFIX = "/dynamics/data/changeValue",
							   VALUE_SCRIPT = "valueScript",
							   DATA_ID = "dataId",
							   STATE_ID = "stateId";
	

	/**
	 * @param id - The id of the Scxml engine that sends an <code>SCXMLChangeDataValueEvent</code>.
	 * @return The topic containing the id and the static suffix of an <code>SCXMLChangeDataValueEvent</code>.
	 */
	public static String getTopic( String id ) {
		return getTopic( id, TOPIC_SUFFIX );
	}
	

	public SCXMLChangeDataValueEvent( String id, String stateId, String dataId, String valueScript ) {
		super( getTopic( id ), getProperties( id, stateId, dataId, valueScript ));
	}
	
	/**
	 * Adds all 3 parameters to a map as properties of some event.
	 * 
	 * @param id
	 * @param dataId
	 * @param valueScript
	 * @return The map containing all properties.
	 */
	protected static Map<String, Object> getProperties( String id, String stateId, String dataId, String valueScript ) {
		Map<String, Object> properties = new HashMap<String, Object>( 4 );
		SCXMLEvent.getProperties( id, properties );
		properties.put( STATE_ID, stateId );
		properties.put( DATA_ID, dataId );
		properties.put( VALUE_SCRIPT, valueScript );
		return properties;
	}
	
	/**
	 * @return The state id where the data is visible.
	 */
	public String getStateId() {
		return (String) getProperty( STATE_ID );
	}
	
	/**
	 * @return The data id which should get the new value.
	 */
	public String getDataId() {
		return (String) getProperty( DATA_ID );
	}
	
	/**
	 * @return The script which should be evaluated dynamically to get the new data.
	 */
	public String getValueScript() {
		return (String) getProperty( VALUE_SCRIPT );
	}
}
