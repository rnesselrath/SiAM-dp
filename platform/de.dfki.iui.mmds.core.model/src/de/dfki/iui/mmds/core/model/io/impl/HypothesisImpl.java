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
package de.dfki.iui.mmds.core.model.io.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.iui.mmds.core.model.base.impl.BObjectImpl;
import de.dfki.iui.mmds.core.model.io.Hypothesis;
import de.dfki.iui.mmds.core.model.io.IoPackage;
import de.dfki.iui.mmds.core.model.io.communicative_functions.CommunicativeFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hypothesis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.HypothesisImpl#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.io.impl.HypothesisImpl#getCommunicativeFunction <em>Communicative Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HypothesisImpl extends BObjectImpl implements Hypothesis {
	/**
	 * The default value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected static final float CONFIDENCE_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected float confidence = CONFIDENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommunicativeFunction() <em>Communicative Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicativeFunction()
	 * @generated
	 * @ordered
	 */
	protected CommunicativeFunction communicativeFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HypothesisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoPackage.Literals.HYPOTHESIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getConfidence() {
		return confidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidence(float newConfidence) {
		float oldConfidence = confidence;
		confidence = newConfidence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.HYPOTHESIS__CONFIDENCE, oldConfidence, confidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicativeFunction getCommunicativeFunction() {
		return communicativeFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunicativeFunction(CommunicativeFunction newCommunicativeFunction, NotificationChain msgs) {
		CommunicativeFunction oldCommunicativeFunction = communicativeFunction;
		communicativeFunction = newCommunicativeFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IoPackage.HYPOTHESIS__COMMUNICATIVE_FUNCTION, oldCommunicativeFunction, newCommunicativeFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicativeFunction(CommunicativeFunction newCommunicativeFunction) {
		if (newCommunicativeFunction != communicativeFunction) {
			NotificationChain msgs = null;
			if (communicativeFunction != null)
				msgs = ((InternalEObject)communicativeFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IoPackage.HYPOTHESIS__COMMUNICATIVE_FUNCTION, null, msgs);
			if (newCommunicativeFunction != null)
				msgs = ((InternalEObject)newCommunicativeFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IoPackage.HYPOTHESIS__COMMUNICATIVE_FUNCTION, null, msgs);
			msgs = basicSetCommunicativeFunction(newCommunicativeFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IoPackage.HYPOTHESIS__COMMUNICATIVE_FUNCTION, newCommunicativeFunction, newCommunicativeFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IoPackage.HYPOTHESIS__COMMUNICATIVE_FUNCTION:
				return basicSetCommunicativeFunction(null, msgs);
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
			case IoPackage.HYPOTHESIS__CONFIDENCE:
				return getConfidence();
			case IoPackage.HYPOTHESIS__COMMUNICATIVE_FUNCTION:
				return getCommunicativeFunction();
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
			case IoPackage.HYPOTHESIS__CONFIDENCE:
				setConfidence((Float)newValue);
				return;
			case IoPackage.HYPOTHESIS__COMMUNICATIVE_FUNCTION:
				setCommunicativeFunction((CommunicativeFunction)newValue);
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
			case IoPackage.HYPOTHESIS__CONFIDENCE:
				setConfidence(CONFIDENCE_EDEFAULT);
				return;
			case IoPackage.HYPOTHESIS__COMMUNICATIVE_FUNCTION:
				setCommunicativeFunction((CommunicativeFunction)null);
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
			case IoPackage.HYPOTHESIS__CONFIDENCE:
				return confidence != CONFIDENCE_EDEFAULT;
			case IoPackage.HYPOTHESIS__COMMUNICATIVE_FUNCTION:
				return communicativeFunction != null;
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
		result.append(" (confidence: ");
		result.append(confidence);
		result.append(')');
		return result.toString();
	}

} //HypothesisImpl
