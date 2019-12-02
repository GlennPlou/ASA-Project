package fr.univnantes.asa.clientserver;

import asaproject.model.asa.M2.ArchitecturalElement;
import asaproject.model.asa.M2.Configuration;
import asaproject.model.asa.M2.impl.ComponentImpl;
import asaproject.model.asa.M2.impl.ProvidedPortImpl;
import asaproject.model.asa.M2.impl.RequiredPortImpl;

public class ConnectionManager extends ComponentImpl {

    private ProvidedPortImpl Security_Check_Send;
    private ProvidedPortImpl DB_Query_Send;
    private RequiredPortImpl Security_Check_Receive;
    private RequiredPortImpl DB_Query_Receive;
    private RequiredPortImpl External_Socket_Receive;


    public ConnectionManager(String name) {
        super(name);

        this.Security_Check_Send = new ProvidedPortImpl("Security_Check_Send").component(this);
        this.DB_Query_Send = new ProvidedPortImpl("DB_Query_Send").component(this);
        this.Security_Check_Receive = new RequiredPortImpl("Security_Check_Receive").component(this);
        this.DB_Query_Receive = new RequiredPortImpl("DB_Query_Receive").component(this);
        this.External_Socket_Receive = new RequiredPortImpl("External_Socket_Receive").component(this);

        this.icomponents.add(this.Security_Check_Send);
        this.icomponents.add(this.DB_Query_Send);
        this.icomponents.add(this.Security_Check_Receive);
        this.icomponents.add(this.DB_Query_Receive);
        this.icomponents.add(this.External_Socket_Receive);
    }

    public ConnectionManager configuration(Configuration configuration) {
        super.configuration(configuration);
        return this;
    }

    public ConnectionManager parent(ArchitecturalElement element) {
        super.parent(element);
        return this;
    }

    public ProvidedPortImpl getSecurity_Check_Send() {
        return Security_Check_Send;
    }

    public ProvidedPortImpl getDB_Query_Send() {
        return DB_Query_Send;
    }

    public RequiredPortImpl getSecurity_Check_Receive() {
        return Security_Check_Receive;
    }

    public RequiredPortImpl getDB_Query_Receive() {
        return DB_Query_Receive;
    }

    public RequiredPortImpl getExternal_Socket_Receive() {
        return External_Socket_Receive;
    }
}
