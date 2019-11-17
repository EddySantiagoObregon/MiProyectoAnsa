/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Datos;


import Modelo.Entidad.TipoVehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DatosTipoVehiculo {
    
   private Connection miConexion;
  private PreparedStatement ps;
   private ResultSet rs;
   private String mensaje;
   
   
   public DatosTipoVehiculo()
   {
       miConexion=Conexion.getConexion();
   }
 
   public ArrayList<TipoVehiculo> ListarTipoVehiculo()
   {
     this.mensaje=null;
     ArrayList<TipoVehiculo> lista= new ArrayList<>();
     String consulta="select * from tipovehiculo";
     try
     {
         ps=miConexion.prepareStatement(consulta);
         rs= ps.executeQuery();
         while(rs.next())
         {
             TipoVehiculo unTipo= new TipoVehiculo(rs.getString("TipoVehiculo"));
             unTipo.setIdTipo(rs.getInt("idTipoVehiculo"));
             lista.add(unTipo);
         }
         rs.close();
     }catch(SQLException ex)
     {
         this.mensaje=ex.getMessage();
     }
     
     return lista;
   }
}

