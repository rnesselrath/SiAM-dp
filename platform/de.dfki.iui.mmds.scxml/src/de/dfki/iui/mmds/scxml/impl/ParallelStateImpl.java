/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.iui.mmds.scxml.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import de.dfki.iui.mmds.scxml.AdapterToken;
import de.dfki.iui.mmds.scxml.Data;
import de.dfki.iui.mmds.scxml.Description;
import de.dfki.iui.mmds.scxml.ParallelState;
import de.dfki.iui.mmds.scxml.ScxmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParallelStateImpl extends StateImpl implements ParallelState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlPackage.Literals.PARALLEL_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object getAdapter(Class adapter) {
		if (adapter == Data.class ) {
			return getDatamodel();
		} else if (adapter == Description.class ) {
			return getDescription();
		} else if ( adapter == String.class ) {
			Map< String, EObject > result = new HashMap< String, EObject >();
			result.put( AdapterToken.DATAMODEL.getLiteral(), getDatamodel() );
			result.put( AdapterToken.DESCRIPTION.getLiteral(), getDescription() );
			return result;
		}
		return null;
	}

} //ParallelStateImpl
