/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DAODepartamentos;
import dao.DAOMunicipios;
import dao.DAOPersonas;
import dao.DAOTiposDocumentos;
import dao.DAOTiposPropiedades;
import dao.DAOVentaRenta;
import dao.DAOZonas;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Departamentos;
import modelo.Municipios;
import modelo.Personas;
import modelo.TiposDocumentos;
import modelo.TiposPropiedades;
import modelo.VentaRenta;
import modelo.Zonas;

/**
 *
 * @author javam2019
 */
public class InicioClientesControlador extends HttpServlet {

    String listar = "pages/inicioClientes_2.jsp";

    Personas perso;
    DAOPersonas daoper = new DAOPersonas();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

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
        //processRequest(request, response);

        DAOVentaRenta dao = new DAOVentaRenta();
        ArrayList<VentaRenta> listaVentaRenta = new ArrayList<>();
        listaVentaRenta = dao.ListEstados();
        request.setAttribute("listaVentaRenta", listaVentaRenta);

        DAOTiposPropiedades daoTipoProp = new DAOTiposPropiedades();
        ArrayList<TiposPropiedades> listaTipoPropi = new ArrayList<>();
        listaTipoPropi = daoTipoProp.listTipos();
        request.setAttribute("listaTiposPropiedades", listaTipoPropi);

        DAODepartamentos daoDep = new DAODepartamentos();
        ArrayList<Departamentos> listaDep = new ArrayList();
        listaDep = daoDep.list();
        request.setAttribute("listarDepartamentos", listaDep);

        DAOMunicipios daoMun = new DAOMunicipios();
        ArrayList<Municipios> listaMun = new ArrayList();
        listaMun = daoMun.list();
        request.setAttribute("listarMunicipios", listaMun);

        DAOZonas daoZona = new DAOZonas();
        ArrayList<Zonas> listaZonas = new ArrayList();
        listaZonas = daoZona.listZonas();
        request.setAttribute("listarZonas", listaZonas);

        DAOTiposDocumentos daoDoc = new DAOTiposDocumentos();
        ArrayList<TiposDocumentos> listaDoc = new ArrayList();
        listaDoc = daoDoc.list();
        request.setAttribute("listarDocumentos", listaDoc);

        request.getRequestDispatcher(listar).forward(request, response);

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
        processRequest(request, response);

        String acceso = "";
        String action = request.getParameter("accion");

        if (action.equalsIgnoreCase("Mordificar")) {
            perso.setNombre(request.getParameter("txtNombre"));
            perso.setApellido(request.getParameter("txtApellido"));
            perso.setCorreo(request.getParameter("txtEmail"));
            perso.setTipoDocumentoId(Byte.parseByte("txtTipo"));
            perso.setNoDocumento(request.getParameter("txtDoc"));
            perso.setFechaNacimiento(Date.valueOf(request.getParameter("txtFechaNac")));
            perso.setCelular(Integer.parseInt(request.getParameter("txtCel")));
            perso.setTelefono(Integer.parseInt(request.getParameter("txtTel")));
            perso.setDireccion(request.getParameter("txtDireccion"));
            perso.setNit(request.getParameter("txtNit"));

            daoper.update(perso);
            

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
