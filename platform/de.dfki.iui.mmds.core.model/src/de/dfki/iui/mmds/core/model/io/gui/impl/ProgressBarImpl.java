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

import de.dfki.iui.mmds.core.emf.datatypes.BBoolean;
import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.model.base.BaseFactory;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.ProgressBar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Progress Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ProgressBarImpl#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ProgressBarImpl#getDeterminate <em>Determinate</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.ProgressBarImpl#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgressBarImpl extends UIElementImpl implements ProgressBar {
	/**
	 * The default value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger PERCENTAGE_EDEFAULT = (BInteger)BaseFactory.eINSTANCE.createFromString(BasePackage.eINSTANCE.getBInteger(), "10");

	/**
	 * The cached value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected BInteger percentage = PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeterminate() <em>Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeterminate()
	 * @generated
	 * @ordered
	 */
	protected static final BBoolean DETERMINATE_EDEFAULT = (BBoolean)BaseFactory.eINSTANCE.createFromString(BasePackage.eINSTANCE.getBBoolean(), "true");

	/**
	 * The cached value of the '{@link #getDeterminate() <em>Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeterminate()
	 * @generated
	 * @ordered
	 */
	protected BBoolean determinate = DETERMINATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger MAX_EDEFAULT = (BInteger)BaseFactory.eINSTANCE.createFromString(BasePackage.eINSTANCE.getBInteger(), "100");

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected BInteger max = MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgressBarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.PROGRESS_BAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BInteger getPercentage() {
		return percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentage(BInteger newPercentage) {
		BInteger oldPercentage = percentage;
		percentage = newPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.PROGRESS_BAR__PERCENTAGE, oldPercentage, percentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BBoolean getDeterminate() {
		return determinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeterminate(BBoolean newDeterminate) {
		BBoolean oldDeterminate = determinate;
		determinate = newDeterminate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.PROGRESS_BAR__DETERMINATE, oldDeterminate, determinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BInteger getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(BInteger newMax) {
		BInteger oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.PROGRESS_BAR__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuiPackage.PROGRESS_BAR__PERCENTAGE:
				return getPercentage();
			case GuiPackage.PROGRESS_BAR__DETERMINATE:
				return getDeterminate();
			case GuiPackage.PROGRESS_BAR__MAX:
				return getMax();
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
			case GuiPackage.PROGRESS_BAR__PERCENTAGE:
				setPercentage((BInteger)newValue);
				return;
			case GuiPackage.PROGRESS_BAR__DETERMINATE:
				setDeterminate((BBoolean)newValue);
				return;
			case GuiPackage.PROGRESS_BAR__MAX:
				setMax((BInteger)newValue);
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
			case GuiPackage.PROGRESS_BAR__PERCENTAGE:
				setPercentage(PERCENTAGE_EDEFAULT);
				return;
			case GuiPackage.PROGRESS_BAR__DETERMINATE:
				setDeterminate(DETERMINATE_EDEFAULT);
				return;
			case GuiPackage.PROGRESS_BAR__MAX:
				setMax(MAX_EDEFAULT);
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
			case GuiPackage.PROGRESS_BAR__PERCENTAGE:
				return PERCENTAGE_EDEFAULT == null ? percentage != null : !PERCENTAGE_EDEFAULT.equals(percentage);
			case GuiPackage.PROGRESS_BAR__DETERMINATE:
				return DETERMINATE_EDEFAULT == null ? determinate != null : !DETERMINATE_EDEFAULT.equals(determinate);
			case GuiPackage.PROGRESS_BAR__MAX:
				return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
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
		result.append(" (percentage: ");
		result.append(percentage);
		result.append(", determinate: ");
		result.append(determinate);
		result.append(", max: ");
		result.append(max);
		result.append(')');
		return result.toString();
	}

} //ProgressBarImpl
