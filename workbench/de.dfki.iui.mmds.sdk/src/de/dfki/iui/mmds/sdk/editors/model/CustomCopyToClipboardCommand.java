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
package de.dfki.iui.mmds.sdk.editors.model;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CopyToClipboardCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.widgets.Display;

public class CustomCopyToClipboardCommand extends CopyToClipboardCommand {

	/**
	 * This constructs a command that copies the given collection of objects to
	 * the clipboard.
	 */
	public CustomCopyToClipboardCommand(EditingDomain domain, Collection<?> collection) {
		super(domain, collection);
	}

	public static Command create(EditingDomain domain, final Collection<?> collection) {
		CustomCopyToClipboardCommand command = new CustomCopyToClipboardCommand(domain, collection);
		return command;
	}

	@Override
	public void doExecute() {
		super.doExecute();
		Clipboard clipboard = new Clipboard(Display.getDefault());
		TextTransfer transfer = TextTransfer.getInstance();
		StringBuilder lines = new StringBuilder();
		if (!sourceObjects.isEmpty()) {
			for (Object line : sourceObjects) {
				if (line instanceof String) {
					lines.append(line);
					lines.append('\n');
				}
			}
		}
		if (lines.length() > 0)
			clipboard.setContents(new Object[] { lines.toString() }, new TextTransfer[] { transfer });
	}

}
