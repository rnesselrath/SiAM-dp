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
package de.dfki.iui.mmds.io.html.servlet;

import java.util.List;

import org.json.JSONObject;
import org.osgi.service.event.Event;

import de.dfki.iui.mmds.core.model.io.OutputAct;
import de.dfki.iui.mmds.core.model.io.gui.AddUIElement;
import de.dfki.iui.mmds.core.model.io.gui.MoveUIElement;
import de.dfki.iui.mmds.core.model.io.gui.RemoveUIElement;
import de.dfki.iui.mmds.core.model.io.gui.StyleSheetUpdate;
import de.dfki.iui.mmds.core.model.io.gui.UIElement;
import de.dfki.iui.mmds.io.html.util.HtmlRenderResult;

public interface GUIRequestHandler {
	/**
	 * Use this method to update window
	 * 
	 * @param res
	 * @param deviceId
	 * @param output
	 * @param event
	 */
	public void handle(HtmlRenderResult res, String deviceId, OutputAct output, Event event);

	/**
	 * Use this method to update {@link UIElement} on the webpage
	 * 
	 * @param update
	 * @param deviceId
	 * @param output
	 * @param event
	 */
	public void handle(List<JSONObject> update, String deviceId, OutputAct output, Event event);

	/**
	 * 
	 * @param update
	 * @param deviceId
	 * @param output
	 * @param event
	 */
	public void handle(RemoveUIElement update, String deviceId, OutputAct output, Event event);

	/**
	 * 
	 * @param update
	 * @param deviceId
	 * @param output
	 * @param event
	 */
	public void handle(AddUIElement update, HtmlRenderResult html, String deviceId, OutputAct output, Event event);

	/**
	 * 
	 * @param update
	 * @param deviceId
	 * @param output
	 * @param event
	 */
	public void handle(MoveUIElement update, String deviceId, OutputAct output, Event event);

	/**
	 * @param u
	 * @param locDeviceId
	 * @param message
	 * @param event
	 */
	public void handle(StyleSheetUpdate u, String locDeviceId, OutputAct message, Event event);
}
