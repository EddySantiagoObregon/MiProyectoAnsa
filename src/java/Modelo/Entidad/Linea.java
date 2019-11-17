/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Entidad;

/**
 *
 * @author Usuario
 */
public class Linea {
    private int idLinea;
    private String nombre;
    private Marca unaMarca;

    public Linea(String nombre, Marca unaMarca) {
        this.nombre = nombre;
        this.unaMarca = unaMarca;
    }

    public Linea(Marca unaMarca) {
        unaMarca = new Marca();
    }

    public Linea() {
        unaMarca = new Marca();
    }

    public int getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Marca getUnaMarca() {
        return unaMarca;
    }

    public void setUnaMarca(Marca unaMarca) {
        this.unaMarca = unaMarca;
    }
    
    
}
