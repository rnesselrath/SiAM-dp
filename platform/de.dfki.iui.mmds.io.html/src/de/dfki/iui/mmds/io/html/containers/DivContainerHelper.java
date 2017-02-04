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
package de.dfki.iui.mmds.io.html.containers;

import de.dfki.iui.mmds.core.model.io.gui.Div;
import de.dfki.iui.mmds.core.model.io.gui.UIElement;
import de.dfki.iui.mmds.io.html.util.HtmlFactory;
import uk.co.wireweb.web.html.Tag;
import uk.co.wireweb.web.html.html5.StandardAttributesTag;

public class DivContainerHelper {

	private final Div cont_;

	public DivContainerHelper(Div d) {
		cont_ = d;
	}

	public Tag<?> createDivContainer() {
		StandardAttributesTag<?> div = HtmlFactory.makeDivContainer(null);
		HtmlFactory.setUpTag(div, cont_);
		for (UIElement child : cont_.getElements()) {
			Tag<?> contents = new HtmlFactory().doSwitch(child);
			if (contents != null) {
				div.appendToBody(contents);
			}
		}
		return div;
	}
}
