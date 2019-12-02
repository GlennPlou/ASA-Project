/**
 */
package asaproject.model.asa.M2.impl;

import asaproject.model.asa.M2.Component;
import asaproject.model.asa.M2.Configuration;
import asaproject.model.asa.M2.M2Package;
import asaproject.model.asa.M2.RequiredPort;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RequiredPortImpl extends PortImpl implements RequiredPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredPortImpl() {
		super();
	}
	
	public RequiredPortImpl(String name) {
		super(name);
	}
	
	public RequiredPortImpl configuration(Configuration configuration) {
    	this.setConfiguration(configuration);
    	return this;
    }
	
	public RequiredPortImpl component(Component component) {
		this.setComponent(component);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.REQUIRED_PORT;
	}

} //RequiredPortImpl
