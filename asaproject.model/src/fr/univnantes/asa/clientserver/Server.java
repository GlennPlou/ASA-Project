package fr.univnantes.asa.clientserver;

import asaproject.model.asa.M2.ArchitecturalElement;
import asaproject.model.asa.M2.Configuration;
import asaproject.model.asa.M2.impl.ComponentImpl;
import asaproject.model.asa.M2.impl.ProvidedPortImpl;
import asaproject.model.asa.M2.impl.RequiredPortImpl;

public class Server extends ComponentImpl {
	
	private RequiredPortImpl receiveRequest, systemServer;
	private ProvidedPortImpl systemServerBindingSend;
	private ServerDetail serverDetail;
	
    public Server() {
        super();
    }
    
    public Server(String name) {
    	super(name);
    	this.receiveRequest = new RequiredPortImpl("Receive_Request").component(this);
    	this.systemServer = new RequiredPortImpl("System_Server").component(this);
    	this.systemServerBindingSend = new ProvidedPortImpl("System_Server_Binding_Send").component(this);
    	this.icomponents.add(receiveRequest);
    	this.icomponents.add(systemServer);
    	this.icomponents.add(systemServerBindingSend);
    	this.serverDetail = new ServerDetail().parent(this);
    }
    
    public Server configuration(Configuration configuration) {
    	super.configuration(configuration);
    	return this;
    }
	
	public Server parent(ArchitecturalElement element) {
    	super.parent(element);
    	return this;
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
