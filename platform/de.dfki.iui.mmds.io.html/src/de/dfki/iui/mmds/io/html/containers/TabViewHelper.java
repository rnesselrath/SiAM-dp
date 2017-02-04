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

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import uk.co.wireweb.web.html.html5.StandardAttributesTag;
import uk.co.wireweb.web.html.html5.tag.A;
import uk.co.wireweb.web.html.html5.tag.Div;
import uk.co.wireweb.web.html.html5.tag.Li;
import uk.co.wireweb.web.html.html5.tag.Script;
import uk.co.wireweb.web.html.html5.tag.Ul;
import de.dfki.iui.mmds.core.model.io.gui.TabItem;
import de.dfki.iui.mmds.core.model.io.gui.TabView;
import de.dfki.iui.mmds.core.model.io.gui.UIElement;
import de.dfki.iui.mmds.io.html.util.HtmlFactory;

public class TabViewHelper {
	private TabView tv_;
	private Logger getLogger() {
		return Logger.getLogger(HtmlFactory.class);
	}
	public TabViewHelper(TabView t) {
		tv_ = t;
	}
	/**
	 * 
	 * @return
	 */
	public StandardAttributesTag<?> createTabView() {
		HtmlFactory f = new HtmlFactory();
		Div d = new Div();
		if(tv_.getId() == null || tv_.getId().getValue().isEmpty()) {
			getLogger().error("TabView must have id attribute");
			return null;
		}			
		f.setUpTag(d, tv_);
		Ul tabs = new Ul();
		EList<UIElement> items = tv_.contains();
		for(UIElement item : items) {
			TabItem ti = (TabItem)item;
			if(ti.getId() == null || ti.getId().getValue().isEmpty()) {
				getLogger().error("TabItem must have id attribute");
				return null;
			}
			Li lItem = new Li();
			A link = new A();
			link.href("#"+ti.getId().getValue());
			link.id(ti.getId().getValue()+"_title");
			if(ti.getTitle() != null) {
				link.body(ti.getTitle().getValue());
				lItem.appendToBody(link);
			}
			tabs.appendToBody(lItem);
		}
		d.appendToBody(tabs);
		for(UIElement item : items) {
			TabItem ti = (TabItem)item;
			d.appendToBody(f.doSwitch(ti));
		}
		Script rInit = new Script();
		rInit.appendToBody("$(function() {$(\"#" + tv_.getId().getValue() + "\").tabs();});");
		d.appendToBody(rInit);
		return d;
	}
}
