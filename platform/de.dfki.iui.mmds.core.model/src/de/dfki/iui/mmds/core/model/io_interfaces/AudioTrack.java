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
package de.dfki.iui.mmds.core.model.io_interfaces;

import de.dfki.iui.mmds.core.emf.datatypes.BString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A request to play a pre-recorded audio track. Semantics are not part of this definition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.AudioTrack#getTrackId <em>Track Id</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io_interfaces.AudioTrack#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getAudioTrack()
 * @model
 * @generated
 */
public interface AudioTrack extends RendererOutput {
	/**
	 * Returns the value of the '<em><b>Track Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A lookup code that may tell the output device which track to play.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Track Id</em>' attribute.
	 * @see #setTrackId(BString)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getAudioTrack_TrackId()
	 * @model dataType="de.dfki.iui.mmds.core.model.base.BString"
	 * @generated
	 */
	BString getTrackId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.AudioTrack#getTrackId <em>Track Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Id</em>' attribute.
	 * @see #getTrackId()
	 * @generated
	 */
	void setTrackId(BString value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An URL where the track data can be obtained, if available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see de.dfki.iui.mmds.core.model.io_interfaces.Io_interfacesPackage#getAudioTrack_Uri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io_interfaces.AudioTrack#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // AudioTrack
