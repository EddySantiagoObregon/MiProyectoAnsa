/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionMySQL
{
  private static Connection conexion;
  private static final String driver="com.mysql.jdbc.Driver";
  private static final String usuario="root";
  private static final String password="";
  private static final String url="jdbc:mysql://localhost:3306/ansa";
  private static String mensaje;
 
 public static Connection getConexion()
  {
     if(conexion!=null)
     {
         return conexion;
     }
     try
     {
         Class.forName(driver);
         conexion=DriverManager.getConnection(url,usuario,password);
         mensaje="Conectado a la base de datos";
         return conexion;
     }catch(ClassNotFoundException | SQLException ex)
     {
         mensaje=ex.getMessage();
         return null;
     }
  }

    public static String getMensaje()
    {
        return mensaje;
    }
  
}

