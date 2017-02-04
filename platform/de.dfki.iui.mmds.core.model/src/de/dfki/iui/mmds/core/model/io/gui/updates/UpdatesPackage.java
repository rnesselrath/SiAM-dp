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
package de.dfki.iui.mmds.core.model.io.gui.updates;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dfki.iui.mmds.core.model.io.gui.updates.UpdatesFactory
 * @model kind="package"
 * @generated
 */
public interface UpdatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "updates";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/iui/mmds/core/model/io/gui/updates";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "updates";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UpdatesPackage eINSTANCE = de.dfki.iui.mmds.core.model.io.gui.updates.impl.UpdatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.updates.impl.UIElementUpdateImpl <em>UI Element Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.updates.impl.UIElementUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.updates.impl.UpdatesPackageImpl#getUIElementUpdate()
	 * @generated
	 */
	int UI_ELEMENT_UPDATE = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT_UPDATE__BINDING = GuiPackage.UPDATE_INFO__BINDING;

	/**
	 * The feature id for the '<em><b>Update Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT_UPDATE__UPDATE_MAP = GuiPackage.UPDATE_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UI Element Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT_UPDATE_FEATURE_COUNT = GuiPackage.UPDATE_INFO_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.updates.impl.TextInputUpdateImpl <em>Text Input Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.updates.impl.TextInputUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.updates.impl.UpdatesPackageImpl#getTextInputUpdate()
	 * @generated
	 */
	int TEXT_INPUT_UPDATE = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_UPDATE__BINDING = UI_ELEMENT_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Update Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_UPDATE__UPDATE_MAP = UI_ELEMENT_UPDATE__UPDATE_MAP;

	/**
	 * The number of structural features of the '<em>Text Input Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_UPDATE_FEATURE_COUNT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.iui.mmds.core.model.io.gui.updates.impl.LabelUpdateImpl <em>Label Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.iui.mmds.core.model.io.gui.updates.impl.LabelUpdateImpl
	 * @see de.dfki.iui.mmds.core.model.io.gui.updates.impl.UpdatesPackageImpl#getLabelUpdate()
	 * @generated
	 */
	int LABEL_UPDATE = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_UPDATE__BINDING = UI_ELEMENT_UPDATE__BINDING;

	/**
	 * The feature id for the '<em><b>Update Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_UPDATE__UPDATE_MAP = UI_ELEMENT_UPDATE__UPDATE_MAP;

	/**
	 * The number of structural features of the '<em>Label Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_UPDATE_FEATURE_COUNT = UI_ELEMENT_UPDATE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.updates.UIElementUpdate <em>UI Element Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Element Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.updates.UIElementUpdate
	 * @generated
	 */
	EClass getUIElementUpdate();

	/**
	 * Returns the meta object for the map '{@link de.dfki.iui.mmds.core.model.io.gui.updates.UIElementUpdate#getUpdateMap <em>Update Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Update Map</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.updates.UIElementUpdate#getUpdateMap()
	 * @see #getUIElementUpdate()
	 * @generated
	 */
	EReference getUIElementUpdate_UpdateMap();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.updates.TextInputUpdate <em>Text Input Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Input Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.updates.TextInputUpdate
	 * @generated
	 */
	EClass getTextInputUpdate();

	/**
	 * Returns the meta object for class '{@link de.dfki.iui.mmds.core.model.io.gui.updates.LabelUpdate <em>Label Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Update</em>'.
	 * @see de.dfki.iui.mmds.core.model.io.gui.updates.LabelUpdate
	 * @generated
	 */
	EClass getLabelUpdate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UpdatesFactory getUpdatesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.updates.impl.UIElementUpdateImpl <em>UI Element Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.updates.impl.UIElementUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.updates.impl.UpdatesPackageImpl#getUIElementUpdate()
		 * @generated
		 */
		EClass UI_ELEMENT_UPDATE = eINSTANCE.getUIElementUpdate();

		/**
		 * The meta object literal for the '<em><b>Update Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ELEMENT_UPDATE__UPDATE_MAP = eINSTANCE.getUIElementUpdate_UpdateMap();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.updates.impl.TextInputUpdateImpl <em>Text Input Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.updates.impl.TextInputUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.updates.impl.UpdatesPackageImpl#getTextInputUpdate()
		 * @generated
		 */
		EClass TEXT_INPUT_UPDATE = eINSTANCE.getTextInputUpdate();

		/**
		 * The meta object literal for the '{@link de.dfki.iui.mmds.core.model.io.gui.updates.impl.LabelUpdateImpl <em>Label Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.iui.mmds.core.model.io.gui.updates.impl.LabelUpdateImpl
		 * @see de.dfki.iui.mmds.core.model.io.gui.updates.impl.UpdatesPackageImpl#getLabelUpdate()
		 * @generated
		 */
		EClass LABEL_UPDATE = eINSTANCE.getLabelUpdate();

	}

} //UpdatesPackage
