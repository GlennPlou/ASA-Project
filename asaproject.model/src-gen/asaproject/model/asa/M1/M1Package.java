/**
 */
package asaproject.model.asa.M1;

import asaproject.model.asa.M2.M2Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see asaproject.model.asa.M1.M1Factory
 * @model kind="package"
 * @generated
 */
public interface M1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "M1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/M1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "M1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	M1Package eINSTANCE = asaproject.model.asa.M1.impl.M1PackageImpl.init();

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Configuration_ClientServerImpl <em>Configuration Client Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Configuration_ClientServerImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getConfiguration_ClientServer()
	 * @generated
	 */
	int CONFIGURATION_CLIENT_SERVER = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__PROPERTIES = M2Package.CONFIGURATION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__ELEMENTS = M2Package.CONFIGURATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__PARENT = M2Package.CONFIGURATION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__NAME = M2Package.CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__COMPONENTS = M2Package.CONFIGURATION__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__CONNECTORS = M2Package.CONFIGURATION__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER__PORTS = M2Package.CONFIGURATION__PORTS;

	/**
	 * The number of structural features of the '<em>Configuration Client Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER_FEATURE_COUNT = M2Package.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Configuration Client Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_CLIENT_SERVER_OPERATION_COUNT = M2Package.CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Component_ClientImpl <em>Component Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Component_ClientImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getComponent_Client()
	 * @generated
	 */
	int COMPONENT_CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLIENT__PROPERTIES = M2Package.COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLIENT__ELEMENTS = M2Package.COMPONENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLIENT__PARENT = M2Package.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLIENT__NAME = M2Package.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLIENT__CONFIGURATION = M2Package.COMPONENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Icomponents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLIENT__ICOMPONENTS = M2Package.COMPONENT__ICOMPONENTS;

	/**
	 * The number of structural features of the '<em>Component Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLIENT_FEATURE_COUNT = M2Package.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CLIENT_OPERATION_COUNT = M2Package.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Connector_RPCImpl <em>Connector RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Connector_RPCImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getConnector_RPC()
	 * @generated
	 */
	int CONNECTOR_RPC = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_RPC__PROPERTIES = M2Package.CONNECTOR__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_RPC__ELEMENTS = M2Package.CONNECTOR__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_RPC__PARENT = M2Package.CONNECTOR__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_RPC__NAME = M2Package.CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_RPC__GLUE = M2Package.CONNECTOR__GLUE;

	/**
	 * The feature id for the '<em><b>Iconnectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_RPC__ICONNECTORS = M2Package.CONNECTOR__ICONNECTORS;

	/**
	 * The number of structural features of the '<em>Connector RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_RPC_FEATURE_COUNT = M2Package.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connector RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_RPC_OPERATION_COUNT = M2Package.CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Component_ServerImpl <em>Component Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Component_ServerImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getComponent_Server()
	 * @generated
	 */
	int COMPONENT_SERVER = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVER__PROPERTIES = M2Package.COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVER__ELEMENTS = M2Package.COMPONENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVER__PARENT = M2Package.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVER__NAME = M2Package.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVER__CONFIGURATION = M2Package.COMPONENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Icomponents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVER__ICOMPONENTS = M2Package.COMPONENT__ICOMPONENTS;

	/**
	 * The number of structural features of the '<em>Component Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVER_FEATURE_COUNT = M2Package.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVER_OPERATION_COUNT = M2Package.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Binding_Server_SystemImpl <em>Binding Server System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Binding_Server_SystemImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getBinding_Server_System()
	 * @generated
	 */
	int BINDING_SERVER_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVER_SYSTEM__PROPERTIES = M2Package.BINDING__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVER_SYSTEM__ELEMENTS = M2Package.BINDING__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVER_SYSTEM__PARENT = M2Package.BINDING__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVER_SYSTEM__NAME = M2Package.BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVER_SYSTEM__PORTS = M2Package.BINDING__PORTS;

	/**
	 * The number of structural features of the '<em>Binding Server System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVER_SYSTEM_FEATURE_COUNT = M2Package.BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Binding Server System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVER_SYSTEM_OPERATION_COUNT = M2Package.BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Binding_Client_SystemImpl <em>Binding Client System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Binding_Client_SystemImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getBinding_Client_System()
	 * @generated
	 */
	int BINDING_CLIENT_SYSTEM = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CLIENT_SYSTEM__PROPERTIES = M2Package.BINDING__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CLIENT_SYSTEM__ELEMENTS = M2Package.BINDING__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CLIENT_SYSTEM__PARENT = M2Package.BINDING__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CLIENT_SYSTEM__NAME = M2Package.BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CLIENT_SYSTEM__PORTS = M2Package.BINDING__PORTS;

	/**
	 * The number of structural features of the '<em>Binding Client System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CLIENT_SYSTEM_FEATURE_COUNT = M2Package.BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Binding Client System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CLIENT_SYSTEM_OPERATION_COUNT = M2Package.BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Attachment_Client_RPCImpl <em>Attachment Client RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Attachment_Client_RPCImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getAttachment_Client_RPC()
	 * @generated
	 */
	int ATTACHMENT_CLIENT_RPC = 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENT_RPC__PROPERTIES = M2Package.ATTACHMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENT_RPC__ELEMENTS = M2Package.ATTACHMENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENT_RPC__PARENT = M2Package.ATTACHMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENT_RPC__NAME = M2Package.ATTACHMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENT_RPC__PORTS = M2Package.ATTACHMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENT_RPC__ROLES = M2Package.ATTACHMENT__ROLES;

	/**
	 * The number of structural features of the '<em>Attachment Client RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENT_RPC_FEATURE_COUNT = M2Package.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attachment Client RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CLIENT_RPC_OPERATION_COUNT = M2Package.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Attachment_RPC_ServerImpl <em>Attachment RPC Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Attachment_RPC_ServerImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getAttachment_RPC_Server()
	 * @generated
	 */
	int ATTACHMENT_RPC_SERVER = 7;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_SERVER__PROPERTIES = M2Package.ATTACHMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_SERVER__ELEMENTS = M2Package.ATTACHMENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_SERVER__PARENT = M2Package.ATTACHMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_SERVER__NAME = M2Package.ATTACHMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_SERVER__PORTS = M2Package.ATTACHMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_SERVER__ROLES = M2Package.ATTACHMENT__ROLES;

	/**
	 * The number of structural features of the '<em>Attachment RPC Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_SERVER_FEATURE_COUNT = M2Package.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attachment RPC Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_RPC_SERVER_OPERATION_COUNT = M2Package.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Configuration_ServerImpl <em>Configuration Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Configuration_ServerImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getConfiguration_Server()
	 * @generated
	 */
	int CONFIGURATION_SERVER = 8;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVER__PROPERTIES = M2Package.CONFIGURATION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVER__ELEMENTS = M2Package.CONFIGURATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVER__PARENT = M2Package.CONFIGURATION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVER__NAME = M2Package.CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVER__COMPONENTS = M2Package.CONFIGURATION__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVER__CONNECTORS = M2Package.CONFIGURATION__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVER__PORTS = M2Package.CONFIGURATION__PORTS;

	/**
	 * The number of structural features of the '<em>Configuration Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVER_FEATURE_COUNT = M2Package.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Configuration Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVER_OPERATION_COUNT = M2Package.CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Component_ConnectionManagerImpl <em>Component Connection Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Component_ConnectionManagerImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getComponent_ConnectionManager()
	 * @generated
	 */
	int COMPONENT_CONNECTION_MANAGER = 9;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONNECTION_MANAGER__PROPERTIES = M2Package.COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONNECTION_MANAGER__ELEMENTS = M2Package.COMPONENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONNECTION_MANAGER__PARENT = M2Package.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONNECTION_MANAGER__NAME = M2Package.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONNECTION_MANAGER__CONFIGURATION = M2Package.COMPONENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Icomponents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONNECTION_MANAGER__ICOMPONENTS = M2Package.COMPONENT__ICOMPONENTS;

	/**
	 * The number of structural features of the '<em>Component Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONNECTION_MANAGER_FEATURE_COUNT = M2Package.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONNECTION_MANAGER_OPERATION_COUNT = M2Package.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Component_DatabaseImpl <em>Component Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Component_DatabaseImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getComponent_Database()
	 * @generated
	 */
	int COMPONENT_DATABASE = 10;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATABASE__PROPERTIES = M2Package.COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATABASE__ELEMENTS = M2Package.COMPONENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATABASE__PARENT = M2Package.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATABASE__NAME = M2Package.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATABASE__CONFIGURATION = M2Package.COMPONENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Icomponents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATABASE__ICOMPONENTS = M2Package.COMPONENT__ICOMPONENTS;

	/**
	 * The number of structural features of the '<em>Component Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATABASE_FEATURE_COUNT = M2Package.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATABASE_OPERATION_COUNT = M2Package.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Component_SecurityManagerImpl <em>Component Security Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Component_SecurityManagerImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getComponent_SecurityManager()
	 * @generated
	 */
	int COMPONENT_SECURITY_MANAGER = 11;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SECURITY_MANAGER__PROPERTIES = M2Package.COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SECURITY_MANAGER__ELEMENTS = M2Package.COMPONENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SECURITY_MANAGER__PARENT = M2Package.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SECURITY_MANAGER__NAME = M2Package.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SECURITY_MANAGER__CONFIGURATION = M2Package.COMPONENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Icomponents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SECURITY_MANAGER__ICOMPONENTS = M2Package.COMPONENT__ICOMPONENTS;

	/**
	 * The number of structural features of the '<em>Component Security Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SECURITY_MANAGER_FEATURE_COUNT = M2Package.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component Security Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SECURITY_MANAGER_OPERATION_COUNT = M2Package.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Connector_CM_DBImpl <em>Connector CM DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Connector_CM_DBImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getConnector_CM_DB()
	 * @generated
	 */
	int CONNECTOR_CM_DB = 12;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CM_DB__PROPERTIES = M2Package.CONNECTOR__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CM_DB__ELEMENTS = M2Package.CONNECTOR__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CM_DB__PARENT = M2Package.CONNECTOR__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CM_DB__NAME = M2Package.CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CM_DB__GLUE = M2Package.CONNECTOR__GLUE;

	/**
	 * The feature id for the '<em><b>Iconnectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CM_DB__ICONNECTORS = M2Package.CONNECTOR__ICONNECTORS;

	/**
	 * The number of structural features of the '<em>Connector CM DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CM_DB_FEATURE_COUNT = M2Package.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connector CM DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CM_DB_OPERATION_COUNT = M2Package.CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Connector_CM_SMImpl <em>Connector CM SM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Connector_CM_SMImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getConnector_CM_SM()
	 * @generated
	 */
	int CONNECTOR_CM_SM = 13;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CM_SM__PROPERTIES = M2Package.CONNECTOR__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CM_SM__ELEMENTS = M2Package.CONNECTOR__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CM_SM__PARENT = M2Package.CONNECTOR__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CM_SM__NAME = M2Package.CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CM_SM__GLUE = M2Package.CONNECTOR__GLUE;

	/**
	 * The feature id for the '<em><b>Iconnectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CM_SM__ICONNECTORS = M2Package.CONNECTOR__ICONNECTORS;

	/**
	 * The number of structural features of the '<em>Connector CM SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CM_SM_FEATURE_COUNT = M2Package.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connector CM SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_CM_SM_OPERATION_COUNT = M2Package.CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Connector_SM_DBImpl <em>Connector SM DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Connector_SM_DBImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getConnector_SM_DB()
	 * @generated
	 */
	int CONNECTOR_SM_DB = 14;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SM_DB__PROPERTIES = M2Package.CONNECTOR__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SM_DB__ELEMENTS = M2Package.CONNECTOR__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SM_DB__PARENT = M2Package.CONNECTOR__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SM_DB__NAME = M2Package.CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SM_DB__GLUE = M2Package.CONNECTOR__GLUE;

	/**
	 * The feature id for the '<em><b>Iconnectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SM_DB__ICONNECTORS = M2Package.CONNECTOR__ICONNECTORS;

	/**
	 * The number of structural features of the '<em>Connector SM DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SM_DB_FEATURE_COUNT = M2Package.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connector SM DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_SM_DB_OPERATION_COUNT = M2Package.CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Attachment_CM_DBImpl <em>Attachment CM DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Attachment_CM_DBImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getAttachment_CM_DB()
	 * @generated
	 */
	int ATTACHMENT_CM_DB = 15;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_DB__PROPERTIES = M2Package.ATTACHMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_DB__ELEMENTS = M2Package.ATTACHMENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_DB__PARENT = M2Package.ATTACHMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_DB__NAME = M2Package.ATTACHMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_DB__PORTS = M2Package.ATTACHMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_DB__ROLES = M2Package.ATTACHMENT__ROLES;

	/**
	 * The number of structural features of the '<em>Attachment CM DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_DB_FEATURE_COUNT = M2Package.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attachment CM DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_DB_OPERATION_COUNT = M2Package.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Attachment_CM_SMImpl <em>Attachment CM SM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Attachment_CM_SMImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getAttachment_CM_SM()
	 * @generated
	 */
	int ATTACHMENT_CM_SM = 16;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_SM__PROPERTIES = M2Package.ATTACHMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_SM__ELEMENTS = M2Package.ATTACHMENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_SM__PARENT = M2Package.ATTACHMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_SM__NAME = M2Package.ATTACHMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_SM__PORTS = M2Package.ATTACHMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_SM__ROLES = M2Package.ATTACHMENT__ROLES;

	/**
	 * The number of structural features of the '<em>Attachment CM SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_SM_FEATURE_COUNT = M2Package.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attachment CM SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CM_SM_OPERATION_COUNT = M2Package.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Attachment_SM_CMImpl <em>Attachment SM CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Attachment_SM_CMImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getAttachment_SM_CM()
	 * @generated
	 */
	int ATTACHMENT_SM_CM = 17;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_CM__PROPERTIES = M2Package.ATTACHMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_CM__ELEMENTS = M2Package.ATTACHMENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_CM__PARENT = M2Package.ATTACHMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_CM__NAME = M2Package.ATTACHMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_CM__PORTS = M2Package.ATTACHMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_CM__ROLES = M2Package.ATTACHMENT__ROLES;

	/**
	 * The number of structural features of the '<em>Attachment SM CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_CM_FEATURE_COUNT = M2Package.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attachment SM CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_CM_OPERATION_COUNT = M2Package.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Attachment_SM_DBImpl <em>Attachment SM DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Attachment_SM_DBImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getAttachment_SM_DB()
	 * @generated
	 */
	int ATTACHMENT_SM_DB = 18;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_DB__PROPERTIES = M2Package.ATTACHMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_DB__ELEMENTS = M2Package.ATTACHMENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_DB__PARENT = M2Package.ATTACHMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_DB__NAME = M2Package.ATTACHMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_DB__PORTS = M2Package.ATTACHMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_DB__ROLES = M2Package.ATTACHMENT__ROLES;

	/**
	 * The number of structural features of the '<em>Attachment SM DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_DB_FEATURE_COUNT = M2Package.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attachment SM DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_SM_DB_OPERATION_COUNT = M2Package.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Attachment_DB_SMImpl <em>Attachment DB SM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Attachment_DB_SMImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getAttachment_DB_SM()
	 * @generated
	 */
	int ATTACHMENT_DB_SM = 19;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_SM__PROPERTIES = M2Package.ATTACHMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_SM__ELEMENTS = M2Package.ATTACHMENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_SM__PARENT = M2Package.ATTACHMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_SM__NAME = M2Package.ATTACHMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_SM__PORTS = M2Package.ATTACHMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_SM__ROLES = M2Package.ATTACHMENT__ROLES;

	/**
	 * The number of structural features of the '<em>Attachment DB SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_SM_FEATURE_COUNT = M2Package.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attachment DB SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_SM_OPERATION_COUNT = M2Package.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Attachment_DB_CMImpl <em>Attachment DB CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Attachment_DB_CMImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getAttachment_DB_CM()
	 * @generated
	 */
	int ATTACHMENT_DB_CM = 20;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_CM__PROPERTIES = M2Package.ATTACHMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_CM__ELEMENTS = M2Package.ATTACHMENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_CM__PARENT = M2Package.ATTACHMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_CM__NAME = M2Package.ATTACHMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_CM__PORTS = M2Package.ATTACHMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_CM__ROLES = M2Package.ATTACHMENT__ROLES;

	/**
	 * The number of structural features of the '<em>Attachment DB CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_CM_FEATURE_COUNT = M2Package.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attachment DB CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_DB_CM_OPERATION_COUNT = M2Package.ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Binding_CM_ServerImpl <em>Binding CM Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Binding_CM_ServerImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getBinding_CM_Server()
	 * @generated
	 */
	int BINDING_CM_SERVER = 21;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CM_SERVER__PROPERTIES = M2Package.BINDING__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CM_SERVER__ELEMENTS = M2Package.BINDING__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CM_SERVER__PARENT = M2Package.BINDING__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CM_SERVER__NAME = M2Package.BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CM_SERVER__PORTS = M2Package.BINDING__PORTS;

	/**
	 * The number of structural features of the '<em>Binding CM Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CM_SERVER_FEATURE_COUNT = M2Package.BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Binding CM Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_CM_SERVER_OPERATION_COUNT = M2Package.BINDING_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Configuration_ClientServer <em>Configuration Client Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Client Server</em>'.
	 * @see asaproject.model.asa.M1.Configuration_ClientServer
	 * @generated
	 */
	EClass getConfiguration_ClientServer();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Component_Client <em>Component Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Client</em>'.
	 * @see asaproject.model.asa.M1.Component_Client
	 * @generated
	 */
	EClass getComponent_Client();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Connector_RPC <em>Connector RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector RPC</em>'.
	 * @see asaproject.model.asa.M1.Connector_RPC
	 * @generated
	 */
	EClass getConnector_RPC();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Component_Server <em>Component Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Server</em>'.
	 * @see asaproject.model.asa.M1.Component_Server
	 * @generated
	 */
	EClass getComponent_Server();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Binding_Server_System <em>Binding Server System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Server System</em>'.
	 * @see asaproject.model.asa.M1.Binding_Server_System
	 * @generated
	 */
	EClass getBinding_Server_System();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Binding_Client_System <em>Binding Client System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Client System</em>'.
	 * @see asaproject.model.asa.M1.Binding_Client_System
	 * @generated
	 */
	EClass getBinding_Client_System();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Attachment_Client_RPC <em>Attachment Client RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment Client RPC</em>'.
	 * @see asaproject.model.asa.M1.Attachment_Client_RPC
	 * @generated
	 */
	EClass getAttachment_Client_RPC();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Attachment_RPC_Server <em>Attachment RPC Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment RPC Server</em>'.
	 * @see asaproject.model.asa.M1.Attachment_RPC_Server
	 * @generated
	 */
	EClass getAttachment_RPC_Server();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Configuration_Server <em>Configuration Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Server</em>'.
	 * @see asaproject.model.asa.M1.Configuration_Server
	 * @generated
	 */
	EClass getConfiguration_Server();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Component_ConnectionManager <em>Component Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Connection Manager</em>'.
	 * @see asaproject.model.asa.M1.Component_ConnectionManager
	 * @generated
	 */
	EClass getComponent_ConnectionManager();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Component_Database <em>Component Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Database</em>'.
	 * @see asaproject.model.asa.M1.Component_Database
	 * @generated
	 */
	EClass getComponent_Database();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Component_SecurityManager <em>Component Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Security Manager</em>'.
	 * @see asaproject.model.asa.M1.Component_SecurityManager
	 * @generated
	 */
	EClass getComponent_SecurityManager();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Connector_CM_DB <em>Connector CM DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector CM DB</em>'.
	 * @see asaproject.model.asa.M1.Connector_CM_DB
	 * @generated
	 */
	EClass getConnector_CM_DB();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Connector_CM_SM <em>Connector CM SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector CM SM</em>'.
	 * @see asaproject.model.asa.M1.Connector_CM_SM
	 * @generated
	 */
	EClass getConnector_CM_SM();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Connector_SM_DB <em>Connector SM DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector SM DB</em>'.
	 * @see asaproject.model.asa.M1.Connector_SM_DB
	 * @generated
	 */
	EClass getConnector_SM_DB();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Attachment_CM_DB <em>Attachment CM DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment CM DB</em>'.
	 * @see asaproject.model.asa.M1.Attachment_CM_DB
	 * @generated
	 */
	EClass getAttachment_CM_DB();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Attachment_CM_SM <em>Attachment CM SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment CM SM</em>'.
	 * @see asaproject.model.asa.M1.Attachment_CM_SM
	 * @generated
	 */
	EClass getAttachment_CM_SM();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Attachment_SM_CM <em>Attachment SM CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment SM CM</em>'.
	 * @see asaproject.model.asa.M1.Attachment_SM_CM
	 * @generated
	 */
	EClass getAttachment_SM_CM();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Attachment_SM_DB <em>Attachment SM DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment SM DB</em>'.
	 * @see asaproject.model.asa.M1.Attachment_SM_DB
	 * @generated
	 */
	EClass getAttachment_SM_DB();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Attachment_DB_SM <em>Attachment DB SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment DB SM</em>'.
	 * @see asaproject.model.asa.M1.Attachment_DB_SM
	 * @generated
	 */
	EClass getAttachment_DB_SM();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Attachment_DB_CM <em>Attachment DB CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment DB CM</em>'.
	 * @see asaproject.model.asa.M1.Attachment_DB_CM
	 * @generated
	 */
	EClass getAttachment_DB_CM();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Binding_CM_Server <em>Binding CM Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding CM Server</em>'.
	 * @see asaproject.model.asa.M1.Binding_CM_Server
	 * @generated
	 */
	EClass getBinding_CM_Server();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	M1Factory getM1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Configuration_ClientServerImpl <em>Configuration Client Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Configuration_ClientServerImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getConfiguration_ClientServer()
		 * @generated
		 */
		EClass CONFIGURATION_CLIENT_SERVER = eINSTANCE.getConfiguration_ClientServer();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Component_ClientImpl <em>Component Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Component_ClientImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getComponent_Client()
		 * @generated
		 */
		EClass COMPONENT_CLIENT = eINSTANCE.getComponent_Client();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Connector_RPCImpl <em>Connector RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Connector_RPCImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getConnector_RPC()
		 * @generated
		 */
		EClass CONNECTOR_RPC = eINSTANCE.getConnector_RPC();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Component_ServerImpl <em>Component Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Component_ServerImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getComponent_Server()
		 * @generated
		 */
		EClass COMPONENT_SERVER = eINSTANCE.getComponent_Server();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Binding_Server_SystemImpl <em>Binding Server System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Binding_Server_SystemImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getBinding_Server_System()
		 * @generated
		 */
		EClass BINDING_SERVER_SYSTEM = eINSTANCE.getBinding_Server_System();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Binding_Client_SystemImpl <em>Binding Client System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Binding_Client_SystemImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getBinding_Client_System()
		 * @generated
		 */
		EClass BINDING_CLIENT_SYSTEM = eINSTANCE.getBinding_Client_System();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Attachment_Client_RPCImpl <em>Attachment Client RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Attachment_Client_RPCImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getAttachment_Client_RPC()
		 * @generated
		 */
		EClass ATTACHMENT_CLIENT_RPC = eINSTANCE.getAttachment_Client_RPC();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Attachment_RPC_ServerImpl <em>Attachment RPC Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Attachment_RPC_ServerImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getAttachment_RPC_Server()
		 * @generated
		 */
		EClass ATTACHMENT_RPC_SERVER = eINSTANCE.getAttachment_RPC_Server();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Configuration_ServerImpl <em>Configuration Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Configuration_ServerImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getConfiguration_Server()
		 * @generated
		 */
		EClass CONFIGURATION_SERVER = eINSTANCE.getConfiguration_Server();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Component_ConnectionManagerImpl <em>Component Connection Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Component_ConnectionManagerImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getComponent_ConnectionManager()
		 * @generated
		 */
		EClass COMPONENT_CONNECTION_MANAGER = eINSTANCE.getComponent_ConnectionManager();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Component_DatabaseImpl <em>Component Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Component_DatabaseImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getComponent_Database()
		 * @generated
		 */
		EClass COMPONENT_DATABASE = eINSTANCE.getComponent_Database();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Component_SecurityManagerImpl <em>Component Security Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Component_SecurityManagerImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getComponent_SecurityManager()
		 * @generated
		 */
		EClass COMPONENT_SECURITY_MANAGER = eINSTANCE.getComponent_SecurityManager();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Connector_CM_DBImpl <em>Connector CM DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Connector_CM_DBImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getConnector_CM_DB()
		 * @generated
		 */
		EClass CONNECTOR_CM_DB = eINSTANCE.getConnector_CM_DB();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Connector_CM_SMImpl <em>Connector CM SM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Connector_CM_SMImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getConnector_CM_SM()
		 * @generated
		 */
		EClass CONNECTOR_CM_SM = eINSTANCE.getConnector_CM_SM();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Connector_SM_DBImpl <em>Connector SM DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Connector_SM_DBImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getConnector_SM_DB()
		 * @generated
		 */
		EClass CONNECTOR_SM_DB = eINSTANCE.getConnector_SM_DB();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Attachment_CM_DBImpl <em>Attachment CM DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Attachment_CM_DBImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getAttachment_CM_DB()
		 * @generated
		 */
		EClass ATTACHMENT_CM_DB = eINSTANCE.getAttachment_CM_DB();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Attachment_CM_SMImpl <em>Attachment CM SM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Attachment_CM_SMImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getAttachment_CM_SM()
		 * @generated
		 */
		EClass ATTACHMENT_CM_SM = eINSTANCE.getAttachment_CM_SM();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Attachment_SM_CMImpl <em>Attachment SM CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Attachment_SM_CMImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getAttachment_SM_CM()
		 * @generated
		 */
		EClass ATTACHMENT_SM_CM = eINSTANCE.getAttachment_SM_CM();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Attachment_SM_DBImpl <em>Attachment SM DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Attachment_SM_DBImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getAttachment_SM_DB()
		 * @generated
		 */
		EClass ATTACHMENT_SM_DB = eINSTANCE.getAttachment_SM_DB();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Attachment_DB_SMImpl <em>Attachment DB SM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Attachment_DB_SMImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getAttachment_DB_SM()
		 * @generated
		 */
		EClass ATTACHMENT_DB_SM = eINSTANCE.getAttachment_DB_SM();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Attachment_DB_CMImpl <em>Attachment DB CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Attachment_DB_CMImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getAttachment_DB_CM()
		 * @generated
		 */
		EClass ATTACHMENT_DB_CM = eINSTANCE.getAttachment_DB_CM();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Binding_CM_ServerImpl <em>Binding CM Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Binding_CM_ServerImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getBinding_CM_Server()
		 * @generated
		 */
		EClass BINDING_CM_SERVER = eINSTANCE.getBinding_CM_Server();

	}

} //M1Package
