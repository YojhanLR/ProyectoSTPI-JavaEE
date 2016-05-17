/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stpi.ejb.BusConductorFacadeLocal;
import com.stpi.ejb.BusFacadeLocal;
import com.stpi.ejb.ConductorFacadeLocal;
import com.stpi.ejb.RutaFacadeLocal;
import com.stpi.model.BusConductor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "MonitoreoBuses", urlPatterns = {"/MonitoreoBuses"})
public class MonitoreoBuses extends HttpServlet {
    @EJB
    private RutaFacadeLocal rutaFacade;
    @EJB
    private ConductorFacadeLocal conductorFacade;
    @EJB
    private BusFacadeLocal busFacade;
    @EJB
    private BusConductorFacadeLocal busConductorFacade;
    
    private int k=0;
    

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
        
    
          List<BusConductor> pendientes = busConductorFacade.findAll();
          List<BusConductor> recorridos = new ArrayList();
           
          
          for(int i=0; i<pendientes.size();i++)
          {
              
              
              if(pendientes.get(i).getFechaFin()== null )
              {
                  //Prueba actualización de kilometros en la tabla.
                  // pendientes.get(i).setKilometrosRecorridos(pendientes.get(i).getKilometrosRecorridos() + 10);
                  // busConductorFacade.edit(pendientes.get(i));
                 recorridos.add(pendientes.get(i));
              }

              if(recorridos.size()== 3)
              {
                  i=pendientes.size()+100;
              }
              
          }
          
          System.out.println("numero pendientes"+pendientes.size());
          System.out.println("numero recorridos"+recorridos.size());
          
        
          
          //Llama función
          ajaxResponse(recorridos,response);
        
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

    
    
     private void ajaxResponse ( List<BusConductor> recorridos, HttpServletResponse response)
            throws ServletException, IOException {
        
        ObjectMapper mapper = new ObjectMapper();
        
        try (PrintWriter out = response.getWriter()) {
            out.print(mapper.writeValueAsString(recorridos));
        }
    }
}
