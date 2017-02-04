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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.StaticSelectionCommandAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;

import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;
import de.dfki.iui.mmds.core.model.dialogue.ExecutableContent;

/**
 * A child creation action is implemented by creating a
 * {@link CreateChildCommand}.
 */
public class ToggleOnEntryExitAction extends StaticSelectionCommandAction {

	/**
	 * This constructs an instance of an action that uses the workbench part's
	 * editing domain to create a child specified by <code>descriptor</code> for
	 * the single object in the <code>selection</code>.
	 * 
	 * @since 2.1.0
	 */
	public ToggleOnEntryExitAction(IWorkbenchPart workbenchPart, ISelection selection) {
		super(workbenchPart);
		configureAction(selection);
	}

	/**
	 * This constructor is simply retained for binary compatibility. It just
	 * calls the {@link #MoveContentAction(IWorkbenchPart, ISelection, Object)
	 * new form}.
	 */
	public ToggleOnEntryExitAction(IEditorPart editorPart, ISelection selection) {
		this((IWorkbenchPart) editorPart, selection);
	}

	/**
	 * This constructs an instance of an action that uses the given editing
	 * domain to create a child specified by <code>descriptor</code> for the
	 * single object in the <code>selection</code>.
	 * 
	 * @since 2.4.0
	 */
	public ToggleOnEntryExitAction(EditingDomain editingDomain, ISelection selection) {
		super(editingDomain);
		configureAction(selection);
	}

	/**
	 * This creates the command for
	 * {@link StaticSelectionCommandAction#createActionCommand}.
	 */
	@Override
	protected Command createActionCommand(EditingDomain editingDomain, Collection<?> collection) {
		if (collection.size() == 1) {
			Object selectedElement = collection.iterator().next();
			if (DialoguePackage.eINSTANCE.getExecutableContent().isInstance(selectedElement)) {
				ExecutableContent executableContent = (ExecutableContent) selectedElement;
				EObject eContainer = executableContent.eContainer();
				EReference eContainmentFeature = executableContent.eContainmentFeature();
				return new ToggleOnEntryExitCommand(editingDomain, eContainer, eContainmentFeature, selectedElement);
			}
		}
		return UnexecutableCommand.INSTANCE;
	}
}
