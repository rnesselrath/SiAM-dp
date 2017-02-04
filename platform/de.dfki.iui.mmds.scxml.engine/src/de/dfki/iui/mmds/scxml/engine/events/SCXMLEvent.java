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

public class SCXMLEvent extends Event {

	public static final String TOPIC = "de/dfki/iui/mmds/scxml", ID = "id", ALL = "*", SEP = "/";

	/**
	 * @param id
	 *            - The id of the Scxml engine that sends an
	 *            <code>SCXMLEvent</code>.
	 * @param suffix
	 *            - The suffix to add to precise the concern of an event.
	 * @return The topic constructed by:<br>
	 * <br>
	 *         <code>SCXMLEvent.TOPIC + SEP + id + suffix</code>.
	 */
	public static String getTopic(String id, String suffix) {
		return TOPIC + SEP + id + suffix;
	}

	public SCXMLEvent(String topic, Map<String, ?> properties) {
		super(topic, properties);
	}

	public SCXMLEvent(String topic, String id, Map<String, Object> properties) {
		super(topic, getProperties(id, properties));
	}

	protected static Map<String, Object> getProperties(String id, Map<String, Object> properties) {
		properties.put(ID, id);
		return properties;
	}

	public String getId() {
		return (String) getProperty(ID);
	}

}
