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
package de.dfki.iui.mmds.core.model.io.earcons;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earcon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A request to output a non-speech cue with a certain semantics. Examples: warning signal, information signal, recording signal etc.
 * "For many items where there is no clear iconic representation, earcons can yield an effective sonification. Earcons are abstract, synthetic and mostly musical tones or sound patterns that can be used in structured combinations. They are non-verbal audio messages, which are 'composed of motives, which are short, rhythmic sequences of pitches with variable intensity, timbre and register'. [...] Earcons are used, for example, as a method to add context to a menu in a user interface, helping the user maintain awareness of where in the tree he or she is currently located. Nevertheless, the relationship between the earcon and the object has a more or less metaphorical character. A three-note pattern representing the deletion of a file through decreasing loudness and pitch is an example of an earcon for deleting a file, with the diminishing loudness and pitch of the sound representing the deletion." (Dingler et al., 2008)
 * This earcon model is based on Blattner, Sumikawa and Greenberg (1989).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.Earcon#getConstruction <em>Construction</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.Earcon#getSeverity <em>Severity</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.Earcon#getVolume <em>Volume</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.Earcon#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getEarcon()
 * @model
 * @generated
 */
public interface Earcon extends EObject {
	/**
	 * Returns the value of the '<em><b>Construction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structure of this earcon. There are multiple ways of describing the structure, represented by the derived types.
	 * Giving a structure description is optional. If none is given, the output module can derive one from the communicative function of the message. I.e. it will choose an earcon that best matches the character.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Construction</em>' reference.
	 * @see #setConstruction(EarconStructure)
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getEarcon_Construction()
	 * @model
	 * @generated
	 */
	EarconStructure getConstruction();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.earcons.Earcon#getConstruction <em>Construction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Construction</em>' reference.
	 * @see #getConstruction()
	 * @generated
	 */
	void setConstruction(EarconStructure value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If no exact structure description is given for this earcon, it will be based on the communicative function and specification of severity. For example, a warning can be light or severe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(float)
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getEarcon_Severity()
	 * @model
	 * @generated
	 */
	float getSeverity();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.earcons.Earcon#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(float value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The global volume to play the earcon at. The default is full (1).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(float)
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getEarcon_Volume()
	 * @model
	 * @generated
	 */
	float getVolume();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.earcons.Earcon#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(float value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The global speed to play the earcon at. The default is normal (1).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(float)
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getEarcon_Speed()
	 * @model
	 * @generated
	 */
	float getSpeed();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.earcons.Earcon#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(float value);

} // Earcon
