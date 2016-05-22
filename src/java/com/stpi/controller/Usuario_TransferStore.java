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
import com.stpi.ejb.UsuarioFacadeLocal;
import com.stpi.model.Conductor;
import com.stpi.model.Ruta;
import com.stpi.model.Transfer;
import com.stpi.model.TransferConductor;
import com.stpi.model.Usuario;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HECTOR
 */
@WebServlet(name = "Usuario_TransferStore", urlPatterns = {"/Usuario_TransferStore"})
public class Usuario_TransferStore extends HttpServlet {

    @EJB
    private RutaFacadeLocal rutaFacade;
    @EJB
    private ConductorFacadeLocal conductorFacade;
    @EJB
    private TransferFacadeLocal transferFacade;
    @EJB
    private TransferConductorFacadeLocal transferConductorFacade;
    @EJB
    private UsuarioFacadeLocal usuarioFacade;

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
            String cedula = request.getParameter("CedulaTransfer");
            String nombre = request.getParameter("NombreTransfer");
            String direccion = request.getParameter("DireccionTransfer");
            String telefono = request.getParameter("TelefonoTransfer");
            String email = request.getParameter("EmailTransfer");
            String $fecha_inicio = request.getParameter("FechaReservaTranfer");
            Date fecha_i = fi.parse($fecha_inicio);

       // java.util.Date date= new java.util.Date();
            int idRuta = Integer.parseInt(request.getParameter("Ruta"));
            Ruta ruta = rutaFacade.find(idRuta);

            Usuario usuario = new Usuario();
            Conductor cond = new Conductor();
            Transfer trans = new Transfer();
            TransferConductor transferConductor = new TransferConductor();
            List<Transfer> transfer = transferFacade.findAll();
            List<Conductor> conductor = conductorFacade.findAll();
            List<TransferConductor> reservas = transferConductorFacade.findAll();
            List<Usuario> usuarios = usuarioFacade.findAll();
            int us=0;
            
            
            for(int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getCedula().equals(cedula)){
            
            usuario=usuarios.get(i);
            usuario.setNombre(nombre);
            usuario.setDireccion(direccion);
            usuario.setTelefono(telefono);
            usuario.setCorreo(email);
            usuario.setEstado("Activo");
            
             usuarioFacade.edit(usuario);
             
             i=usuarios.size()+100;
             us=1;
            
            }
            }
            

             if(us==1){}else{
            usuario.setCedula(cedula);
            usuario.setNombre(nombre);
            usuario.setDireccion(direccion);
            usuario.setTelefono(telefono);
            usuario.setCorreo(email);
            usuario.setEstado("Activo");

            usuarioFacade.create(usuario);
             }
            
            
            
            if(reservas.size()==0){
                
                 trans = transfer.get(0);
                 cond = conductor.get(0);

                
                
            }else{

            for (int i = 0; i < reservas.size(); i++) {
                if ((reservas.get(i).getFechaInicio().getYear() == fecha_i.getYear())
                        && (reservas.get(i).getFechaInicio().getMonth() == fecha_i.getMonth())
                        && (reservas.get(i).getFechaInicio().getDay() == fecha_i.getDay())) {

                    for (int j = 0; j < transfer.size(); j++) {

                        if (transfer.get(j).getTransferId().equals(reservas.get(i).getTransferId().getTransferId())) {
                        } else {

                            int id = transfer.get(j).getTransferId();
                            int b = 0;

                            for (int l = 0; l < reservas.size(); l++) {

                                if (reservas.get(l).getTransferId().getTransferId().equals(id)) {
                                    l = 10000;
                                    b = 0;
                                } else {
                                    b = 1;
                                }

                            }
                            if (b == 1) {
                                trans = transfer.get(j);
                                j = 10000;
                            }
                        }
                    }

                    for (int k = 0; k < conductor.size(); k++) {
                        if (conductor.get(k).getConductorId().equals(reservas.get(i).getConductorId().getConductorId())) {
                        } else {
                            int id = conductor.get(k).getConductorId();
                            int b = 0;

                            for (int l = 0; l < reservas.size(); l++) {
                                if (reservas.get(l).getConductorId().getConductorId().equals(id)) {
                                    l = 10000;
                                    b = 0;
                                } else {
                                    b = 1;
                                }

                            }
                            if (b == 1) {
                                cond = conductor.get(k);
                                k = 10000;;
                            }
                        }

                    }

                } else {

                    if (reservas.size() == (i + 1)) {

                        trans = transfer.get(0);
                        cond = conductor.get(0);

                    }
                }
            }
            }

            transferConductor.setTransferId(trans);
            transferConductor.setConductorId(cond);
            transferConductor.setUsuarioId(usuario);
            transferConductor.setKilometrosRecorridos(0);
            transferConductor.setFechaFin(null);
            transferConductor.setFechaInicio(fecha_i);
            transferConductor.setRutaId(ruta);

            transferConductorFacade.create(transferConductor);
            
            usuario.getTransferConductorList().add(transferConductor);
            usuarioFacade.edit(usuario);
            
            cond.getTransferConductorList().add(transferConductor);
            conductorFacade.edit(cond);
            
            trans.getTransferConductorList().add(transferConductor);
            transferFacade.edit(trans);
            
            ruta.getTransferConductorList().add(transferConductor);
            rutaFacade.edit(ruta);

            response.sendRedirect(request.getContextPath() + "/index.jsp");

        } catch (ParseException ex) {
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
