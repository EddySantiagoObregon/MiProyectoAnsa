/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Datos;

import Modelo.Entidad.Linea;
import Modelo.Entidad.Marca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DatosLinea {
          private Connection miConexion;
  private PreparedStatement ps;
   private ResultSet rs;
   private String mensaje;
   
   
   public DatosLinea()
   {
       miConexion=Conexion.getConexion();
   }
 
   public ArrayList<Linea> ListarLineasPorMarca(Marca unaMarca)
   {
     this.mensaje=null;
     ArrayList<Linea> lista= new ArrayList<>();
     String consulta="select * from lineamarca where linMarca=?";
     try
     {
         ps=miConexion.prepareStatement(consulta);
         ps.setInt(1,unaMarca.getIdMarca());
         rs= ps.executeQuery();
         while(rs.next())
         {
             Linea unaLinea= new Linea();
             unaLinea.setIdLinea(rs.getInt("idLinea"));
             unaLinea.setNombre(rs.getString("linNombre"));
             unaLinea.getUnaMarca().setIdMarca(rs.getInt("linMarca"));
             lista.add(unaLinea);
         }
         rs.close();
                 
     }catch(SQLException ex)
     {
         this.mensaje=ex.getMessage();
     }
     
     return lista;
   }

}
