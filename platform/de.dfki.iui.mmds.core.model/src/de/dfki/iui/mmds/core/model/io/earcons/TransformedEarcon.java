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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformed Earcon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An earcon that is created by transforming another one (see Blattner, Sumikawa and Greenberg, 1989).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.TransformedEarcon#getBase <em>Base</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.earcons.TransformedEarcon#getModification <em>Modification</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getTransformedEarcon()
 * @model
 * @generated
 */
public interface TransformedEarcon extends EarconStructure {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base earcon that is being transformed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(EarconStructure)
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getTransformedEarcon_Base()
	 * @model required="true"
	 * @generated
	 */
	EarconStructure getBase();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.earcons.TransformedEarcon#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(EarconStructure value);

	/**
	 * Returns the value of the '<em><b>Modification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The transformation being applied. Only The attributes specified in this object will be changed in a relative (additive) manner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modification</em>' reference.
	 * @see #setModification(PlainEarcon)
	 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage#getTransformedEarcon_Modification()
	 * @model required="true"
	 * @generated
	 */
	PlainEarcon getModification();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.io.earcons.TransformedEarcon#getModification <em>Modification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification</em>' reference.
	 * @see #getModification()
	 * @generated
	 */
	void setModification(PlainEarcon value);

} // TransformedEarcon
