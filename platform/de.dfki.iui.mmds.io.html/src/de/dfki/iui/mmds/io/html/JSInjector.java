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

import java.net.URL;
import java.util.List;

import uk.co.wireweb.web.html.html5.tag.Script;
import de.dfki.iui.mmds.io.html.util.HtmlRenderResult;

public abstract class JSInjector implements HtmlPlugin {

	@Override
	public void execute(HtmlRenderResult outputHtml) {
		String urls = new String("'"+getScripts().get(0)+"'");
		for(int i=1; i < getScripts().size();++i) {
			urls += ",'"+getScripts().get(i)+"'";			
		}
		Script sc = new Script();
		sc.appendToBody("loadScripts(["+urls.toString()+"],function(){"+getScriptBody()+"});");
		outputHtml.getContents().appendToBody(sc);
	}
	/**
	 * Returns Javascript code which is injected to a webpage
	 * @return
	 */
	protected abstract String getScriptBody();
	/**
	 * Attach other javascript resources
	 * @return
	 */
	protected abstract List<URL> getScripts();

}
