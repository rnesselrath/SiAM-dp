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
package de.dfki.iui.mmds.core.model.io.communicative_functions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.mmds.core.model.base.impl.BObjectImpl;
import de.dfki.iui.mmds.core.model.io.communicative_functions.Communicative_functionsPackage;
import de.dfki.iui.mmds.core.model.io.communicative_functions.SemanticContent;
import de.dfki.iui.mmds.core.model.io.communicative_functions.TurnTake;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turn Take</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnTakeImpl#getSemanticContent <em>Semantic Content</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnTakeImpl#isIsEllipsis <em>Is Ellipsis</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.communicative_functions.impl.TurnTakeImpl#getKnowledgeItem <em>Knowledge Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurnTakeImpl extends BObjectImpl implements TurnTake {
	/**
	 * The cached value of the '{@link #getSemanticContent() <em>Semantic Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticContent()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticContent> semanticContent;
	/**
	 * The default value of the '{@link #isIsEllipsis() <em>Is Ellipsis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEllipsis()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ELLIPSIS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsEllipsis() <em>Is Ellipsis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEllipsis()
	 * @generated
	 * @ordered
	 */
	protected boolean isEllipsis = IS_ELLIPSIS_EDEFAULT;
	/**
	 * The default value of the '{@link #getKnowledgeItem() <em>Knowledge Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledgeItem()
	 * @generated
	 * @ordered
	 */
	protected static final String KNOWLEDGE_ITEM_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getKnowledgeItem() <em>Knowledge Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledgeItem()
	 * @generated
	 * @ordered
	 */
	protected String knowledgeItem = KNOWLEDGE_ITEM_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnTakeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Communicative_functionsPackage.Literals.TURN_TAKE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticContent> getSemanticContent() {
		if (semanticContent == null) {
			semanticContent = new EObjectContainmentEList<SemanticContent>(SemanticContent.class, this, Communicative_functionsPackage.TURN_TAKE__SEMANTIC_CONTENT);
		}
		return semanticContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEllipsis() {
		return isEllipsis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEllipsis(boolean newIsEllipsis) {
		boolean oldIsEllipsis = isEllipsis;
		isEllipsis = newIsEllipsis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Communicative_functionsPackage.TURN_TAKE__IS_ELLIPSIS, oldIsEllipsis, isEllipsis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKnowledgeItem() {
		return knowledgeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKnowledgeItem(String newKnowledgeItem) {
		String oldKnowledgeItem = knowledgeItem;
		knowledgeItem = newKnowledgeItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Communicative_functionsPackage.TURN_TAKE__KNOWLEDGE_ITEM, oldKnowledgeItem, knowledgeItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Communicative_functionsPackage.TURN_TAKE__SEMANTIC_CONTENT:
				return ((InternalEList<?>)getSemanticContent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Communicative_functionsPackage.TURN_TAKE__SEMANTIC_CONTENT:
				return getSemanticContent();
			case Communicative_functionsPackage.TURN_TAKE__IS_ELLIPSIS:
				return isIsEllipsis();
			case Communicative_functionsPackage.TURN_TAKE__KNOWLEDGE_ITEM:
				return getKnowledgeItem();
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
			case Communicative_functionsPackage.TURN_TAKE__SEMANTIC_CONTENT:
				getSemanticContent().clear();
				getSemanticContent().addAll((Collection<? extends SemanticContent>)newValue);
				return;
			case Communicative_functionsPackage.TURN_TAKE__IS_ELLIPSIS:
				setIsEllipsis((Boolean)newValue);
				return;
			case Communicative_functionsPackage.TURN_TAKE__KNOWLEDGE_ITEM:
				setKnowledgeItem((String)newValue);
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
			case Communicative_functionsPackage.TURN_TAKE__SEMANTIC_CONTENT:
				getSemanticContent().clear();
				return;
			case Communicative_functionsPackage.TURN_TAKE__IS_ELLIPSIS:
				setIsEllipsis(IS_ELLIPSIS_EDEFAULT);
				return;
			case Communicative_functionsPackage.TURN_TAKE__KNOWLEDGE_ITEM:
				setKnowledgeItem(KNOWLEDGE_ITEM_EDEFAULT);
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
			case Communicative_functionsPackage.TURN_TAKE__SEMANTIC_CONTENT:
				return semanticContent != null && !semanticContent.isEmpty();
			case Communicative_functionsPackage.TURN_TAKE__IS_ELLIPSIS:
				return isEllipsis != IS_ELLIPSIS_EDEFAULT;
			case Communicative_functionsPackage.TURN_TAKE__KNOWLEDGE_ITEM:
				return KNOWLEDGE_ITEM_EDEFAULT == null ? knowledgeItem != null : !KNOWLEDGE_ITEM_EDEFAULT.equals(knowledgeItem);
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
		result.append(" (isEllipsis: ");
		result.append(isEllipsis);
		result.append(", knowledgeItem: ");
		result.append(knowledgeItem);
		result.append(')');
		return result.toString();
	}

} //TurnTakeImpl
