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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see asaproject.model.asa.M1.M1Package
 * @generated
 */
public class M1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static M1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = M1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M1Switch<Adapter> modelSwitch = new M1Switch<Adapter>() {
		@Override
		public Adapter caseConfiguration_ClientServer(Configuration_ClientServer object) {
			return createConfiguration_ClientServerAdapter();
		}

		@Override
		public Adapter caseComponent_Client(Component_Client object) {
			return createComponent_ClientAdapter();
		}

		@Override
		public Adapter caseConnector_RPC(Connector_RPC object) {
			return createConnector_RPCAdapter();
		}

		@Override
		public Adapter caseComponent_Server(Component_Server object) {
			return createComponent_ServerAdapter();
		}

		@Override
		public Adapter caseBinding_Server_System(Binding_Server_System object) {
			return createBinding_Server_SystemAdapter();
		}

		@Override
		public Adapter caseBinding_Client_System(Binding_Client_System object) {
			return createBinding_Client_SystemAdapter();
		}

		@Override
		public Adapter caseAttachment_Client_RPC(Attachment_Client_RPC object) {
			return createAttachment_Client_RPCAdapter();
		}

		@Override
		public Adapter caseAttachment_RPC_Server(Attachment_RPC_Server object) {
			return createAttachment_RPC_ServerAdapter();
		}

		@Override
		public Adapter caseConfiguration_Server(Configuration_Server object) {
			return createConfiguration_ServerAdapter();
		}

		@Override
		public Adapter caseComponent_ConnectionManager(Component_ConnectionManager object) {
			return createComponent_ConnectionManagerAdapter();
		}

		@Override
		public Adapter caseComponent_Database(Component_Database object) {
			return createComponent_DatabaseAdapter();
		}

		@Override
		public Adapter caseComponent_SecurityManager(Component_SecurityManager object) {
			return createComponent_SecurityManagerAdapter();
		}

		@Override
		public Adapter caseConnector_CM_DB(Connector_CM_DB object) {
			return createConnector_CM_DBAdapter();
		}

		@Override
		public Adapter caseConnector_CM_SM(Connector_CM_SM object) {
			return createConnector_CM_SMAdapter();
		}

		@Override
		public Adapter caseConnector_SM_DB(Connector_SM_DB object) {
			return createConnector_SM_DBAdapter();
		}

		@Override
		public Adapter caseAttachment_CM_DB(Attachment_CM_DB object) {
			return createAttachment_CM_DBAdapter();
		}

		@Override
		public Adapter caseAttachment_CM_SM(Attachment_CM_SM object) {
			return createAttachment_CM_SMAdapter();
		}

		@Override
		public Adapter caseAttachment_SM_CM(Attachment_SM_CM object) {
			return createAttachment_SM_CMAdapter();
		}

		@Override
		public Adapter caseAttachment_SM_DB(Attachment_SM_DB object) {
			return createAttachment_SM_DBAdapter();
		}

		@Override
		public Adapter caseAttachment_DB_SM(Attachment_DB_SM object) {
			return createAttachment_DB_SMAdapter();
		}

		@Override
		public Adapter caseAttachment_DB_CM(Attachment_DB_CM object) {
			return createAttachment_DB_CMAdapter();
		}

		@Override
		public Adapter caseBinding_CM_Server(Binding_CM_Server object) {
			return createBinding_CM_ServerAdapter();
		}

		@Override
		public Adapter caseArchitecturalElement(ArchitecturalElement object) {
			return createArchitecturalElementAdapter();
		}

		@Override
		public Adapter caseConfiguration(Configuration object) {
			return createConfigurationAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseConnector(Connector object) {
			return createConnectorAdapter();
		}

		@Override
		public Adapter caseLink(Link object) {
			return createLinkAdapter();
		}

		@Override
		public Adapter caseBinding(Binding object) {
			return createBindingAdapter();
		}

		@Override
		public Adapter caseAttachment(Attachment object) {
			return createAttachmentAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Configuration_ClientServer <em>Configuration Client Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Configuration_ClientServer
	 * @generated
	 */
	public Adapter createConfiguration_ClientServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Component_Client <em>Component Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Component_Client
	 * @generated
	 */
	public Adapter createComponent_ClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Connector_RPC <em>Connector RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Connector_RPC
	 * @generated
	 */
	public Adapter createConnector_RPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Component_Server <em>Component Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Component_Server
	 * @generated
	 */
	public Adapter createComponent_ServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Binding_Server_System <em>Binding Server System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Binding_Server_System
	 * @generated
	 */
	public Adapter createBinding_Server_SystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Binding_Client_System <em>Binding Client System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Binding_Client_System
	 * @generated
	 */
	public Adapter createBinding_Client_SystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Attachment_Client_RPC <em>Attachment Client RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Attachment_Client_RPC
	 * @generated
	 */
	public Adapter createAttachment_Client_RPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Attachment_RPC_Server <em>Attachment RPC Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Attachment_RPC_Server
	 * @generated
	 */
	public Adapter createAttachment_RPC_ServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Configuration_Server <em>Configuration Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Configuration_Server
	 * @generated
	 */
	public Adapter createConfiguration_ServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Component_ConnectionManager <em>Component Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Component_ConnectionManager
	 * @generated
	 */
	public Adapter createComponent_ConnectionManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Component_Database <em>Component Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Component_Database
	 * @generated
	 */
	public Adapter createComponent_DatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Component_SecurityManager <em>Component Security Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Component_SecurityManager
	 * @generated
	 */
	public Adapter createComponent_SecurityManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Connector_CM_DB <em>Connector CM DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Connector_CM_DB
	 * @generated
	 */
	public Adapter createConnector_CM_DBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Connector_CM_SM <em>Connector CM SM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Connector_CM_SM
	 * @generated
	 */
	public Adapter createConnector_CM_SMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Connector_SM_DB <em>Connector SM DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Connector_SM_DB
	 * @generated
	 */
	public Adapter createConnector_SM_DBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Attachment_CM_DB <em>Attachment CM DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Attachment_CM_DB
	 * @generated
	 */
	public Adapter createAttachment_CM_DBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Attachment_CM_SM <em>Attachment CM SM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Attachment_CM_SM
	 * @generated
	 */
	public Adapter createAttachment_CM_SMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Attachment_SM_CM <em>Attachment SM CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Attachment_SM_CM
	 * @generated
	 */
	public Adapter createAttachment_SM_CMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Attachment_SM_DB <em>Attachment SM DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Attachment_SM_DB
	 * @generated
	 */
	public Adapter createAttachment_SM_DBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Attachment_DB_SM <em>Attachment DB SM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Attachment_DB_SM
	 * @generated
	 */
	public Adapter createAttachment_DB_SMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Attachment_DB_CM <em>Attachment DB CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Attachment_DB_CM
	 * @generated
	 */
	public Adapter createAttachment_DB_CMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M1.Binding_CM_Server <em>Binding CM Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M1.Binding_CM_Server
	 * @generated
	 */
	public Adapter createBinding_CM_ServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M2.ArchitecturalElement <em>Architectural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M2.ArchitecturalElement
	 * @generated
	 */
	public Adapter createArchitecturalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M2.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M2.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M2.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M2.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M2.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M2.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M2.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M2.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M2.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M2.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaproject.model.asa.M2.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaproject.model.asa.M2.Attachment
	 * @generated
	 */
	public Adapter createAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //M1AdapterFactory
