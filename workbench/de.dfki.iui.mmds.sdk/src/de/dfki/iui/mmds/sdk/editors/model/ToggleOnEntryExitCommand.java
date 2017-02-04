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

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;

public class ToggleOnEntryExitCommand extends CompoundCommand implements CommandActionDelegate {

	public ToggleOnEntryExitCommand(EditingDomain editingDomain, EObject eContainer, EReference eContainmentFeature, Object contentElement) {
		RemoveCommand removeCommand = new RemoveCommand(editingDomain, eContainer, eContainmentFeature, contentElement);
		append(removeCommand);
		EReference targetFeature;
		if (eContainmentFeature.equals(DialoguePackage.eINSTANCE.getState_OnEntry())) {
			targetFeature = DialoguePackage.eINSTANCE.getState_OnExit();
			label = "Toggle to OnExit";
		} else {
			targetFeature = DialoguePackage.eINSTANCE.getState_OnEntry();
			label = "Toggle to OnEntry";
		}
		AddCommand addCommand = new AddCommand(editingDomain, eContainer, targetFeature, contentElement);
		append(addCommand);
		setLabel(label);
	}

	@Override
	public Object getImage() {
		return null;
	}

	@Override
	public String getText() {
		return getLabel();
	}

	@Override
	public String getToolTipText() {
		return null;
	}

}
