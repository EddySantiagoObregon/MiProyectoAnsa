/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Datos;

import Modelo.Entidad.Persona;
import Modelo.Entidad.UsuarioRegistro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class datosPersona {
    
      private Connection miConexion;
   private PreparedStatement ps;
   private ResultSet rs;
   private String mensaje;
   
   public datosPersona()
   {
       miConexion=Conexion.getConexion();
   }
   public String getMensaje()
   {
       return mensaje;
   }
   

    public boolean agregarRegistro(UsuarioRegistro unUsuario){
        boolean agregado = false;
        String consulta="insert into persona "
             + " values(null,?,?,?,?)"; 
        try{
            this.miConexion.setAutoCommit(false);
            ps=miConexion.prepareStatement(consulta);
            ps.setString(1,unUsuario.getDocumento());
            ps.setString(2,unUsuario.getNombre());
            ps.setString(3,unUsuario.getApellido());
            ps.setString(4,unUsuario.getTelefono());
            ps.executeUpdate();
            //ps.setInt(7,unAprendiz.getUnCurso().getIdCurso());
            
           consulta="select idPersona from persona where perIdentificacion=?";
           ps=miConexion.prepareStatement(consulta);
           ps.setString(1, unUsuario.getDocumento());
           rs= ps.executeQuery();
           int idPersona=0;
           if(rs.next())
           {
               idPersona= rs.getInt("idPersona");
           }
           
      
           consulta="insert into usuario values(null,?,?,?)";
           ps=miConexion.prepareStatement(consulta);
           ps.setString(1, unUsuario.getCorreo());
           ps.setString(2, unUsuario.getContraseña());
           ps.setInt(3,idPersona);
           ps.executeUpdate();
           
        this.miConexion.commit();
           this.mensaje="usuario agregado Correctamente";
           
           agregado=true;
            UsuarioRegistro user= null;
                    if(rs.next())
           {
               user = new UsuarioRegistro();
               user.setCorreo(rs.getString("usuLogin"));
               user.setContraseña(rs.getString("usuPassword"));
               user.setIdUsuario(rs.getInt("idUsuario"));
               
               user.setDocumento(rs.getString("perIdentificacion"));
               user.setNombre(rs.getString("perNombre"));
               user.setApellido(rs.getString("perApellido"));
               user.setTelefono(rs.getString("perTelefono"));
           }
          
       }catch(SQLException ex)
       {
         try
         {
             this.mensaje=ex.getMessage();
             this.miConexion.rollback();
         }catch(SQLException ex1)
                 {
                     this.mensaje= ex1.getMessage();
                 }
       }
       return agregado;
    }
   
}
