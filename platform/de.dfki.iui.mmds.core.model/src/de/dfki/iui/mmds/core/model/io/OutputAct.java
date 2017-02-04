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
package de.dfki.iui.mmds.core.model.io;

import de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Root element of the output, consisting of a single function to be presented. This request may contain multiple presentation alternatives and be spread accross multiple channels.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.OutputAct#getCommunicativeFunction <em>Communicative Function</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.OutputAct#getPresentation <em>Presentation</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getOutputAct()
 * @model
 * @generated
 */
public interface OutputAct extends CommunicativeAct, OutputMessage {
	/**
	 * Returns the value of the '<em><b>Communicative Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communicative Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communicative Function</em>' containment reference.
	 * @see #setCommunicativeFunction(CommunicativeFunction)
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getOutputAct_CommunicativeFunction()
	 * @model containment="true"
	 * @generated
	 */
	CommunicativeFunction getCommunicativeFunction();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.OutputAct#getCommunicativeFunction <em>Communicative Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communicative Function</em>' containment reference.
	 * @see #getCommunicativeFunction()
	 * @generated
	 */
	void setCommunicativeFunction(CommunicativeFunction value);

	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.io.OutputRepresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Models one or more ways to represent the task. All representations are true at the same time, as with audio and accompanying visual cues.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Presentation</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.io.IoPackage#getOutputAct_Presentation()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputRepresentation> getPresentation();

} // OutputAct
