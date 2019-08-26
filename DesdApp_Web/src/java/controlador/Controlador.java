package controlador;

import dao.DAOClientes;
import dao.DAOPersonas;
import java.io.IOException;
import static java.lang.System.out;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Clientes;
import modelo.Personas;

/**
 *
 * @author User
 */
public class Controlador extends HttpServlet {
    
    String inmuebles = "pages/inmuebles.jsp";
    String add = "pages/login.jsp";
    String registrase = "pages/registrarse.jsp";
    String equipo = "pages/nosotros.jsp";
    String oficina = "pages/nuestraoficina.jsp";
    String index = "index.jsp";
    String mg = "";
    Personas p = new Personas();
    Clientes c = new Clientes();
    DAOPersonas daoP = new DAOPersonas();
    DAOClientes daoC = new DAOClientes();
    String cont = null;
    String user = null;
    String pass = null;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        /**
         * Handles the HTTP <code>GET</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        out.println("User: " + user + "pass" + pass);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
         String acceso="";
         String action = request.getParameter("accion");
         System.out.println("Accion:" + action);
         if (action.equalsIgnoreCase("registrar")) {
            acceso=add;
         }else if(action.equalsIgnoreCase("add")){
             acceso = registrase;
         }else if(action.equalsIgnoreCase("equipo")){
            acceso=equipo; 
         }else if(action.equalsIgnoreCase("oficina")){
            acceso=oficina;
         }else if(action.equalsIgnoreCase("index")){
            acceso=index;
         }
        //Registrase
         else if (action.equalsIgnoreCase("Registrarme")) {
             //int id = Integer.parseInt(request.getParameter("txtidPer"));
             String nombre = request.getParameter("txtNombre");
             String apellido = request.getParameter("txtApellido");
             byte TpDocument = Byte.parseByte(request.getParameter("txtTpDocument"));
             String noDocument = request.getParameter("txtDocument");
             String nit = request.getParameter("txtNit");
             String direccion = request.getParameter("txtDireccion");
             int cel = Integer.parseInt(request.getParameter("txtCel"));
             int tel = Integer.parseInt(request.getParameter("txtTel"));
             String correo = request.getParameter("emailAddress");
             //Date fechaNac = Date.valueOf("txtFechaNac");
            // p.setPersonaId(id);
            Date fechaNac = Date.valueOf(request.getParameter("txtFechaNac"));
            
            // p.setPersonaId(id);
             p.setNombre(nombre);
             p.setApellido(apellido);
             p.setTipoDocumentoId(TpDocument);
             p.setNoDocumento(noDocument);
             p.setNit(nit);
             p.setDireccion(direccion);
             p.setCelular(cel);
             p.setTelefono(tel);
             p.setCorreo(correo);
             p.setFechaNacimiento(fechaNac);
             System.out.println(p.toString());
             int personaIdValor = daoP.insert(p);
             System.out.println("Ultimo Ingresado" + personaIdValor);
             
             c.setPersonaId(personaIdValor);
             c.setNombreTitular(nombre);
             c.setUser(request.getParameter("usser"));
             c.setPassword(request.getParameter("txtContra"));
             System.out.println(c.toString());
             daoC.insertCliente(c);
             
             String password = request.getParameter("");
             c.setUser(user);
             c.setPassword(password);
             if (personaIdValor==0){
             acceso=registrase;
             }else{
              acceso = index;
             }
         }
         
        
        RequestDispatcher pages = request.getRequestDispatcher(acceso);
        pages.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("CONTROLADOR");
        user = request.getParameter("txtUser");
        pass = request.getParameter("txtPass");

        Clientes cliente = new Clientes();

        cliente.setUser(user);
        cliente.setPassword(pass);

        System.out.println("User: " + cliente.getUser() + ", pass: " + cliente.getPassword());
        int resultado = daoC.validar(cliente);

        System.out.println(resultado + " RESULTADO");

        if (resultado == 1) {
            System.out.println("Llegue al 1");
            response.sendRedirect("pages/ejemploInicio.jsp");
        } else {
            response.sendRedirect("pages/login.jsp?error=1");

        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
