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
package de.dfki.iui.mmds.core.model.io.tangible;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.tangible.TangiblePackage
 * @generated
 */
public interface TangibleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TangibleFactory eINSTANCE = de.dfki.iui.mmds.core.model.io.tangible.impl.TangibleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input</em>'.
	 * @generated
	 */
	TangibleInput createTangibleInput();

	/**
	 * Returns a new object of class '<em>Push Button Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Push Button Input</em>'.
	 * @generated
	 */
	PushButtonInput createPushButtonInput();

	/**
	 * Returns a new object of class '<em>Toggle Button Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Toggle Button Input</em>'.
	 * @generated
	 */
	ToggleButtonInput createToggleButtonInput();

	/**
	 * Returns a new object of class '<em>Keyboard Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keyboard Input</em>'.
	 * @generated
	 */
	KeyboardInput createKeyboardInput();

	/**
	 * Returns a new object of class '<em>Turn Dial Finite Discrete Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Dial Finite Discrete Input</em>'.
	 * @generated
	 */
	TurnDialFiniteDiscreteInput createTurnDialFiniteDiscreteInput();

	/**
	 * Returns a new object of class '<em>Turn Dial Finite Continuous Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Dial Finite Continuous Input</em>'.
	 * @generated
	 */
	TurnDialFiniteContinuousInput createTurnDialFiniteContinuousInput();

	/**
	 * Returns a new object of class '<em>Turn Dial Infinite Discrete Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Dial Infinite Discrete Input</em>'.
	 * @generated
	 */
	TurnDialInfiniteDiscreteInput createTurnDialInfiniteDiscreteInput();

	/**
	 * Returns a new object of class '<em>Turn Dial Infinite Continuous Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Dial Infinite Continuous Input</em>'.
	 * @generated
	 */
	TurnDialInfiniteContinuousInput createTurnDialInfiniteContinuousInput();

	/**
	 * Returns a new object of class '<em>Joystick2 DInput</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Joystick2 DInput</em>'.
	 * @generated
	 */
	Joystick2DInput createJoystick2DInput();

	/**
	 * Returns a new object of class '<em>Joystick3 DInput</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Joystick3 DInput</em>'.
	 * @generated
	 */
	Joystick3DInput createJoystick3DInput();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TangiblePackage getTangiblePackage();

} //TangibleFactory
