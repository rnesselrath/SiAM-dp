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

import java.util.Collections;

import org.eclipse.jface.action.Action;

import de.dfki.iui.mmds.core.model.dialogue.Transition;

public class FollowTransitionAction extends Action {

	private final Transition transition;
	private final ProjectEditor editor;

	public FollowTransitionAction(Transition transition, ProjectEditor editor) {
		this.transition = transition;
		this.editor = editor;
	}

	@Override
	public void run() {
		if (transition.getTarget() != null) {
			editor.setSelectionToViewer(Collections.singleton(transition.getTarget()));
		}
	}

	@Override
	public String getText() {
		return "Follow transition to target state";
	}

}
