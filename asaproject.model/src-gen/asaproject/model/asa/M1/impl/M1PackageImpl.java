/**
 */
package asaproject.model.asa.M1.impl;

import asaproject.model.asa.M1.Attachment_CM_DB;
import asaproject.model.asa.M1.Attachment_CM_SM;
import asaproject.model.asa.M1.Attachment_Client_RPC;
import asaproject.model.asa.M1.Attachment_DB_CM;
import asaproject.model.asa.M1.Attachment_DB_SM;
import asaproject.model.asa.M1.Attachment_RPC_Server;
import asaproject.model.asa.M1.Attachment_SM_CM;
import asaproject.model.asa.M1.Attachment_SM_DB;
import asaproject.model.asa.M1.Binding_CM_Server;
import asaproject.model.asa.M1.Binding_Client_System;
import asaproject.model.asa.M1.Binding_Server_System;
import asaproject.model.asa.M1.Component_Client;
import asaproject.model.asa.M1.Component_ConnectionManager;
import asaproject.model.asa.M1.Component_Database;
import asaproject.model.asa.M1.Component_SecurityManager;
import asaproject.model.asa.M1.Component_Server;
import asaproject.model.asa.M1.Configuration_ClientServer;
import asaproject.model.asa.M1.Configuration_Server;
import asaproject.model.asa.M1.Connector_CM_DB;
import asaproject.model.asa.M1.Connector_CM_SM;
import asaproject.model.asa.M1.Connector_RPC;
import asaproject.model.asa.M1.Connector_SM_DB;
import asaproject.model.asa.M1.M1Factory;
import asaproject.model.asa.M1.M1Package;

import asaproject.model.asa.M2.M2Package;

