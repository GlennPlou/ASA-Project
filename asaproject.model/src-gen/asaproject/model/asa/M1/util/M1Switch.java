/**
 */
package asaproject.model.asa.M1.util;

import asaproject.model.asa.M1.*;

import asaproject.model.asa.M2.ArchitecturalElement;
import asaproject.model.asa.M2.Attachment;
import asaproject.model.asa.M2.Binding;
import asaproject.model.asa.M2.Component;
import asaproject.model.asa.M2.Configuration;
import asaproject.model.asa.M2.Connector;
import asaproject.model.asa.M2.Link;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see asaproject.model.asa.M1.M1Package
 * @generated
 */
public class M1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static M1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M1Switch() {
		if (modelPackage == null) {
			modelPackage = M1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case M1Package.CONFIGURATION_CLIENT_SERVER: {
			Configuration_ClientServer configuration_ClientServer = (Configuration_ClientServer) theEObject;
			T result = caseConfiguration_ClientServer(configuration_ClientServer);
			if (result == null)
				result = caseConfiguration(configuration_ClientServer);
			if (result == null)
				result = caseArchitecturalElement(configuration_ClientServer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.COMPONENT_CLIENT: {
			Component_Client component_Client = (Component_Client) theEObject;
			T result = caseComponent_Client(component_Client);
			if (result == null)
				result = caseComponent(component_Client);
			if (result == null)
				result = caseArchitecturalElement(component_Client);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.CONNECTOR_RPC: {
			Connector_RPC connector_RPC = (Connector_RPC) theEObject;
			T result = caseConnector_RPC(connector_RPC);
			if (result == null)
				result = caseConnector(connector_RPC);
			if (result == null)
				result = caseArchitecturalElement(connector_RPC);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.COMPONENT_SERVER: {
			Component_Server component_Server = (Component_Server) theEObject;
			T result = caseComponent_Server(component_Server);
			if (result == null)
				result = caseComponent(component_Server);
			if (result == null)
				result = caseArchitecturalElement(component_Server);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.BINDING_SERVER_SYSTEM: {
			Binding_Server_System binding_Server_System = (Binding_Server_System) theEObject;
			T result = caseBinding_Server_System(binding_Server_System);
			if (result == null)
				result = caseBinding(binding_Server_System);
			if (result == null)
				result = caseLink(binding_Server_System);
			if (result == null)
				result = caseArchitecturalElement(binding_Server_System);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.BINDING_CLIENT_SYSTEM: {
			Binding_Client_System binding_Client_System = (Binding_Client_System) theEObject;
			T result = caseBinding_Client_System(binding_Client_System);
			if (result == null)
				result = caseBinding(binding_Client_System);
			if (result == null)
				result = caseLink(binding_Client_System);
			if (result == null)
				result = caseArchitecturalElement(binding_Client_System);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.ATTACHMENT_CLIENT_RPC: {
			Attachment_Client_RPC attachment_Client_RPC = (Attachment_Client_RPC) theEObject;
			T result = caseAttachment_Client_RPC(attachment_Client_RPC);
			if (result == null)
				result = caseAttachment(attachment_Client_RPC);
			if (result == null)
				result = caseLink(attachment_Client_RPC);
			if (result == null)
				result = caseArchitecturalElement(attachment_Client_RPC);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.ATTACHMENT_RPC_SERVER: {
			Attachment_RPC_Server attachment_RPC_Server = (Attachment_RPC_Server) theEObject;
			T result = caseAttachment_RPC_Server(attachment_RPC_Server);
			if (result == null)
				result = caseAttachment(attachment_RPC_Server);
			if (result == null)
				result = caseLink(attachment_RPC_Server);
			if (result == null)
				result = caseArchitecturalElement(attachment_RPC_Server);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.CONFIGURATION_SERVER: {
			Configuration_Server configuration_Server = (Configuration_Server) theEObject;
			T result = caseConfiguration_Server(configuration_Server);
			if (result == null)
				result = caseConfiguration(configuration_Server);
			if (result == null)
				result = caseArchitecturalElement(configuration_Server);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.COMPONENT_CONNECTION_MANAGER: {
			Component_ConnectionManager component_ConnectionManager = (Component_ConnectionManager) theEObject;
			T result = caseComponent_ConnectionManager(component_ConnectionManager);
			if (result == null)
				result = caseComponent(component_ConnectionManager);
			if (result == null)
				result = caseArchitecturalElement(component_ConnectionManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.COMPONENT_DATABASE: {
			Component_Database component_Database = (Component_Database) theEObject;
			T result = caseComponent_Database(component_Database);
			if (result == null)
				result = caseComponent(component_Database);
			if (result == null)
				result = caseArchitecturalElement(component_Database);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.COMPONENT_SECURITY_MANAGER: {
			Component_SecurityManager component_SecurityManager = (Component_SecurityManager) theEObject;
			T result = caseComponent_SecurityManager(component_SecurityManager);
			if (result == null)
				result = caseComponent(component_SecurityManager);
			if (result == null)
				result = caseArchitecturalElement(component_SecurityManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.CONNECTOR_CM_DB: {
			Connector_CM_DB connector_CM_DB = (Connector_CM_DB) theEObject;
			T result = caseConnector_CM_DB(connector_CM_DB);
			if (result == null)
				result = caseConnector(connector_CM_DB);
			if (result == null)
				result = caseArchitecturalElement(connector_CM_DB);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.CONNECTOR_CM_SM: {
			Connector_CM_SM connector_CM_SM = (Connector_CM_SM) theEObject;
			T result = caseConnector_CM_SM(connector_CM_SM);
			if (result == null)
				result = caseConnector(connector_CM_SM);
			if (result == null)
				result = caseArchitecturalElement(connector_CM_SM);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.CONNECTOR_SM_DB: {
			Connector_SM_DB connector_SM_DB = (Connector_SM_DB) theEObject;
			T result = caseConnector_SM_DB(connector_SM_DB);
			if (result == null)
				result = caseConnector(connector_SM_DB);
			if (result == null)
				result = caseArchitecturalElement(connector_SM_DB);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.ATTACHMENT_CM_DB: {
			Attachment_CM_DB attachment_CM_DB = (Attachment_CM_DB) theEObject;
			T result = caseAttachment_CM_DB(attachment_CM_DB);
			if (result == null)
				result = caseAttachment(attachment_CM_DB);
			if (result == null)
				result = caseLink(attachment_CM_DB);
			if (result == null)
				result = caseArchitecturalElement(attachment_CM_DB);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.ATTACHMENT_CM_SM: {
			Attachment_CM_SM attachment_CM_SM = (Attachment_CM_SM) theEObject;
			T result = caseAttachment_CM_SM(attachment_CM_SM);
			if (result == null)
				result = caseAttachment(attachment_CM_SM);
			if (result == null)
				result = caseLink(attachment_CM_SM);
			if (result == null)
				result = caseArchitecturalElement(attachment_CM_SM);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.ATTACHMENT_SM_CM: {
			Attachment_SM_CM attachment_SM_CM = (Attachment_SM_CM) theEObject;
			T result = caseAttachment_SM_CM(attachment_SM_CM);
			if (result == null)
				result = caseAttachment(attachment_SM_CM);
			if (result == null)
				result = caseLink(attachment_SM_CM);
			if (result == null)
				result = caseArchitecturalElement(attachment_SM_CM);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.ATTACHMENT_SM_DB: {
			Attachment_SM_DB attachment_SM_DB = (Attachment_SM_DB) theEObject;
			T result = caseAttachment_SM_DB(attachment_SM_DB);
			if (result == null)
				result = caseAttachment(attachment_SM_DB);
			if (result == null)
				result = caseLink(attachment_SM_DB);
			if (result == null)
				result = caseArchitecturalElement(attachment_SM_DB);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.ATTACHMENT_DB_SM: {
			Attachment_DB_SM attachment_DB_SM = (Attachment_DB_SM) theEObject;
			T result = caseAttachment_DB_SM(attachment_DB_SM);
			if (result == null)
				result = caseAttachment(attachment_DB_SM);
			if (result == null)
				result = caseLink(attachment_DB_SM);
			if (result == null)
				result = caseArchitecturalElement(attachment_DB_SM);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.ATTACHMENT_DB_CM: {
			Attachment_DB_CM attachment_DB_CM = (Attachment_DB_CM) theEObject;
			T result = caseAttachment_DB_CM(attachment_DB_CM);
			if (result == null)
				result = caseAttachment(attachment_DB_CM);
			if (result == null)
				result = caseLink(attachment_DB_CM);
			if (result == null)
				result = caseArchitecturalElement(attachment_DB_CM);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case M1Package.BINDING_CM_SERVER: {
			Binding_CM_Server binding_CM_Server = (Binding_CM_Server) theEObject;
			T result = caseBinding_CM_Server(binding_CM_Server);
			if (result == null)
				result = caseBinding(binding_CM_Server);
			if (result == null)
				result = caseLink(binding_CM_Server);
			if (result == null)
				result = caseArchitecturalElement(binding_CM_Server);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Client Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Client Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration_ClientServer(Configuration_ClientServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent_Client(Component_Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector_RPC(Connector_RPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent_Server(Component_Server object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Server System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Server System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding_Server_System(Binding_Server_System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Client System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Client System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding_Client_System(Binding_Client_System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment Client RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment Client RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_Client_RPC(Attachment_Client_RPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment RPC Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment RPC Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_RPC_Server(Attachment_RPC_Server object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration_Server(Configuration_Server object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Connection Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Connection Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent_ConnectionManager(Component_ConnectionManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent_Database(Component_Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Security Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Security Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent_SecurityManager(Component_SecurityManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector CM DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector CM DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector_CM_DB(Connector_CM_DB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector CM SM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector CM SM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector_CM_SM(Connector_CM_SM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector SM DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector SM DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector_SM_DB(Connector_SM_DB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment CM DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment CM DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_CM_DB(Attachment_CM_DB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment CM SM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment CM SM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_CM_SM(Attachment_CM_SM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment SM CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment SM CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_SM_CM(Attachment_SM_CM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment SM DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment SM DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_SM_DB(Attachment_SM_DB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment DB SM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment DB SM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_DB_SM(Attachment_DB_SM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment DB CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment DB CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment_DB_CM(Attachment_DB_CM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding CM Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding CM Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding_CM_Server(Binding_CM_Server object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architectural Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architectural Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitecturalElement(ArchitecturalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //M1Switch
