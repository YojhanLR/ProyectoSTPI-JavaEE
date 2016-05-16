/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.controller;

import com.stpi.ejb.BicicletaFacadeLocal;
import com.stpi.ejb.BicicletaUsuarioFacadeLocal;
import com.stpi.ejb.UsuarioFacadeLocal;
import com.stpi.model.Bicicleta;
import com.stpi.model.BicicletaUsuario;
import com.stpi.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@WebServlet(name = "Bicicleta_UsuarioStore", urlPatterns = {"/Bicicleta_UsuarioStore"})
public class Bicicleta_UsuarioStore extends HttpServlet {
    @EJB
    private BicicletaFacadeLocal bicicletaFacade;
    @EJB
    private UsuarioFacadeLocal usuarioFacade;
    @EJB
    private BicicletaUsuarioFacadeLocal bicicletaUsuarioFacade;
    
    
    
    
    
     private static final DateFormat fi = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    

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
        String cedula = request.getParameter("CedulaBici");
        String nombre = request.getParameter("NombreBici");
        String direccion = request.getParameter("DireccionBici");
        String telefono = request.getParameter("TelefonoBici");
        String email= request.getParameter("EmailBici");
        String $fecha_inicio= request.getParameter("FechaReservaBici");
         Date fecha_i = fi.parse($fecha_inicio);
   
       // java.util.Date date= new java.util.Date();
       
        
   
        
          Usuario usuarioBici = new Usuario();
          Bicicleta bici= new Bicicleta();
          BicicletaUsuario bicicletaUsuario = new BicicletaUsuario();
          List<BicicletaUsuario> reservas =  bicicletaUsuarioFacade.findAll();
          List<Bicicleta> bicicletas = bicicletaFacade.findAll();
            
           
            usuarioBici.setCedula(cedula);
            usuarioBici.setNombre(nombre);
            usuarioBici.setDireccion(direccion);
            usuarioBici.setTelefono(telefono);
            usuarioBici.setCorreo(email);
            usuarioBici.setEstado("Activo");
            
            usuarioFacade.create(usuarioBici);
            
              
      
            for(int i=0; i<reservas.size();i++)
            {
                if((reservas.get(i).getFechaInicio().getYear() == fecha_i.getYear()) &&
                        (reservas.get(i).getFechaInicio().getMonth()== fecha_i.getMonth()) &&
                        (reservas.get(i).getFechaInicio().getDay()== fecha_i.getDay()))
                {

                    for(int j=0; j<bicicletas.size(); j++)
                    {
                   
                        if(bicicletas.get(j).getBicicletaId().equals(reservas.get(i).getBicicletaId().getBicicletaId()))
                        { }else{
                            
                            int id= bicicletas.get(j).getBicicletaId();
                            int b=0;
                            
                           for(int l=0; l<reservas.size();l++)
                           {
                            if(reservas.get(l).getBicicletaId().getBicicletaId().equals(id)) 
                            { l=10000; b=0; }else { b=1;}
                            
                            
                           } 
                           if(b==1){bici=bicicletas.get(j); j=10000;}
                        }
                    }
       
                } else {
                  
                     if(reservas.size()== (i+1))
                     {
                     
                          bici=bicicletas.get(0);
                         
                   
                     }
                }
            }
            
           
             bicicletaUsuario.setBicicletaId(bici);
   
             bicicletaUsuario.setUsuarioId(usuarioBici);
             bicicletaUsuario.setFechaFin(null);
             bicicletaUsuario.setFechaInicio(fecha_i);
           //  transferConductor.setFechaInicio(new Timestamp(date.getTime()));
            

            bicicletaUsuarioFacade.create(bicicletaUsuario);
             
            response.sendRedirect(request.getContextPath() + "/index.jsp");
   
    }  catch (ParseException ex) {
            Logger.getLogger(ConductorStore.class.getName()).log(Level.SEVERE, null, ex);
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
