
package modelo;

//Clase Modelo para Propietarios
public class Propietarios {
    //Declaracion de Atributos
    private int propietarioId;
    private String acreedor;
    private String user;
    private String pass;
   
    
    //Constructor Con parametro

    public Propietarios(int propietarioId, String acreedor, String user, String pass) {
        this.propietarioId = propietarioId;
        this.acreedor = acreedor;
        this.user = user;
        this.pass = pass;
        
    }

//Constructor vacio

    public Propietarios() {
    }

//Getters y Setters
 public int getPropietarioId() {
        return propietarioId;
    }

    public void setPropietarioId(int propietarioId) {
        this.propietarioId = propietarioId;
    }
    

    public String getAcreedor() {
        return acreedor;
    }

    public void setAcreedor(String acreedor) {
        this.acreedor = acreedor;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

   

//Metodo To String

    @Override
    public String toString() {
        return "Propietarios{" + "propietarioId=" + propietarioId + ", acreedor=" + acreedor + ", user=" + user + ", pass=" + pass +  '}';
    }

   
    
}