import asaproject.model.asa.M2.impl.M2PackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class M1PackageImpl extends EPackageImpl implements M1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configuration_ClientServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass component_ClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connector_RPCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass component_ServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binding_Server_SystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binding_Client_SystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_Client_RPCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_RPC_ServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configuration_ServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass component_ConnectionManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass component_DatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass component_SecurityManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connector_CM_DBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connector_CM_SMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connector_SM_DBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_CM_DBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_CM_SMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_SM_CMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_SM_DBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_DB_SMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachment_DB_CMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binding_CM_ServerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see asaproject.model.asa.M1.M1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private M1PackageImpl() {
		super(eNS_URI, M1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link M1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static M1Package init() {
		if (isInited)
			return (M1Package) EPackage.Registry.INSTANCE.getEPackage(M1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredM1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		M1PackageImpl theM1Package = registeredM1Package instanceof M1PackageImpl ? (M1PackageImpl) registeredM1Package
				: new M1PackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(M2Package.eNS_URI);
		M2PackageImpl theM2Package = (M2PackageImpl) (registeredPackage instanceof M2PackageImpl ? registeredPackage
				: M2Package.eINSTANCE);

		// Create package meta-data objects
		theM1Package.createPackageContents();
		theM2Package.createPackageContents();

		// Initialize created meta-data
		theM1Package.initializePackageContents();
		theM2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theM1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(M1Package.eNS_URI, theM1Package);
		return theM1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration_ClientServer() {
		return configuration_ClientServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent_Client() {
		return component_ClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector_RPC() {
		return connector_RPCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent_Server() {
		return component_ServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding_Server_System() {
		return binding_Server_SystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding_Client_System() {
		return binding_Client_SystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_Client_RPC() {
		return attachment_Client_RPCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_RPC_Server() {
		return attachment_RPC_ServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration_Server() {
		return configuration_ServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent_ConnectionManager() {
		return component_ConnectionManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent_Database() {
		return component_DatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent_SecurityManager() {
		return component_SecurityManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector_CM_DB() {
		return connector_CM_DBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector_CM_SM() {
		return connector_CM_SMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector_SM_DB() {
		return connector_SM_DBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_CM_DB() {
		return attachment_CM_DBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_CM_SM() {
		return attachment_CM_SMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_SM_CM() {
		return attachment_SM_CMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_SM_DB() {
		return attachment_SM_DBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_DB_SM() {
		return attachment_DB_SMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment_DB_CM() {
		return attachment_DB_CMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding_CM_Server() {
		return binding_CM_ServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M1Factory getM1Factory() {
		return (M1Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		configuration_ClientServerEClass = createEClass(CONFIGURATION_CLIENT_SERVER);

		component_ClientEClass = createEClass(COMPONENT_CLIENT);

		connector_RPCEClass = createEClass(CONNECTOR_RPC);

		component_ServerEClass = createEClass(COMPONENT_SERVER);

		binding_Server_SystemEClass = createEClass(BINDING_SERVER_SYSTEM);

		binding_Client_SystemEClass = createEClass(BINDING_CLIENT_SYSTEM);

		attachment_Client_RPCEClass = createEClass(ATTACHMENT_CLIENT_RPC);

		attachment_RPC_ServerEClass = createEClass(ATTACHMENT_RPC_SERVER);

		configuration_ServerEClass = createEClass(CONFIGURATION_SERVER);

		component_ConnectionManagerEClass = createEClass(COMPONENT_CONNECTION_MANAGER);

		component_DatabaseEClass = createEClass(COMPONENT_DATABASE);

		component_SecurityManagerEClass = createEClass(COMPONENT_SECURITY_MANAGER);

		connector_CM_DBEClass = createEClass(CONNECTOR_CM_DB);

		connector_CM_SMEClass = createEClass(CONNECTOR_CM_SM);

		connector_SM_DBEClass = createEClass(CONNECTOR_SM_DB);

		attachment_CM_DBEClass = createEClass(ATTACHMENT_CM_DB);

		attachment_CM_SMEClass = createEClass(ATTACHMENT_CM_SM);

		attachment_SM_CMEClass = createEClass(ATTACHMENT_SM_CM);

		attachment_SM_DBEClass = createEClass(ATTACHMENT_SM_DB);

		attachment_DB_SMEClass = createEClass(ATTACHMENT_DB_SM);

		attachment_DB_CMEClass = createEClass(ATTACHMENT_DB_CM);

		binding_CM_ServerEClass = createEClass(BINDING_CM_SERVER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		M2Package theM2Package = (M2Package) EPackage.Registry.INSTANCE.getEPackage(M2Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		configuration_ClientServerEClass.getESuperTypes().add(theM2Package.getConfiguration());
		component_ClientEClass.getESuperTypes().add(theM2Package.getComponent());
		connector_RPCEClass.getESuperTypes().add(theM2Package.getConnector());
		component_ServerEClass.getESuperTypes().add(theM2Package.getComponent());
		binding_Server_SystemEClass.getESuperTypes().add(theM2Package.getBinding());
		binding_Client_SystemEClass.getESuperTypes().add(theM2Package.getBinding());
		attachment_Client_RPCEClass.getESuperTypes().add(theM2Package.getAttachment());
		attachment_RPC_ServerEClass.getESuperTypes().add(theM2Package.getAttachment());
		configuration_ServerEClass.getESuperTypes().add(theM2Package.getConfiguration());
		component_ConnectionManagerEClass.getESuperTypes().add(theM2Package.getComponent());
		component_DatabaseEClass.getESuperTypes().add(theM2Package.getComponent());
		component_SecurityManagerEClass.getESuperTypes().add(theM2Package.getComponent());
		connector_CM_DBEClass.getESuperTypes().add(theM2Package.getConnector());
		connector_CM_SMEClass.getESuperTypes().add(theM2Package.getConnector());
		connector_SM_DBEClass.getESuperTypes().add(theM2Package.getConnector());
		attachment_CM_DBEClass.getESuperTypes().add(theM2Package.getAttachment());
		attachment_CM_SMEClass.getESuperTypes().add(theM2Package.getAttachment());
		attachment_SM_CMEClass.getESuperTypes().add(theM2Package.getAttachment());
		attachment_SM_DBEClass.getESuperTypes().add(theM2Package.getAttachment());
		attachment_DB_SMEClass.getESuperTypes().add(theM2Package.getAttachment());
		attachment_DB_CMEClass.getESuperTypes().add(theM2Package.getAttachment());
		binding_CM_ServerEClass.getESuperTypes().add(theM2Package.getBinding());

		// Initialize classes, features, and operations; add parameters
		initEClass(configuration_ClientServerEClass, Configuration_ClientServer.class, "Configuration_ClientServer",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(component_ClientEClass, Component_Client.class, "Component_Client", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(connector_RPCEClass, Connector_RPC.class, "Connector_RPC", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(component_ServerEClass, Component_Server.class, "Component_Server", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(binding_Server_SystemEClass, Binding_Server_System.class, "Binding_Server_System", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binding_Client_SystemEClass, Binding_Client_System.class, "Binding_Client_System", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attachment_Client_RPCEClass, Attachment_Client_RPC.class, "Attachment_Client_RPC", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attachment_RPC_ServerEClass, Attachment_RPC_Server.class, "Attachment_RPC_Server", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(configuration_ServerEClass, Configuration_Server.class, "Configuration_Server", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(component_ConnectionManagerEClass, Component_ConnectionManager.class, "Component_ConnectionManager",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(component_DatabaseEClass, Component_Database.class, "Component_Database", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(component_SecurityManagerEClass, Component_SecurityManager.class, "Component_SecurityManager",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connector_CM_DBEClass, Connector_CM_DB.class, "Connector_CM_DB", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(connector_CM_SMEClass, Connector_CM_SM.class, "Connector_CM_SM", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(connector_SM_DBEClass, Connector_SM_DB.class, "Connector_SM_DB", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(attachment_CM_DBEClass, Attachment_CM_DB.class, "Attachment_CM_DB", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(attachment_CM_SMEClass, Attachment_CM_SM.class, "Attachment_CM_SM", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(attachment_SM_CMEClass, Attachment_SM_CM.class, "Attachment_SM_CM", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(attachment_SM_DBEClass, Attachment_SM_DB.class, "Attachment_SM_DB", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(attachment_DB_SMEClass, Attachment_DB_SM.class, "Attachment_DB_SM", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(attachment_DB_CMEClass, Attachment_DB_CM.class, "Attachment_DB_CM", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(binding_CM_ServerEClass, Binding_CM_Server.class, "Binding_CM_Server", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //M1PackageImpl
