/**
 */
package asaproject.model.asa.M2.impl;

import asaproject.model.asa.M2.Connector;
import asaproject.model.asa.M2.M2Package;
import asaproject.model.asa.M2.ProvidedRole;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProvidedRoleImpl extends RoleImpl implements ProvidedRole {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedRoleImpl() {
		super();
	}
	
	public ProvidedRoleImpl(String name) {
		super();
		this.setName(name);
	}
	
	public ProvidedRoleImpl connector(Connector connector) {
    	this.setConnector(connector);
    	return this;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.PROVIDED_ROLE;
	}

} //ProvidedRoleImpl
