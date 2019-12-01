/**
 */
package asaproject.model.asa.M1.impl;

import asaproject.model.asa.M1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class M1FactoryImpl extends EFactoryImpl implements M1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static M1Factory init() {
		try {
			M1Factory theM1Factory = (M1Factory) EPackage.Registry.INSTANCE.getEFactory(M1Package.eNS_URI);
			if (theM1Factory != null) {
				return theM1Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new M1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case M1Package.CONFIGURATION_CLIENT_SERVER:
			return createConfiguration_ClientServer();
		case M1Package.COMPONENT_CLIENT:
			return createComponent_Client();
		case M1Package.CONNECTOR_RPC:
			return createConnector_RPC();
		case M1Package.COMPONENT_SERVER:
			return createComponent_Server();
		case M1Package.BINDING_SERVER_SYSTEM:
			return createBinding_Server_System();
		case M1Package.BINDING_CLIENT_SYSTEM:
			return createBinding_Client_System();
		case M1Package.ATTACHMENT_CLIENT_RPC:
			return createAttachment_Client_RPC();
		case M1Package.ATTACHMENT_RPC_SERVER:
			return createAttachment_RPC_Server();
		case M1Package.CONFIGURATION_SERVER:
			return createConfiguration_Server();
		case M1Package.COMPONENT_CONNECTION_MANAGER:
			return createComponent_ConnectionManager();
		case M1Package.COMPONENT_DATABASE:
			return createComponent_Database();
		case M1Package.COMPONENT_SECURITY_MANAGER:
			return createComponent_SecurityManager();
		case M1Package.CONNECTOR_CM_DB:
			return createConnector_CM_DB();
		case M1Package.CONNECTOR_CM_SM:
			return createConnector_CM_SM();
		case M1Package.CONNECTOR_SM_DB:
			return createConnector_SM_DB();
		case M1Package.ATTACHMENT_CM_DB:
			return createAttachment_CM_DB();
		case M1Package.ATTACHMENT_CM_SM:
			return createAttachment_CM_SM();
		case M1Package.ATTACHMENT_SM_CM:
			return createAttachment_SM_CM();
		case M1Package.ATTACHMENT_SM_DB:
			return createAttachment_SM_DB();
		case M1Package.ATTACHMENT_DB_SM:
			return createAttachment_DB_SM();
		case M1Package.ATTACHMENT_DB_CM:
			return createAttachment_DB_CM();
		case M1Package.BINDING_CM_SERVER:
			return createBinding_CM_Server();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration_ClientServer createConfiguration_ClientServer() {
		Configuration_ClientServerImpl configuration_ClientServer = new Configuration_ClientServerImpl();
		return configuration_ClientServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component_Client createComponent_Client() {
		Component_ClientImpl component_Client = new Component_ClientImpl();
		return component_Client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector_RPC createConnector_RPC() {
		Connector_RPCImpl connector_RPC = new Connector_RPCImpl();
		return connector_RPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component_Server createComponent_Server() {
		Component_ServerImpl component_Server = new Component_ServerImpl();
		return component_Server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding_Server_System createBinding_Server_System() {
		Binding_Server_SystemImpl binding_Server_System = new Binding_Server_SystemImpl();
		return binding_Server_System;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding_Client_System createBinding_Client_System() {
		Binding_Client_SystemImpl binding_Client_System = new Binding_Client_SystemImpl();
		return binding_Client_System;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_Client_RPC createAttachment_Client_RPC() {
		Attachment_Client_RPCImpl attachment_Client_RPC = new Attachment_Client_RPCImpl();
		return attachment_Client_RPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_RPC_Server createAttachment_RPC_Server() {
		Attachment_RPC_ServerImpl attachment_RPC_Server = new Attachment_RPC_ServerImpl();
		return attachment_RPC_Server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration_Server createConfiguration_Server() {
		Configuration_ServerImpl configuration_Server = new Configuration_ServerImpl();
		return configuration_Server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component_ConnectionManager createComponent_ConnectionManager() {
		Component_ConnectionManagerImpl component_ConnectionManager = new Component_ConnectionManagerImpl();
		return component_ConnectionManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component_Database createComponent_Database() {
		Component_DatabaseImpl component_Database = new Component_DatabaseImpl();
		return component_Database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component_SecurityManager createComponent_SecurityManager() {
		Component_SecurityManagerImpl component_SecurityManager = new Component_SecurityManagerImpl();
		return component_SecurityManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector_CM_DB createConnector_CM_DB() {
		Connector_CM_DBImpl connector_CM_DB = new Connector_CM_DBImpl();
		return connector_CM_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector_CM_SM createConnector_CM_SM() {
		Connector_CM_SMImpl connector_CM_SM = new Connector_CM_SMImpl();
		return connector_CM_SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector_SM_DB createConnector_SM_DB() {
		Connector_SM_DBImpl connector_SM_DB = new Connector_SM_DBImpl();
		return connector_SM_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_CM_DB createAttachment_CM_DB() {
		Attachment_CM_DBImpl attachment_CM_DB = new Attachment_CM_DBImpl();
		return attachment_CM_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_CM_SM createAttachment_CM_SM() {
		Attachment_CM_SMImpl attachment_CM_SM = new Attachment_CM_SMImpl();
		return attachment_CM_SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_SM_CM createAttachment_SM_CM() {
		Attachment_SM_CMImpl attachment_SM_CM = new Attachment_SM_CMImpl();
		return attachment_SM_CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_SM_DB createAttachment_SM_DB() {
		Attachment_SM_DBImpl attachment_SM_DB = new Attachment_SM_DBImpl();
		return attachment_SM_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_DB_SM createAttachment_DB_SM() {
		Attachment_DB_SMImpl attachment_DB_SM = new Attachment_DB_SMImpl();
		return attachment_DB_SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment_DB_CM createAttachment_DB_CM() {
		Attachment_DB_CMImpl attachment_DB_CM = new Attachment_DB_CMImpl();
		return attachment_DB_CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding_CM_Server createBinding_CM_Server() {
		Binding_CM_ServerImpl binding_CM_Server = new Binding_CM_ServerImpl();
		return binding_CM_Server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M1Package getM1Package() {
		return (M1Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static M1Package getPackage() {
		return M1Package.eINSTANCE;
	}

} //M1FactoryImpl
