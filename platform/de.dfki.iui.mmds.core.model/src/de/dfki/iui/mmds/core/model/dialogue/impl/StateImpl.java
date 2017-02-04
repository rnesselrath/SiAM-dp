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

import de.dfki.iui.mmds.core.model.dialogue.DialoguePackage;
import de.dfki.iui.mmds.core.model.dialogue.ExecutableContent;
import de.dfki.iui.mmds.core.model.dialogue.SourceState;
import de.dfki.iui.mmds.core.model.dialogue.State;
import de.dfki.iui.mmds.core.model.dialogue.TargetState;
import de.dfki.iui.mmds.core.model.dialogue.Transition;
import de.dfki.iui.mmds.core.model.dialogue.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.impl.StateImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.impl.StateImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.impl.StateImpl#getOnEntry <em>On Entry</em>}</li>
 *   <li>{@link de.dfki.iui.mmds.core.model.dialogue.impl.StateImpl#getOnExit <em>On Exit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends DialogueDesignerElementImpl implements State {
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getOnEntry() <em>On Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableContent> onEntry;

	/**
	 * The cached value of the '{@link #getOnExit() <em>On Exit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnExit()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableContent> onExit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DialoguePackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, DialoguePackage.STATE__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, DialoguePackage.STATE__TRANSITIONS, DialoguePackage.TRANSITION__SOURCE);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableContent> getOnEntry() {
		if (onEntry == null) {
			onEntry = new EObjectContainmentEList<ExecutableContent>(ExecutableContent.class, this, DialoguePackage.STATE__ON_ENTRY);
		}
		return onEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableContent> getOnExit() {
		if (onExit == null) {
			onExit = new EObjectContainmentEList<ExecutableContent>(ExecutableContent.class, this, DialoguePackage.STATE__ON_EXIT);
		}
		return onExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DialoguePackage.STATE__TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DialoguePackage.STATE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case DialoguePackage.STATE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case DialoguePackage.STATE__ON_ENTRY:
				return ((InternalEList<?>)getOnEntry()).basicRemove(otherEnd, msgs);
			case DialoguePackage.STATE__ON_EXIT:
				return ((InternalEList<?>)getOnExit()).basicRemove(otherEnd, msgs);
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
			case DialoguePackage.STATE__VARIABLES:
				return getVariables();
			case DialoguePackage.STATE__TRANSITIONS:
				return getTransitions();
			case DialoguePackage.STATE__ON_ENTRY:
				return getOnEntry();
			case DialoguePackage.STATE__ON_EXIT:
				return getOnExit();
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
			case DialoguePackage.STATE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case DialoguePackage.STATE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case DialoguePackage.STATE__ON_ENTRY:
				getOnEntry().clear();
				getOnEntry().addAll((Collection<? extends ExecutableContent>)newValue);
				return;
			case DialoguePackage.STATE__ON_EXIT:
				getOnExit().clear();
				getOnExit().addAll((Collection<? extends ExecutableContent>)newValue);
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
			case DialoguePackage.STATE__VARIABLES:
				getVariables().clear();
				return;
			case DialoguePackage.STATE__TRANSITIONS:
				getTransitions().clear();
				return;
			case DialoguePackage.STATE__ON_ENTRY:
				getOnEntry().clear();
				return;
			case DialoguePackage.STATE__ON_EXIT:
				getOnExit().clear();
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
			case DialoguePackage.STATE__VARIABLES:
				return variables != null && !variables.isEmpty();
			case DialoguePackage.STATE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case DialoguePackage.STATE__ON_ENTRY:
				return onEntry != null && !onEntry.isEmpty();
			case DialoguePackage.STATE__ON_EXIT:
				return onExit != null && !onExit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SourceState.class) {
			switch (derivedFeatureID) {
				case DialoguePackage.STATE__TRANSITIONS: return DialoguePackage.SOURCE_STATE__TRANSITIONS;
				default: return -1;
			}
		}
		if (baseClass == TargetState.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SourceState.class) {
			switch (baseFeatureID) {
				case DialoguePackage.SOURCE_STATE__TRANSITIONS: return DialoguePackage.STATE__TRANSITIONS;
				default: return -1;
			}
		}
		if (baseClass == TargetState.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //StateImpl
