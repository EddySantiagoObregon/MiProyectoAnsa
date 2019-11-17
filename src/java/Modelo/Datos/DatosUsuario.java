/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Datos;

import Modelo.Entidad.UsuarioRegistro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class DatosUsuario {
      private Connection miConexion;
   private PreparedStatement ps;
   private ResultSet rs;
   private String mensaje;   
   
   public DatosUsuario()
   {
        miConexion=Conexion.getConexion();
   }
   public String getMensaje()
   {
       return mensaje;
   } 
    public UsuarioRegistro iniciarSesion(UsuarioRegistro unUsuario)
   {
       UsuarioRegistro user= null;
       this.mensaje=null;
     
       String consulta="select usuario.*, persona.* " 
                +" from usuario inner join persona on usuario.usuPersona= persona.idPersona "
                 +" where usuLogin=? and usuPassword=?";
       try
       {
           ps=miConexion.prepareStatement(consulta);
           ps.setString(1, unUsuario.getCorreo());
           ps.setString(2, unUsuario.getContraseña());
           rs = ps.executeQuery();
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
           rs.close();
       }catch(SQLException ex)
       {
           this.mensaje= ex.getMessage();
       }
       return user;
   }
}
