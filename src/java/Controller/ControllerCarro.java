/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modelo.Datos.DatosCarro;
import Modelo.Datos.DatosCiudad;
import Modelo.Datos.DatosLinea;
import Modelo.Datos.DatosMarca;
import Modelo.Datos.DatosTipoVehiculo;
import Modelo.Entidad.Carro;
import Modelo.Entidad.Ciudad;
import Modelo.Entidad.Linea;
import Modelo.Entidad.Marca;
import Modelo.Entidad.TipoVehiculo;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "ControllerCarro", urlPatterns = {"/ControllerCarro"})
public class ControllerCarro extends HttpServlet {
private DatosCarro dCarro = new DatosCarro();
DatosMarca dMarca= new DatosMarca();
DatosCiudad dCiudad= new DatosCiudad();
DatosTipoVehiculo dTipo= new DatosTipoVehiculo();
DatosLinea dLinea = new DatosLinea();

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControllerCarro</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControllerCarro at " + request.getContextPath() + "</h1>");
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
        throws ServletException, IOException  {
       
         String tarea = request.getParameter("accion");
        switch (tarea){
            case    "Agregar": agregar(request, response);
            break;
            case "ListarMarcas": listarMarca(request, response);
            break;
                   
            case "ListarCiudad": listarCiudad(request, response);
            break;
                   
           case "ListarTipoVehiculo": listarTipoVehiculo(request, response);
           break;
           
           case "ListarLinea": listarLinea(request, response);
           break;
           
           case "ListarCarro": listarCarros(request, response);
           break;
           
           
    }
    }
    private void agregar(HttpServletRequest request,HttpServletResponse response)
        throws ServletException, IOException{
        String placa = request.getParameter("txt_Placa");
        int idLinea=Integer.parseInt(request.getParameter("cb_Linea"));
        Linea unaLinea= new Linea();
        unaLinea.setIdLinea(idLinea);
        String fecha= request.getParameter("txt_Anio");
        String kilometraje = request.getParameter("txt_Kilometraje");
        String cilindraje = request.getParameter("txt_Cilindraje");
        String precio= request.getParameter("txt_Precio");
        String tipocaja = request.getParameter("txt_TipoCaja");
        String descripcion = request.getParameter("txt_Descripcion");
        String disponible= request.getParameter("cb_Disponible");
        
       
        int idTipo=Integer.parseInt(request.getParameter("cb_TipoVehiculo"));
        TipoVehiculo unTipo= new TipoVehiculo();
        unTipo.setIdTipo(idTipo);
        int idMarca=Integer.parseInt(request.getParameter("cb_Marca"));
        Marca unaMarca= new Marca();
        unaMarca.setIdMarca(idMarca);
        int idCiudad=Integer.parseInt(request.getParameter("cb_Ciudad"));
        Ciudad unaCiudad= new Ciudad();
        unaCiudad.setIdCiudad(idCiudad);
        
        Carro unCarro = new Carro(placa,unaLinea,fecha,kilometraje,cilindraje,precio,tipocaja,descripcion,disponible,unTipo,unaMarca,unaCiudad);
       
        //unAprendiz.setUnCurso(unCurso);
        //Se agrega el Aprendiz utilizando el objeto dAprendiz
        boolean agregado = dCarro.agregarCarro(unCarro);
        //Se crea una variable mensaje para enviar a la vista
        PrintWriter out = response.getWriter();
        String json = new Gson().toJson(agregado);
        out.print(json);
           
      
    }
    
         private void listarMarca(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException
    {
       ArrayList<Marca> lista= dMarca.ListarMarcas();
       PrintWriter out= response.getWriter();
       String json= new Gson().toJson(lista);
       out.print(json);
     
    }
                  private void listarCiudad(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException
    {
       ArrayList<Ciudad> lista= dCiudad.ListarCiudad();
       PrintWriter out= response.getWriter();
       String json= new Gson().toJson(lista);
       out.print(json);
     
    }
                                    private void listarTipoVehiculo(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException
    {
       ArrayList<TipoVehiculo> lista= dTipo.ListarTipoVehiculo();
       PrintWriter out= response.getWriter();
       String json= new Gson().toJson(lista);
       out.print(json);
     
    }
    
       private void listarLinea(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException
    {
       int idMarca = Integer.parseInt(request.getParameter("idMarca"));
       Marca unaMarca = new Marca();
       unaMarca.setIdMarca(idMarca);
       ArrayList<Linea> lista= dLinea.ListarLineasPorMarca(unaMarca);
       PrintWriter out= response.getWriter();
       String json= new Gson().toJson(lista);
       out.print(json);
     
    }
        private void listarCarros(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException
    {
        
         ArrayList<Carro> lista= dCarro.ListarCarro();
         
         PrintWriter out= response.getWriter();
        String json = new Gson().toJson(lista);
        out.print(json);
    }
     
                private void carroOferta(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException
    {
        
       
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
