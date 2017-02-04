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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.pattern.PObject#getType <em>Type</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.pattern.PObject#getSlot <em>Slot</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.pattern.PatternPackage#getPObject()
 * @model
 * @generated
 */
public interface PObject extends PPattern {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EClass)
	 * @see de.dfki.iui.mmds.core.model.pattern.PatternPackage#getPObject_Type()
	 * @model required="true"
	 * @generated
	 */
	EClass getType();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.pattern.PObject#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EClass value);

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.iui.mmds.core.model.pattern.PSlot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference list.
	 * @see de.dfki.iui.mmds.core.model.pattern.PatternPackage#getPObject_Slot()
	 * @model containment="true"
	 * @generated
	 */
	EList<PSlot> getSlot();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PSlot getSlot(EStructuralFeature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject createSkeleton();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ppattAnnotation="http://www.eclipse.org/emf/2002/GenModel body='PObject co = EcoreUtil.copy( this );\r\n\r\n// 1) compare the types\r\nEClass eclCo = getType(),\r\n\t   eclBg = bg.getType();\r\nEPackage pCo = eclCo.getEPackage();\r\nEPackage pBg = eclBg.getEPackage();\r\n\r\nif ( !(eclCo.equals( eclBg ) || pCo.getName().equals( pBg.getName() ) || pCo.getNsPrefix().equals( pBg.getNsPrefix() ) || pCo.getNsURI().equals( pBg.getNsURI() )) ) {\r\n\treturn null;\r\n}\r\n\r\n// 2) collect the slots\r\nMap<EStructuralFeature, List< PSlot >> allSlots = new HashMap<>();\r\nEStructuralFeature feat;\r\nPSlot slot;\r\nfor ( EList< ? > slotList : new EList<?>[]{ co.getSlot(), bg.getSlot()} ) {\r\n\tfor ( Object obj : slotList ) {\r\n\t\tslot = (PSlot) obj;\r\n\t\tfeat = slot.getFeature();\r\n\t\tif ( !allSlots.containsKey( feat )) {\r\n\t\t\tallSlots.put( feat, new ArrayList< PSlot >( 2 ));\r\n\t\t}\r\n\t\tallSlots.get( feat ).add( slot );\r\n\t}\r\n}\r\n\r\n// 3) unify all slots with the same feature\r\nco.getSlot().clear();\r\nList< PSlot > slots;\r\nfor ( EStructuralFeature f : allSlots.keySet() ) {\r\n\tslots = allSlots.get( f );\r\n\tslot = slots.get( 0 );\r\n\tfor ( int i = 1, size = slots.size(); i < size; i++ ) {\r\n\t\tslot = slot.unify( slots.get( i ));\r\n\t\tif ( slot == null ) {\r\n\t\t\treturn null;\r\n\t\t}\r\n\t}\r\n\tco.getSlot().add( slot );\r\n}\r\nreturn co;'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return unify( (PObject) ppatt );'"
	 * @generated
	 */
	PPattern unify(PPattern ppatt);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='PObject co = this;\r\n\r\n// 1) compare the types\r\nEClass eclCo = getType(),\r\n\t   eclBg = bg.getType();\r\nEPackage pCo = eclCo.getEPackage();\r\nEPackage pBg = eclBg.getEPackage();\r\n\r\nif ( !(eclCo.equals( eclBg ) || pCo.getName().equals( pBg.getName() ) || pCo.getNsPrefix().equals( pBg.getNsPrefix() ) || pCo.getNsURI().equals( pBg.getNsURI() )) ) {\r\n\treturn null;\r\n}\r\n\r\n// 2) collect the slots\r\nMap<EStructuralFeature, List< PSlot >> allSlots = new HashMap<>();\r\nEStructuralFeature feat;\r\nPSlot slot;\r\nfor ( EList< ? > slotList : new EList<?>[]{ co.getSlot(), bg.getSlot()} ) {\r\n\tfor ( Object obj : slotList ) {\r\n\t\tslot = (PSlot) obj;\r\n\t\tfeat = slot.getFeature();\r\n\t\tif ( !allSlots.containsKey( feat )) {\r\n\t\t\tallSlots.put( feat, new ArrayList< PSlot >( 2 ));\r\n\t\t}\r\n\t\tallSlots.get( feat ).add( slot );\r\n\t}\r\n}\r\n\r\n// 3) unify all slots with the same feature\r\nco.getSlot().clear();\r\nList< PSlot > slots;\r\nfor ( EStructuralFeature f : allSlots.keySet() ) {\r\n\tslots = allSlots.get( f );\r\n\tslot = slots.get( 0 );\r\n\tfor ( int i = 1, size = slots.size(); i < size; i++ ) {\r\n\t\tslot = slot.unify( slots.get( i ));\r\n\t\tif ( slot == null ) {\r\n\t\t\treturn null;\r\n\t\t}\r\n\t}\r\n\tco.getSlot().add( slot );\r\n}\r\nreturn co;'"
	 * @generated
	 */
	PObject unify(PObject bg);

} // PObject
