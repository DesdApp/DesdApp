package dao;

public class PruebaConex {

    public static void main(String[] args) {
        ConexionDB conex = new ConexionDB();
        conex.conectar();
        conex.desconectar();
    }
    
}
