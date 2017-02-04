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

import de.dfki.iui.mmds.core.model.base.BObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earcon Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a single note / tone in the earcon.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getPitch <em>Pitch</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getPause <em>Pause</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getIntensityBegin <em>Intensity Begin</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getIntensityEnd <em>Intensity End</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getTimbre <em>Timbre</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getEarconNote()
 * @model
 * @generated
 */
public interface EarconNote extends BObject {
	/**
	 * Returns the value of the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pitch of the note in Hz.
	 * "The pitch sequence of motives can take a variety of forms because so many pitches are available. Most computer users are familiar with the tonal system of eight octaves of 12 pitches each. In theory then, 96 unique one-pitch earcons, 9,216 two-pitch motives, 884,736 three-pitch motives, and 84,934,656 four-pitch motives are possible. In reality, however, it is difficult to distinguish the fundamental frequency of very low and very high pitches. This, along with the difficulty of reproducing such extreme frequencies, eliminates these outer octaves from consideration. In addition, motives constructed of random pitches from these 96 available are undesirable. The pitches chosen for a particular motive are important. All pitches in a motive should be chosen from the same octave to avoid problems inherent in octave perception. This also facilitates changing the register of the pitch sequence." (Blattner, Sumikawa and Greenberg, 1989)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pitch</em>' attribute.
	 * @see #setPitch(int)
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getEarconNote_Pitch()
	 * @model
	 * @generated
	 */
	int getPitch();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getPitch <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pitch</em>' attribute.
	 * @see #getPitch()
	 * @generated
	 */
	void setPitch(int value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Length of the tone in milliseconds. This is part of the description of the rhythms of the earcon.
	 * "Rhythm is the most prominent characteristic of a motive. Listeners respond more readily to rhythm than to any other musical parameter. Kerman (1980) stated that 'No single feature of music, not even melody, determines the effect of music more crucially than the timing and weighting of notes' (p. 5). In music, duration is indicated with note values. Common time divisions and their iconic notations are listed in Figure 7. A whole note is generally given the longest time value." (Blattner, Sumikawa and Greenberg, 1989)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getEarconNote_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Pause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Length of the silence after the note in milliseconds. This is part of the description of the rhythms of the earcon.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pause</em>' attribute.
	 * @see #setPause(int)
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getEarconNote_Pause()
	 * @model
	 * @generated
	 */
	int getPause();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getPause <em>Pause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pause</em>' attribute.
	 * @see #getPause()
	 * @generated
	 */
	void setPause(int value);

	/**
	 * Returns the value of the '<em><b>Intensity Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the dynamics of the earcon at this specific note. More specifically, this value refers to the volume at the beginning of the tone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intensity Begin</em>' attribute.
	 * @see #setIntensityBegin(float)
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getEarconNote_IntensityBegin()
	 * @model
	 * @generated
	 */
	float getIntensityBegin();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getIntensityBegin <em>Intensity Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intensity Begin</em>' attribute.
	 * @see #getIntensityBegin()
	 * @generated
	 */
	void setIntensityBegin(float value);

	/**
	 * Returns the value of the '<em><b>Intensity End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the dynamics of the earcon at this specific note. More specifically, this value refers to the volume at the end of the tone. If the volumes differ between beginning and end, a fade effect is generated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intensity End</em>' attribute.
	 * @see #setIntensityEnd(float)
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getEarconNote_IntensityEnd()
	 * @model
	 * @generated
	 */
	float getIntensityEnd();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getIntensityEnd <em>Intensity End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intensity End</em>' attribute.
	 * @see #getIntensityEnd()
	 * @generated
	 */
	void setIntensityEnd(float value);

	/**
	 * Returns the value of the '<em><b>Timbre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the general sound (or "color") that is used to generate the signal. Basic timbres are "sine", "square", and "sawtooth". Furthermore, the output component may have a library of other sounds and instruments that can be used.
	 * "Timbre is a tonal attribute that refers to the quality or 'color' of a sound. Musical instruments sound different because the physical makeup of their sound differs. For example, the same note played on a piano and clarinet sounds different because each instrument has its own peculiar set of waveforms and harmonics. The timbre of a sound is usually described with adjectives such as bright, warm, harsh, hollow, twangy, or brassy. Even though timbre is difficult to describe and notate precisely, it is one of the most immediate and easily recognizable characteristics of sound (Kerman, 1980). Earcons assembled by novice users should be made from a set of brisic, easily differentiated waveforms. The sinusoidal waveform will be 'timbreless' because it is pure, unmodulated sound. The sine wave lacks timbre in the same sense that white lacks color. To alter our perception of a given earcon, we can simply change the earcon's waveform, thereby producing a different timbre." (Blattner, Sumikawa and Greenberg, 1989)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timbre</em>' attribute.
	 * @see #setTimbre(String)
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getEarconNote_Timbre()
	 * @model
	 * @generated
	 */
	String getTimbre();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.earcons.EarconNote#getTimbre <em>Timbre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timbre</em>' attribute.
	 * @see #getTimbre()
	 * @generated
	 */
	void setTimbre(String value);

} // EarconNote
