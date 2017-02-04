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
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.CopyToClipboardCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.PasteAction;

/**
 * A copy action is implemented by creating a {@link CopyToClipboardCommand}.
 */
public class CustomPasteAction extends PasteAction {

	@Override
	public Command createCommand(Collection<?> selection) {
		if (selection.size() == 1)
			return CustomPasteFromClipboardCommand.create(domain, selection.iterator().next(), null);
		else
			return UnexecutableCommand.INSTANCE;
	}

	public static Command create(EditingDomain domain, Object owner, Object feature) {
		return create(domain, owner, feature, CommandParameter.NO_INDEX);
	}

	/**
	 * This creates a command to add copies from the clipboard to the specified
	 * feature of the owner and at the given index.
	 */
	public static Command create(EditingDomain domain, Object owner, Object feature, int index) {
		return new CustomPasteFromClipboardCommand(domain, owner, feature, index, true);
	}

}
