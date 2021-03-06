/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.controller;

import com.stpi.ejb.ConductorFacadeLocal;
import com.stpi.model.Conductor;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author YojhanLR
 */
public class ConductorUpdate extends HttpServlet {
    @EJB
    private ConductorFacadeLocal conductorFacade;
    
    private static final Logger LOG = Logger.getLogger(ConductorUpdate.class.getName());
    private static final DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
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
        
        try {
            
            String nombre  = request.getParameter("nombre");
            String cedula = request.getParameter("cedula");
            String $fecha_nac = request.getParameter("fecha_nac");
            String telefono = request.getParameter("telefono");
            String direccion = request.getParameter("direccion");
            
            int id = Integer.parseInt(request.getParameter("id"));
            Date fecha_nac = df.parse($fecha_nac);
            
            Conductor conductor = conductorFacade.find(id);
            conductor.setNombre(nombre);
            conductor.setCedula(cedula);
            conductor.setFechaNac(fecha_nac);
            conductor.setTelefono(telefono);
            conductor.setDireccion(direccion);
            
           
            conductorFacade.edit(conductor);
            
            response.sendRedirect(request.getContextPath() + "/Conductores");
           
        }   catch (ParseException ex) {
            Logger.getLogger(ConductorUpdate.class.getName()).log(Level.SEVERE, null, ex);
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
