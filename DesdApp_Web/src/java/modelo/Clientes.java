package modelo;

public class Clientes {

    // Atributos
    private int clienteId;
    private int personaId;
    private String nombreTitular;
    private String user;
    private String password;

    //Contructor de  atributos
    public Clientes(int clienteId, int personaId, String nombreTitular, String user, String password) {
        this.clienteId = clienteId;
        this.personaId = personaId;
        this.nombreTitular = nombreTitular;
        this.user = user;
        this.password = password;

    }

    @Override
    public String toString() {
        return "Clientes{" + "clienteId=" + clienteId + ", personaId=" + personaId + ", nombreTitular=" + nombreTitular + ", user=" + user + ", password=" + password + '}';
    }
    
    

    public Clientes() {
    }

    //<editor-fold defaultstate="collapsed" desc="Metodos set y get">
    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
//</editor-fold>
}
