/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.controller;

import com.stpi.ejb.BicicletaFacadeLocal;
import com.stpi.ejb.EstacionFacadeLocal;
import com.stpi.model.Bicicleta;
import com.stpi.model.Estacion;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "BiciIndex", urlPatterns = {"/BiciIndex"})
public class BiciIndex extends HttpServlet {
    @EJB
    private EstacionFacadeLocal estacionFacade;
    @EJB
    private BicicletaFacadeLocal bicicletaFacade;
    private static final Logger LOG = Logger.getLogger(BiciIndex.class.getName());

    
    
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
      
          
        List<Bicicleta> bicis = bicicletaFacade.findAll();
        List<Estacion> estaciones = estacionFacade.findAll();
        
            //Estacion estacion = bici.getEstacionBicicletaList().get(0).getEstacionId().getNombre();
      
        request.setAttribute("bicis",bicis);
        request.setAttribute("estaciones",estaciones);
        
        getServletContext().getRequestDispatcher("/views/Administrador/Bicis/index.jsp").forward(request, response);
    
        
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
