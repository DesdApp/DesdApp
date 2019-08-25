/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DAOClientes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Clientes;

/**
 *
 * @author javam2019
 */
public class ControladorLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    DAOClientes daoC = new DAOClientes();
    String inicioC = "pages/inicioClientes_2.jsp";
    String user = null;
    String pass = null;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorLogin</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorLogin at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        

        String acceso = "";
        String action = request.getParameter("accion");

        System.out.println("Accion:" + action);
        if (action.equalsIgnoreCase("inicioC")) {
            acceso = inicioC;
        }
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
            try {
                response.sendRedirect("InicioClientesControlador");
            } catch (Exception e) {
                System.out.println("Error aqui: " + e);
            }

            //response.sendRedirect("pages/inicioClientes.jsp");
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
