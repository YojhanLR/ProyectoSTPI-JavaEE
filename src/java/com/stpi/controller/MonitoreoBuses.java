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
import com.stpi.model.Bus;
import com.stpi.model.BusConductor;
import com.stpi.model.Conductor;
import com.stpi.model.Ruta;
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
    private int bandera=0;
    

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
        
        
        // Asignacion de recorridos de buses
        
         BusConductor asignaciones = new BusConductor();
          
          List<Conductor> conductores = conductorFacade.findAll();
          Conductor conductor = new Conductor();
          List<Bus> buses = busFacade.findAll();
          Bus bus = new Bus();
          List<Ruta> rutas = rutaFacade.findAll();
          Ruta ruta = new Ruta();
          
          java.util.Date date= new java.util.Date();
          
           List<BusConductor> pendientes = busConductorFacade.findAll();
           if(pendientes.size()==0){bandera=0;}
        
        int limite=0;
          if(buses.size()>=conductores.size()){limite=conductores.size();}else{limite=buses.size();}
           
          if(bandera<=20){
 
              for(int p=0;p<limite;p++)
              {
              conductor=conductores.get((int)(Math.random()*(0-limite)+limite));
              bus= buses.get((int)(Math.random()*(0-limite)+limite));

              ruta= rutas.get(k);
             if(k==2) {k=0;}else{k++;}               
          
          
          asignaciones.setBusId(bus);
          asignaciones.setConductorId(conductor);
          asignaciones.setRutaId(ruta);
          asignaciones.setKilometrosRecorridos(0);
          asignaciones.setFechaInicio(new Timestamp(date.getTime()));
          asignaciones.setFechaFin(null);
          
          busConductorFacade.create(asignaciones);
          
              bandera=bandera+1;
              }
          }
          
          
          
        
              
          
              
          /*}else{
           
          for(int i=0;i<conductores.size();i++)
          {
              for(int j=0;j<pendientes.size();j++)
              {
                  if(conductores.get(i).getConductorId().equals(pendientes.get(j).getConductorId().getConductorId()))
                  {}else{
                    conductor=conductores.get(i);
                    j=100000;
                    i=100000;
                  }
               }
           }
          
          for(int i=0;i<buses.size();i++)
          {
              for(int j=0;j<pendientes.size();j++)
              {
                  if(buses.get(i).getBusId().equals(pendientes.get(j).getBusId().getBusId()))
                  {}else{
                    bus=buses.get(i);
                  }
               }
           
          }
         
          
             ruta= rutas.get(k);
             if(k==2) {k=0;}else{k++;}               
          
          
          asignaciones.setBusId(bus);
          asignaciones.setConductorId(conductor);
          asignaciones.setRutaId(ruta);
          asignaciones.setKilometrosRecorridos(0);
          asignaciones.setFechaInicio(new Timestamp(date.getTime()));
          asignaciones.setFechaFin(null);
          
          busConductorFacade.create(asignaciones);
          }*/
         
        
       //Lista de recorridos a monitorear        
    
          List<BusConductor> pendientes2 = busConductorFacade.findAll();
          List<BusConductor> recorridos2 = new ArrayList();
          
          java.util.Date date2= new java.util.Date();
           
          
          for(int i=0; i<pendientes2.size();i++)
          {
              
              
              if(pendientes2.get(i).getFechaFin()== null )
              {
            
               pendientes2.get(i).setKilometrosRecorridos((float) (pendientes2.get(i).getKilometrosRecorridos() + Math.random()*(0.2-0.6)+0.6));
               if(pendientes2.get(i).getKilometrosRecorridos()>=13 && pendientes2.get(i).getRutaId().getRutaId()== 1)
               {
                   pendientes2.get(i).setFechaFin(new Timestamp(date2.getTime()));
                   
               }
                if(pendientes2.get(i).getKilometrosRecorridos()>=14 && pendientes2.get(i).getRutaId().getRutaId()== 2)
               {
                   pendientes2.get(i).setFechaFin(new Timestamp(date2.getTime()));
               }
                 if(pendientes2.get(i).getKilometrosRecorridos()>=14 && pendientes2.get(i).getRutaId().getRutaId()== 3)
               {
                   pendientes2.get(i).setFechaFin(new Timestamp(date2.getTime()));
                   
               }
                 
               busConductorFacade.edit(pendientes2.get(i));
               recorridos2.add(pendientes2.get(i));
               
              
              }

              if(recorridos2.size()== 12)
              {
                  i=pendientes.size()+100;
              }
              
          }
          
          
          //Llama función
          ajaxResponse(recorridos2,response);
        
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
