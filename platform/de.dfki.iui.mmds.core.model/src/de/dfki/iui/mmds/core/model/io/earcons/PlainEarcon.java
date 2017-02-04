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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plain Earcon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the shape and attributes of a simple earcon.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.PlainEarcon#getNote <em>Note</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.PlainEarcon#getRegister <em>Register</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.PlainEarcon#getDynamics <em>Dynamics</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getPlainEarcon()
 * @model
 * @generated
 */
public interface PlainEarcon extends EarconStructure {
	/**
	 * Returns the value of the '<em><b>Note</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sequence of notes that makes up the earcon.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' reference list.
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getPlainEarcon_Note()
	 * @model
	 * @generated
	 */
	EList<EarconNote> getNote();

	/**
	 * Returns the value of the '<em><b>Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The register to play the earcon at, in Hz.
	 * "Register refers to the relative highllow of a pitch or a set of pitches. An earcon in the low register sounds "lown; one in the high register sounds "high." If we label the eight octaves in our tonal system 1 to 8, from low to high respectively, we can define an earcon in a low register, Octave 2, for example, as one with pitches entirely contained in one of the lower octaves. Likewise, a motive with medium register has pitches from Octaves 4 or 5, and one with high register has pitches from Octave 7. Register can be creatively manipulated to indicate vertical location or direction in a sightlsound interface. Earcons constructed with pitch sequences contained in the low, medium, or high registers are easily differentiated and, therefore, easily perceived. An earcon can be made to sound very different by changing its register." (Blattner, Sumikawa and Greenberg, 1989)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Register</em>' attribute.
	 * @see #setRegister(float)
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getPlainEarcon_Register()
	 * @model
	 * @generated
	 */
	float getRegister();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.earcons.PlainEarcon#getRegister <em>Register</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register</em>' attribute.
	 * @see #getRegister()
	 * @generated
	 */
	void setRegister(float value);

	/**
	 * Returns the value of the '<em><b>Dynamics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relative volume to play the earcon at.
	 * "Dynamics refers to the relative loudness or softness of an earcon. One can differentiate the relative loudness or softness of an earcon by making its dynamics either constant or variable. Thus, an earcon can be loud for the duration of the motive, soft for the duration of the motive, graded from loud to soft, and graded from soft to loud. Any combination of these four is also possible."  (Blattner, Sumikawa and Greenberg, 1989)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamics</em>' attribute.
	 * @see #setDynamics(float)
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getPlainEarcon_Dynamics()
	 * @model
	 * @generated
	 */
	float getDynamics();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.earcons.PlainEarcon#getDynamics <em>Dynamics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamics</em>' attribute.
	 * @see #getDynamics()
	 * @generated
	 */
	void setDynamics(float value);

} // PlainEarcon
