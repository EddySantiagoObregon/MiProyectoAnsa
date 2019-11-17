/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Entidad;

/**
 *
 * @author Usuario1
 */
public class UsuarioRegistro extends Persona{
    private int idUsuario;
    private String Correo;
    private String Contraseña;
   

    public UsuarioRegistro(String Correo, String Contraseña, String documento, String nombre, String apellido, String telefono) {
        super(documento, nombre, apellido, telefono);
        this.Correo = Correo;
        this.Contraseña = Contraseña;
        
    }

    public UsuarioRegistro() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

  



    

  
    
   
    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    
   
}
    
    

