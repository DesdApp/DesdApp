package dao;

public class Conex {

    public static void main(String[] args) {
        ConexionDB conex = new ConexionDB();
        conex.conectar();
        conex.desconectar();
    }
    
}
