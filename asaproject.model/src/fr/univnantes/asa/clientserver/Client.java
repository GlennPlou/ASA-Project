package fr.univnantes.asa.clientserver;

import asaproject.model.asa.M2.Configuration;
import asaproject.model.asa.M2.impl.ComponentImpl;
import asaproject.model.asa.M2.impl.ProvidedPortImpl;
import asaproject.model.asa.M2.impl.RequiredPortImpl;

public class Client extends ComponentImpl {
	
	private ProvidedPortImpl sendRequest;
	private RequiredPortImpl systemClient;
	
    public Client() {
        super();
    }
    
    public Client(String name, Configuration configuration) {
    	super(name, configuration);
    	this.sendRequest = new ProvidedPortImpl("Send_Request");
    	this.systemClient = new RequiredPortImpl("System_Client");
    	this.icomponents.add(this.sendRequest);
    	this.icomponents.add(this.systemClient);
    }

    public ProvidedPortImpl getSendRequest() {
        return sendRequest;
    }

    public RequiredPortImpl getSystemClient() {
        return systemClient;
    }
}
