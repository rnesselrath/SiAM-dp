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
package de.dfki.iui.mmds.scxml.engine;

import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.scxml.SCXMLListener;

public interface SCXMLEngine {

	enum State {
		IDLE, // represents the state of the engine after executing a macro step
				// -> waiting for new events
		ON_FIRE_EVENT
	}

	public URL preprocess(final URL scxmlDocument);

	public void initialize(final URL scxmlDocument);

	public boolean start();

	public boolean reset();

	public boolean fireEvent(final String event, final Object payload);

	public List<String> getAvailableEvents();

	/**
	 * For the <code>Scxml Debug View</code> there is list of available events
	 * and for each event a list of states that contain the corresponding needed
	 * transition. Therefore this method is used to inform the view about the
	 * current status.
	 * 
	 * @return A map of events to all states containing transitions on the
	 *         events.
	 */
	Map<String, Map<String, List<Object[]>>> getAvailableEventsStates();

	public List<String> getActiveStates();

	public List<String> getAllActiveStates();

	public void logError(String message, Throwable error);

	public void logInfo(String message, Throwable error);

	public void logError(String message);

	public void logInfo(String message);

	// public void setCallback(SCXMLCallback cb);

	public void addListener(SCXMLListener listener);

	public void setActiveStates(Set<String> activeStates);

	public void setId(final String engineId);

	public void setVar(String name, Object object);

	/**
	 * @return The engine's id.
	 */
	String getId();

	/**
	 * @param superStep
	 */
	void setSuperStep(boolean superStep);

	/**
	 * Stops the engine.
	 * 
	 * @CUSTOM, @NEW
	 */
	public void stop();

	/**
	 * @param preprocess
	 * @param idSuffix
	 * 
	 * @CUSTOM, @NEW
	 */
	public void initialize(URL scxmlDocument, String idSuffix);

	/**
	 * 
	 * @param stateIds
	 *            - The list of state ids with a breakpoint.
	 */
	void setBreakpoints(List<String> stateIds);
}
