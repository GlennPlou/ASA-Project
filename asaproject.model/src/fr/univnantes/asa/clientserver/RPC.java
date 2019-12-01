package fr.univnantes.asa.clientserver;

import asaproject.model.asa.M2.impl.ConnectorImpl;
import asaproject.model.asa.M2.impl.ProvidedRoleImpl;
import asaproject.model.asa.M2.impl.RequiredRoleImpl;

public class RPC extends ConnectorImpl {
	
	private RequiredRoleImpl caller;
	private ProvidedRoleImpl called;
	
    public RPC() {
        super();
    }

    public RequiredRoleImpl getCaller() {
        return caller;
    }

    public ProvidedRoleImpl getCalled() {
        return called;
    }
}
