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
import uk.co.wireweb.web.html.html5.tag.Table;
import uk.co.wireweb.web.html.html5.tag.Td;
import uk.co.wireweb.web.html.html5.tag.Tr;
import de.dfki.iui.mmds.core.model.io.gui.Button;
import de.dfki.iui.mmds.core.model.io.gui.ButtonBar;
import de.dfki.iui.mmds.core.model.io.gui.Orientation;
import de.dfki.iui.mmds.io.html.util.HtmlFactory;

public class ButtonBarHelper {
	private ButtonBar bBar_;
	public ButtonBarHelper(ButtonBar b) {
		bBar_ = b;
	}
	/**
	 * 
	 * @return
	 */
	public Tag<?> createButtonBar() {
		HtmlFactory f = new HtmlFactory();
		Table t = new Table();
		EList<Button> eList = bBar_.getButton();
		Tr row = new Tr();
		for(Button b : eList) {
			Td cell = new Td();
			Tag renButton = f.doSwitch(b);
			cell.appendToBody(renButton);
			switch (bBar_.getOrientation()) {
			case HORIZONTAL:
				row.appendToBody(cell);
				break;
			case VERTICAL:
				row = new Tr();
				row.appendToBody(cell);
				t.appendToBody(row);
				break;
			default:
				break;
			}
		}
		if(bBar_.getOrientation() == Orientation.HORIZONTAL)
			t.appendToBody(row);
		return t;
	}
	
}
