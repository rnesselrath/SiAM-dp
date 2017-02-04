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

import org.eclipse.emf.common.util.EList;

import uk.co.wireweb.web.html.Tag;
import uk.co.wireweb.web.html.html5.StandardAttributesTag;
import de.dfki.iui.mmds.core.model.io.gui.HBox;
import de.dfki.iui.mmds.core.model.io.gui.UIElement;
import de.dfki.iui.mmds.io.html.util.HtmlFactory;

public class HBoxContainerHelper {
	private final HBox cont_;

	public HBoxContainerHelper(HBox b) {
		cont_ = b;
	}

	public Tag<?> createHBoxContainer() {
		HtmlFactory f = new HtmlFactory();
		StandardAttributesTag<?> table = HtmlFactory.makeGridContainer(null);
		HtmlFactory.setUpTag(table, cont_);
		StandardAttributesTag<?> tr = HtmlFactory.makeTableRow(null);
		EList<UIElement> items = cont_.getElements();
		for (int j = 0; j < items.size(); ++j) {
			StandardAttributesTag<?> td = HtmlFactory.makeTableCell(null,false);
			if (items.get(j) != null) {
				Tag<?> contents = f.doSwitch(items.get(j));
				if (contents != null) {
					td.appendToBody(contents);
				}
			}
			tr.appendToBody(td);
		}
		table.appendToBody(tr);
		return table;
	}
}
