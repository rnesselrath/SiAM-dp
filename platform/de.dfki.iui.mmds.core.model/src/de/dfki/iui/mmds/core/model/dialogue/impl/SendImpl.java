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
package de.dfki.iui.mmds.core.model.dialogue.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;
import de.dfki.iui.mmds.core.model.dialogue.Send;
import de.dfki.iui.mmds.core.model.io.OutputMessage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.impl.SendImpl#getOutputRequest <em>Output Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendImpl extends MinimalEObjectImpl.Container implements Send {
	/**
	 * The cached value of the '{@link #getOutputRequest() <em>Output Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputRequest()
	 * @generated
	 * @ordered
	 */
	protected OutputMessage outputRequest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DialoguePackage.Literals.SEND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputMessage getOutputRequest() {
		return outputRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputRequest(OutputMessage newOutputRequest, NotificationChain msgs) {
		OutputMessage oldOutputRequest = outputRequest;
		outputRequest = newOutputRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DialoguePackage.SEND__OUTPUT_REQUEST, oldOutputRequest, newOutputRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputRequest(OutputMessage newOutputRequest) {
		if (newOutputRequest != outputRequest) {
			NotificationChain msgs = null;
			if (outputRequest != null)
				msgs = ((InternalEObject)outputRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DialoguePackage.SEND__OUTPUT_REQUEST, null, msgs);
			if (newOutputRequest != null)
				msgs = ((InternalEObject)newOutputRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DialoguePackage.SEND__OUTPUT_REQUEST, null, msgs);
			msgs = basicSetOutputRequest(newOutputRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DialoguePackage.SEND__OUTPUT_REQUEST, newOutputRequest, newOutputRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DialoguePackage.SEND__OUTPUT_REQUEST:
				return basicSetOutputRequest(null, msgs);
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
			case DialoguePackage.SEND__OUTPUT_REQUEST:
				return getOutputRequest();
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
			case DialoguePackage.SEND__OUTPUT_REQUEST:
				setOutputRequest((OutputMessage)newValue);
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
			case DialoguePackage.SEND__OUTPUT_REQUEST:
				setOutputRequest((OutputMessage)null);
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
			case DialoguePackage.SEND__OUTPUT_REQUEST:
				return outputRequest != null;
		}
		return super.eIsSet(featureID);
	}

} //SendImpl
