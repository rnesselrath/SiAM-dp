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
package de.dfki.iui.mmds.core.interfaces;

import java.util.Map;

import org.osgi.service.component.ComponentContext;

import de.dfki.iui.mmds.core.model.dialogue.Dialogue;

public interface IDialogueManager {
	public void loadDialog(Dialogue dialogue);

	public void startDialog();

	public void registerPlugin(String pluginName, Object pluginInstance);

	public void reset();

	public Map<String, Object> getCurrentScxmlContext();

	public void setProjectContext(ComponentContext context);

	public void raiseEvent(String event);

	public void raiseEvent(final String event, final Object input);
	
	public void resetCurrentScxmlContext();
}
