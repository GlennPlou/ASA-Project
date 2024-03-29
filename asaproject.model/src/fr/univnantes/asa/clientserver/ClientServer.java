package fr.univnantes.asa.clientserver;

import asaproject.model.asa.M2.impl.AttachmentImpl;
import asaproject.model.asa.M2.impl.BindingImpl;
import asaproject.model.asa.M2.impl.ConfigurationImpl;
import asaproject.model.asa.M2.impl.ConnectorImpl;
import asaproject.model.asa.M2.impl.ProvidedPortImpl;

public class ClientServer extends ConfigurationImpl {
	
	private Client client;
	private Server server;
	private ConnectorImpl rpc;
	private ProvidedPortImpl serverPort, clientPort;
	private AttachmentImpl clientToRPC, RPCToServer;
	private BindingImpl clientSystem, serverSystem;
	
    public ClientServer() {
        super();
        this.addClient(new Client("Prénom").configuration(this).parent(this));
        this.addServer(new Server("POKéMON_GO").configuration(this).parent(this));

        this.addRPC(new ConnectorImpl("RPC").parent(this));
        
        this.serverPort = new ProvidedPortImpl("Server_Port").configuration(this);
        this.addPort(serverPort);
        this.clientPort = new ProvidedPortImpl("Client_Port").configuration(this);
        this.addPort(clientPort);
        
        this.clientToRPC = new AttachmentImpl("Client_To_RPC", client.getSendRequest(), rpc.getCaller());
        this.RPCToServer = new AttachmentImpl("RPC_To_Server", server.getReceiveRequest(), rpc.getCalled());
        this.serverSystem = new BindingImpl("Server_System", serverPort, server.getSystemServer());
        this.clientSystem = new BindingImpl("Client_System", clientPort, client.getSystemClient());
    }
	
	public void addClient(Client client) {
		this.addComponent(client);
		this.client = client;
	}
	public void addServer(Server server) {
		this.addComponent(server);
		this.server = server;
		
	}
	public void addRPC(ConnectorImpl rpc) {
		this.addConnector(rpc);
		this.rpc = rpc;
	}
}
