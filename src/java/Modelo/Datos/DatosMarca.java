/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Datos;

import Modelo.Entidad.Carro;
import Modelo.Entidad.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DatosMarca {
      private Connection miConexion;
  private PreparedStatement ps;
   private ResultSet rs;
   private String mensaje;
   
   
   public DatosMarca()
   {
       miConexion=Conexion.getConexion();
   }
 
   public ArrayList<Marca> ListarMarcas()
   {
     this.mensaje=null;
     ArrayList<Marca> lista= new ArrayList<>();
     String consulta="select * from carromarca";
     try
     {
         ps=miConexion.prepareStatement(consulta);
         rs= ps.executeQuery();
         while(rs.next())
         {
             Marca unaMarca= new Marca(rs.getString("Marca"));
             unaMarca.setIdMarca(rs.getInt("idCarroMarca"));
             lista.add(unaMarca);
         }
         rs.close();
                 
     }catch(SQLException ex)
     {
         this.mensaje=ex.getMessage();
     }
     
     return lista;
   }


}
