package fr.univnantes.asa.clientserver;

import asaproject.model.asa.M2.ArchitecturalElement;
import asaproject.model.asa.M2.impl.*;

public class ServerDetail extends ConfigurationImpl {

	private ConnectionManager connectionManager;
	private SecurityManager securityManager;
	private Database database;
	private ConnectorImpl connectionManager_securityManager, securityManager_database, database_connectionManager;
	private AttachmentImpl 	connectionManager_To_CM_SM, CM_SM_To_securityManager,
							securityManager_To_SM_DB, SM_DB_To_database,
							database_To_DB_CM, DB_CM_To_connectionManager;
	private BindingImpl connectionManager_Server;

	public ServerDetail() {
		super();
		this.addConnectionManager(new ConnectionManager("Log_Me_PLZ").configuration(this).parent(this));
		this.addSecurityManager(new SecurityManager("Be_Secure").configuration(this).parent(this));
		this.addDatabase(new Database("MySQL").configuration(this).parent(this));

		this.addConnectionManager_securityManager(new ConnectorImpl("CM_SM").parent(this));
		this.addSecurityManager_database(new ConnectorImpl("SM_DB").parent(this));
		this.addDatabase_connectionManager(new ConnectorImpl("DB_CM").parent(this));

		this.connectionManager_To_CM_SM = new
				AttachmentImpl("CM_To_CM_SM", this.connectionManager.getSecurity_Check_Send(), this.connectionManager_securityManager.getCaller())
				.setAttachment(this.connectionManager.getExternal_Socket_Receive(), this.connectionManager_securityManager.getCalled());

		this.CM_SM_To_securityManager = new
				AttachmentImpl("CM_SM_To_SM", this.securityManager.getSecurity_Authentification_Send(), this.connectionManager_securityManager.getCaller())
				.setAttachment(this.securityManager.getSecurity_Authentification_Receive(), this.connectionManager_securityManager.getCalled());

		this.securityManager_To_SM_DB = new
				AttachmentImpl("SM_To_SM_DB", this.securityManager.getCheck_Query_Send(), this.securityManager_database.getCaller())
				.setAttachment(this.securityManager.getCheck_Query_Receive(), this.securityManager_database.getCalled());

		this.SM_DB_To_database = new AttachmentImpl("SM_DB_To_DB", database.getSecurity_Management_Send(), this.securityManager_database.getCaller())
				.setAttachment(this.database.getSecurity_Management_Receive(), this.securityManager_database.getCalled());

		this.database_To_DB_CM = new
				AttachmentImpl("DB_To_DB_CM", this.database.getQuery_Interrogation_Send(), this.database_connectionManager.getCaller())
				.setAttachment(this.database.getQuery_Interrogation_Receive(), this.database_connectionManager.getCalled());

		this.DB_CM_To_connectionManager = new AttachmentImpl("DB_CM_To_CM", this.connectionManager.getDB_Query_Send(), this.database_connectionManager.getCaller())
				.setAttachment(this.connectionManager.getDB_Query_Receive(), this.database_connectionManager.getCalled());

		this.connectionManager_Server =
				new BindingImpl("connectionManager_Server",
				this.connectionManager.getExternal_Socket_Receive(),
				((Server)this.getParent()).getSystemServerBindingSend());
	}
	
	public ServerDetail parent(ArchitecturalElement element) {
    	super.parent(element);
    	return this;
    }

	public void addConnectionManager(ConnectionManager connectionManager) {
		this.addComponent(connectionManager);
		this.connectionManager = connectionManager;
	}
	public void addSecurityManager(SecurityManager securityManager) {
		this.addComponent(securityManager);
		this.securityManager = securityManager;
	}
	public void addDatabase(Database database) {
		this.addComponent(database);
		this.database = database;
	}

	public void addConnectionManager_securityManager(ConnectorImpl connectionManager_securityManager) {
		this.addConnector(connectionManager_securityManager);
		this.connectionManager_securityManager = connectionManager_securityManager;
	}
	public void addSecurityManager_database(ConnectorImpl securityManager_database) {
		this.addConnector(securityManager_database);
		this.securityManager_database = securityManager_database;
	}
	public void addDatabase_connectionManager(ConnectorImpl database_connectionManager) {
		this.addConnector(database_connectionManager);
		this.database_connectionManager = database_connectionManager;
	}

}
