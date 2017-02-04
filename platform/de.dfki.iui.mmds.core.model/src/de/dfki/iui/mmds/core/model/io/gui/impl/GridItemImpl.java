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
import de.dfki.iui.mmds.core.emf.datatypes.BFloat;
import de.dfki.iui.mmds.core.emf.datatypes.BInteger;
import de.dfki.iui.mmds.core.model.base.BaseFactory;
import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.io.gui.Alignment;
import de.dfki.iui.mmds.core.model.io.gui.GridItem;
import de.dfki.iui.mmds.core.model.io.gui.GuiPackage;
import de.dfki.iui.mmds.core.model.io.gui.VAlignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridItemImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridItemImpl#getIsPercentage <em>Is Percentage</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridItemImpl#getRowSpan <em>Row Span</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridItemImpl#getColumnSpan <em>Column Span</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridItemImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.gui.impl.GridItemImpl#getValignment <em>Valignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GridItemImpl extends ContainerImpl implements GridItem {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final BFloat WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected BFloat width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsPercentage() <em>Is Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final BBoolean IS_PERCENTAGE_EDEFAULT = (BBoolean)BaseFactory.eINSTANCE.createFromString(BasePackage.eINSTANCE.getBBoolean(), "false");

	/**
	 * The cached value of the '{@link #getIsPercentage() <em>Is Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPercentage()
	 * @generated
	 * @ordered
	 */
	protected BBoolean isPercentage = IS_PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowSpan() <em>Row Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowSpan()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger ROW_SPAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowSpan() <em>Row Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowSpan()
	 * @generated
	 * @ordered
	 */
	protected BInteger rowSpan = ROW_SPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnSpan() <em>Column Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnSpan()
	 * @generated
	 * @ordered
	 */
	protected static final BInteger COLUMN_SPAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnSpan() <em>Column Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnSpan()
	 * @generated
	 * @ordered
	 */
	protected BInteger columnSpan = COLUMN_SPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Alignment ALIGNMENT_EDEFAULT = Alignment.LEFT;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected Alignment alignment = ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValignment() <em>Valignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValignment()
	 * @generated
	 * @ordered
	 */
	protected static final VAlignment VALIGNMENT_EDEFAULT = VAlignment.TOP;

	/**
	 * The cached value of the '{@link #getValignment() <em>Valignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValignment()
	 * @generated
	 * @ordered
	 */
	protected VAlignment valignment = VALIGNMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.GRID_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFloat getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(BFloat newWidth) {
		BFloat oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GRID_ITEM__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BBoolean getIsPercentage() {
		return isPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPercentage(BBoolean newIsPercentage) {
		BBoolean oldIsPercentage = isPercentage;
		isPercentage = newIsPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GRID_ITEM__IS_PERCENTAGE, oldIsPercentage, isPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BInteger getRowSpan() {
		return rowSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowSpan(BInteger newRowSpan) {
		BInteger oldRowSpan = rowSpan;
		rowSpan = newRowSpan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GRID_ITEM__ROW_SPAN, oldRowSpan, rowSpan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BInteger getColumnSpan() {
		return columnSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnSpan(BInteger newColumnSpan) {
		BInteger oldColumnSpan = columnSpan;
		columnSpan = newColumnSpan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GRID_ITEM__COLUMN_SPAN, oldColumnSpan, columnSpan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(Alignment newAlignment) {
		Alignment oldAlignment = alignment;
		alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GRID_ITEM__ALIGNMENT, oldAlignment, alignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VAlignment getValignment() {
		return valignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValignment(VAlignment newValignment) {
		VAlignment oldValignment = valignment;
		valignment = newValignment == null ? VALIGNMENT_EDEFAULT : newValignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.GRID_ITEM__VALIGNMENT, oldValignment, valignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuiPackage.GRID_ITEM__WIDTH:
				return getWidth();
			case GuiPackage.GRID_ITEM__IS_PERCENTAGE:
				return getIsPercentage();
			case GuiPackage.GRID_ITEM__ROW_SPAN:
				return getRowSpan();
			case GuiPackage.GRID_ITEM__COLUMN_SPAN:
				return getColumnSpan();
			case GuiPackage.GRID_ITEM__ALIGNMENT:
				return getAlignment();
			case GuiPackage.GRID_ITEM__VALIGNMENT:
				return getValignment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GuiPackage.GRID_ITEM__WIDTH:
				setWidth((BFloat)newValue);
				return;
			case GuiPackage.GRID_ITEM__IS_PERCENTAGE:
				setIsPercentage((BBoolean)newValue);
				return;
			case GuiPackage.GRID_ITEM__ROW_SPAN:
				setRowSpan((BInteger)newValue);
				return;
			case GuiPackage.GRID_ITEM__COLUMN_SPAN:
				setColumnSpan((BInteger)newValue);
				return;
			case GuiPackage.GRID_ITEM__ALIGNMENT:
				setAlignment((Alignment)newValue);
				return;
			case GuiPackage.GRID_ITEM__VALIGNMENT:
				setValignment((VAlignment)newValue);
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
			case GuiPackage.GRID_ITEM__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case GuiPackage.GRID_ITEM__IS_PERCENTAGE:
				setIsPercentage(IS_PERCENTAGE_EDEFAULT);
				return;
			case GuiPackage.GRID_ITEM__ROW_SPAN:
				setRowSpan(ROW_SPAN_EDEFAULT);
				return;
			case GuiPackage.GRID_ITEM__COLUMN_SPAN:
				setColumnSpan(COLUMN_SPAN_EDEFAULT);
				return;
			case GuiPackage.GRID_ITEM__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
				return;
			case GuiPackage.GRID_ITEM__VALIGNMENT:
				setValignment(VALIGNMENT_EDEFAULT);
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
			case GuiPackage.GRID_ITEM__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case GuiPackage.GRID_ITEM__IS_PERCENTAGE:
				return IS_PERCENTAGE_EDEFAULT == null ? isPercentage != null : !IS_PERCENTAGE_EDEFAULT.equals(isPercentage);
			case GuiPackage.GRID_ITEM__ROW_SPAN:
				return ROW_SPAN_EDEFAULT == null ? rowSpan != null : !ROW_SPAN_EDEFAULT.equals(rowSpan);
			case GuiPackage.GRID_ITEM__COLUMN_SPAN:
				return COLUMN_SPAN_EDEFAULT == null ? columnSpan != null : !COLUMN_SPAN_EDEFAULT.equals(columnSpan);
			case GuiPackage.GRID_ITEM__ALIGNMENT:
				return alignment != ALIGNMENT_EDEFAULT;
			case GuiPackage.GRID_ITEM__VALIGNMENT:
				return valignment != VALIGNMENT_EDEFAULT;
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
		result.append(" (width: ");
		result.append(width);
		result.append(", isPercentage: ");
		result.append(isPercentage);
		result.append(", rowSpan: ");
		result.append(rowSpan);
		result.append(", columnSpan: ");
		result.append(columnSpan);
		result.append(", alignment: ");
		result.append(alignment);
		result.append(", valignment: ");
		result.append(valignment);
		result.append(')');
		return result.toString();
	}

} //GridItemImpl
