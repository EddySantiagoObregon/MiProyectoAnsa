/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modelo.Datos.datosPersona;
import Modelo.Entidad.Persona;
import Modelo.Entidad.UsuarioRegistro;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario1
 */

@WebServlet(name = "ControllerPersona", urlPatterns = {"/ControllerPersona"})
public class ControllerPersona extends HttpServlet {
    //String listar="Vista/listar.js";

    //Crea un Objeto de Tipo datosAprendiz
    private datosPersona dPersona = new datosPersona();

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
            out.println("<title>Servlet ControllerPersona</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControllerPersona at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
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
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String tarea = request.getParameter("accion");
        switch (tarea){
            case    "Agregar": agregar(request, response);
            break;
           
            /*
            case    "Consultar": consultar(request, response);
            break;
            case    "Actualizar": actualizar(request, response);
            break;
            case    "Eliminar": eliminar(request, response);
            break;
            case    "Listar": listar(request, response);
            break;
*/
            }
    }
   
    /**
     * Metodo que recibe de la Vista los datos del Aprendiz en el objeto request
     * y devuelve una respuesta mediante response.
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void agregar(HttpServletRequest request,HttpServletResponse response)
        throws ServletException, IOException{
        String documento = request.getParameter("txt_Documento");
        String nombre = request.getParameter("txt_Nombre");
        String apellido = request.getParameter("txt_Apellido");
        String telefono = request.getParameter("txt_Telefono");
        String correo = request.getParameter("txt_Correo");
        String contraseña = request.getParameter("txt_Contraseña");
       
        /*int idCurso = Integer.parseInt(request.getParameter("cb_Curso"));
        Curso unCurso = new Curso();
        unCurso.setIdCurso(idCurso);*/
        //Se crea el objeto Aprendiz
        UsuarioRegistro unUsuario = new UsuarioRegistro(correo,contraseña,documento,nombre,apellido,telefono);
       
        //unAprendiz.setUnCurso(unCurso);
        //Se agrega el Aprendiz utilizando el objeto dAprendiz
        boolean agregado = dPersona.agregarRegistro(unUsuario);
        //Se crea una variable mensaje para enviar a la vista
        PrintWriter out = response.getWriter();
        String json = new Gson().toJson(agregado);
        out.print(json);
    
      
    }
        private void agregar2(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException
     {
           String documento = request.getParameter("txt_Documento");
        String nombre = request.getParameter("txt_Nombre");
        String apellido = request.getParameter("txt_Apellido");
        String telefono = request.getParameter("txt_Telefono");
         
       
        Persona unaPersona=new Persona(documento, nombre, apellido, 
                telefono);
       // boolean agregado =dPersona.agregarRegistro(unaPersona);
        PrintWriter out= response.getWriter();
       // String json= new Gson().toJson(agregado);
       // out.print(json);
     }

}