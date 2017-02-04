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
/**
 */
package de.dfki.iui.mmds.core.model.dialogue;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executable Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Executable content allows the state machine to do things. It provides the hooks that allow an SCXML session to modify its data model and interact with external entities. Executable content consists of actions that are performed as part of taking transitions. In particular, executable content occurs inside <onentry> and <onexit> elements (as well as inside transitions/ COMMENT: actually NOT). When the state machine takes a transition, it executes the <onexit> executable content in the states it is leaving,( followed by the content in the transition), followed by the <onentry> content in the states it is entering.
 * <!-- end-model-doc -->
 *
 *
 * @see de.dfki.iui.mmds.core.model.dialogue.DialoguePackage#getExecutableContent()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ExecutableContent extends EObject {
} // ExecutableContent
