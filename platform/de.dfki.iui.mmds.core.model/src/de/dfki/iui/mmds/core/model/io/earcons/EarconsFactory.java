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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.earcons.EarconsPackage
 * @generated
 */
public interface EarconsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EarconsFactory eINSTANCE = de.dfki.iui.mmds.core.model.io.earcons.impl.EarconsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Auditory Icon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auditory Icon</em>'.
	 * @generated
	 */
	AuditoryIcon createAuditoryIcon();

	/**
	 * Returns a new object of class '<em>Earcon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earcon</em>'.
	 * @generated
	 */
	Earcon createEarcon();

	/**
	 * Returns a new object of class '<em>Reference Earcon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Earcon</em>'.
	 * @generated
	 */
	ReferenceEarcon createReferenceEarcon();

	/**
	 * Returns a new object of class '<em>Plain Earcon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Earcon</em>'.
	 * @generated
	 */
	PlainEarcon createPlainEarcon();

	/**
	 * Returns a new object of class '<em>Earcon Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earcon Note</em>'.
	 * @generated
	 */
	EarconNote createEarconNote();

	/**
	 * Returns a new object of class '<em>Combined Earcon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combined Earcon</em>'.
	 * @generated
	 */
	CombinedEarcon createCombinedEarcon();

	/**
	 * Returns a new object of class '<em>Inherited Earcon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inherited Earcon</em>'.
	 * @generated
	 */
	InheritedEarcon createInheritedEarcon();

	/**
	 * Returns a new object of class '<em>Inherited Earcon Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inherited Earcon Layer</em>'.
	 * @generated
	 */
	InheritedEarconLayer createInheritedEarconLayer();

	/**
	 * Returns a new object of class '<em>Transformed Earcon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformed Earcon</em>'.
	 * @generated
	 */
	TransformedEarcon createTransformedEarcon();

	/**
	 * Returns a new object of class '<em>Spearcon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spearcon</em>'.
	 * @generated
	 */
	Spearcon createSpearcon();

	/**
	 * Returns a new object of class '<em>Semanticon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semanticon</em>'.
	 * @generated
	 */
	Semanticon createSemanticon();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EarconsPackage getEarconsPackage();

} //EarconsFactory
