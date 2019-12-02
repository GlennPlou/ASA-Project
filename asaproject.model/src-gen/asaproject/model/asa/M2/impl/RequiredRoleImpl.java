/**
 */
package asaproject.model.asa.M2.impl;

import asaproject.model.asa.M2.Connector;
import asaproject.model.asa.M2.M2Package;
import asaproject.model.asa.M2.RequiredRole;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RequiredRoleImpl extends RoleImpl implements RequiredRole {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRoleImpl() {
		super();
	}
	
	public RequiredRoleImpl(String name) {
		super();
		this.setName(name);
	}
	
	public RequiredRoleImpl connector(Connector connector) {
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
		return M2Package.Literals.REQUIRED_ROLE;
	}

} //RequiredRoleImpl
