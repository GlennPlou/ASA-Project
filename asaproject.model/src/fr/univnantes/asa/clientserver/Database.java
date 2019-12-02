package fr.univnantes.asa.clientserver;

import asaproject.model.asa.M2.ArchitecturalElement;
import asaproject.model.asa.M2.Configuration;
import asaproject.model.asa.M2.impl.ComponentImpl;
import asaproject.model.asa.M2.impl.ProvidedPortImpl;
import asaproject.model.asa.M2.impl.RequiredPortImpl;

public class Database extends ComponentImpl {

    private ProvidedPortImpl Security_Management_Send;
    private ProvidedPortImpl Query_Interrogation_Send;
    private RequiredPortImpl Security_Management_Receive;
    private RequiredPortImpl Query_Interrogation_Receive;

    public Database(String name) {
        super(name);

        this.Security_Management_Send = new ProvidedPortImpl("Security_Management_Send").component(this);
        this.Query_Interrogation_Send = new ProvidedPortImpl("Query_Interrogation_Send").component(this);
        this.Security_Management_Receive = new RequiredPortImpl("Security_Management_Receive").component(this);
        this.Query_Interrogation_Receive = new RequiredPortImpl("Query_Interrogation_Receive").component(this);

        this.icomponents.add(this.Security_Management_Send);
        this.icomponents.add(this.Query_Interrogation_Send);
        this.icomponents.add(this.Security_Management_Receive);
        this.icomponents.add(this.Query_Interrogation_Receive);
    }

    public Database configuration(Configuration configuration) {
        super.configuration(configuration);
        return this;
    }

    public Database parent(ArchitecturalElement element) {
        super.parent(element);
        return this;
    }

    public ProvidedPortImpl getSecurity_Management_Send() {
        return Security_Management_Send;
    }

    public ProvidedPortImpl getQuery_Interrogation_Send() {
        return Query_Interrogation_Send;
    }

    public RequiredPortImpl getSecurity_Management_Receive() {
        return Security_Management_Receive;
    }

    public RequiredPortImpl getQuery_Interrogation_Receive() {
        return Query_Interrogation_Receive;
    }
}
