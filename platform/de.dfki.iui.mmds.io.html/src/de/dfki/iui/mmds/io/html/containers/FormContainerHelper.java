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
import de.dfki.iui.mmds.core.model.io.gui.Form;
import de.dfki.iui.mmds.core.model.io.gui.UIElement;
import de.dfki.iui.mmds.io.html.util.HtmlFactory;

public class FormContainerHelper {
	private final Form cont_;

	public FormContainerHelper(Form f) {
		cont_ = f;
	}

	public Tag<?> createFormContainer() {
		HtmlFactory f = new HtmlFactory();
		Tag<?> form = HtmlFactory.makeForm(cont_);
		EList<UIElement> eList = cont_.getElements();
		for (UIElement el : eList) {
			if (el != null) {
				Tag<?> contents = f.doSwitch(el);
				if (contents != null) {
					form.appendToBody(contents);
				}
			}
		}
		return form;
	}
}
