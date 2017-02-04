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
package de.dfki.iui.mmds.core.model.base.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.iui.mmds.core.model.base.BasePackage;
import de.dfki.iui.mmds.core.model.base.Entity;
import de.dfki.iui.mmds.core.model.base.EntityResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.impl.EntityResourceImpl#getContent <em>Content</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.base.impl.EntityResourceImpl#isAddToKnowledgeManager <em>Add To Knowledge Manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityResourceImpl extends ResourceImpl implements EntityResource {
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> content;
	/**
	 * The default value of the '{@link #isAddToKnowledgeManager() <em>Add To Knowledge Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAddToKnowledgeManager()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADD_TO_KNOWLEDGE_MANAGER_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isAddToKnowledgeManager() <em>Add To Knowledge Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAddToKnowledgeManager()
	 * @generated
	 * @ordered
	 */
	protected boolean addToKnowledgeManager = ADD_TO_KNOWLEDGE_MANAGER_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.ENTITY_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<Entity>(Entity.class, this, BasePackage.ENTITY_RESOURCE__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAddToKnowledgeManager() {
		return addToKnowledgeManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddToKnowledgeManager(boolean newAddToKnowledgeManager) {
		boolean oldAddToKnowledgeManager = addToKnowledgeManager;
		addToKnowledgeManager = newAddToKnowledgeManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.ENTITY_RESOURCE__ADD_TO_KNOWLEDGE_MANAGER, oldAddToKnowledgeManager, addToKnowledgeManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasePackage.ENTITY_RESOURCE__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
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
			case BasePackage.ENTITY_RESOURCE__CONTENT:
				return getContent();
			case BasePackage.ENTITY_RESOURCE__ADD_TO_KNOWLEDGE_MANAGER:
				return isAddToKnowledgeManager();
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
			case BasePackage.ENTITY_RESOURCE__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends Entity>)newValue);
				return;
			case BasePackage.ENTITY_RESOURCE__ADD_TO_KNOWLEDGE_MANAGER:
				setAddToKnowledgeManager((Boolean)newValue);
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
			case BasePackage.ENTITY_RESOURCE__CONTENT:
				getContent().clear();
				return;
			case BasePackage.ENTITY_RESOURCE__ADD_TO_KNOWLEDGE_MANAGER:
				setAddToKnowledgeManager(ADD_TO_KNOWLEDGE_MANAGER_EDEFAULT);
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
			case BasePackage.ENTITY_RESOURCE__CONTENT:
				return content != null && !content.isEmpty();
			case BasePackage.ENTITY_RESOURCE__ADD_TO_KNOWLEDGE_MANAGER:
				return addToKnowledgeManager != ADD_TO_KNOWLEDGE_MANAGER_EDEFAULT;
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
		result.append(" (addToKnowledgeManager: ");
		result.append(addToKnowledgeManager);
		result.append(')');
		return result.toString();
	}

} //EntityResourceImpl
