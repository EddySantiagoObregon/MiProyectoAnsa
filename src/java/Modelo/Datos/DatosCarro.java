/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Datos;

import Modelo.Entidad.Carro;
import Modelo.Entidad.Persona;
import Modelo.Entidad.UsuarioRegistro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DatosCarro {
  



      private Connection miConexion;
   private PreparedStatement ps;
   private ResultSet rs;
   private String mensaje;
   
   public DatosCarro()
   {
       miConexion=Conexion.getConexion();
   }
   public String getMensaje()
   {
       return mensaje;
   }
   
    /**
     * Metodo que me agrega una persona a la base de datos
     * @param unaPersona
     * @return true o false
     */
    public boolean agregarCarro(Carro unCarro){
        boolean agregado = false;
        
    
        try{
            this.miConexion.setAutoCommit(false);
                String consulta="insert into carro "
             + " values(null,?,?,?,?,?,?,?,?,?,?,?,?)"; 
            ps=miConexion.prepareStatement(consulta);
            ps.setString(1,unCarro.getPlaca());
            ps.setInt(2,unCarro.getUnaLinea().getIdLinea());
            ps.setString(3,unCarro.getFecha());
            ps.setString(4,unCarro.getKilometraje());
            ps.setString(5,unCarro.getCilindraje());
            ps.setString(6,unCarro.getPrecio());
            ps.setString(7,unCarro.getTipocaja());
            ps.setString(8,unCarro.getDescripcion());
            ps.setString(9,unCarro.getDisponible());
            ps.setInt(10,unCarro.getUnTipo().getIdTipo());
            ps.setInt(11,unCarro.getUnaMarca().getIdMarca());
            ps.setInt(12,unCarro.getUnaCiudad().getIdCiudad());
            ps.executeUpdate();
       
                       consulta="select max(idPersona) as idPersona from Persona";
           ps= miConexion.prepareStatement(consulta);
           
           rs= ps.executeQuery();
           int idPersona=0;
           if(rs.next())
           {
               idPersona=rs.getInt("idPersona");
           }
    consulta="select idCarro from carro where carPlaca=?";
           ps=miConexion.prepareStatement(consulta);
           ps.setString(1, unCarro.getPlaca());
           rs= ps.executeQuery();
           int idCarro=0;
           if(rs.next())
           {
               idCarro= rs.getInt("idCarro");
           }
 consulta="insert into vendedor values(null,?,?)";
           ps=miConexion.prepareStatement(consulta);
           ps.setInt(1,idCarro);
           ps.setInt(2,idPersona);
           
           ps.executeUpdate();



           this.miConexion.commit();
           this.mensaje="Carro agregado";
           agregado=true;
          
           
            
            //ps.setInt(7,unAprendiz.getUnCurso().getIdCurso());
            
       
           
          
          
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
       public ArrayList<Carro>ListarCarro()
    {
            this.mensaje=null;
     ArrayList<Carro> lista= new ArrayList<>();
        try
        {
            this.miConexion.setAutoCommit(false);
            String consulta = "select carro.*,lineamarca.*, tipovehiculo.*, carromarca.*, ciudad.* "
               +" from carro inner join tipovehiculo on carro.carTipoVehiculo=tipovehiculo.idTipoVehiculo "
               +" inner join carromarca on carro.carMarca = carromarca.idCarroMarca "
               +" inner join lineamarca on carro.carLinea=lineamarca.idLinea "
              +" inner join ciudad on carro.carCiudad=ciudad.idCiudad " ;
            ps=this.miConexion.prepareStatement(consulta);
            
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                Carro unCarro = new Carro();
                
                unCarro.setPlaca(rs.getString("carPlaca"));
                unCarro.getUnaLinea().setNombre(rs.getString("linNombre"));
                unCarro.setFecha(rs.getString("carAnio"));
                unCarro.setKilometraje(rs.getString("carKilometraje"));
                unCarro.setCilindraje(rs.getString("carCilindraje"));
                unCarro.setPrecio(rs.getString("carPrecio"));
                unCarro.setTipocaja(rs.getString("carTipoCaja"));
                unCarro.setDescripcion(rs.getString("carDescripcion"));
                unCarro.setDisponible(rs.getString("carDispoible"));
                unCarro.getUnTipo().setNombre(rs.getString("TipoVehiculo"));
                unCarro.getUnaMarca().setNombre(rs.getString("Marca"));
                unCarro.getUnaCiudad().setNombre(rs.getString("nombreCiudad"));
                lista.add(unCarro);
         String consulta2 = "   select persona.* ,vendedor.*,carro.*,usuario.* from vendedor " 
+"inner join carro on vendedor.idCarro = carro.idCarro " 
+"inner join persona on vendedor.idPersona = persona.idPersona " 
+"inner join usuario on usuario.usuPersona = persona.idPersona "
+"where vendedor.idCarro= ?";
                PreparedStatement ps2=this.miConexion.prepareStatement(consulta2);
                ps2.setInt(1, unCarro.getIdCarro());
                
                ArrayList<UsuarioRegistro>listaUsuario;
                try (ResultSet rs2 = ps2.executeQuery())
                {
                    listaUsuario = new ArrayList<>();
                    while(rs2.next())
                    {
                        
                        UsuarioRegistro usu = new UsuarioRegistro();
                        usu.setIdUsuario(rs2.getInt("idUsuario"));
                        usu.setNombre(rs2.getString("perNombre"));
                        usu.setApellido(rs2.getString("perApellido"));
                        usu.setTelefono(rs2.getString("perTelefono"));
                        usu.setCorreo(rs2.getString("usuLogin"));
                        
                        listaUsuario.add(usu);
                    }
                
                        lista.add(unCarro);
                    
                }
            }
            this.miConexion.commit();
        }catch(SQLException ex)
        {
            this.mensaje= ex.getMessage();
        }
        return lista;
}
}


