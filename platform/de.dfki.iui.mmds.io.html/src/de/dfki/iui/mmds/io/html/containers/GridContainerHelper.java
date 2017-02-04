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
import de.dfki.iui.mmds.core.model.io.gui.GridContainer;
import de.dfki.iui.mmds.core.model.io.gui.GridItem;
import de.dfki.iui.mmds.core.model.io.gui.GridRow;
import de.dfki.iui.mmds.io.html.util.HtmlFactory;

public class GridContainerHelper {
	private final GridContainer cont_;

	public GridContainerHelper(GridContainer cont) {
		cont_ = cont;
	}

	public Tag<?> createContainer() {
		HtmlFactory f = new HtmlFactory();
		StandardAttributesTag<?> table = HtmlFactory.makeGridContainer(null);
		HtmlFactory.setUpTag(table, cont_);
		EList<GridRow> rows = cont_.getRow();
		for (int i = 0; i < rows.size(); ++i) {
			StandardAttributesTag<?> tr = HtmlFactory.makeTableRow(rows.get(i));
			// HtmlFactory.setUpTag(tr, rows.get(i));
			EList<GridItem> items = rows.get(i).getItem();
			for (int j = 0; j < items.size(); ++j) {
				StandardAttributesTag<?> td = (StandardAttributesTag<?>)f.doSwitch(items.get(j));
				// HtmlFactory.setUpTag(td, items.get(j));
//				if (!items.get(j).getElements().isEmpty()) {
//					Tag<?> contents = f.doSwitch(items.get(j).getElements().get(0));	// only 1 element allowed in the GridItem
//					if (contents != null) {
//						td.appendToBody(contents);
//					}
//				}
				tr.appendToBody(td);
			}
			table.appendToBody(tr);
		}
		return table;
	}
	
}
