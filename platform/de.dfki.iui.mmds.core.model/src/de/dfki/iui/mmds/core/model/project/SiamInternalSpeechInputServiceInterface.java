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
package de.dfki.iui.mmds.core.model.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Siam Internal Speech Input Service Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interal service interface for speech input. It allows to define an assoicated grammar ruleset.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.project.SiamInternalSpeechInputServiceInterface#getGrammarRulesetId <em>Grammar Ruleset Id</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getSiamInternalSpeechInputServiceInterface()
 * @model
 * @generated
 */
public interface SiamInternalSpeechInputServiceInterface extends SiamInternalServiceInterface {
	/**
	 * Returns the value of the '<em><b>Grammar Ruleset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grammar Ruleset Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grammar Ruleset Id</em>' attribute.
	 * @see #setGrammarRulesetId(String)
	 * @see de.dfki.iui.mmds.core.model.project.ProjectPackage#getSiamInternalSpeechInputServiceInterface_GrammarRulesetId()
	 * @model
	 * @generated
	 */
	String getGrammarRulesetId();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.project.SiamInternalSpeechInputServiceInterface#getGrammarRulesetId <em>Grammar Ruleset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grammar Ruleset Id</em>' attribute.
	 * @see #getGrammarRulesetId()
	 * @generated
	 */
	void setGrammarRulesetId(String value);

} // SiamInternalSpeechInputServiceInterface
