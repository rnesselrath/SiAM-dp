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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.PasteFromClipboardCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Entity;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Grammar_rulesPackage;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.PhraseMapping;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.SemanticMapping;
import de.dfki.iui.mmds.core.model.speech_recognition.grammar_rules.Utterance;

public class CustomPasteFromClipboardCommand extends PasteFromClipboardCommand {

	public static Command create(EditingDomain domain, Object owner, Object feature) {
		return create(domain, owner, feature, CommandParameter.NO_INDEX);
	}

	public static Command create(EditingDomain domain, Object owner, Object feature, int index) {

		return new CustomPasteFromClipboardCommand(domain, owner, feature, index, true);

	}

	public CustomPasteFromClipboardCommand(EditingDomain domain, Object owner, Object feature, int index, boolean optimize) {
		super(domain, owner, feature, index, optimize);
	}

	public CustomPasteFromClipboardCommand(EditingDomain domain, Object owner, Object feature, int index) {
		super(domain, owner, feature, index);
	}

	@Override
	public boolean doCanExecute() {
		Collection<Object> clipboard = getDomain().getClipboard();
		if (clipboard != null && !clipboard.isEmpty()) {
			Object next = clipboard.iterator().next();
			if (next instanceof Utterance && owner instanceof Utterance || next instanceof Entity && owner instanceof Entity || next instanceof SemanticMapping && owner instanceof SemanticMapping
					|| next instanceof PhraseMapping && owner instanceof PhraseMapping) {
				owner = ((EObject) owner).eContainer();
				optimize = false;
				if (next instanceof PhraseMapping) {
					feature = Grammar_rulesPackage.eINSTANCE.getSemanticMapping_PhraseMappings();
				}
			}
		}
		return super.doCanExecute();
	}

	// this
	@Override
	public void doExecute() {

		Collection<Object> clipboard = getDomain().getClipboard();
		Object next = clipboard.iterator().next();
		if (next instanceof Utterance && owner instanceof Utterance || next instanceof Entity && owner instanceof Entity || next instanceof SemanticMapping && owner instanceof SemanticMapping
				|| next instanceof PhraseMapping && owner instanceof PhraseMapping) {
			owner = ((Utterance) owner).eContainer();
		}
		super.doExecute();
	}

}
