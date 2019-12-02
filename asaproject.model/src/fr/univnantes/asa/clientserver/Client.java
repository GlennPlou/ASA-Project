package fr.univnantes.asa.clientserver;

import asaproject.model.asa.M2.ArchitecturalElement;
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
    
    public Client(String name) {
    	super(name);
    	this.sendRequest = new ProvidedPortImpl("Send_Request").component(this);
    	this.systemClient = new RequiredPortImpl("System_Client").component(this);
    	this.icomponents.add(this.sendRequest);
    	this.icomponents.add(this.systemClient);
    }
    
    public Client configuration(Configuration configuration) {
    	super.configuration(configuration);
    	return this;
    }
	
	public Client parent(ArchitecturalElement element) {
    	super.parent(element);
    	return this;
    }

    public ProvidedPortImpl getSendRequest() {
        return sendRequest;
    }

    public RequiredPortImpl getSystemClient() {
        return systemClient;
    }
}
