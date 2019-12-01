package fr.univnantes.asa.clientserver;

import asaproject.model.asa.M2.Configuration;
import asaproject.model.asa.M2.impl.ComponentImpl;
import asaproject.model.asa.M2.impl.ProvidedPortImpl;
import asaproject.model.asa.M2.impl.RequiredPortImpl;

public class Server extends ComponentImpl {
	
	private RequiredPortImpl receiveRequest, systemServer;
	private ProvidedPortImpl systemServerBindingSend;
	
    public Server() {
        super();
    }
    
    public Server(String name, Configuration configuration) {
    	super(name, configuration);
    	this.receiveRequest = new RequiredPortImpl("Receive_Request");
    	this.systemServer = new RequiredPortImpl("System_Server");
    	this.systemServerBindingSend = new ProvidedPortImpl("System_Server_Binding_Send");
    	this.icomponents.add(receiveRequest);
    	this.icomponents.add(systemServer);
    	this.icomponents.add(systemServerBindingSend);
    }

    public RequiredPortImpl getReceiveRequest() {
        return receiveRequest;
    }

    public RequiredPortImpl getSystemServer() {
        return systemServer;
    }

    public ProvidedPortImpl getSystemServerBindingSend() {
        return systemServerBindingSend;
    }
}
