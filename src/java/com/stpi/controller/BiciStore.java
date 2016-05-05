/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.controller;

import com.stpi.ejb.BicicletaFacadeLocal;
import com.stpi.ejb.EstacionBicicletaFacadeLocal;
import com.stpi.ejb.EstacionFacadeLocal;
import com.stpi.ejb.RutaFacadeLocal;
import com.stpi.model.Bicicleta;
import com.stpi.model.Estacion;
import com.stpi.model.EstacionBicicleta;
import com.stpi.model.Ruta;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HECTOR
 */
@WebServlet(name = "BiciStore", urlPatterns = {"/BiciStore"})
public class BiciStore extends HttpServlet {
    @EJB
    private RutaFacadeLocal rutaFacade;
    @EJB
    private EstacionBicicletaFacadeLocal estacionBicicletaFacade;
    @EJB
    private EstacionFacadeLocal estacionFacade;
    @EJB
    private BicicletaFacadeLocal bicicletaFacade;
    //private static final Logger LOG = Logger.getLogger(BiciStore.class.getName());
    
    


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
        
          Bicicleta bici = new Bicicleta();
          
          bici.setEstado("Libre");
          
          bicicletaFacade.create(bici);
          
          int idEstacion = Integer.parseInt(request.getParameter("Estacion"));
          Estacion estacion = estacionFacade.find(idEstacion);
          Ruta ruta = rutaFacade.find(estacion.getRutaId().getRutaId());
          
          EstacionBicicleta estacionBici = new EstacionBicicleta();
          estacionBici.setBicicletaId(bici);
          estacionBici.setEstacionId(estacion);
          estacionBici.setRutaId(ruta);
          
          estacionBicicletaFacade.create(estacionBici);
          
          bici.getEstacionBicicletaList().add(estacionBici);
          bicicletaFacade.edit(bici);
          
          response.sendRedirect(request.getContextPath() + "/Bicis");
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
