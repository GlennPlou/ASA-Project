package fr.univnantes.asa.clientserver;

import asaproject.model.asa.M2.ArchitecturalElement;
import asaproject.model.asa.M2.Configuration;
import asaproject.model.asa.M2.impl.ComponentImpl;
import asaproject.model.asa.M2.impl.ProvidedPortImpl;
import asaproject.model.asa.M2.impl.RequiredPortImpl;

public class SecurityManager extends ComponentImpl {

    private ProvidedPortImpl Security_Authentification_Send;
    private ProvidedPortImpl Check_Query_Send;
    private RequiredPortImpl Security_Authentification_Receive;
    private RequiredPortImpl Check_Query_Receive;

    public SecurityManager(String name) {
        super(name);

        this.Security_Authentification_Send = new ProvidedPortImpl("Security_Authentification_Send").component(this);
        this.Check_Query_Send = new ProvidedPortImpl("Check_Query_Send").component(this);
        this.Security_Authentification_Receive = new RequiredPortImpl("Security_Authentification_Receive").component(this);
        this.Check_Query_Receive = new RequiredPortImpl("Check_Query_Receive").component(this);
        this.icomponents.add(this.Security_Authentification_Send);
        this.icomponents.add(this.Check_Query_Send);
        this.icomponents.add(this.Security_Authentification_Receive);
        this.icomponents.add(this.Check_Query_Receive);

    }

    public SecurityManager configuration(Configuration configuration) {
        super.configuration(configuration);
        return this;
    }

    public SecurityManager parent(ArchitecturalElement element) {
        super.parent(element);
        return this;
    }

    public ProvidedPortImpl getSecurity_Authentification_Send() {
        return Security_Authentification_Send;
    }

    public ProvidedPortImpl getCheck_Query_Send() {
        return Check_Query_Send;
    }

    public RequiredPortImpl getSecurity_Authentification_Receive() {
        return Security_Authentification_Receive;
    }

    public RequiredPortImpl getCheck_Query_Receive() {
        return Check_Query_Receive;
    }
}
