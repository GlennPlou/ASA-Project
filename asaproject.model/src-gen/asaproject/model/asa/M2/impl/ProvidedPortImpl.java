/**
 */
package asaproject.model.asa.M2.impl;

import asaproject.model.asa.M2.M2Package;
import asaproject.model.asa.M2.ProvidedPort;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProvidedPortImpl extends PortImpl implements ProvidedPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedPortImpl() {
		super();
	}
	
	public ProvidedPortImpl(String name) {
		super(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.PROVIDED_PORT;
	}

} //ProvidedPortImpl
