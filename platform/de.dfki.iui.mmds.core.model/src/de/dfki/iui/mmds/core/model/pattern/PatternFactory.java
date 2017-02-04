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
package de.dfki.iui.mmds.core.model.pattern;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.pattern.PatternPackage
 * @generated
 */
public interface PatternFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternFactory eINSTANCE = de.dfki.iui.mmds.core.model.pattern.impl.PatternFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PEmpty Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PEmpty Slot</em>'.
	 * @generated
	 */
	PEmptySlot createPEmptySlot();

	/**
	 * Returns a new object of class '<em>PLogical Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PLogical Formula</em>'.
	 * @generated
	 */
	PLogicalFormula createPLogicalFormula();

	/**
	 * Returns a new object of class '<em>PObject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PObject</em>'.
	 * @generated
	 */
	PObject createPObject();

	/**
	 * Returns a new object of class '<em>PSlot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PSlot</em>'.
	 * @generated
	 */
	PSlot createPSlot();

	/**
	 * Returns a new object of class '<em>PSubscription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PSubscription</em>'.
	 * @generated
	 */
	PSubscription createPSubscription();

	/**
	 * Returns a new object of class '<em>PValue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PValue</em>'.
	 * @generated
	 */
	PValue createPValue();

	/**
	 * Returns a new object of class '<em>PValue Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PValue Object</em>'.
	 * @generated
	 */
	PValueObject createPValueObject();

	/**
	 * Returns a new object of class '<em>PRestrictions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRestrictions</em>'.
	 * @generated
	 */
	PRestrictions createPRestrictions();

	/**
	 * Returns a new object of class '<em>PBoolean Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PBoolean Restriction</em>'.
	 * @generated
	 */
	PBooleanRestriction createPBooleanRestriction();

	/**
	 * Returns a new object of class '<em>PEnum Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PEnum Restriction</em>'.
	 * @generated
	 */
	PEnumRestriction createPEnumRestriction();

	/**
	 * Returns a new object of class '<em>PChar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PChar Restriction</em>'.
	 * @generated
	 */
	PCharRestriction createPCharRestriction();

	/**
	 * Returns a new object of class '<em>PString Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PString Restriction</em>'.
	 * @generated
	 */
	PStringRestriction createPStringRestriction();

	/**
	 * Returns a new object of class '<em>PByte Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PByte Restriction</em>'.
	 * @generated
	 */
	PByteRestriction createPByteRestriction();

	/**
	 * Returns a new object of class '<em>PShort Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PShort Restriction</em>'.
	 * @generated
	 */
	PShortRestriction createPShortRestriction();

	/**
	 * Returns a new object of class '<em>PInteger Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PInteger Restriction</em>'.
	 * @generated
	 */
	PIntegerRestriction createPIntegerRestriction();

	/**
	 * Returns a new object of class '<em>PLong Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PLong Restriction</em>'.
	 * @generated
	 */
	PLongRestriction createPLongRestriction();

	/**
	 * Returns a new object of class '<em>PFloat Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PFloat Restriction</em>'.
	 * @generated
	 */
	PFloatRestriction createPFloatRestriction();

	/**
	 * Returns a new object of class '<em>PDouble Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PDouble Restriction</em>'.
	 * @generated
	 */
	PDoubleRestriction createPDoubleRestriction();

	/**
	 * Returns a new object of class '<em>PDate Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PDate Restriction</em>'.
	 * @generated
	 */
	PDateRestriction createPDateRestriction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PatternPackage getPatternPackage();

} //PatternFactory
