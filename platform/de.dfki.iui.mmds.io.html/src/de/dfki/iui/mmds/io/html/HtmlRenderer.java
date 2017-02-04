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
package de.dfki.iui.mmds.io.html;

import java.util.Map;

import org.apache.log4j.Logger;
import org.osgi.service.component.ComponentContext;

import de.dfki.iui.mmds.core.interfaces.IProjectManager;
import de.dfki.iui.mmds.core.model.io.gui.GUIApplication;
import de.dfki.iui.mmds.core.model.io.gui.GuiPlugin;
import de.dfki.iui.mmds.core.model.io.gui.UIElement;
import de.dfki.iui.mmds.core.model.io.gui.Window;
import de.dfki.iui.mmds.io.html.util.HtmlFactory;
import de.dfki.iui.mmds.io.html.util.HtmlRenderResult;
import uk.co.wireweb.web.html.Tag;
import uk.co.wireweb.web.html.html5.tag.Body;
import uk.co.wireweb.web.html.html5.tag.Div;
import uk.co.wireweb.web.html.html5.tag.Head;
import uk.co.wireweb.web.html.html5.tag.Html;
import uk.co.wireweb.web.html.html5.tag.Link;
import uk.co.wireweb.web.html.html5.tag.Script;

public class HtmlRenderer implements Renderer {

	private final ComponentContext context;

	public HtmlRenderer(ComponentContext context) {
		this.context = context;
	}

	/**
	 * 
	 * @return
	 */
	private static Logger getLogger() {
		return Logger.getLogger(HtmlRenderer.class);
	}

	/**
	 * Render application
	 */
	@Override
	public HtmlRenderResult render(GUIApplication app, boolean generatePage, Map<String, String> pageVars) {
		Div mainDiv = HtmlFactory.makeMainContainer();
		if (generatePage) {
			Html html = generatePage(app);
			Body body = HtmlFactory.makeBody(app);
			body.appendToBody(generatePageConstants(pageVars));
			body.appendToBody(mainDiv);
			html.appendToBody(body);
			return new HtmlRenderResult("", html, new Link());
		}
		Link appSheet = HtmlFactory.makeAppStyleImport(app);
		HtmlRenderResult res = renderWindow(app.getWindow());
		res.setStyle(appSheet);
		return res;
	}

	/**
	 * 
	 */
	@Override
	public HtmlRenderResult renderWindow(Window window) {
		HtmlFactory f = new HtmlFactory();
		String wTitle = "";
		if (window.getTitle() != null && !window.getTitle().getValue().isEmpty()) {
			wTitle = window.getTitle().getValue();
		}
		Tag<?> contents = f.doSwitch(window.getElements().get(0));
		HtmlRenderResult res = new HtmlRenderResult(wTitle, contents, null);
		executePlugins(window, res);
		return res;
	}

	/**
	 * 
	 */
	@Override
	public HtmlRenderResult renderElement(UIElement element) {
		if (element == null)
			return null;
		HtmlFactory f = new HtmlFactory();
		Tag<?> contents = f.doSwitch(element);
		HtmlRenderResult res = new HtmlRenderResult("", contents, null);
		return res;
	}

	private void executePlugins(Window window, HtmlRenderResult res) {
		if (window != null) {
			for (GuiPlugin plugin : window.getPlugins()) {
				try {
					ComponentContext applicationContext = ((IProjectManager) context.locateService("ProjectManager")).getApplicationContext();
					Class<?> loadClass = applicationContext.getBundleContext().getBundle().loadClass(plugin.getClassName().getValue());
					Object pluginInstance = loadClass.newInstance();
					if (pluginInstance instanceof HtmlPlugin) {
						((HtmlPlugin) pluginInstance).execute(res);
					} else {
						getLogger().error(plugin.getClassName() + " is not an instance of HtmlPlugin");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 
	 * @param app
	 * @return
	 */
	private Html generatePage(GUIApplication app) {
		Html html = HtmlFactory.makeHtml(app);
		Head head = HtmlFactory.makeHead(app);
		HtmlFactory.addJqueryRef(head);
		html.appendToBody(head);
		return html;
	}

	/**
	 * 
	 * @param pageVars
	 * @return
	 */
	private Tag<?> generatePageConstants(Map<String, String> pageVars) {
		Script s = new Script();
		if (pageVars != null) {
			for (Map.Entry<String, String> var : pageVars.entrySet()) {
				s.appendToBody("var " + var.getKey() + "=\"" + var.getValue() + "\";\n");
			}
		}
		return s;
	}

}
