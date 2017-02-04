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
package de.dfki.iui.mmds.core.model.io.gui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.Margin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Margin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.MarginImpl#getTop <em>Top</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.MarginImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.MarginImpl#getRight <em>Right</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.MarginImpl#getBottom <em>Bottom</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.MarginImpl#isIsPercentage <em>Is Percentage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarginImpl extends MinimalEObjectImpl.Container implements Margin {
	/**
	 * The default value of the '{@link #getTop() <em>Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected static final int TOP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTop() <em>Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected int top = TOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected static final int LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected int left = LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected static final int RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected int right = RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected static final int BOTTOM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected int bottom = BOTTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPercentage() <em>Is Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PERCENTAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPercentage() <em>Is Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPercentage()
	 * @generated
	 * @ordered
	 */
	protected boolean isPercentage = IS_PERCENTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.MARGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTop() {
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTop(int newTop) {
		int oldTop = top;
		top = newTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.MARGIN__TOP, oldTop, top));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(int newLeft) {
		int oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.MARGIN__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(int newRight) {
		int oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.MARGIN__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBottom() {
		return bottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottom(int newBottom) {
		int oldBottom = bottom;
		bottom = newBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.MARGIN__BOTTOM, oldBottom, bottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPercentage() {
		return isPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPercentage(boolean newIsPercentage) {
		boolean oldIsPercentage = isPercentage;
		isPercentage = newIsPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.MARGIN__IS_PERCENTAGE, oldIsPercentage, isPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuiPackage.MARGIN__TOP:
				return getTop();
			case GuiPackage.MARGIN__LEFT:
				return getLeft();
			case GuiPackage.MARGIN__RIGHT:
				return getRight();
			case GuiPackage.MARGIN__BOTTOM:
				return getBottom();
			case GuiPackage.MARGIN__IS_PERCENTAGE:
				return isIsPercentage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GuiPackage.MARGIN__TOP:
				setTop((Integer)newValue);
				return;
			case GuiPackage.MARGIN__LEFT:
				setLeft((Integer)newValue);
				return;
			case GuiPackage.MARGIN__RIGHT:
				setRight((Integer)newValue);
				return;
			case GuiPackage.MARGIN__BOTTOM:
				setBottom((Integer)newValue);
				return;
			case GuiPackage.MARGIN__IS_PERCENTAGE:
				setIsPercentage((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GuiPackage.MARGIN__TOP:
				setTop(TOP_EDEFAULT);
				return;
			case GuiPackage.MARGIN__LEFT:
				setLeft(LEFT_EDEFAULT);
				return;
			case GuiPackage.MARGIN__RIGHT:
				setRight(RIGHT_EDEFAULT);
				return;
			case GuiPackage.MARGIN__BOTTOM:
				setBottom(BOTTOM_EDEFAULT);
				return;
			case GuiPackage.MARGIN__IS_PERCENTAGE:
				setIsPercentage(IS_PERCENTAGE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GuiPackage.MARGIN__TOP:
				return top != TOP_EDEFAULT;
			case GuiPackage.MARGIN__LEFT:
				return left != LEFT_EDEFAULT;
			case GuiPackage.MARGIN__RIGHT:
				return right != RIGHT_EDEFAULT;
			case GuiPackage.MARGIN__BOTTOM:
				return bottom != BOTTOM_EDEFAULT;
			case GuiPackage.MARGIN__IS_PERCENTAGE:
				return isPercentage != IS_PERCENTAGE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (top: ");
		result.append(top);
		result.append(", left: ");
		result.append(left);
		result.append(", right: ");
		result.append(right);
		result.append(", bottom: ");
		result.append(bottom);
		result.append(", isPercentage: ");
		result.append(isPercentage);
		result.append(')');
		return result.toString();
	}

} //MarginImpl
