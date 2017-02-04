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
package de.dfki.iui.mmds.io.html.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import uk.co.wireweb.web.html.Tag;
import uk.co.wireweb.web.html.html5.StandardAttributesTag;
import de.dfki.iui.mmds.core.model.io.gui.UIElement;

public class StyleBuilder {
	private Map<String, String> styles = new HashMap<String, String>();
	private ArrayList<String> styleNames = new ArrayList<String>();
	/**
	 * 
	 */
	public StyleBuilder() {
	}
	/**
	 * 
	 */
	public void addStyle(String key, String value) {
		styles.put(key, value);		
	}
	
	public void addStyleName(String name) {
		styleNames.add(name);
	}
	
	public void fillTagClasses(Tag<?> tag) {
		String classes = "";
		for (int i = 0; i < styleNames.size();++i) {
			if (i==0)
				classes+=styleNames.get(i);
			else 
				classes += " "+styleNames.get(i);
		}
		if (!classes.equals(""))
			tag.attribute("class", classes);
	}
	
	/**
	 * 
	 */
	public String toString() {
		if (styles.size() == 0) {
			return "";
		}
		StringBuilder style = new StringBuilder();
		for (Entry<String, String> entry : styles.entrySet()) {
			style.append(entry.getKey()+":"+entry.getValue()+";");
		}
		return style.toString();
		
	}
	/**
	 * 
	 * @param tag
	 */
	public void fillTag(StandardAttributesTag<?> tag) {
		if (tag.getAttribute("style") == null) {
			tag.style(toString());
		} else {
			tag.style(tag.getAttribute("style") + toString());
		}
	}
	/**
	 * 
	 * @param tag
	 * @param element
	 */
	public static void addPaddings(Tag<?> tag, UIElement element) {
		String style = tag.getAttribute("style");
		if (style == null)
			style = "";
		int x = element.getX().getValue();
		int y = element.getY().getValue();
		style += CSS.MARGIN_LEFT+":"+Integer.toString(x)+";";
		style += CSS.MARGIN_TOP + ":"+Integer.toString(y)+";";
		style += CSS.DISPLAY+":"+"inline"+";";
		tag.attribute("style", style);
	}
	
}
