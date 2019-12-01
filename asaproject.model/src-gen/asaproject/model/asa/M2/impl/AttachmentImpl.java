/**
 */
package asaproject.model.asa.M2.impl;

import asaproject.model.asa.M2.Attachment;
import asaproject.model.asa.M2.M2Package;
import asaproject.model.asa.M2.Port;
import asaproject.model.asa.M2.ProvidedPort;
import asaproject.model.asa.M2.ProvidedRole;
import asaproject.model.asa.M2.RequiredPort;
import asaproject.model.asa.M2.RequiredRole;
import asaproject.model.asa.M2.Role;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaproject.model.asa.M2.impl.AttachmentImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link asaproject.model.asa.M2.impl.AttachmentImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentImpl extends LinkImpl implements Attachment {
	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;
	
	protected ProvidedPort providedPort;
	protected RequiredPort requiredPort;
	protected ProvidedRole providedRole;
	protected RequiredRole requiredRole;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentImpl() {
		super();
	}
	
	public AttachmentImpl(String name) {
		super();
		this.name = name;
	}
	
	public AttachmentImpl(String name, ProvidedPort providedPort, RequiredRole requiredRole) {
		super();
		this.name = name;
		this.setAttachment(providedPort, requiredRole);
	}
	
	public AttachmentImpl(String name, RequiredPort requiredPort, ProvidedRole providedRole) {
		super();
		this.name = name;
		this.setAttachment(requiredPort, providedRole);
	}
	
	public void setAttachment(ProvidedPort providedPort, RequiredRole requiredRole) {
		this.providedPort = providedPort;
		this.requiredRole = requiredRole;
		this.ports.add(providedPort);
		this.roles.add(requiredRole);
	}
	
	public void setAttachment(RequiredPort requiredPort, ProvidedRole providedRole) {
		this.requiredPort = requiredPort;
		this.providedRole = providedRole;
		this.ports.add(requiredPort);
		this.roles.add(providedRole);
	}

	public ProvidedPort getProvidedPort() {
		return providedPort;
	}

	public RequiredPort getRequiredPort() {
		return requiredPort;
	}

	public ProvidedRole getProvidedRole() {
		return providedRole;
	}

	public RequiredRole getRequiredRole() {
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectResolvingEList<Port>(Port.class, this, M2Package.ATTACHMENT__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectResolvingEList<Role>(Role.class, this, M2Package.ATTACHMENT__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case M2Package.ATTACHMENT__PORTS:
			return getPorts();
		case M2Package.ATTACHMENT__ROLES:
			return getRoles();
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
		case M2Package.ATTACHMENT__PORTS:
			getPorts().clear();
			getPorts().addAll((Collection<? extends Port>) newValue);
			return;
		case M2Package.ATTACHMENT__ROLES:
			getRoles().clear();
			getRoles().addAll((Collection<? extends Role>) newValue);
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
		case M2Package.ATTACHMENT__PORTS:
			getPorts().clear();
			return;
		case M2Package.ATTACHMENT__ROLES:
			getRoles().clear();
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
		case M2Package.ATTACHMENT__PORTS:
			return ports != null && !ports.isEmpty();
		case M2Package.ATTACHMENT__ROLES:
			return roles != null && !roles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AttachmentImpl
