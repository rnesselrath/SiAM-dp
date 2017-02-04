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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PNumber Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.pattern.PNumberRestriction#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see de.dfki.iui.mmds.core.model.pattern.PatternPackage#getPNumberRestriction()
 * @model abstract="true"
 * @generated
 */
public interface PNumberRestriction<V> extends PRestriction<PNumberRestrictionEnum, V> {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.iui.mmds.core.model.pattern.PNumberRestrictionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.pattern.PNumberRestrictionEnum
	 * @see #setFunction(PNumberRestrictionEnum)
	 * @see de.dfki.iui.mmds.core.model.pattern.PatternPackage#getPNumberRestriction_Function()
	 * @model required="true"
	 * @generated
	 */
	PNumberRestrictionEnum getFunction();

	/**
	 * Sets the value of the '{@link de.dfki.iui.mmds.core.model.pattern.PNumberRestriction#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see de.dfki.iui.mmds.core.model.pattern.PNumberRestrictionEnum
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(PNumberRestrictionEnum value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='switch (function) {\r\ncase EQUALS:\r\n\tif (compareToResult == 0)\r\n\t\treturn true;\r\n\tbreak;\r\ncase GREATER_EQUALS:\r\n\tif (compareToResult >= 0)\r\n\t\treturn true;\r\n\tbreak;\r\ncase GREATER_THAN:\r\n\tif (compareToResult > 0)\r\n\t\treturn true;\r\n\tbreak;\r\ncase LESS_EQUALS:\r\n\tif (compareToResult <= 0)\r\n\t\treturn true;\r\n\tbreak;\r\ncase LESS_THAN:\r\n\tif (compareToResult < 0)\r\n\t\treturn true;\r\n\tbreak;\r\ncase NOT_EQUALS:\r\n\tif (compareToResult != 0)\r\n\t\treturn true;\r\n\tbreak;\r\ndefault:\r\n\tbreak;\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean _compareTo(int compareToResult, PNumberRestrictionEnum function);

} // PNumberRestriction
