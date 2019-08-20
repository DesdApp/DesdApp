
package controlador;

import dao.DAOPersonas;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Personas;

/**
 *
 * @author User
 */
public class Controlador extends HttpServlet {

    String registrado = "pages/registroexito.jsp";
    String add = "pages/login.jsp";
    String registrase = "pages/registrarse.jsp";
    Personas p = new Personas();
    DAOPersonas daoP = new DAOPersonas();
  
    
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
         }
         else if (action.equalsIgnoreCase("Agregar")) {
             int id = Integer.parseInt(request.getParameter("txtidPer"));
             String nombre = request.getParameter("txtNombre");
             String apellido = request.getParameter("txtApellido");
             byte TpDocument = Byte.parseByte(request.getParameter("txtTpDocument"));
             String noDocument = request.getParameter("txtDocument");
             String nit = request.getParameter("txtNit");
             String direccion = request.getParameter("txtDireccion");
             int cel = Integer.parseInt(request.getParameter("txtCel"));
             int tel = Integer.parseInt(request.getParameter("txtTel"));
             String correo = request.getParameter("txtUsser");
             Date fechaNac = Date.valueOf("txtFechaNac");
             p.setPersonaId(id);
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
             daoP.insert(p);
             acceso = add;
        }
        RequestDispatcher pages = request.getRequestDispatcher(acceso);
        pages.forward(request, response);
    }

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
