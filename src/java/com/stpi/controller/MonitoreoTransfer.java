/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.controller;

import com.stpi.ejb.ConductorFacadeLocal;
import com.stpi.ejb.RutaFacadeLocal;
import com.stpi.ejb.TransferConductorFacadeLocal;
import com.stpi.ejb.TransferFacadeLocal;
import com.stpi.model.Bus;
import com.stpi.model.Conductor;
import com.stpi.model.Ruta;
import com.stpi.model.Transfer;
import com.stpi.model.TransferConductor;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
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
@WebServlet(name = "MonitoreoTransfer", urlPatterns = {"/MonitoreoTransfer"})
public class MonitoreoTransfer extends HttpServlet {
    @EJB
    private TransferFacadeLocal transferFacade;
    @EJB
    private ConductorFacadeLocal conductorFacade;
    @EJB
    private TransferConductorFacadeLocal transferConductorFacade;
    @EJB
    private RutaFacadeLocal rutaFacade;
    
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
        response.setContentType("text/html;charset=UTF-8");
      
         TransferConductor asignaciones = new TransferConductor();
          
          List<Conductor> conductores = conductorFacade.findAll();
          Conductor conductor = new Conductor();
          List<Transfer> buses = transferFacade.findAll();
          Transfer transfer = new Transfer();
          List<Ruta> rutas = rutaFacade.findAll();
          Ruta ruta = new Ruta();
          
          java.util.Date date= new java.util.Date();
      
        
           //Lista de recorridos a monitorear        
    
          List<TransferConductor> pendientes = transferConductorFacade.findAll();
          List<TransferConductor> recorridos = new ArrayList();
          
          if(pendientes.size()!=0)
          {
          for(int i=0; i<pendientes.size();i++)
          {
              
              
              if(pendientes.get(i).getFechaFin()== null)
              {
            
                  if(pendientes.get(i).getFechaInicio().equals(new Timestamp(date.getTime())) || pendientes.get(i).getKilometrosRecorridos()!=0)
                  {
               pendientes.get(i).setKilometrosRecorridos((float) (pendientes.get(i).getKilometrosRecorridos() + Math.random()*(0.2-0.6)+0.6));
               if(pendientes.get(i).getKilometrosRecorridos()>=13 && pendientes.get(i).getRutaId().getRutaId()== 1)
               {
                   pendientes.get(i).setFechaFin(new Timestamp(date.getTime()));
                   
               }
                if(pendientes.get(i).getKilometrosRecorridos()>=14 && pendientes.get(i).getRutaId().getRutaId()== 2)
               {
                   pendientes.get(i).setFechaFin(new Timestamp(date.getTime()));
               }
                 if(pendientes.get(i).getKilometrosRecorridos()>=14 && pendientes.get(i).getRutaId().getRutaId()== 3)
               {
                   pendientes.get(i).setFechaFin(new Timestamp(date.getTime()));
                   
               }
                 
               transferConductorFacade.edit(pendientes.get(i));
               recorridos.add(pendientes.get(i));
               
              
              }
              }

              if(recorridos.size()== 6)
              {
                  i=pendientes.size()+100;
              }
              
          }
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
