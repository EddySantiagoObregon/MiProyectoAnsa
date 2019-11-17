/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Datos;

import Modelo.Entidad.Ciudad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DatosCiudad {
    
   private Connection miConexion;
  private PreparedStatement ps;
   private ResultSet rs;
   private String mensaje;
   
   
   public DatosCiudad()
   {
       miConexion=Conexion.getConexion();
   }
 
   public ArrayList<Ciudad> ListarCiudad()
   {
     this.mensaje=null;
     ArrayList<Ciudad> lista= new ArrayList<>();
     String consulta="select * from ciudad";
     try
     {
         ps=miConexion.prepareStatement(consulta);
         rs= ps.executeQuery();
         while(rs.next())
         {
             Ciudad unaCiudad= new Ciudad(rs.getString("nombreCiudad"));
             unaCiudad.setIdCiudad(rs.getInt("idCiudad"));
             lista.add(unaCiudad);
         }
         rs.close();
     }catch(SQLException ex)
     {
         this.mensaje=ex.getMessage();
     }
     
     return lista;
   }
}

