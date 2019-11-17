/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Datos;

import Modelo.Entidad.Oferta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class DatosOferta {
         private Connection miConexion;
   private PreparedStatement ps;
   private ResultSet rs;
   private String mensaje;
   
   public DatosOferta()
   {
       miConexion=Conexion.getConexion();
   }
   public String getMensaje()
   {
       return mensaje;
   }
   

    public boolean agregarOferta(Oferta unaOferta){
        boolean agregado = false;
        String consulta="insert into oferta "
             + " values(null,?,?,?,?)"; 
        try{
            this.miConexion.setAutoCommit(false);
            ps=miConexion.prepareStatement(consulta);
            ps.setInt(1,unaOferta.getUnCarro().getIdCarro());
            ps.setString(2,unaOferta.getPreciooferta());
            ps.setString(3,unaOferta.getFecha());
            ps.setString(4,unaOferta.getEstado());
            ps.executeUpdate();
 
            
    
        this.miConexion.commit();
  
           
           agregado=true;
      
          
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
